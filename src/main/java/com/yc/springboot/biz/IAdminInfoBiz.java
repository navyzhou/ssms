package com.yc.springboot.biz;

import java.util.List;

import com.yc.springboot.bean.AdminInfo;

public interface IAdminInfoBiz {
	public List<AdminInfo> findAll();
}
