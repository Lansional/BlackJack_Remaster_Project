package com.Main;

import java.util.Scanner;

import com.Game.Menu;
import com.PlayerLogin.Start;

public class GameMain {		// Main 함수

	public static void main(String[] args) {
		// start
		Start start = new Start();
		Scanner scan = new Scanner(System.in);
		start.showMenu();
		start.Input(scan.nextInt());
		
		// menu
//		new Menu();
	}

}
