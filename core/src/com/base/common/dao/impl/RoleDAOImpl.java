package com.base.common.dao.impl;

import java.util.List;

import com.base.common.dao.IRoleDAO;
import com.base.common.model.Role;

public class RoleDAOImpl extends BaseDAOImpl<Role> implements IRoleDAO {
	public List<Role> getAll() {
		return hibernateTemplate.loadAll(Role.class);
	}
}
