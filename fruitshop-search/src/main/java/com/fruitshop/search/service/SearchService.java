package com.fruitshop.search.service;

import com.fruitshop.search.pojo.SearchResult;

public interface SearchService {

	SearchResult search(String queryString, int page, int rows) throws Exception;
}
