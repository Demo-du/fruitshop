package com.fruitshop.service;

import java.util.List;

import com.fruitshop.common.pojo.EUTreeNode;
import com.fruitshop.common.pojo.FruitshopResult;

public interface ContentCategoryService {

	List<EUTreeNode> getCategoryList(long parentId);
	FruitshopResult insertContentCategory(long parentId, String name);
}
