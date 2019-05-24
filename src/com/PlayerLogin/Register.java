package com.PlayerLogin;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Arrays;

public class Register implements Login_and_Register {
	private String id, passWord;
	private static int soMoreWrong;
	
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
					System.out.println("Sorry! Please try again");
					System.exit(0);					
				}
				System.err.println("Not Same PassWord input!");
				soMoreWrong++;
			}
		}
		if (!information()) {
			System.err.println("서버가 실행하지 않았습니다.");
			System.exit(0);
		}
		System.out.println("Please Login!!");
//		new Login();
	}
	
	@Override
	public boolean information() {			// tcp/ip로 모든 정보를 보내기
		Socket socket = null;
		
		try {
			socket = new Socket(ADDRESS, PORT);
			
			DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
			
			outputStream.writeUTF(id);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
			
			outputStream.writeUTF(passWord);
			return true;
		} catch (IOException ioe) {
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
	public String getPw() {
		return passWord;
	}
}
