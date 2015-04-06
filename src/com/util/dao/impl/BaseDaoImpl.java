package com.util.dao.impl;

import java.util.List;

import com.util.dao.BaseDao;

public class BaseDaoImpl<T> implements BaseDao<T>{

	@Override
	public void insert(T t) {
		
	}

	@Override
	public void save() {
		
	}

	@Override
	public void del(T t) {
		
	}

	@Override
	public List<T> findAll() {
		return null;
	}

	//·ÖÒ³
	@Override
	public List<T> findByHql(String hql, int pageNo, int pagesize) {
		return null;
	}

}
