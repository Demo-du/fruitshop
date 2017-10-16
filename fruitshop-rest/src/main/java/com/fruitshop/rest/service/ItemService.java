package com.fruitshop.rest.service;

import com.fruitshop.common.pojo.FruitshopResult;

public interface ItemService {

	FruitshopResult getItemBaseInfo(long itemId);
	FruitshopResult getItemDesc(long itemId);
	FruitshopResult getItemParam(long itemId);
}
