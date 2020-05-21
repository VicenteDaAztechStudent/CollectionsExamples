package collectTutorial;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {
	

	public static void main(String[] args) {
		
		/*
		 * 2) Using ArrayList Collection Java
		 */
		
		
		// Creating ArrayList with no size/length
		ArrayList<Integer> integerList = new ArrayList<Integer>();
		
		
		// Adding integer elements to the ArrayList 'integerList'
		integerList.add(5);
		integerList.add(1);
		integerList.add(-6);
		
		// Get size/length of ArrayList
		System.out.println("The size of ArrayList 'integerList' is: " + integerList.size());
		
		// Get integer in the 3rd item from ArrayList
		System.out.println("3rd item is " + integerList.get(2));
		
		// Insert item between 0 and 1 indexes
		integerList.add(1, 8);
		System.out.println("Size after adding another item is : " + integerList.size());
		System.out.println("3rd item is " + integerList.get(2));
		
		// Removing item from index 0, which is '5'
		integerList.remove(0);
		System.out.println("0th item after removal is: " + integerList.get(0));
		
		// Returns index of item if available in ArrayList
		int index = integerList.indexOf(-6);
		System.out.println("Index of number -6 is: " + index);
		
		// Returning item at index '2' 
		Integer searchItem = integerList.get(index);
		System.out.println("Item of index 2 is: " + searchItem);
		
		// Remove all items
		integerList.clear();
		System.out.println("Size of list after clearing method is: " + integerList.size());
		System.out.println();
		System.out.println();

		
		
		/*
		 *  3 Using Custom Object Instances In ArrayList
		 */
		
		// Create blank list that can contain instances of class 'Customer' 
		List<Customer> customerList = new ArrayList<Customer>();
		
		// Create instances of class 'Customer'
		Customer customer = new Customer(1, "John", "Amazed", "M", true);
		Customer customer2 = new Customer(2, "Micho", "Rizzo", "M", false);
		Customer customer3 = new Customer(3, "Super", "Mario", "M", true);
		Customer customer4 = new Customer(4, "Princess", "Peach", "F", false);
		Customer customer5 = new Customer(5, "Alejandra", "Martinez", "M", true);
		
		
		// Add instance of class 'customer' to list 'customerList'
		customerList.add(customer);
		// Print size of list 'customerList'
		System.out.println("Size of customer list: " + customerList.size());
		
		// Add instance of class 'customer2' to list 'customerList' 
		// Will be placed in 1st index since used '0' as placement
		customerList.add(0,customer2);
		// Print size of list 'customerList'
		System.out.println("Size of customer list: " + customerList.size());
		// Print 'customer' details in index '0'
		System.out.println("First item of customer list is: " + customerList.get(0));
		// Print 'customer2' details in index '1'
		System.out.println("Second item of customer list is: " + customerList.get(1));
		

	
		// Created integer 'indexOfCustomer' to identify index of
		// Customer once added to the list
		int indexOfCustomer = customerList.indexOf(customer2);
		System.out.println("Index of Micho Rizzo: " + indexOfCustomer);
		
		// Shows 'customer' index inside the list
		indexOfCustomer = customerList.indexOf(customer);
		System.out.println("Index of John Amazed: " + indexOfCustomer);
		
		customerList.add(customer3);
		customerList.add(customer4);
		customerList.add(customer5);
		
		System.out.println("All items in CustomerList using for-each loop: ");
		System.out.println();
		for(Customer value : customerList) {
			System.out.println(value);
		}
		System.out.println("");
	  
	}
}
