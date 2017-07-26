package com.alvaro.grupoEnlace.controllers;

import com.alvaro.grupoEnlace.data.persistence.persistors.PersistenceService;
import com.alvaro.grupoEnlace.data.persistence.tables.tasks.TasksGrupoEnlace;
import com.alvaro.grupoEnlace.entities.Tarea;
import com.alvaro.grupoEnlace.entities.User;
import com.alvaro.grupoEnlace.pages.tareas.TareasFormData;
import com.alvaro.grupoEnlace.pages.welcome.WelcomeFormData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by armandosanchezmedina on 02/07/2017.
 */

@Controller
public class TareasController {
//    @RequestParam("usuario") int usuario
private static final Logger logger = LoggerFactory.getLogger(WelcomeController.class);

    @Autowired
    PersistenceService persistenceService;

    TareasFormData tareasFormData;

    @RequestMapping(value = {"/tareas"}, method = RequestMethod.GET)
    public ModelAndView tareas(@RequestParam("usuario") int usuario) {
        User user  = persistenceService.getUsersById(usuario);
        List<TasksGrupoEnlace> misTareas = persistenceService.getTareasByUserId(usuario);
        logger.debug("access to tareas page");
        tareasFormData = new TareasFormData();

        tareasFormData.setUsuario(user);
        tareasFormData.setTareas(misTareas);
        ModelAndView modelAndView = new ModelAndView("tareas");
        modelAndView.addObject("formData",tareasFormData);

        return modelAndView;

    }

}
