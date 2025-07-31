package com.ddu.ch13.part02;

import java.util.Scanner;
import java.util.Stack;

// (())(() -> 유효한 괄호인지 아닌지 출력하는 프로그램

public class StackQuiz02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		
		Stack<Character> strStack = new Stack<Character>();
		
		for (int i = 0; i <str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == '(') {
				strStack.push(ch);
			} else { // ')' 가 들어옴
				if (strStack.isEmpty()) {
					System.out.println("유효하지 않은 괄호 구성입니다");
					return;
				}
				strStack.pop(); // 들어옴 ')'의 짝이 추출됨
			}
		} 
		if (strStack.isEmpty()) {
			System.out.println("유효한 괄호 구성입니다");
		} else {
			System.out.println("유효하지 않은 괄호 구성입니다");
		} scanner.close();
	}

}
