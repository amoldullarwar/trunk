package com.base.common.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import com.base.common.dao.ILoginDAO;
import com.base.common.model.User;

@Controller
@SessionAttributes({"user"})
public class LoginController {

	@Autowired
	private ILoginDAO loginDao;
	
	public ILoginDAO getLoginDao() {
		return loginDao;
	}
	
	public void setLoginDao(ILoginDAO loginDao) {
		this.loginDao = loginDao;
	}
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String loginPage(){
		return "login";
	}
	
	@RequestMapping(value="/loginSubmit", method=RequestMethod.POST)
	@Scope(value="session")
	public ModelAndView loginSubmit(User user, SessionStatus status){
		System.out.println("Method start");
		User user1 =loginDao.authenticate(user);
		ModelAndView mv =new ModelAndView();
		mv.setViewName("dashboard");
		if(user1!=null) {
			mv.addObject("user", user1);
		} else {
			status.setComplete();
		}
		return mv; // on success return to user dashboard page
	}
	
	@RequestMapping(value="/logout", method=RequestMethod.GET)
	public String logout(SessionStatus status,ModelMap map,HttpSession session){
		User user = ((User)session.getAttribute("user"));
		if(user!=null)
			map.put("msg", (user.getUserName()+": Logout successfull.."));
		status.setComplete();
		return "default";
	}
}
