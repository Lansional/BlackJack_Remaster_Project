package Game.SinglePlayer.Player;

import Game.SinglePlayer.SuperClass;

public class SinglePlay implements SuperClass {			// 싱글플레이
	private Object[] Card = { 'A', 2, 3, 4, 5, 6, 7, 8, 9, 10, 'J', 'Q', 'K' };			// 포커 카드
	
	
	
	@Override
	public Object[] getCard() {
		return Card;
	}
}
