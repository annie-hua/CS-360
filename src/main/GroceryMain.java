package main;
import customer.Customer;
import customer.GroceryList;
import products.ItemsForSale;

public class GroceryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer num2 = new Customer("Michael", "Purcell");
		num2.printName();
		System.out.println("What is the product name?");
		ItemsForSale item1 = new ItemsForSale("Shampoo");
		GroceryList firstList = new GroceryList();
		firstList.addItemToList(item1);
		firstList.printList();
	}

}
