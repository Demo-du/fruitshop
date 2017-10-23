package com.fruitshop.portal.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fruitshop.common.pojo.FruitshopResult;
import com.fruitshop.portal.pojo.CartItem;

public interface CartService {

	FruitshopResult addCartItem(long itemId, int num, HttpServletRequest request, HttpServletResponse response);
	List<CartItem> getCartItemList(HttpServletRequest request, HttpServletResponse response);
	FruitshopResult deleteCartItem(long itemId, HttpServletRequest request, HttpServletResponse response);
}
