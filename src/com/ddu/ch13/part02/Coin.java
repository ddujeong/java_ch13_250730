package com.ddu.ch13.part02;

public class Coin {
	private int coin; // 동전 액면 가격 (50, 100, 500)

	public Coin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Coin(int coin) {
		super();
		this.coin = coin;
	}

	public int getCoin() {
		return coin;
	}

	public void setCoin(int coin) {
		this.coin = coin;
	}
	
	
}
