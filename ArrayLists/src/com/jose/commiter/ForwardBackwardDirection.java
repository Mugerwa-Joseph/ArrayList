package com.jose.commiter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

import com.jose.GroceryList;

public class ForwardBackwardDirection extends GroceryList {
	
	@DaudKakumirizi(author = "@kdaud", organisation = " ")


	/**
	 * @return
	 * @throws CloneNotSupportedException
	 */
	protected String forwardbackworddircetion() throws CloneNotSupportedException {
		/**
		 * 
		 */
		ArrayList<String> offeredcourse = new ArrayList<>(
		        Arrays.asList("Computer Netwotking", "Information Systems", "Computer Engineering", "Software Engineering",
		            "Library Science Tehnology"));
    
		ListIterator<String> listItr = offeredcourse.listIterator();
     
		System.out.println("******Forward*******");
     
    while(listItr.hasNext()) {
        System.out.println(listItr.next());
    }
     
		System.out.println("\n*****Backward*******");
		
    while(listItr.hasPrevious()) {
        System.out.println(listItr.previous());
		}
    
		return "";
	}

}
