package SetCollectionTest;

import java.util.HashSet;
import java.util.Set;

public class CollectionSetTest {
public static void main(String[] args) {
	
	Set s = new HashSet();
	
	s.add(22);
	s.add('G');
	s.add("GV");
	s.add(1.1);
	
	System.out.println(s);
	System.out.println("-----------------------");
	
	s.remove(1.1);
	System.out.println(s);
	
	}
}
