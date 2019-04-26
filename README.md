# CoreJava Interview Programs

ArrayList vs LinkedList
=======================

-> Both ArrayList and LinkedList maintain insertion order <br>
-> once ArrayList size is reached it will creates a new ArrayList of increased size copies the old arrayList. <br>
-> ArrayList is index based,and better for retrieval operations. <br>
-> LinkedList is better for insertion and removal and it is node based. <br>
-> Both ArrayList and LinkedList are not thread safe.<br>
-> To make it thread safe we have: <br>


		Collections.synchronizedList(list);
		Collections.synchronizedMap(m)
		Collections.synchronizedSet(set)
 

ArrayList vs Vector
===================
