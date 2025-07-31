package com.ddu.ch13.part02;

import java.util.Stack;

public class CoinMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Coin> coinBox = new Stack<Coin>();
		// Coin 클래스로 만든 객체만 들어올 수 있는 stack
		
		coinBox.push(new Coin(100)); // 100원짜리 1개 생성 
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		
		while (!coinBox.isEmpty()) {
			Coin coin = coinBox.pop(); // 코인박스에서 동전 빼기
			System.out.println("꺼내온 동전 : " + coin.getCoin());
		}
	}

}
