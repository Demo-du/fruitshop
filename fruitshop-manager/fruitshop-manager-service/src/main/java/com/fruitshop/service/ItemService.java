package com.fruitshop.service;

import com.fruitshop.common.pojo.EUDataGridResult;
import com.fruitshop.common.pojo.FruitshopResult;
import com.fruitshop.pojo.TbItem;

public interface ItemService {
    TbItem getItemById(long itemid);
    EUDataGridResult getItemList(int page, int rows);
    FruitshopResult createItem(TbItem item, String desc, String itemParam) throws Exception;
}