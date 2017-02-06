package customer;

import java.util.ArrayList;
import products.ItemsForSale;

public class GroceryList {
	private ArrayList<ItemsForSale> groceryList = new ArrayList<ItemsForSale>();
	private int priceOfGroceryList;
	private int PickupDateAndTime;
	
	public int groceryListLength(){
		return groceryList.size();
	}
	public void addItemToList(ItemsForSale item){
		groceryList.add(item);
	}
	public int getPickupDateAndTime() {
		return PickupDateAndTime;
	}
	public void setPickupDateAndTime(int pickupDateAndTime) {
		PickupDateAndTime = pickupDateAndTime;
	}
	public int getPriceOfGroceryList() {
		return priceOfGroceryList;
	}
	public void printList(){
		for(int i = 0;i<groceryList.size();i++){
			System.out.println(((ItemsForSale) groceryList.get(i)).getProductName());
		}
	}
}
