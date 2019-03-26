package com.Game;

public interface Card {			// 사용자와 봇의 상속 인터페이스
	public String[] Card = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };			// 포커 카드
	
	public int getSum();			// 모든 카드의 합
	public void moreOneCard();		// 카드 추가
	public int getCardSize();		// 카드 수량
	public boolean outSum();		// 카드 숫자 초과 확인
	public void startGetCard();		// 시작 카드
	public void setSum();			// 합을 매 한턴씩 저장 (setDaemon())
}
