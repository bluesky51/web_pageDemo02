package com.sky.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.sky.dao.ShopDao;
import com.sky.dao.impl.ShopDaoImpl;
import com.sky.domain.Shop;
import com.sky.domain.ShopBean;
import com.sky.service.ShopService;

public class ShopServiecImpl implements ShopService {

	ShopDao shopDao=new ShopDaoImpl();
	@Override
	public ShopBean getDateByPage(int pageNo1, int pageSize1) {
		// TODO Auto-generated method stub
		ShopBean shopBean =new ShopBean();
		try {
			shopBean.setPageNo(pageNo1);
             //获取表中总的条数
			long totalCount = shopDao.queryTotalCount();
			//计算总页数
			int totalPage  = (int)Math.ceil(totalCount/pageSize1);
			shopBean.setTotalPage(totalPage);
			List<Shop> list = shopDao.queryShoList(pageNo1, pageSize1);
			shopBean.setList(list);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return shopBean;
	}

}
