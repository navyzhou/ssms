package com.yc.springboot.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.yc.springboot.bean.AdminInfo;
import com.yc.springboot.biz.IAdminInfoBiz;
import com.yc.springboot.dao.IBaseDao;

@Service
@SuppressWarnings({"rawtypes","unchecked"})
public class AdminInfoBizImpl implements IAdminInfoBiz{
	@Autowired
	@Qualifier("baseDaoImpl")
	private IBaseDao baseDao;
	
	@Override
	public List<AdminInfo> findAll() {
		return baseDao.findAll(AdminInfo.class,"findAllAdminInfo");
	}
	
}
