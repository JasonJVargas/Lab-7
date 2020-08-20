
public class Driver {

	
	
	public static void main(String[] args) {
		// Create instances
		LinkedStack link = new LinkedStack();
		ArrayStack array = new ArrayStack();

		// Push the int's onto LinkedStack.
		link.push(1);
		link.push(7);
		link.push(3);
		link.push(4);
		link.push(9);
		link.push(2);

		// Print to show the int's were pushed

		System.out.println(link);
			
		System.out.println("We will now remove: " + link.peek());
		link.pop();
		System.out.println(link + "\n" + "We will now remove: " + link.peek());
		link.pop();
		System.out.println(link + "\n" + "We will now remove: " + link.peek());
		link.pop();
		System.out.println(link + "\n" + "We will now remove: " + link.peek());
		link.pop();
		System.out.println(link + "\n" + "We will now remove: " + link.peek());
		link.pop();
		System.out.println(link + "\n" + "We will now remove: " + link.peek());
		link.pop();

		System.out.println("\nNothing left! " + link);
		
		// Push again for Exercise 2
		link.push(1);
		link.push(7);
		link.push(3);
		link.push(4);
		link.push(9);
		link.push(2);

		System.out.println();
		System.out.print("Here is the original LinkedStack: ");
		System.out.println(link);

		System.out.print("Top half of the stack: ");
		link.removeHalf();
		System.out.println("Time complexity of method removeHalf is: O(N)");
		

		// Push the int's onto ArrayStack.
		array.push(1);
		array.push(7);
		array.push(3);
		array.push(4);
		array.push(9);
		array.push(2);

		// Show items are being removed in the stack
		System.out.println("\nArrayStack now contains " + array.size() + " int's in the stack.");
		array.pop();
		System.out.println("ArrayStack now contains " + array.size() + " int's in the stack.");
		array.pop();
		System.out.println("ArrayStack now contains " + array.size() + " int's in the stack.");
		array.pop();
		System.out.println("ArrayStack now contains " + array.size() + " int's in the stack.");
		array.pop();
		System.out.println("ArrayStack now contains " + array.size() + " int's in the stack.");
		array.pop();
		System.out.println("ArrayStack now contains " + array.size() + " int's in the stack.");
		array.pop();
		System.out.println("ArrayStack now contains " + array.size() + " int's in the stack.");
		

	}

}