package com.util.service.impl;

import java.util.List;

import com.util.dao.BaseDao;
import com.util.service.BaseService;

public class BaseServiceImpl<T> implements BaseService<T>{
	
	private BaseDao baseDao;	
	@Override
	public void insert(T t) {
		this.baseDao.insert(t);
	}

	@Override
	public void save() {
		
	}

	@Override
	public void del(T t) {
		this.baseDao.del(t);
	}

	@Override
	public List<T> findAll() {
		return baseDao.findAll();
	}

	@Override
	public List<T> findByHql(String hql, int pageNo, int pagesize) {
		return this.baseDao.findByHql(hql, pageNo, pagesize);
	}

}
