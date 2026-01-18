package main;

import java.util.ArrayList;
import java.util.List;
// Generic Bag (multiset) implementation that allows duplicate elements
class Bag<T> {
// Using List "items" and item type "T"	
	private List<T> items;
//	Constructor to initialize Bag
	public Bag() {
		items = new ArrayList<>();
	}
// Add an item to the Bag	
	public void add(T item) {
		items.add(item);
	}
// Remove an item from the Bag	
	public void remove(T item) {
		items.remove(item);
	}
// Checks if bag contains item
	public boolean contains(T item) {
		return items.contains(item);
	}
// Loop through items list for each item to count number of times item appears
	public int count(T item) {
		int count = 0;
		for(T element : items) {
			if(element.equals(item)) {
				count++;
			}
		}
		return count;
	}
// Print Bag contents	
	public void printBag() {
		System.out.println(items);
	}
}
