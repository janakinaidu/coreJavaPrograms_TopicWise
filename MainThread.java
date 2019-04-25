package com.naidu.threadexamples;

public class MainThread {

	public static void main(String[] args) {
		
		//creating first Thread
		Thread1 t1 = new Thread1();
		t1.run();
		
		//creating second thread
		Thread2 t2 = new Thread2();
//		t2.start();

	}

}
