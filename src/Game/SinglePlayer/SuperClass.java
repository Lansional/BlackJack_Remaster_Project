package Game.SinglePlayer;

import java.util.ArrayList;

public interface SuperClass {			// ����ڿ� ���� ��� �������̽�
	public Object[] Card = { 'A', 2, 3, 4, 5, 6, 7, 8, 9, 10, 'J', 'Q', 'K' };			// ��Ŀ ī��
	
	public ArrayList<Object> getCard();
	public int getSum();
}
