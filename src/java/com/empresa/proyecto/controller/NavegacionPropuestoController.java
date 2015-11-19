/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.empresa.proyecto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Ignacio Castro
 */
@Controller
public class NavegacionPropuestoController {
    
    
    @RequestMapping(params = "page01")
    public ModelAndView getPage01(){
        ModelAndView mav = new ModelAndView("page01");
        return mav;
    }
    
    @RequestMapping(params = "page02")
    public ModelAndView getPage02(){
        ModelAndView mav = new ModelAndView("page02");
        return mav;
    }
    
    @RequestMapping(params = "page03")
    public ModelAndView getPage03(){
        ModelAndView mav = new ModelAndView("page03");
        return mav;
    }
    
    @RequestMapping(params = "page04")
    public ModelAndView getPage04(){
        ModelAndView mav = new ModelAndView("page04");
        return mav;
    }
    
}
