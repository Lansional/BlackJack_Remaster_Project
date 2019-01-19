package PlayerLogin;

import java.io.Console;

public class Login implements Login_and_Register { // Cloneable {
	private Console console = System.console();
	protected String userName;		// 유저이름입력
	protected char[] pW;		// 비밀번호입력
	protected String passWord;		// pW를 String으로 전환
	
	public Login() {
		System.out.print("UserName: ");
		inputUserName(console.readLine());
		System.out.print("PassWord: ");
		inputPassWord(console.readPassword());
		ioCheck<Login> login = new ioCheck<Login>(this);
	}
	
	@Override
	public String getId() {
		return userName;
	}

	@Override
	public String getPw() {
		return passWord;
	}
	
	@Override
	public void inputUserName(String str) {
		if (str == null) {
			System.err.println("입력값이 없습니다.");
			new Login();
			return;
		}
		this.userName = str;
	}

	@Override
	public void inputPassWord(char[] passWord) {
		if (passWord.length == 0) {
			System.err.println("입력값이 없습니다.");			
			new Login();
			return;
		}
		pW = passWord;
		this.passWord = String.valueOf(passWord);
	}
	
//	public Login deepClone() {		// 강한 복사
//		Object obj = null;
//		
//		try {
//			obj = super.clone();
//		} catch (CloneNotSupportedException e) {
//			e.printStackTrace();
//		}
//		
//		Login login = (Login) obj;
//		return login;
//	}
}
