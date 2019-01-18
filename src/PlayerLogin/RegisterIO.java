package PlayerLogin;

import java.io.Console;

public class RegisterIO implements Login_and_Register {
//	private Object obj = null;
	private Console console = System.console();
	protected String id;		// 아이디입력
	protected char[] pW;		// 비밀번호입력
	protected String passWord;		// pW를 String으로 전환
	
	
	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String getPw() {
		// TODO Auto-generated method stub
		return null;
	}
}
