package com.xiaoshu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xiaoshu.dao.ContentMapper;
import com.xiaoshu.entity.Content;
import com.xiaoshu.entity.ContentVo;

@Service
public class ContentService {

	@Autowired
	ContentMapper contentMapper;


	// 新增
	public  void addUser(Content t) throws Exception {
		contentMapper.insert(t);
	};

	// 修改
	public void updateUser(Content t) throws Exception {
		contentMapper.updateByPrimaryKey(t);
	};

	// 删除
	public void deleteUser(Integer id) throws Exception {
		contentMapper.deleteByPrimaryKey(id);
	};



	

	


	public PageInfo<ContentVo> findAll(ContentVo contentVo, Integer pageNum, Integer pageSize) {
PageHelper.startPage(pageNum, pageSize);
		
		List<ContentVo> userList = contentMapper.findAll(contentVo);
		PageInfo<ContentVo> pageInfo = new PageInfo<ContentVo>(userList);
		return pageInfo;
	}



}
