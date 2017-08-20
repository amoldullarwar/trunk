package com.base.common.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.base.common.dao.IRoleDAO;
import com.base.common.model.Role;
import com.base.common.model.User;
import com.base.common.service.IRoleService;

@Controller
public class AdminController{
	
	@Autowired	
	private IRoleService roleService;

	public void setRoleService(IRoleService roleService) {
		this.roleService = roleService;
	}
	
	@RequestMapping(value="/role", method=RequestMethod.GET)
	public String rolePage(){
		return "role";
	}
	
	@RequestMapping(value="/role/{action}", method=RequestMethod.GET)
	public String roleManagePage(@PathVariable("action") String action){
		System.out.println(action);
		return "role";
	}
	
	@RequestMapping(value="/roleSubmit", method=RequestMethod.POST)
	public String roleSumit(Role role){
		roleService.save(role);
		System.out.println(role.getName());
		return "dashboard";
	}
	
	@RequestMapping(value="/updateUserStatus", method=RequestMethod.POST)
	public String updateUserStatus(User user, String status){
		return "dashboard";
	}
}
