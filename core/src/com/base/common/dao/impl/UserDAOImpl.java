package com.base.common.dao.impl;

import java.util.List;

import com.base.common.dao.IUserDAO;
import com.base.common.model.User;

public class UserDAOImpl extends BaseDAOImpl<User> implements IUserDAO {
	public List<User> getAll() {
		return hibernateTemplate.loadAll(User.class);
	}
	public void deleteById(Long id) {
		hibernateTemplate.delete(getById(User.class,id));
	}
}
