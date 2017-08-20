package com.base.common.service.impl;

import java.io.Serializable;
import java.util.List;

import com.base.common.dao.IBaseDAO;
import com.base.common.service.IBaseService;

public class BaseServiceImpl<T> implements IBaseService<T> {
	private IBaseDAO baseDAO;

	public IBaseDAO getBaseDAO() {
		return baseDAO;
	}

	public void setBaseDAO(IBaseDAO baseDAO) {
		this.baseDAO = baseDAO;
	}

	public void detele(T obj) {
		baseDAO.detele(obj);
	}

	public Serializable save(T obj) {
		return baseDAO.save(obj);
	}

	public void update(T obj) {
		baseDAO.update(obj);
	}

	public List<T> getAll() {
		return baseDAO.getAll();
	}

	public T getById(Class<T> c, Long id) {
		return (T) baseDAO.getById(c, id);
	}
}
