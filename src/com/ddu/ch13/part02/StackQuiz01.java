package com.ddu.ch13.part02;

import java.util.Stack;

public class StackQuiz01 {
// 문자열 뒤집기 : Hello 문자열을 거꾸로 출력하시오.
	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Stack<Character> stack = new Stack<Character>();
//		stack.push('H');
//		stack.push('e');
//		stack.push('l');
//		stack.push('l');
//		stack.push('o');
//		
//		while (!stack.isEmpty()) {
//			System.out.print(stack.pop());
//		}
		
		String str = "Hello";
		Stack<Character> strStack = new Stack<Character>();
		
		for (int i = 0;i <str.length();i++ ) {
			Character ch = str.charAt(i);
			strStack.push(ch);
		}
		while (!strStack.isEmpty()) {
			System.out.print(strStack.pop());
		}
	}

}
