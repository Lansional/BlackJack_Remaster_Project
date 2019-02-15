package Game.SinglePlayer;

import java.util.ArrayList;

public interface SuperClass {			// 사용자와 봇의 상속 인터페이스
	public Object[] Card = { 'A', 2, 3, 4, 5, 6, 7, 8, 9, 10, 'J', 'Q', 'K' };			// 포커 카드
	
	public ArrayList<Object> getCard();
	public int getSum();
}
