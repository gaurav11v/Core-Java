package SetCollectionTest;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {

	public static void main(String[] args) {

		// SortedSet output by default ASC order
		SortedSet s = new TreeSet();

		s.add("1");
		s.add("4");
		s.add("3");

		System.out.println(s.last());
		System.out.println(s.first());

		System.out.println(s);

		for (Object ele : s) {

			System.out.println(ele);

		}

	}

}
