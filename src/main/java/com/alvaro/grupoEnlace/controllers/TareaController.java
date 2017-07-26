package com.alvaro.grupoEnlace.controllers;

import com.alvaro.grupoEnlace.data.persistence.persistors.PersistenceService;
import com.alvaro.grupoEnlace.data.persistence.tables.tasks.TasksGrupoEnlace;
import com.alvaro.grupoEnlace.entities.User;
import com.alvaro.grupoEnlace.pages.tarea.TareaFormData;
import com.alvaro.grupoEnlace.pages.tareas.TareasFormData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by armandosanchezmedina on 25/07/2017.
 */
@Controller
public class TareaController {
    private static final Logger logger = LoggerFactory.getLogger(WelcomeController.class);

    @Autowired
    PersistenceService persistenceService;

    TareaFormData tareaFormData;

    @RequestMapping(value = {"/tarea"}, method = RequestMethod.GET)
    public ModelAndView tarea(@RequestParam("tarea") int tarea,@RequestParam("user") int iduser) {
        TasksGrupoEnlace miTarea  = persistenceService.getTareaById(tarea);
        User user  = persistenceService.getUsersById(iduser);
        tareaFormData = new TareaFormData();

        tareaFormData.setTarea(miTarea);
        tareaFormData.setUserName(user.getName());
        tareaFormData.setUserId(iduser);
        ModelAndView modelAndView = new ModelAndView("tarea");
        modelAndView.addObject("formData",tareaFormData);

        return modelAndView;

    }
}
