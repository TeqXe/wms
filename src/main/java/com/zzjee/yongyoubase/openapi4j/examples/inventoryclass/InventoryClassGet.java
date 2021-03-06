package com.zzjee.yongyoubase.openapi4j.examples.inventoryclass;

import com.zzjee.yongyoubase.openapi4j.exception.OpenAPIException;
import com.zzjee.yongyoubase.openapi4j.service.InventoryClassService;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.alibaba.fastjson.JSONObject;

public class InventoryClassGet {
	final static Logger logger = LogManager.getLogger(InventoryClassGet.class);

	public static void main(String[] args) {
		String to_account = args[0];	//	提供方id
		String id = args[1];			//	存货分类编码
		InventoryClassService ds = new InventoryClassService();
		try {
			JSONObject record = ds.get(id, to_account);
			logger.info(record.toString());
		} catch (OpenAPIException e) {
			e.printStackTrace();
		}
	}
}
