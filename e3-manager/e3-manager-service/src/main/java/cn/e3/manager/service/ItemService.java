package cn.e3.manager.service;

import cn.e3.pojo.TbItem;

public interface ItemService {
	
	/**
	 * é?æ±?:æ ¹æ®ååidæ¥è¯¢ååæ°æ®
	 * åæ°:Long itemId
	 * è¿åå?:TbItem
	 */
	public TbItem findItemById(Long itemId);

}
