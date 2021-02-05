package com.techelevator;

public class Item {
	String itemName;
	double itemPrice;
	String itemSound;
	String itemType;
	int remainingStock;
public Item(String itemName,double itemPrice,String itemType,int remainingStock) {
	this.itemName = itemName;
	this.itemPrice = itemPrice;
	this.itemType = itemType;
	this.remainingStock = remainingStock;
	
	if(this.itemType.equals("Candy")) {
		this.itemSound = "Munch, Munch, Yum!";
	}
	if(this.itemType.equals("Chip")) {
		this.itemSound = "Crunch, Crunch, Yum!";
	}
	if(this.itemType.equals("Drink")) {
		this.itemSound = "Glug, Glug, Yum!";
	}
	if(this.itemType.equals("Gum")) {
		this.itemSound = "Chew, Chew, Yum!";
	}
}
/**
 * @return the itemName
 */
public String getItemName() {
	return itemName;
}
/**
 * @return the itemPrice
 */
public double getItemPrice() {
	return itemPrice;
}
/**
 * @return the itemSound
 */
public String getItemSound() {
	return itemSound;
}
/**
 * @return the itemType
 */
public String getItemType() {
	return itemType;
}
/**
 * @return the remainingStock
 */
public int getRemainingStock() {
	return remainingStock;
}
}
