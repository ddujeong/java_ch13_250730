package com.ddu.ch13.part01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strList = new ArrayList<>();
		// <클래스 이름> -> 타입 파라미터
		
		strList.add("Kor"); // 리스트에 객체를 순서대로 추가
		strList.add("Jap");
		strList.add(1, "USA"); // 지정한 인덱스 넘버에 객체 추가
		
		System.out.println(strList.get(0)); // Kor
		System.out.println(strList.get(1)); // USA
		System.out.println(strList.get(2)); // Jap
		
		System.out.println("==============================================");
		strList.remove(1); // 지정한 인덱스 객체 삭제 -> (USA)
		
		System.out.println(strList.get(0)); // Kor
		System.out.println(strList.get(1)); // Jap
		// System.out.println(strList.get(2)); // out of bounds (error)
		
		System.out.println("==============================================");
		
		// 향상된 for문
		for (String str : strList) {
			System.out.println(str);
		}
		
		System.out.println("==============================================");
		
		// iterator 사용
		Iterator<String> iterator = strList.iterator();
		
		while (iterator.hasNext()) {
			String str = iterator.next();
			
			System.out.println(str);
		}

	}
		
	}

