package com.ssafy.model;

public class CalcService {
	// 비지니스 로직 처리를 위한 모델 - 사용자마다 있을 필요는 없다
	// Singleton design
	private static CalcService service = new CalcService();
	
	public static CalcService getService() {
		return service;
	}
	
	private CalcService() {}
	
	
	public int add(int num1, int num2) {
		return num1 + num2;
	}
}
