package com.naidu.threadexamples;

public class Thread1 extends Thread {

	@Override
	public void run() {
		for (int i = 1; i < 1000; i++) {
			System.out.println(i);
		}
	}

}
