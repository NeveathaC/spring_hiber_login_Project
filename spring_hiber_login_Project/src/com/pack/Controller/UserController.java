package com.pack.Controller;


import org.hibernate.validator.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.pack.Model.User;
import com.pack.Service.UsrService;



@Controller
public class UserController {
@Autowired
private UsrService userService;
@RequestMapping(value="/toAdd",method=RequestMethod.GET)
public String toAdd(Model model)
{
	model.addAttribute("userBean",new User());
	return "Loginn";
}
@RequestMapping(value="/DoAdd",method=RequestMethod.POST)
//public ModelAndView saveUser(User userBean)

	public String saveUser(@javax.validation.Valid @ModelAttribute("userBean") User userBean,BindingResult result)
	{
	if(result.hasErrors())
	{
	
	return "Loginn";
	}
	else
	{
		return ("WELCOME");
	}
	
}
@RequestMapping(value="/toDelete",method=RequestMethod.GET)
public String toDelete(Model model)
{
	model.addAttribute("userBean",new User());
	return "getid";
}
@RequestMapping(value="/goDelete",method=RequestMethod.POST)
public ModelAndView deleteUser(@RequestParam("id") int id)
{System.out.println(id);
	userService.deleteUser(id);
	return new ModelAndView("Display");
}

}
