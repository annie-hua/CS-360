package products;

import supplier.Supplier;

public class ItemsForSale {
	private double priceOfItem;
	private int amountInStock;
	private String Brand;
	private Supplier supplier;
	private String ProductName;
	
	
	public ItemsForSale (String ProductNameContstruct){
		ProductName = ProductNameContstruct;
	}
	public double getPriceOfItem() {
		return priceOfItem;
	}
	public void setPriceOfItem(double priceOfItem) {
		this.priceOfItem = priceOfItem;
	}
	public int getAmountInStock() {
		return amountInStock;
	}
	public void setAmountInStock(int amountInStock) {
		this.amountInStock = amountInStock;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public Supplier getSupplier() {
		return supplier;
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
}
