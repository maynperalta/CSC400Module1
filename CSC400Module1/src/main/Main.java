package main;

public class Main {
	public static void main(String[] args) {
// New instance of Bag class		
		Bag<String> bag = new Bag<>();
// Add objects to bag (including duplicates)			
			bag.add("book");
			bag.add("pen");
			bag.add("pencil");
			bag.add("calculator");
			bag.add("eraser");
			bag.add("pen");
			bag.add("notebook");
			bag.add("pen");
			bag.add("book");
// Print Bag contents		
			System.out.printf("\nCurrently in bag: ");
			bag.printBag();
// Test "contains" method for a few elements			
			System.out.printf("\nBag contains book? %b", bag.contains("book"));
			System.out.printf("\nBag contains pen? %b", bag.contains("pen"));
			System.out.printf("\nBag contains eraser? %b ",  bag.contains("eraser"));
// New line for readability, then test "count" method for a few elements		
			System.out.println("");
			System.out.printf("\nNumber of books in the bag: %d", bag.count("book"));
			System.out.printf("\nNumber of pens in the bag: %d", bag.count("pen"));
			System.out.printf("\nNumber of erasers in the bag: %d", bag.count("eraser"));
			System.out.println("");
// Remove elements from Bag		
			bag.remove("eraser");
			bag.remove("pen");
			bag.remove("book");
// Print Bag contents again		
			System.out.printf("\nNow in bag: ");
			bag.printBag();
// Test "contains" method for removed element and "count" method for removed element		
			System.out.printf("\nBag contains eraser? %b", bag.contains("eraser"));
			System.out.printf("\nNumber of pens in bag: %d", bag.count("pen"));
			System.out.printf("\nNumber of erasers in bag: %d", bag.count("eraser"));
	}
}
