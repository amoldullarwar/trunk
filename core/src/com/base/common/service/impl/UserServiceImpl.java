package com.base.common.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.base.common.dao.IUserDAO;
import com.base.common.model.User;
import com.base.common.service.IUserService;

public class UserServiceImpl extends BaseServiceImpl<User> implements
		IUserService{
	
	@Autowired
	private IUserDAO dao;

	public void setDao(IUserDAO dao) {
		//this.setBaseDAO(dao);
		this.dao = dao;
	}

	public void deleteById(Long id) {
		dao.deleteById(id);
	}
}
