package Code12_6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//List

public class Collection {

	public static void main(String[] args) {
		
		List list1 = new ArrayList();  //Created Empty Array List allow Hetrogeneous Element
		
		System.out.println("Size  => " +list1.size());
		System.out.println("Is list Empty ?  => " +list1.isEmpty());
		
		list1.add(10);
		list1.add(20);
		list1.add(true);
		list1.add(false);
		list1.add(20);
		list1.add("Hello");
		list1.add(56.78);
		list1.add(5,"Hii");
		list1.add(10);
		 
		
		System.out.println("List is => " +list1);
		
		System.out.println("Is list Conatins 15 " +list1.contains(15));
		list1.remove(false);
		 
		
		//need to give the index value for integer to remove from the list
		
		System.out.println("List is => " +list1);
		
		System.out.println("Element at 5 th location is => " +list1.get(5));
		
		System.out.println("Element Removed => " +list1.remove(list1.lastIndexOf(10))); //last occurence of list
		
		System.out.println("Element Removed => " +list1.remove(list1.indexOf(10)));  //particular occurence

		System.out.println("List is => " +list1);
		
		//Collections.sort(list1);
		
		//System.out.println("List is => " +list1);  // Class Cast Exception
	
		list1.clear();
		
		System.out.println("List is => " +list1);
	}

}
