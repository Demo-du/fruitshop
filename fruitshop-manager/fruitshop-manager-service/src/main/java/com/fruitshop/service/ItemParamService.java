package com.fruitshop.service;

import com.fruitshop.common.pojo.FruitshopResult;
import com.fruitshop.pojo.TbItemParam;

public interface ItemParamService {

	FruitshopResult getItemParamByCid(long cid);
	FruitshopResult insertItemParam(TbItemParam itemParam);
}
