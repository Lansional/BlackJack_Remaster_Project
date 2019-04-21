package com.PlayerLogin;

public interface Login_and_Register {			// 로그인과 계정.....
	public String ADDRESS = "192.168.0.101";
	public int PORT = 8006;
	
	public void setUserName(String str);
	public void setPassWord(char[] passWord);
	public String getId();
	public String getPw();
}
