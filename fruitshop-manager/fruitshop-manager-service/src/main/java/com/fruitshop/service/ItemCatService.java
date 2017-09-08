package com.fruitshop.service;

import java.util.List;

import com.fruitshop.common.pojo.EUTreeNode;

public interface ItemCatService {

	List<EUTreeNode> getCatList(long parentId);
}
