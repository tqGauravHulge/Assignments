package com.itemsupplier;

import java.util.List;

public class Supplier {
	private int regNo;
	private String sname;
	List<Item> itemList;

	public Supplier() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Supplier(int regNo, String sname, List<Item> itemList) {
		super();
		this.regNo = regNo;
		this.sname = sname;
	}

	public int getRegNo() {
		return regNo;
	}

	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public List<Item> getItemList() {
		return itemList;
	}

	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}

	public void addItem(Item Item) {
		itemList.add(Item);
	}

	@Override
	public String toString() {
		return "Supplier [regNo=" + regNo + ", sname=" + sname + ", itemList=" + itemList + "]";
	}

}
