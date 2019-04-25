package com.naidu.threadexamples;

public class FirstThread extends Thread {

	public void run() {
		System.out.println("Current Thread name="
				+ Thread.currentThread().getName());
		System.out.println("run() method is called");
	}
}
