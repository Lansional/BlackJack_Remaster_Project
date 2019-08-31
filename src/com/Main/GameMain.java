package com.Main;

import java.util.Scanner;

// import com.Game.Menu;
import com.PlayerLogin.Start;

public class GameMain {		// Main 함수
	private final static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("서버의 주소값을 입력하세요: ");
		String address = scan.next();
		System.out.print("서버의 포트번호를 입력하세요: ");
		int port = scan.nextInt();
		
		// System.out.println(address);
		// start
		Start start = new Start(address, port);
		start.showMenu();
		start.Input(scan.nextInt());
		
		// menu				 Start가 끝나면 바로 Menu가 실행한다. (아직 통신은 완성 못함)
//		new Menu();
	}

}
