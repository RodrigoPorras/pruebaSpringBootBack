package com.prueba.pruebaSpringBootBack.util;

import java.util.List;

public class QueryResult {
	
	private int tontalRecords;
	private List<Object> list;
	
	public int getTontalRecords() {
		return tontalRecords;
	}
	public void setTontalRecords(int tontalRecords) {
		this.tontalRecords = tontalRecords;
	}
	public List<Object> getList() {
		return list;
	}
	public void setList(List<Object> list) {
		this.list = list;
	}
	
	
}
