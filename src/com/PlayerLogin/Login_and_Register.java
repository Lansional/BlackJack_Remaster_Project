package com.PlayerLogin;

import java.io.Console;

public interface Login_and_Register {
	String ADDRESS = "192.168.0.104";
	int PORT = 8006;
	Console console = System.console();
	
	void setUserName(String str);						// userName 필드 setter
	void setPassWord(char[] passWord);					// passWord 필드 setter
	boolean checkPassword(char[] pW);					// passWord 체크
	boolean information();								// 서버과 통신 메소드
	String getId();											// userName 필드 getter
	String getPw();											// passWord 필드 getter
}
