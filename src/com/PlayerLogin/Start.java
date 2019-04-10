package com.PlayerLogin;

import java.util.Scanner;

public class Start {
	private Scanner scan = new Scanner(System.in);
	
	public Start() {
		showMenu();
		Input(scan.nextInt());
	}
	
	public void Input(int t) {
		usaClear();
		if (t == 1) {
			new Login();
			return;
		} else if (t == 2) {
			new Register();
			return;
		} else {
			System.out.println("Please re-enter! ");
			this.Input(scan.nextInt());
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
