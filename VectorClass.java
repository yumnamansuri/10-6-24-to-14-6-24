package Code13_6;


/*
//Linked List

add();
addFirst();
addLast();
getFirst();
getLast();
removeFirst();
removeLast();
sort();
reverse();
*/

import java.util.Vector;
import java.util.Iterator;


public class VectorClass {

	public static void main(String[] args) {
		
		Vector<String> animals = new Vector<>();
		animals.add("Tiger");
		animals.add("Lion");
		animals.add("Wolf");
		animals.add("Monkey");
		
		System.out.println("Animals Name => " +animals);
		
		//using GET MEthod
		String element = animals.get(2);
		System.out.println("Element at Index 2 => " +element);
		
		//using Iterator
		
		Iterator<String> i = animals.iterator();
		System.out.println("Vector => ");
		while(i.hasNext())
		{
			System.out.println(i.next());
			System.out.println(", ");
			
			
		}
		element=animals.remove(1);
		System.out.println("Removed Element => " +element);
		System.out.println("New Vector => " +animals);
		
	
	}

}
