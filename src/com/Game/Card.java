package com.Game;

/**
 * Card라고 이름을 지었지만
 * 사실은 플레이어와 AI클래서 상속하는 인터페이스
 * @author jacky
 * @param String[] card 포커
 */
public interface Card {
	public String[] Card = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
	
	public int CARD_LENG = Card.length;
	
	// 합의 getter && setter
	public int getSum();
	public void setSum();
	
	public void moreOneCard();		// 한장더
	public int getCardSize();		// 카드 사이즈 확인
	public boolean outSum();		// 카드의 합이 21을 넘었더라면
	public void startGetCard();		// 시작할때 주는 카드
}
