package com.fruitshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fruitshop.common.pojo.EUDataGridResult;
import com.fruitshop.common.pojo.FruitshopResult;
import com.fruitshop.pojo.TbItem;
import com.fruitshop.service.ItemService;


@Controller
public class ItemController {

	@Autowired
	private ItemService itemService;
	
	@RequestMapping("/item/{itemId}")
	@ResponseBody
	//从路径取参数@PathVariable 
	public TbItem getItemById(@PathVariable Long itemId) {
		TbItem tbItem = itemService.getItemById(itemId);
		return tbItem;
	}
	@RequestMapping("/item/list")
	@ResponseBody
	public EUDataGridResult getItemList(Integer page, Integer rows) {
		EUDataGridResult result = itemService.getItemList(page, rows);
		return result;
	}
	@RequestMapping(value="/item/save", method=RequestMethod.POST)
	@ResponseBody
	private FruitshopResult createItem(TbItem item, String desc, String itemParams) throws Exception {
		FruitshopResult result = itemService.createItem(item, desc, itemParams);
		return result;
	}
}
