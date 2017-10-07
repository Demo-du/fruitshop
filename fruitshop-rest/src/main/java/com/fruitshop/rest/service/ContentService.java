package com.fruitshop.rest.service;

import java.util.List;

import com.fruitshop.pojo.TbContent;

public interface ContentService {

	List<TbContent> getContentList(long contentCid);
}
