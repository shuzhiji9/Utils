package com.util.dao;

import java.util.List;

public interface BaseDao<T> {
	
	public void insert(T t);
	
	public void save();
	
	public void del(T t);
	
	public List<T> findAll();
	
	public List<T> findByHql(String hql,int pageNo,int pagesize);
	
}
