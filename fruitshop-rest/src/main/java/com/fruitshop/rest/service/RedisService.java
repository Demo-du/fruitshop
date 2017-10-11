package com.fruitshop.rest.service;

import com.fruitshop.common.pojo.FruitshopResult;

public interface RedisService {

	FruitshopResult syncContent(long contentCid);
}
