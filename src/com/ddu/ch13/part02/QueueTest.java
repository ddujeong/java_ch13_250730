package com.ddu.ch13.part02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest { // 선입선출

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> queue = new LinkedList<String>();
		queue.offer("1) kor");
		queue.offer("2) jap");
		queue.offer("3) usa");
		
		while (!queue.isEmpty()) {
			System.out.println(queue.poll());
			
		}
	}

}
