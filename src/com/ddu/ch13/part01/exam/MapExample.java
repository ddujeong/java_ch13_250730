package com.ddu.ch13.part01.exam;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		map.put("red", 99);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
		Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator();
		
		while (iter.hasNext()) {
			Map.Entry<String, Integer> entry = iter.next();
			entry.getKey();
			entry.getValue();
			if (entry.getValue() > maxScore) {
				maxScore = entry.getValue();
				name = entry.getKey(); // key 값 -> id 값 가져오기
				// 마지막 if 조건문이 참인 시점 -> 최고값은 maxScore로 바뀜
				// 마지막 if 조건문이 참인 시점 -> 키값은 maxscore의 id값이 name 으로 바뀜
			}
			totalScore = totalScore + entry.getValue();
		}System.out.println("최고 점수 : " +maxScore);
		System.out.println("평균 점수 : " + (double)totalScore / map.size());
		System.out.println("최고 점수를 받은 아이디 : " + name);
		
		
		
		
//		Set<Map.Entry<String, Integer>> entry2 = map.entrySet();
//		for (Map.Entry<String, Integer> entry : entry2) {
//			entry.getKey();
//			entry.getValue();
//			
//		}
	
	}

}
