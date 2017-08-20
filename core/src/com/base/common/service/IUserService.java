package com.base.common.service;

import com.base.common.model.User;

public interface IUserService extends IBaseService<User>{
	public void deleteById(Long id);
}



