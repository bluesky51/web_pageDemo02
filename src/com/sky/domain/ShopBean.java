package com.sky.domain;

import java.util.List;

public class ShopBean {
	
	private List<Shop> list ;//每页的数据内容
	private  int pageNo;//当前页
	private  int totalPage;//总页数
	public List<Shop> getList() {
		return list;
	}
	public void setList(List<Shop> list) {
		this.list = list;
	}
	public int getPageNo() {
		return pageNo;
	}
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	@Override
	public String toString() {
		return "ShopBean [list=" + list + ", pageNo=" + pageNo + ", totalPage=" + totalPage + "]";
	}
	
	
	

}
