package work.com.ssafy.model;

public class LoginService {
	private LoginService() {
	}

	private static LoginService service = new LoginService();

	public static LoginService getService() {
		return service;
	}
	
	public boolean login(String id, String pass) {
		if (id.equals("ssafy") && pass.equals("1111")) {
			return true;
		} else {
			return false;
		}
	}
}
