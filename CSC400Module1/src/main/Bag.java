package main;

import java.util.ArrayList;
import java.util.List;

class Bag<T> {
	
	private List<T> items;
	
	public Bag() {
		items = new ArrayList<>();
	}
	
	public void add(T item) {
		items.add(item);
	}
	
	public void remove(T item) {
		items.remove(item);
	}

	public boolean contains(T item) {
		return items.contains(item);
	}
	
	public int count(T item) {
		int count = 0;
		for(T element : items) {
			if(element.equals(item)) {
				count++;
			}
		}
		return count;
	}
	
	public void printBag() {
		System.out.println(items);
	}
}
