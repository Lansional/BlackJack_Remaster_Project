package Game.SinglePlayer.Player;

import java.util.ArrayList;
import java.util.Random;

import Game.SinglePlayer.SuperClass;

public class SinglePlay implements SuperClass {			// ΩÃ±€«√∑π¿Ã
	private ArrayList<Object> playerCard;
	private Random rand;
	
	public SinglePlay() {
		playerCard = new ArrayList<Object>();
		rand = new Random(Card.length);
		
		moreOneCard();
	}
	
	@Override
	public ArrayList<Object> getCard() {
		return playerCard;
	}
	
	public void moreOneCard() {
		playerCard.add(Card[rand.nextInt()]);
	}
}
