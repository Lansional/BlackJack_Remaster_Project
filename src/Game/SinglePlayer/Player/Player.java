package Game.SinglePlayer.Player;

import java.util.ArrayList;
import java.util.Random;

import Game.SinglePlayer.SuperClass;

public class Player extends Thread implements SuperClass {			// ΩÃ±€«√∑π¿Ã
	private ArrayList<Object> playerCard;
	private Random rand;
	private int sum;
	
	public Player() {
		sum = 0;
		playerCard = new ArrayList<Object>();
		rand = new Random(Card.length);
	}
	
	@Override
	public void run() {
		
	}
	
	@Override
	public ArrayList<Object> getCard() {
		return playerCard;
	}
	
	@Override
	public int getSum() {
		return sum;
	}
	
	public void moreOneCard() {
		playerCard.add(Card[rand.nextInt()]);
	}
}
