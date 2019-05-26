package com.PlayerLogin;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Arrays;
import java.util.function.Predicate;

/**
 * <계정 만들기>
 * 비번을 두번 확인한다.
 * 그리고 신호, 입력한 아이디, 비번을 서버쪽으로 보낸다.
 * @author jacky
 */
public class Register implements Login_and_Register {
	private final static String SIGNAL = "Register";						// 서버로 Register 신호보낸다
	private String id, passWord;												// 아이디, 비번	
	private static int soMoreWrong;												// 만약에 비번이 3번이상 틀렸다면 시스템 종료
	
	public Register() {
		System.out.print("UserName: ");
		setUserName(console.readLine());
		System.out.print("PassWord: ");
		setPassWord(console.readPassword());
		while (true) {
			System.out.print("Please Input PassWord OneMoreTime: ");
			if (checkPassword(console.readPassword())) {
				break;
			} else {
				if (soMoreWrong >= 3) {
					System.out.println("Sorry! Please start again");
					System.exit(0);					
				}
				System.err.println("Not same passWord input, please try again!");
				soMoreWrong++;
			}
		}
		if (!information()) {
			System.exit(0);
		}
		System.out.println("Please Login!!");
		new Login();							// 계정만들기 성공했다면 로그인 클래스로
	}
	
	@Override
	public boolean information() {			// tcp/ip로 모든 정보를 보내기
		Socket socket = null;
		
		try {
			socket = new Socket(ADDRESS, PORT);
			
			DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
			// 신호, 아이디, 비번을 보낸다.
			outputStream.writeUTF(SIGNAL);
			outputStream.writeUTF(id);
			outputStream.writeUTF(passWord);
			return true;
		} catch (IOException ioe) {
			System.out.println(ioe.getMessage());
			return false;
		}
	}
	
	@Override
	public boolean checkPassword(char[] pW) {
		if (Arrays.equals(passWord.toCharArray(), pW)) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public String getId() {
		return id;
	}
	
	@Override
	public void setUserName(String id) {			// Setter: UserName
		if (id == null) {
			System.err.println("id is not input please retry");
			new Login();
			return;
		}
		this.id = id;
	}

	@Override
	public void setPassWord(char[] passWord) {			// Setter: PassWord
		this.passWord = String.valueOf(passWord);
	}

	@Override
	public String getPw() {									// getter: PassWord
		return passWord;
	}
}
