package com.naidu.threadexamples;

public class FirstThreadTest {

	public static void main(String[] args) {
		
		FirstThread ft = new FirstThread();
//		ft.start();
//		ft.start();
		
		ft.run();
		System.out.println("***");
		ft.run();
	}

}


/*
 *Exception in thread "main" java.lang.IllegalThreadStateException at
 * java.lang.Thread.start(Unknown Source) at
 * com.naidu.threadexamples.FirstThreadTest.main(FirstThreadTest.java:9)
 */