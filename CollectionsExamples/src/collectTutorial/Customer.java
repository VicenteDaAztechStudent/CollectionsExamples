package collectTutorial;

public class Customer {
	int id;
	String firstName;
	String lastName;
	String gender;
	boolean shopping;
	
	public Customer(int id, String firstName, String lastName, String gender, boolean shopping ) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.shopping = shopping;
	}
	
	// Returns assigned inherited variables from 'Customer' class
	// When get() method is used to get specified index of ArrayList 
	public String toString() {
		return "ID: " + id + " " + "FIRST NAME: " + firstName + " " +"LAST NAME: " + lastName +" " + "GENDER: " + gender + " " + "SHOPPING: " + shopping;
	}
	
	public boolean equals(Object o) {
		
		if(o == null)
			return false;
		
		if(this.id == ((Customer)o).id) {
			return true;
		}
		
		return false;
	}
}
