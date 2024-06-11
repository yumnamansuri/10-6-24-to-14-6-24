package Code11_6;

import multiThreading.ThreadClass;

//To Define methods present in Thread Class

public class MethodsThreads {

	public static void main(String[] args) {
		ThreadClass t1 = new ThreadClass(5,"First"); //Object of Thread Class 1
		ThreadClass t2 = new ThreadClass(7,"Second"); //Object of Thread Class 2
		
		System.out.println("Current Thread => " +Thread.currentThread()); //return the current thread
		
		
		t1.start();
		t2.start();
	
		Thread.currentThread().setName("Parent Thread"); //Name given to thread by setName method
		
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
		System.out.println("Current THREAD => " +Thread.currentThread());
		
		try
		{
			t1.join(); //Wait Current thread until the t1 is dead
			t2.join();	//Wait Current thread until the t2 is dead or time is over
		}
		catch(Exception e)
		{
			System.out.println("Thread is Interrupted");
		}
		
		System.out.println("***************End of Main************");
	}

}
