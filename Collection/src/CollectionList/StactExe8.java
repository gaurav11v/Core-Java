package CollectionList;

import java.util.Stack;

public class StactExe8 {

	public static void main(String[] args) {

		Stack s = new Stack();

		for (char ch = 'A'; ch <= 'Z'; ch++) {
			s.push(ch);
		}

		System.out.println(s);

		Stack s2 = new Stack();

		while (!s.isEmpty()) {

			s2.push(s.pop());

		}

		System.out.println(s2);
		System.out.println(s);

	}

}
