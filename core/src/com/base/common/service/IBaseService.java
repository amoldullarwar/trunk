package com.base.common.service;

import java.io.Serializable;
import java.util.List;

import com.base.common.dao.IBaseDAO;

public interface IBaseService <T> {
	public T getById(Class<T> c,Long id);
	
	public List<T> getAll();

	public Serializable save(T obj);

	public void update(T obj);

	public void detele(T obj);
}
