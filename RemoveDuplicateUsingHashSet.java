package collectiontopic;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateUsingHashSet {
	public static void main(String[] args) {
		Products p1 = new Products(101, "pen", 10.00);
		Products p2 = new Products(101, "pen", 10.00);
		Products p3 = new Products(102, "pencil", 50.00);
		Products p4 = new Products(103, "rubber", 30.00);
		Products p5 = new Products(105, "plank", 40.00);

		Set<Products> set = new HashSet<Products>();
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		set.add(p5);
		System.out.println(set);
	}
}
