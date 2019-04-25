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


Synchronization
===============
//source:
https://www.geeksforgeeks.org/method-block-synchronization-java/
We need to synchronize the shared resources to ensure that at a time only one thread is able to access the shared resource

Note: Synchronization is needed when Object is mutable.
If shared Object is immutable or all the threads which share the same Object are only reading the Object’s state not modifying then you don’t need to synchronize it.


    Fetch the value of variable i.
    Increment the fetched value.
    And store the increased value of i to its location.

Here,

    1st thread fetches the value of i. (Currently value i is 0) and increases it by one, so value of variable i becomes 1.
    Now 2nd thread accesses the value of i that would be 0 as 1st thread did not store it back to its location.
    And 2nd thread also increment it and store it back to its location. And 1st also store it.
    Finally value of variable i is 1. But it should be 2 by the effect of both threads. That’s why we need to synchronize the access to shared variable i.


Java programming language provide two synchronization idioms:

    Methods synchronization
    Statement(s) synchronization (Block synchronization)
	
	Methods synchronization
	
It is not possible for two invocations for synchronized methods to interleave. If one thread is executing the synchronized method, all others thread that invoke synchronized method on the same Object will have to wait until first thread is done with the Object.

Block Synchronization:
======================
If we only need to execute some subsequent lines of code not all lines (instructions) of code within a method, then we should synchronize only block of the code within which required instructions are exists.
->Java synchronization will throw null pointer exception

In Java, wait(), notify() and notifyAll() are the important methods that are used in synchronization.

->You can not apply java synchronized keyword with the variables.
Finally Synchronization is needed when Object is mutable.and it is not required if objects are immutable;
