package com.hello.profile.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hello.profile.dao.ProfileDao;
import com.hello.profile.model.ProfileModel;
@Controller
public class ProfileController {
	@Autowired
	private ProfileDao profileDao;
	@RequestMapping(value="/register",method = RequestMethod.GET)
	public ModelAndView showRegister( ModelMap model) {
		
		return new ModelAndView("register", "RegisterCMD", new ProfileModel());
	}

	@RequestMapping(value = "/saveProfile", method = RequestMethod.POST)
	public ModelAndView addUser(@ModelAttribute("RegisterCMD")ProfileModel profile,HttpServletRequest request,ModelMap model) {
		request.getSession().setAttribute("profile", profile);
		profileDao.saveProfile(profile);
		return new ModelAndView("loginPage", "LoginPage", new ProfileModel());
	}

}
