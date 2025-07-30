package com.ddu.ch13.part01.maptest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIteratorTest {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<String, String>();
		
		map.put("이름", "홍길동");
		map.put("직업", "개발자");
		map.put("직장", "서울자동차");
		
		Iterator<String> iter = map.keySet().iterator();
		//  map의 keyset()을 통해 key만 모은 set을 가져오고 그에 대해 iterator 생성
		
		while (iter.hasNext()) {
			String key = iter.next(); // key를 추출
			map.get(key); // key 값을 사용하여 value를 추출
			System.out.println(map.get(key));
		} 
		System.out.println("================================");
		
		Iterator<Map.Entry<String, String>> iter2 = map.entrySet().iterator();
		// 키 , 값 한쌍에 대해서 iterator 사용
		
		while (iter2.hasNext()) {
			Map.Entry<String, String>entry = iter2.next();
			System.out.println(entry.getKey()); // key 값 가져오기
			System.out.println(entry.getValue()); // value 값 가져오기
		}
		
		
	}

}
