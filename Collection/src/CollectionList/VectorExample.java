package CollectionList;

import java.util.Iterator;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {

		Vector v = new Vector();

		v.addElement("kgf");
		v.addElement(58);
		v.addElement(5.2);
		
		System.out.println(v);
		
		Iterator it = v.iterator();
		
		while (it.hasNext()) {
			
			System.out.println(it.next());
			
		}

	}

}
