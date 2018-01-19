package com.yc.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.yc.springboot.biz.IAdminInfoBiz;

@RestController
public class AdminInfoController {
	@Autowired
	@Qualifier("adminInfoBizImpl")
	private IAdminInfoBiz adminInfoBiz;
	
	@RequestMapping("/findAll")
	public String findAll() {
		Gson gson=new Gson();
		return gson.toJson(adminInfoBiz.findAll());
	}
}
