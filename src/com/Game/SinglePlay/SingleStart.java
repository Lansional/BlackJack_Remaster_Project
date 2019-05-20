package com.Game.SinglePlay;

import com.Game.SinglePlay.Player.Player;

public class SingleStart {
	private Player player;
//	private Bot bot;
	
	public SingleStart() {
		someInformation();
		player = new Player();
		readyStart();
	}
	
	public void readyStart() {
		player.start();
		player.setDaemon(true);
//		bot = new Bot();
		
		try {
			player.join();
			System.out.println("== 게임 종료 ==");
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
	}
	
	public void someInformation() {
		System.out.println();
		System.out.println(" =*******************=");
		System.out.println(" =  1. moreOneCard   =");
		System.out.println(" =  2. continue	     =");
		System.out.println(" =                   =");
		System.out.println(" =*******************=");
		System.out.println();
	}
}
