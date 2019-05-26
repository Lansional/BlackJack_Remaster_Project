package com.PlayerLogin;

import java.io.Console;

/**
 * 클라이언트쪽 주요 인터페이스
 * @author jacky
 */
public interface Login_and_Register {
	String ADDRESS = "192.168.0.104";					// ADDRESS: 내집 와이파이 주소값 (후로는 사용자보고 입력한다.)
	int PORT = 8006;										// PORT: 8080임의 값 (후로는 사용자보고 입력한다.)
	Console console = System.console();				// 자식 클래스가 다 사용할수 있도록
	
	void setUserName(String str);						// userName 필드 setter
	void setPassWord(char[] passWord);					// passWord 필드 setter
	boolean checkPassword(char[] pW);					// passWord 체크
	boolean information();								// 서버과 통신 메소드
	String getId();											// userName 필드 getter
	String getPw();											// passWord 필드 getter
}
