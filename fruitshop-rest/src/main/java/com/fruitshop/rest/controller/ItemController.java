package com.fruitshop.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fruitshop.common.pojo.FruitshopResult;
import com.fruitshop.rest.service.ItemService;

/**
 * 商品信息Controller
 * @version 1.0
 */
@Controller
@RequestMapping("/item")
public class ItemController {

	@Autowired
	private ItemService itemService;
	
	@RequestMapping("/info/{itemId}")
	@ResponseBody
	public FruitshopResult getItemBaseInfo(@PathVariable Long itemId) {
		FruitshopResult result = itemService.getItemBaseInfo(itemId);
		return result;
	}
	
	@RequestMapping("/desc/{itemId}")
	@ResponseBody
	public FruitshopResult getItemDesc(@PathVariable Long itemId) {
		FruitshopResult result = itemService.getItemDesc(itemId);
		return result;
	}
	
	@RequestMapping("/param/{itemId}")
	@ResponseBody
	public FruitshopResult getItemParam(@PathVariable Long itemId) {
		FruitshopResult result = itemService.getItemParam(itemId);
		return result;
	}
}
