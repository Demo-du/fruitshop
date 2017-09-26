package com.fruitshop.service.impl;
import java.util.Date;
import java.util.List;

import com.fruitshop.pojo.*;
import com.fruitshop.service.ItemParamService;
import com.fruitshop.pojo.TbItemParamExample.Criteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fruitshop.common.pojo.FruitshopResult;
import com.fruitshop.mapper.TbItemParamMapper;

/*
 * 水果规格参数
 */
@Service
public class ItemParamServiceImpl implements ItemParamService {

	@Autowired
	private TbItemParamMapper itemParamMapper;
	
	@Override
	public FruitshopResult getItemParamByCid(long cid) {
		TbItemParamExample example = new TbItemParamExample();
		Criteria criteria = example.createCriteria();
		criteria.andItemCatIdEqualTo(cid);
		List<TbItemParam> list = itemParamMapper.selectByExampleWithBLOBs(example);
		//判断是否查询到结果
		if (list != null && list.size() > 0) {
			return FruitshopResult.ok(list.get(0));
		}
		
		return FruitshopResult.ok();
	}

	@Override
	public FruitshopResult insertItemParam(TbItemParam itemParam) {//插入保存
		//补全pojo
		itemParam.setCreated(new Date());
		itemParam.setUpdated(new Date());
		//插入到规格参数模板表
		itemParamMapper.insert(itemParam);
		return FruitshopResult.ok();
	}

}