package Code13_6;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		
		Deque<String> arrayDeque = new ArrayDeque<>();
		arrayDeque.add("A");
		arrayDeque.add("B");
		arrayDeque.add("C");
		arrayDeque.add("D");
		
		arrayDeque.offer("M");
		arrayDeque.offerFirst("N");
		arrayDeque.offerLast("O");
		
		System.out.println(arrayDeque);
		
		//Poll Method
	}

}
