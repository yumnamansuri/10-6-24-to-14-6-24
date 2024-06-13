package Code13_6;

import java.util.LinkedList;

import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		
		Queue<Integer> q = new LinkedList();
		
		//add elements of 5 in queue
		
		for(int i=0;i<5;i++)
		{
			q.add(i);
			System.out.println(q);
			
		}
		int removable = q.remove();  //remove the head of the element
		System.out.println(removable);
		
				
		int head =q.peek(); //retriving the head element
		System.out.println(q);
		
		int size = q.size();
		
		System.out.println(size);
	}
	
	

}
