package com.ddu.ch13.part02;

import java.util.Stack;

public class StackTest {// 후입선출

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Stack<String> stack1 = new Stack<String>();
	
	stack1.push("1) kor");
	stack1.push("2) jap");
	stack1.push("3) usa");
	
	while (!stack1.empty()) {
		// stack 이 비어있으면 true
		// (!) 비어 있지 않으면 false
		String str = stack1.pop();
		// .pop은 하나씩 빼줌
		System.out.println(str);
		// 3) usa 2) jap 1) kor
	} 

	}

}
