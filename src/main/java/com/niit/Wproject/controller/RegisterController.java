package com.niit.Wproject.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.Wproject.Model.Sup1;



@Controller
public class RegisterController {
	@RequestMapping("/")
	public String showIndexPage()
	{
		return "index";
	}
	@GetMapping(value="/Register")
    public ModelAndView showForm() {
        return new ModelAndView("Register", "user", new Sup1());
    }
	@PostMapping("/adduser") 
		public String addUser(@Valid @ModelAttribute("user") Sup1 s,BindingResult result, Model model) {
		if(result.hasErrors()) {
		return"Register";
	}
			return"sup1Details";	
}
}
 
   /* @RequestMapping(value = "/adduser", method = RequestMethod.POST)
    
    public String submit(@ModelAttribute("user")Sup1 s, 
      Model model) { 
        
    	System.out.println(s.getUserId());
    	System.out.println(s.getUserName());
    	System.out.println(s.getUserEmail());
    	System.out.println(s.getUserMobileNo());
		return "sup1Details";
    	
       
    }*/
	

