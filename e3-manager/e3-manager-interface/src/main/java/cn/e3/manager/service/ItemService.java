package cn.e3.manager.service;

import cn.e3.pojo.TbItem;
import cn.e3.utils.EasyUIPageBean;

public interface ItemService {
	
	/**
	 * 需求:根据商品id查询商品数据
	 * 参数:Long itemId
	 * 返回值:TbItem
	 */
	public TbItem findItemById(Long itemId);
	/**
	 * 需求:查询商品数据,进行 分页展示
	 * 参数:Integer page,Integer rows
	 * 返回值:EasyUIPageBean
	 */
	public EasyUIPageBean findItemListByPage(Integer page,Integer rows);

}
