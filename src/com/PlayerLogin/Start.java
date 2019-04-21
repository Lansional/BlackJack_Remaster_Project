package com.PlayerLogin;

public class Start {
	
	public void Input(int t) {
		usaClear();
		if (t == 1) {
			new Login();
			return;
		} else if (t == 2) {
			new Register();
			return;
		} else {
			System.out.println("Please Try Again! ");
			System.exit(0);
		}
	}
	
	public void usaClear() {
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
