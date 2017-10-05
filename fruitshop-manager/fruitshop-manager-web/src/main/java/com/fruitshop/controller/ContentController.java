package com.fruitshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fruitshop.common.pojo.FruitshopResult;
import com.fruitshop.pojo.TbContent;
import com.fruitshop.service.ContentService;

/**
 * 内容管理Controller
 * @version 1.0
 */
@Controller
@RequestMapping("/content")
public class ContentController {

	@Autowired
	private ContentService contentService;
	
	@RequestMapping("/save")
	@ResponseBody
	public FruitshopResult insertContent(TbContent content) {
		FruitshopResult result = contentService.insertContent(content);
		return result;
	}
}
