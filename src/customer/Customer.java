package customer;

public class Customer {
	private String FirstName;
	private String LastName;
	private GroceryList List;
	private Address HomeAddress;
	private String Email;
	private String PhoneNumber;
	
	public Customer (String FirstNameConstructor, String LastNameConstructor){
		FirstName = FirstNameConstructor;
		LastName = LastNameConstructor;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public void printName(){
		System.out.println(FirstName+" "+LastName);
	}
	
}
