package Game.SinglePlayer.Player;

import Game.SinglePlayer.SuperClass;

public class SinglePlay implements SuperClass {			// �̱��÷���
	private Object[] Card = { 'A', 2, 3, 4, 5, 6, 7, 8, 9, 10, 'J', 'Q', 'K' };			// ��Ŀ ī��
	
	
	
	@Override
	public Object[] getCard() {
		return Card;
	}
}
