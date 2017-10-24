package com.fruitshop.portal.pojo;

import java.util.List;

import com.fruitshop.pojo.TbOrder;
import com.fruitshop.pojo.TbOrderItem;
import com.fruitshop.pojo.TbOrderShipping;

public class Order extends TbOrder {

	private List<TbOrderItem> orderItems;
	private TbOrderShipping orderShipping;
	public List<TbOrderItem> getOrderItems() {
		return orderItems;
	}
	public void setOrderItems(List<TbOrderItem> orderItems) {
		this.orderItems = orderItems;
	}
	public TbOrderShipping getOrderShipping() {
		return orderShipping;
	}
	public void setOrderShipping(TbOrderShipping orderShipping) {
		this.orderShipping = orderShipping;
	}
	
	
}
