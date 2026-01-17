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
		
			System.out.println("Currently in bag: ");
			bag.printBag();
		
			System.out.println("Book is in the bag? " + bag.contains("book"));
			System.out.println("Pen is in the bag? " + bag.contains("pen"));
			System.out.println("Eraser is in the bag? " + bag.contains("eraser"));
		
			System.out.println("Number of books in the bag: " + bag.count("book"));
			System.out.println("Number of pens in the bag: " + bag.count("pen"));
			System.out.println("Number of erasers in the bag: " + bag.count("eraser"));
		
			bag.remove("eraser");
			bag.remove("pen");
			bag.remove("book");
		
			System.out.println("Now in bag: ");
			bag.printBag();
		
			System.out.println("Eraser in bag? " + bag.contains("eraser"));
			System.out.println("Number of pens in bag: " + bag.count("pen"));
			System.out.println("Number of erasers in bag: " + bag.count("eraser"));
	}
}
