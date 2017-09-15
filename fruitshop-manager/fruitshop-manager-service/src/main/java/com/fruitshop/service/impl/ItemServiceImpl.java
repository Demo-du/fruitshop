package com.fruitshop.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

import com.fruitshop.common.pojo.EUDataGridResult;
import com.fruitshop.common.pojo.FruitshopResult;
import com.fruitshop.common.utils.IDUtils;
import com.fruitshop.mapper.*;
import com.fruitshop.pojo.*;
import com.fruitshop.pojo.TbItemExample.Criteria;
import com.fruitshop.service.ItemService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;


@Service
public class ItemServiceImpl implements ItemService {
	@Autowired
	private TbItemMapper itemMapper;
	@Override
    public TbItem getItemById(long itemId){
		TbItemExample example=new TbItemExample();
		//添加查询条件
		Criteria criteria=example.createCriteria();
		criteria.andIdEqualTo(itemId);
		
		List<TbItem> list=itemMapper.selectByExample(example);
		if(list!=null&&list.size()>0){
			TbItem item=list.get(0);
			return item;
		}
    	return null;
    }
	/**
	 * 水果列表查询

	 */
	@Override
	public EUDataGridResult getItemList(int page, int rows) {
		//查询水果列表
		TbItemExample example = new TbItemExample();
		//分页处理
		PageHelper.startPage(page, rows);
		List<TbItem> list = itemMapper.selectByExample(example);
		//创建一个返回值对象
		EUDataGridResult result = new EUDataGridResult();
		result.setRows(list);
		//取记录总条数
		PageInfo<TbItem> pageInfo = new PageInfo<>(list);
		result.setTotal(pageInfo.getTotal());
		return result;
	}
	@Override
	public FruitshopResult createItem(TbItem item, String desc, String itemParam)
			throws Exception {
		// TODO Auto-generated method stub
		//item补全
				//生成商品ID
				Long itemId = IDUtils.genItemId();
				item.setId(itemId);
				// '商品状态，1-正常，2-下架，3-删除',
				item.setStatus((byte) 1);
				item.setCreated(new Date());
				item.setUpdated(new Date());
				//插入到数据库
				itemMapper.insert(item);
				//添加商品描述信息
				/*FruitshopResult result = insertItemDesc(itemId, desc);
				if (result.getStatus() != 200) {
					throw new Exception();
				}
				//添加规格参数
				result = insertItemParamItem(itemId, itemParam);
				if (result.getStatus() != 200) {
					throw new Exception();
				}*/
				return FruitshopResult.ok();
	}

}