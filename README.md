# MultiThreading Concept

Threads:
========
Application :

Application:
->is a program which is designed to perform a specific task

Process:
--------
->Process is an executing instance of an application.

Thread :
--------
->Thread is a smallest executable unit of a process

Multitasking :
-------------
i) Process-based multitasking Or Multiprocessing :
ii)Thread-based Multitasking  Or Multithreading:

There are two ways for creating a thread;
i)By extending the java.lang.Thread class;
ii)By implementing the java.lang.Runnable;

Q)what is the difference between callings start() and run() method directly?

The difference is that when program calls start() method, a new thread is created and code inside run() is executed in new thread while if you call run() method directly no new thread will be created and code inside run() will execute in the current thread directly. ... But Thread.run() does not create any new thread.

Difference between Thread.start() and Thread.run() in Java:*************
===========================================================
1.New Thread Creation:
----------------------
When a program calls the start() method, a new thread is created and then the run() method is executed. But if we directly call the run() method then no new thread will be created and run() method will be executed as a normal method call on the current calling thread itself and no multi-threading will take place.


2.Multiple invocation
======================
In Java’s multi-threading concept, another most important difference between start() and run() method is that we can’t call the start() method twice otherwise it will throw an IllegalStateException whereas run() method can be called multiple times as it is just a normal method calling.
