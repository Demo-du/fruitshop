package com.fruitshop.service;

import com.fruitshop.common.pojo.EUDataGridResult;
import com.fruitshop.pojo.TbItem;

public interface ItemService {
    TbItem getItemById(long itemid);
    EUDataGridResult getItemList(int page, int rows);
}