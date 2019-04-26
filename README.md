# CoreJava Interview Programs

ArrayList vs LinkedList
=======================

-> Both ArrayList and LinkedList maintain insertion order <br>
-> once ArrayList size is reached it will creates a new ArrayList of increased size copies the old arrayList.
-> ArrayList is index based,and better for retrieval operations.
-> LinkedList is better for insertion and removal and it is node based.
-> Both ArrayList and LinkedList are not thread safe.
-> To make it thread safe we have:


		Collections.synchronizedList(list);
		Collections.synchronizedMap(m)
		Collections.synchronizedSet(set)
 

ArrayList vs Vector
===================
