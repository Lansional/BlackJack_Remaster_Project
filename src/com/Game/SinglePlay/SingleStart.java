package com.Game.SinglePlay;

import java.util.Scanner;

import com.Game.SinglePlay.Player.Player;

public class SingleStart {
	private Player player;
//	private Bot bot;
	private Scanner scan = new Scanner(System.in);
	private int num = scan.nextInt();
	
	public SingleStart() {
		player = new Player();
//		bot = new Bot();
	}
	
	public void run() {
		player.start();
//		bot.start();
		
		try {
			player.join();
//			bot.join();
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
	}
	
	public void printSum() {
		System.out.println("���� ī�� ��: " + player.getSum());
//		System.out.println("���� ��: "+ bot.getSum());
	}
	
	public void someInformation() {
		System.out.println();
		System.out.println(" =*******************=");
		System.out.println(" =  1. moreOneCard   =");
		System.out.println(" =  2. continue		 =");
		System.out.println(" =    				 =");
		System.out.println(" =*******************=");
		System.out.println();
	}
}
