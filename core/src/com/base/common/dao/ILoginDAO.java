package com.base.common.dao;

import com.base.common.model.User;

public interface ILoginDAO extends IBaseDAO<User>{
	public User authenticate(User user);
}
