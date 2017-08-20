package com.base.common.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.base.common.model.User;
import com.base.common.service.IUserService;

@Controller
@SessionAttributes({"user"})
public class UserController {
	
	@Autowired
	private IUserService userService;
	
	public IUserService getUserService() {
		return userService;
	}
	
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public String registerPage(){
		return "register";
	}
	
	@RequestMapping(value="/dashboard", method=RequestMethod.GET)
	public String dashboardPage(){
		return "dashboard";
	}
	
	@RequestMapping(value="/registerSubmit", method=RequestMethod.POST)
	public String registerSubmit(User user){
		//basicDao.save(user);
		userService.save(user);
	System.out.println("User registered successfully : \n"+user );	
	 return "default";	
	}
	
	@RequestMapping(value="/users", method=RequestMethod.GET)
	public ModelAndView userListPage(){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("listview");
		List<User> userList = userService.getAll();
		mv.addObject("userList", userList);
		return mv;
	}
	
	@RequestMapping(value="/users/delete/{userId}", method=RequestMethod.GET)
	public String deleteUser(@PathVariable("userId") String userId){
		if(userId!=null)
			userService.deleteById(Long.valueOf(userId));
		return "listview";
	}
}