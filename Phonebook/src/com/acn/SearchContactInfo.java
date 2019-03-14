package com.acn;

import java.util.HashMap;
import java.util.Map;

public class SearchContactInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// initialize map
		
		Map<String, Person> myMap = initMap();
		// define and add some random characters
		// felix

		// search for specific character in map
		// marius

		// search for specific phone number in map
		// roman
		String numAsStr = "+417575757575";
		searchByNumber(myMap, numAsStr);
		
		
		
		// start app in console with Name: and wait for user input
		// after input set with enter:
		// 1. if contact does not exist: print contact does not exist
		// 2. search address if found: printout address

		// 3. search phone number if found: printout phone number of contact

		// 4. printout Name: and wait for input
	}

	private static void searchByNumber(Map phonebook, String numAsStr) {
		System.out.println("Person not found");
		for (Object obj : phonebook.values()) {
			Person pers = (Person) obj;
			System.out.println(obj);
			System.out.println(pers);
			if (pers.name.equals(numAsStr)) {
				// found the person
				System.out.println("The number belongs to: "+pers.name);
			}
		}
		System.out.println("Couldn't find a person with this number");
		// didn't find the person

	}

	private void searchbyName(Map p1, String name) {
		System.out.println("Person not found");
	
	}

	private static Map<String, Person> initMap() {
		// First String is name
		// Second element is person info
		Map<String, Person> phonebook = new HashMap<String, Person>();
		return phonebook;
	}

}
