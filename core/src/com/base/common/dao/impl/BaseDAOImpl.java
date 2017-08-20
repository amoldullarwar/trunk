package com.base.common.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.base.common.dao.IBaseDAO;


public abstract class BaseDAOImpl<T> implements IBaseDAO<T>{
	
	@Autowired
	protected HibernateTemplate hibernateTemplate;
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public void detele(T obj) {
		this.hibernateTemplate.delete(obj);
	}

	@Override
	public T getById(Class<T> c, Long id) {
		return this.hibernateTemplate.get(c, id);
	}

	@Override
	public Serializable save(T obj) {
		return this.hibernateTemplate.save(obj);
	}

	@Override
	public void update(T obj) {
		this.hibernateTemplate.update(obj);
	}
}
