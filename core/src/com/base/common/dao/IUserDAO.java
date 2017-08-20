package com.base.common.dao;

import com.base.common.model.User;

public interface IUserDAO extends IBaseDAO<User> {
	public void deleteById(Long id);
}
