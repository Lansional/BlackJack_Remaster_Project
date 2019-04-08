package com.PlayerLogin;

import java.io.Console;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Arrays;

public class Register implements Login_and_Register {
	private Console console = System.console();
	private String id, passWord;
	private static int soMoreWrong;
	
	public Register() {
		System.out.print("UserName: ");
		setUserName(console.readLine());
		inputPassWord();
		inputInformation();
		System.out.println("Please Login!!");
		new Login();
	}
	
	public void inputInformation() {			// tcp/ip 서버로 비번과 아이디 보내기
		Socket socket = null;
		
		try {
			socket = new Socket("192.168.0.101", 1720);
			
			DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
			
			outputStream.writeUTF(id);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
			
			outputStream.writeUTF(passWord);
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
	
	public void inputPassWord() {
		System.out.print("PassWord: ");
		setPassWord(console.readPassword());
		System.out.print("Please Input PassWord OneMoreTime: ");
		if (equalsPassword(console.readPassword())) {
			return;
		} else {
			soMoreWrong++;
			System.err.println("Not Same PassWord input!");
			inputPassWord();
			if (soMoreWrong >= 3) {
				System.out.println("Sorry! Please try again");
				System.exit(0);
			}
		}
	}
	
	public boolean equalsPassword(char[] pW) {
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
			System.err.println("입력값이 없습니다.");
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
