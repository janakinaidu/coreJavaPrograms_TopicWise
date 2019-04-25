package com.naidu.threadexamples;

public class MyThread extends Thread {
	
	public void run(){
		System.out.println("current Thread name="+Thread.currentThread().getName());
		System.out.println("run() method is called");
	}
}
