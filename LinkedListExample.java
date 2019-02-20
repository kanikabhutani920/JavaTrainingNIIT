package Collections;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList <String> linkedlist=new LinkedList<String>();
		
		linkedlist.add("Item1");
		linkedlist.add("Item2");
		linkedlist.add("Item3");
		linkedlist.add("Item6");
		linkedlist.add("Item2");		

		System.out.println("Linked List Content:" +linkedlist);
		
		linkedlist.offer("Item100");
		System.out.println("Linked List Content:" +linkedlist);
		linkedlist.addFirst("Item100");
		linkedlist.addLast("Item100");
		System.out.println("Linked List Content after addition:" +linkedlist);
		Object firstvar=linkedlist.get(0);
		System.out.println("First element:" +linkedlist);
		linkedlist.set(0,"change first item");
		Object firstvar2=linkedlist.get(0);
		System.out.println("First element after update by set method:" +firstvar2);
		
		linkedlist.removeFirst();
		linkedlist.removeLast();
	}

}
