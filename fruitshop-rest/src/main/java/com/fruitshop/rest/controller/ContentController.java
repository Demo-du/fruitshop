package com.fruitshop.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fruitshop.common.pojo.FruitshopResult;
import com.fruitshop.common.utils.ExceptionUtil;

import com.fruitshop.pojo.TbContent;
import com.fruitshop.rest.service.ContentService;

/**
 * 内容管理Controller
 * @version 1.0
 */
@Controller
@RequestMapping("/content")
public class ContentController {

	@Autowired
	private ContentService contentService;
	
	@RequestMapping("/list/{contentCategoryId}")
	@ResponseBody
	public FruitshopResult getContentList(@PathVariable Long contentCategoryId) {
		try {
			List<TbContent> list = contentService.getContentList(contentCategoryId);
			return FruitshopResult.ok(list);
		} catch (Exception e) {
			e.printStackTrace();
			return FruitshopResult.build(500, ExceptionUtil.getStackTrace(e));
		}
	}
}