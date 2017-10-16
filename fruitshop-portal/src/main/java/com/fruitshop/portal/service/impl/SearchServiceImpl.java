package com.fruitshop.portal.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.fruitshop.common.pojo.FruitshopResult;
import com.fruitshop.common.utils.HttpClientUtil;
import com.fruitshop.portal.pojo.SearchResult;
import com.fruitshop.portal.service.SearchService;

/**
 * 商品搜索Service
 * @version 1.0
 */

@Service
public class SearchServiceImpl implements SearchService {

	@Value("${SEARCH_BASE_URL}")
	private String SEARCH_BASE_URL;
	
	@Override
	public SearchResult search(String queryString, int page) {
		// 调用taotao-search的服务
		//查询参数
		Map<String, String> param = new HashMap<>();
		param.put("q", queryString);
		param.put("page", page + "");
		try {
			//调用服务
			String json = HttpClientUtil.doGet(SEARCH_BASE_URL, param);
			//把字符串转换成java对象
			FruitshopResult fruitshopResult = FruitshopResult.formatToPojo(json, SearchResult.class);
			if (fruitshopResult.getStatus() == 200) {
				SearchResult result = (SearchResult) fruitshopResult.getData();
				return result;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
