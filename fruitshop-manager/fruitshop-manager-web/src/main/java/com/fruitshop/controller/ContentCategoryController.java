package com.fruitshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fruitshop.common.pojo.EUTreeNode;
import com.fruitshop.common.pojo.FruitshopResult;
import com.fruitshop.service.ContentCategoryService;

/**
 * 内容分类管理
 * @version 1.0
 */
@Controller
@RequestMapping("/content/category")
public class ContentCategoryController {

	@Autowired
	private ContentCategoryService contentCategoryService;
	
	@RequestMapping("/list")
	@ResponseBody
	public List<EUTreeNode> getContentCatList(@RequestParam(value="id", defaultValue="0")Long parentId) {
		List<EUTreeNode> list = contentCategoryService.getCategoryList(parentId);
		return list;
	}
	
	@RequestMapping("/create")
	@ResponseBody
	public FruitshopResult createContentCategory(Long parentId, String name) {
		FruitshopResult result = contentCategoryService.insertContentCategory(parentId, name);
		return result;
	}
}
