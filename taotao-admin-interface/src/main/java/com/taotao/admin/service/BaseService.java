package com.taotao.admin.service;

import java.io.Serializable;
import java.util.List;

public interface BaseService<T> {
	
	//选择性添加
	void saveSelective(T entiry);
	
	//删除
	void delete(Serializable id);
	
	//批量删除
	void deleteAll(String idField , Serializable[] ids);
	
	//根据条件选择性修改
	void updateSelective(T entiry);
	
	//查询单个对象
	T selectOne(Serializable id);
	
	//查询所有
	List<T> findAll();
	
	//根据条件查询
	List<T> findAllByWhere(T entiry);
	
	//多条件统计查询
	int countByWhere(T entiry);
	
	//分页查询
	List<T> findByPage(Integer page , Integer rows);
	
}
