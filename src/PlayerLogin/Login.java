package PlayerLogin;

import java.io.Console;
import java.io.DataInputStream;
import java.io.FileInputStream;

public class Login implements Login_and_Register {
	private Console console = System.console();
	private String userName;		// 유저이름입력
	private String passWord;		// pW를 String으로 전환
	
	public Login() {
		System.out.print("UserName: ");
		setUserName(console.readLine());
		System.out.print("PassWord: ");
		setPassWord(console.readPassword());
	}
	
//	public void findInformation() {
//		DataInputStream dataInputStream = null;
//		try {
//			dataInputStream = new DataInputStream(new FileInputStream(informationFile + userName + ".dat"));
//			while (true) {
//				
//			}
//		}
//	}
	
	@Override
	public String getId() {
		return userName;
	}

	@Override
	public String getPw() {
		return passWord;
	}
	
	@Override
	public void setUserName(String str) {
		if (str == null) {
			System.err.println("입력값이 없습니다.");
			new Login();
			return;
		}
		this.userName = str;
	}

	@Override
	public void setPassWord(char[] passWord) {
		if (passWord.length == 0) {
			System.err.println("입력값이 없습니다.");			
			new Login();
			return;
		}
		this.passWord = String.valueOf(passWord);
	}
}
