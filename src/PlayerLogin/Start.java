package PlayerLogin;

import java.util.Scanner;

public class Start {
	private Scanner scan = new Scanner(System.in);
	
	public Start() {
		ShowMenu();
		Input(scan.nextInt());
	}
	
	public void Input(int t) {
		if (t == 1) {
			new Login();
			return;
		} else if (t == 2) {
			new Register();
			return;
		} else {
			System.out.println("다시 입력하세요! ");
			this.Input(scan.nextInt());
		}
	}
	
	private void ShowMenu() {
		System.out.println("1. Login");
		System.out.println("2. Register");
		System.out.print(">> ");
	}
}
