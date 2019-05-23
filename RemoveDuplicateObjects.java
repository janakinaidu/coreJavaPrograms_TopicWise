import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author janakinaidu
 */

public class RemoveDuplicateObjects {

	public static void main(String[] args) {

		Products p1 = new Products(101, "pen", 10.00, "Renold");
		Products p2 = new Products(101, "pen", 10.00, "Renold");
		Products p3 = new Products(102, "pencil", 20.00, "pencilProvider");
		Products p4 = new Products(103, "plank", 50.00, "PlankProvider");
		Products p5 = new Products(104, "pet", 30.00, "petRenold");

		List<Products> list = new ArrayList<Products>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		System.out.println(list);
		Collections.sort(list, Products.priceComparator);

		java.util.List<Products> uniqueEmployee = list.stream().distinct() // it will remove duplicate object, It will
																			// check duplicate using equals method
				.collect(Collectors.toList());
		System.out.println("============");
		System.out.println(uniqueEmployee);
	}

}
