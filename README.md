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
-> ArrayList is not threadsafe where as Vector class is Thread safe;
-> Whenever the size of the ArrayList exceeds it’s capacity, the capacity is increased by half of the current capacity. And For Vector we
   have an option to pass capacity increment,if not passed then its capacity doubled;
->Searching for Vector is faster compared to ArrayList

Converting Array to ArrayList
=============================
a)Using Arrays.asList()

	String[] inputArray = new String[] { "janu", "ravi", "krishna", "kumar21","hari" };
	ArrayList<String> list = new ArrayList<>(Arrays.asList(inputArray));
	
b)Using Collections.addAll() Method

       String[] array = new String[] {"JAVA", "SERVLETS", "SQL", "STRUTS"};
         
        ArrayList<String> list = new ArrayList<String>();
         
        Collections.addAll(list, array);
         
        System.out.println(list);
	
c) Using ArrayList.addAll() Method :

     		list.addAll(Arrays.asList(array));
		System.out.println(list);

d)Using Streams from Java 8:

		List<String> list1 = Arrays.stream(arr).collect(Collectors.toList());
		System.out.println(list1);

Converting ArrayList to Array
=============================
	
	ArrayList<String> list = new ArrayList<String>();
        list.add("JANU");
        list.add("KRISHNA");
        list.add("VENU");
        list.add("RAJU");
        list.add("SAI");
        
        String[] array = new String[list.size()];
        list.toArray(array);

Ways to irerate the ArrayList
=============================
a) Iteration Using Normal for loop.

b) Iteration Using Iterator Object.

c) Iteration Using ListIterator Object.

d) Iteration Using Enhanced for loop.

For Sorting and Reverse an ArrayList:
====================================
  	
	List<String> list = new ArrayList<String>();
		list.add("janu");
		list.add("ravi");
		list.add("kumar");
		list.add("hari");
		list.add("pavan");
	Collections.sort(list);
	Collections.reverse(list)


