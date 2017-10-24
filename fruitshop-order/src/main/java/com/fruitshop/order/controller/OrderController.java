package com.fruitshop.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fruitshop.common.pojo.FruitshopResult;
import com.fruitshop.common.utils.ExceptionUtil;
import com.fruitshop.order.pojo.Order;
import com.fruitshop.order.service.OrderService;

/**
 * 订单Controller
 * @version 1.0
 */
@Controller
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@RequestMapping(value="/create", method=RequestMethod.POST)
	@ResponseBody
	public FruitshopResult createOrder(@RequestBody Order order) {
		try {
			FruitshopResult result = orderService.createOrder(order, order.getOrderItems(), order.getOrderShipping());
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			return FruitshopResult.build(500, ExceptionUtil.getStackTrace(e));
		}
	}
}
