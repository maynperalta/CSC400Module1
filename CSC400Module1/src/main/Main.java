package main;

public class Main {

	public static void main(String[] args) {
		
		Bag<String> bag = new Bag<>();
			
			bag.add("book");
			bag.add("pen");
			bag.add("pencil");
			bag.add("calculator");
			bag.add("eraser");
			bag.add("pen");
			bag.add("notebook");
			bag.add("pen");
			bag.add("book");
		
			System.out.printf("\nCurrently in bag: ");
			bag.printBag();
			
			System.out.printf("\nBag contains book? %b", bag.contains("book"));
			System.out.printf("\nBag contains pen? %b", bag.contains("pen"));
			System.out.printf("\nBag contains eraser? %b ",  bag.contains("eraser"));
		
			System.out.println("");
			System.out.printf("\nNumber of books in the bag: %d", bag.count("book"));
			System.out.printf("\nNumber of pens in the bag: %d", bag.count("pen"));
			System.out.printf("\nNumber of erasers in the bag: %d", bag.count("eraser"));
			System.out.println("");
		
			bag.remove("eraser");
			bag.remove("pen");
			bag.remove("book");
		
			System.out.printf("\nNow in bag: ");
			bag.printBag();
		
			System.out.printf("\nBag contains eraser? %b", bag.contains("eraser"));
			System.out.printf("\nNumber of pens in bag: %d", bag.count("pen"));
			System.out.printf("\nNumber of erasers in bag: %d", bag.count("eraser"));
	}
}
