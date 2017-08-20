package com.base.common.dao;

import java.io.Serializable;
import java.util.List;

public interface IBaseDAO <T> {
	
	public T getById(Class<T> c,Long id);
	
	public List<T> getAll();

	public Serializable save(T obj);

	public void update(T obj);

	public void detele(T obj);
}
