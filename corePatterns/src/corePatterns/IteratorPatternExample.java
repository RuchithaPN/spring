package corePatterns;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class IteratorPatternExample {
  public static void main(String[] args) {	
	List<String> myList = new ArrayList<>();
	myList.add("Java");
	myList.add("Python");
	myList.add("C++");

	// Using Iterator to traverse the list
	Iterator<String> iterator = myList.iterator();
	while (iterator.hasNext()) {
	    String language = iterator.next();
	    System.out.println(language);
	}
  }

}

