package PlayerLogin;

import java.io.Console;

public class Login implements Login_and_Register {
	private Console console = System.console();
	protected String userName;		// �����̸��Է�
	protected char[] pW;		// ��й�ȣ�Է�
	protected String passWord;		// pW�� String���� ��ȯ
	
	public Login() {
		System.out.print("UserName: ");
		inputUserName(console.readLine());
		System.out.print("PassWord: ");
		inputPassWord(console.readPassword());
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
		this.userName = str;
	}

	@Override
	public void inputPassWord(char[] passWord) {
		pW = passWord;
		this.passWord = String.valueOf(passWord);
	}
	
	public boolean IOchekckAll() {
		boolean check = false;
		
		
		
		return check;
	}
}
