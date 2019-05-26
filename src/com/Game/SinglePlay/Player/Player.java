package com.Game.SinglePlay.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.function.Function;

import com.Game.PlayerInterface;

public class Player extends Thread implements PlayerInterface {			// Player
	private List<String> playerCard;												// 리스트로 사용자가 얻은 카드 저장
	private static int sum;															// 리스트의 사용자가 얻은 카드의 값의 합을 저장하는 변수
	private Scanner scan = new Scanner(System.in);								// Scanner (컴퓨터는 필요없음)
	
	public Player() {
		super("Play");																	// 쓰레드 그룹의 이름 저장
		playerCard = new ArrayList<String>();										// 리스트 초기화
		
		startGetCard();																	// 시작
	}
	
	@Override
	public void run() {
		while (outSum()) {
			System.out.println("Your Card: " + playerCard + " sum : " + getSum());
			
			int num = input();
			
			if (num == 1) {
				moreOneCard();
			} else if (num == 2) {
				yield();
			} else {
				System.out.println("Please Input Again!");				
			}
			setSum();
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
	public void setSum() {
		Function<List<String>, Integer> function = (T) -> {
			ListIterator<String> listIterator = T.listIterator();
			int sum = 0;
			
			while (listIterator.hasNext()) {
				try {
//					sum += listIterator.next();
					sum += Integer.parseInt(listIterator.next());
				} catch (NumberFormatException nfe) {
					nfe.printStackTrace();
				}
			}
			
			return sum;
		};
		
		sum = function.apply(playerCard);
	}
	
	@Override
	public int getSum() {
		return sum;
	}
	
	@Override
	public void moreOneCard() {
		playerCard.add(Card[(int)(Math.random() * (CARD_LENG - 1)) + 1]);
	}
}
