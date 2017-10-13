package com.fruitshop.search.dao;

import org.apache.solr.client.solrj.SolrQuery;

import com.fruitshop.search.pojo.SearchResult;

public interface SearchDao {

	SearchResult search(SolrQuery query) throws Exception;
}
