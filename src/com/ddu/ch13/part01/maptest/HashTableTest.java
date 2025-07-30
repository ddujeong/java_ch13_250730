package com.ddu.ch13.part01.maptest;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashTableTest {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("tiger", "12345"); // id, pw
		map.put("lion", "88888");
		map.put("blackcat", "99999");
		map.put("whitedog", "12345");
		
		Scanner scanner = new Scanner(System.in);
	
	
		while (true) {
			System.out.print("아이디 : ");
			String id = scanner.nextLine();
			System.out.print("비밀번호 : ");
			String pw = scanner.nextLine();
			System.out.println("=================================");
			
			if (map.containsKey(id)) {
				// map에 들어있는 데이터의 값들 중에 일치하는 값이 존재하면 true
				if (map.get(id).equals(pw)) {
					System.out.println("로그인 성공하셨습니다.");
					break;
				} else { // id 값은 존재하나 비밀번호가 틀렸을때
					System.out.println("비밀번호를 잘못 입력하셨습니다.");
				} 
			} else {
				System.out.println("입력하신 id가 존재하지 않습니다.");
			}
		} scanner.close();
	
	
	}

}
