package com.Game;

public interface Card {			// ����ڿ� ���� ��� �������̽�
	public String[] Card = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };			// ��Ŀ ī��
	
	public int getSum();			// ��� ī���� ��
	public void moreOneCard();		// ī�� �߰�
	public int getCardSize();		// ī�� ����
	public boolean outSum();		// ī�� ���� �ʰ� Ȯ��
	public void startGetCard();		// ���� ī��
	public void setSum();			// ���� �� ���Ͼ� ���� (setDaemon())
}
