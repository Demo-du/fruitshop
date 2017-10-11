package com.fruitshop.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fruitshop.common.pojo.FruitshopResult;
import com.fruitshop.rest.service.RedisService;

/**
 * 缓存同步Controller
 * @version 1.0
 */
@Controller
@RequestMapping("/cache/sync")
public class RedisController {

	@Autowired
	private RedisService redisService;
	
	@RequestMapping("/content/{contentCid}")
	@ResponseBody
	public FruitshopResult contentCacheSync(@PathVariable Long contentCid) {
		FruitshopResult result = redisService.syncContent(contentCid);
		return result;
	}
}
