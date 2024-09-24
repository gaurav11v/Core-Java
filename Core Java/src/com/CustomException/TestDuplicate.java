package com.CustomException;

public class TestDuplicate   {
public static void main(String[] args) throws DuplicateException {
	
	String str = "Gv11";
	if (str == "Gv11") {
		throw new DuplicateException();
	}else {
		System.out.println("User has created");
}

}
}





