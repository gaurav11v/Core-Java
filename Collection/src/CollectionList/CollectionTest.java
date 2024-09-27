package CollectionList;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest {

	public static void main(String[] args) {

		Collection c = new ArrayList();

		c.add("Gaurav");
		c.add(2);
		c.add(11.3);
		c.add('A');

		System.out.println(c);

	}
}
