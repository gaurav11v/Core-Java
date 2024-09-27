package CollectionList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorCollection {
public static void main(String[] args) {
	
	List list = new ArrayList();
	
	list.add("pk");
	list.add(2);
	list.add(null);
	list.add("pk");
	list.add(null);
	
	System.out.println(list);
	
	Iterator it = list.iterator();
	while (it.hasNext()) {
		System.out.println(it.next());
	}
}

}
