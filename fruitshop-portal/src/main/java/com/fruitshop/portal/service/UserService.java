package com.fruitshop.portal.service;

import com.fruitshop.pojo.TbUser;

public interface UserService {

	TbUser getUserByToken(String token);
}
