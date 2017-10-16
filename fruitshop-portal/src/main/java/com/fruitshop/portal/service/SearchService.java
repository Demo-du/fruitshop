package com.fruitshop.portal.service;

import com.fruitshop.portal.pojo.SearchResult;

public interface SearchService {

	SearchResult search(String queryString, int page);
}
