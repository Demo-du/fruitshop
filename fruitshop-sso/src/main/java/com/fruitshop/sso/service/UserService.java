package com.fruitshop.sso.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fruitshop.common.pojo.FruitshopResult;
import com.fruitshop.pojo.TbUser;

public interface UserService {

	FruitshopResult checkData(String content, Integer type);
	FruitshopResult createUser(TbUser user);
	FruitshopResult userLogin(String username, String password, HttpServletRequest request, HttpServletResponse response);
	FruitshopResult getUserByToken(String token);
}
