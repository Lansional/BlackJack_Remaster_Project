package com.Game.SinglePlay.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.Game.Card;

public class Player extends Thread implements Card {			// ΩÃ±€«√∑π¿Ã
	private List<String> playerCard;
	private Random rand;
	private int sum;
	private Scanner scan = new Scanner(System.in);
	
	public Player() {
		sum = 0;
		playerCard = new ArrayList<String>();
		rand = new Random(Card.length);
		startGetCard();
	}
	
	@Override
	public void run() {
		while (outSum()) {
			if ()
				
		}
	}
	
	public int input() {
		return scan.nextInt();
	}
	
	@Override
	public void startGetCard() {
		for (int i = 0; i < 2; i++) {
			moreOneCard();
		}
	}
	
	@Override
	public boolean outSum() {
		if (getSum() >= 12) {
			return true;
		}
		return false;
	}
	
	@Override
	public int getCardSize() {
		return playerCard.size();
	}
	
	@Override
	public int getSum() {
		return sum;
	}
	
	@Override
	public void moreOneCard() {
		playerCard.add(Card[rand.nextInt()]);
	}
}
