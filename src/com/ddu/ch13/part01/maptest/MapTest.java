package com.ddu.ch13.part01.maptest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		Map<String, String> map1 = new HashMap<>();
		// <객체만 들어갈 수 있음 int (x) , Integer(o)>
		
		map1.put("이름", "홍길동"); // .put() -> 데이터 삽입 ( = add)
		map1.put("직업", "개발자");
		map1.put("성별", "남자");
		// key 값은 고유의 값으로 중복 되면 덮어씌움
		// 각 값들의 이름을 명시 할 수 있음
		
		 // get() = key 값으로 value 값을 얻음
		System.out.println(map1.get("이름")); // 홍길동
		System.out.println(map1.get("직업")); // 개발자
		System.out.println(map1.get("성별")); // 남자
		
		Map<String, Integer> map2 = new HashMap<String, Integer>();
		map2.put("홍길동", 90);
		map2.put("이순신", 80);
		map2.put("김유신", 70);
		map2.put("강감찬", 75);
		
		map2.put("강감찬", 85); // 강감찬(key)의 점수가 85점(value)으로 수정
		
	}

}
