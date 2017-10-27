package com.taotao.admin.service;

import java.util.List;

import com.taotao.admin.pojo.ItemCat;

public interface ItemCatService {

	List<ItemCat> findAll(Integer page,Integer rows);
	
	
}
