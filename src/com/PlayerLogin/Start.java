package com.PlayerLogin;

public class Start {
	private String ADDRESS;
	private int PORT;
	
	public Start(String address, int port) {
		this.ADDRESS = address;
		this.PORT = port;
	}
	
	public void Input(int t) {
		usaClear();
		if (t == 1) {
			new Login();
			return;
		} else if (t == 2) {
			new Register(ADDRESS, PORT);
			return;
		} else {
			System.out.println("Please Try Again! ");
			System.exit(0);
		}
	}
	
	public void usaClear() {											// 유사 리눅스 명령어 "clear"
		for (int i = 0; i < 100; i++) {
			System.out.println();
		}
	}
	
	public void showMenu() {
		System.out.println("1. Login");
		System.out.println("2. Register");
		System.out.println("(1 or 2)");
		System.out.print(">> ");
	}
}
