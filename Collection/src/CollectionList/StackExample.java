package CollectionList;

import java.util.Stack;

public class StackExample {

	// push(); - To add
	// peek(); - To print last element
	// pop(); - To remove last element
	
	public static void main(String[] args) {

		Stack s = new Stack();

		s.push(5);
		s.push(6);
		s.push(8);

		System.out.println(s);

		System.out.println(s.peek());

		System.out.println(s);

		System.out.println(s.pop());

		System.out.println(s);

	}

}
