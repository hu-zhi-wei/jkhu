package com.taotao.admin.service.impl;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.taotao.admin.mapper.ItemCatMapper;
import com.taotao.admin.pojo.ItemCat;
import com.taotao.admin.service.ItemCatService;


@Service
@Transactional(readOnly=false)
public class ItemCatServiceImpl implements ItemCatService {

	@Autowired
	public ItemCatMapper itemCatMapper;
	
	@Override
	public List<ItemCat> findAll(Integer page,Integer rows) {
		PageHelper.startPage(page, rows);
		return itemCatMapper.selectAll();
	}

	
}
