package com.fruitshop.order.service;

import java.util.List;

import com.fruitshop.common.pojo.FruitshopResult;
import com.fruitshop.pojo.TbOrder;
import com.fruitshop.pojo.TbOrderItem;
import com.fruitshop.pojo.TbOrderShipping;

public interface OrderService {

	FruitshopResult createOrder(TbOrder order, List<TbOrderItem> itemList, TbOrderShipping orderShipping);
}
