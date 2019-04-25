package com.naidu.threadexamples;

public class MyRunnableClass implements Runnable {

	@Override
	public void run() {
		System.out.println("run() method in MyRunnableClass");
		System.out.println("current Thread name="
				+ Thread.currentThread().getName());

	}

	public static void main(String[] args) {
		MyRunnableClass mr = new MyRunnableClass();
		mr.run();
	}
}
