package Code13_6;

import java.util.*;

public class PriorityQueueDemo {

	public static void main(String[] args) {
			
		Queue<String> prior = new PriorityQueue<>();
		
		prior.add("Python");
		prior.add("C");
		prior.add("Java");
		prior.add("DBMS");
		prior.add("Data Structure");
		
		System.out.println(prior);
		
		prior.remove("Java");
		System.out.println("After Removing Element => "+prior);
		
		System.out.println("Poll Method => "+prior.poll());
		System.out.println("Peek Method => "+prior.peek());

	}

}
