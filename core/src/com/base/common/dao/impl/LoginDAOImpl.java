package com.base.common.dao.impl;

import java.util.List;

import com.base.common.dao.ILoginDAO;
import com.base.common.model.User;

public class LoginDAOImpl extends BaseDAOImpl<User> implements ILoginDAO {
	@Override
	public User authenticate(User user) {
		String queryString = "from User where userName=:userName and password=:password";
		User u1 = null;
		List<Object> list = hibernateTemplate.findByNamedParam(queryString,
				new String[] { "userName", "password" }, new String[] {
						user.getUserName(), user.getPassword() });
		if (list != null && list.size() > 0) {
			u1 = (User) list.get(0);
			u1.setAuthenticated(true);
		}
		return u1;
	}

	public List<User> getAll() {
		return null;
	}
}