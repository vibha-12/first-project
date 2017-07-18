package com.hello.login.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

//import com.hello.login.dao.LoginDao;
import com.hello.login.dao.LoginDao;
import com.hello.profile.model.ProfileModel;

@Controller
public class LoginController {

	@Autowired
	private LoginDao loginDao;

	
	
	
	
	@RequestMapping(value="/showLogin",method = RequestMethod.GET)
	public ModelAndView showHome(ModelMap model) {
		return new ModelAndView("loginPage", "LoginPage", new ProfileModel());
	}
	
	
	@RequestMapping(value="/showHome",method = RequestMethod.POST)
	public String enterHome(@ModelAttribute("LoginPage")ProfileModel loginModel,HttpServletRequest request, ModelMap model) {
		model.addAttribute("message", "Hello Spring MVC Framework!");
		System.out.println("username"+loginModel.getUsername());
		System.out.println(loginModel.getPwd());
		

		List<String> l;	
		
		l= loginDao.compare(loginModel);
		System.out.println("++++printing l  ++++++"+l);

		if(!(l.isEmpty()))
		{		
			model.addAttribute("msg", "welcome" + loginModel.getUsername());
			request.getSession().setAttribute("loginn", loginModel);
			
			

			return "welcome";
		}
			else{
				
                model.put("msg","Invalid username or password");
                model.addAttribute("error", "Please enter Details");
		return "loginPage";
			}
		

	}

	
	
	
	
	
}
