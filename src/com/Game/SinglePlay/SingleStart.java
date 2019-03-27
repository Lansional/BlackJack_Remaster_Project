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
//		bot = new Bot();
				
		try {
			player.join();
//			bot.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
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
