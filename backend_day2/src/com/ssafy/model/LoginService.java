package com.ssafy.model;

public class LoginService {
	private LoginService() {
	}

	private static LoginService service = new LoginService();

	public static LoginService getService() {
		return service;
	}
	// 개별적인 파라미터가 아닌 DTO 레퍼런스 전달로 메서드 호출 간편화
	public UserInfo login(UserInfo info) {
		if(info.getId().equals("hong") && info.getPass().equals("1234")) {
			info.setNick("율도국왕");
			return info;
		}else {
			return null;
		}
	}
	
	public String login(String id, String pass) {
		if(id.equals("hong") && pass.equals("1234")) {
			return "율도국왕";
		}else {
			return null;
		}
	}
}
