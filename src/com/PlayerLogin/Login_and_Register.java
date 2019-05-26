package com.PlayerLogin;

import java.io.Console;

/**
 * 클라이언트쪽 주요 인터페이스
 * @author jacky
 */
public interface Login_and_Register {
	Console console = System.console();				// 자식 클래스가 다 사용할수 있도록
	
	void setUserName(String str);						// userName 필드 setter
	void setPassWord(char[] passWord);					// passWord 필드 setter
	boolean checkPassword(char[] pW);					// passWord 체크
	boolean information();								// 서버과 통신 메소드
	String getId();											// userName 필드 getter
	String getPw();											// passWord 필드 getter
}
