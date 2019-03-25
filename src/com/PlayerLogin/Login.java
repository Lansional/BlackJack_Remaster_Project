package com.PlayerLogin;

import java.io.Console;

public class Login implements Login_and_Register {
	private String userName;		// �����̸��Է�
	private String passWord;		// pW�� String���� ��ȯ
	private Console console = System.console();
	
	public Login() {
		System.out.print("UserName: ");
		setUserName(console.readLine());
		System.out.print("PassWord: ");
		setPassWord(console.readPassword());
	}
	
	public boolean ckeckThePassWord(String str) {
		if (passWord.equals(str)) {
			return true;
		}
		return false;
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
	public void setUserName(String str) {
		if (str == null) {
			System.err.println("�Է°��� �����ϴ�.");
			new Login();
			return;
		}
		this.userName = str;
	}

	@Override
	public void setPassWord(char[] passWord) {
		if (passWord.length == 0) {
			System.err.println("�Է°��� �����ϴ�.");			
			new Login();
			return;
		}
		this.passWord = String.valueOf(passWord);
	}
}
