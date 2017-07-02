package com.alvaro.grupoEnlace.controllers;

import com.alvaro.grupoEnlace.entities.User;
import com.alvaro.grupoEnlace.data.persistence.persistors.PersistenceService;
import com.alvaro.grupoEnlace.pages.welcome.WelcomeFormData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by armandosanchezmedina on 17/06/2017.
 */
@Controller
public class WelcomeController {
    private static final Logger logger = LoggerFactory.getLogger(WelcomeController.class);

    @Autowired
    PersistenceService persistenceService;

    WelcomeFormData welcomeFormData;

    @RequestMapping(value = {"/welcome","/"}, method = RequestMethod.GET)
    public ModelAndView welcome() {
        welcomeFormData = new WelcomeFormData();
        logger.debug("access to welcome page");

        welcomeFormData.setUsers(persistenceService.getAllUsers());
        ModelAndView modelAndView = new ModelAndView("welcome");
        modelAndView.addObject("formData",welcomeFormData);

        return modelAndView;

    }
    @RequestMapping(value = "/welcome", method = RequestMethod.POST)
    public ModelAndView handlePost(@ModelAttribute WelcomeFormData formData, Model model) {
        logger.debug("access to welcome page via POST");

        int selectedUserId = formData.getSelectedUserId();

        if (selectedUserId >0) {
            return new ModelAndView("redirect:/tareas?usuario="+selectedUserId);
        }
        else{
            ModelAndView modelAndView = new ModelAndView("welcome");
            modelAndView.addObject("formData",welcomeFormData);
            return modelAndView;
        }
    }
}
