package com.ddu.ch13.part01.settest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest01 {

	public static void main(String[] args) {

		Set<String> set1 = new HashSet<>();
		set1.add("Kor");
		set1.add("Jap");
		set1.add("China");
		set1.add("USA");
		
		System.out.println(set1.size()); // set1에 들어간 총 객체 수
		// 4
		
		System.out.println("==============================================");
		
		set1.add("Jap");
		set1.add("China");
		set1.add("Rusia");
		System.out.println(set1.size());
		// 5(중복 허용XXX)
		
		System.out.println("==============================================");

		Iterator<String> iter = set1.iterator();
		// set1 전용 iterator 생성
		
		// set의 모든 요소를 순회할 때까지 반복
		while (iter.hasNext()) { // 다음 set 요소(객체)가 존재하면 true 없으면 false 반환
			String setStr = iter.next(); // 현재 set 요소(객체)를 반환하고 iterator(커서)를 다음으로 이동
			if (setStr.equals("Jap")) {
				iter.remove();
			}
			System.out.println(setStr);
		}
		
		System.out.println("==============================================");
		
		set1.clear(); // 모든 요소 삭제
		
		for (String setStr : set1) {
			System.out.println(setStr);
		}
		
		if (set1.isEmpty()) {
			System.out.println("비어 있음~!");
		} else {
			System.out.println("비어 있지 않음!");
		}
		
	
	}	

}
