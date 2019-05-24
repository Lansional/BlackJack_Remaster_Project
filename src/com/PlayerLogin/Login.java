package com.PlayerLogin;

import java.io.DataInputStream;
import java.net.Socket;

public class Login implements Login_and_Register {
	private String userName;		// 아이디
	private String passWord;		// 비밀번호
	
	public Login() {							// 생성자로 바로 로그인
		System.out.print("UserName: ");
		setUserName(console.readLine());
		System.out.print("PassWord: ");
		setPassWord(console.readPassword());
	}
	
//	public boolean getInformationAtServer() {						// 서버쪽으서 데이터 얻기
//		Socket socket = null;
//		
//		try {
//			socket = new Socket(ADDRESS, PORT);
//			DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
//			
//		}
//	}
	
//	public boolean checkTheUserName(String str) {					// UserName 체크
//		
//	}
	
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
			System.err.println("이름이 입력하지 않았습니다.");
			new Login();
			return;
		}
		this.userName = str;
	}

	@Override
	public void setPassWord(char[] passWord) {
		if (passWord.length == 0) {
			System.err.println("비번이 입력하지 않았습니다.");
			new Login();
			return;
		}
		this.passWord = String.valueOf(passWord);
	}

	@Override
	public boolean checkPassword(char[] pW) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean information() {
		// TODO Auto-generated method stub
		return false;
	}
}
