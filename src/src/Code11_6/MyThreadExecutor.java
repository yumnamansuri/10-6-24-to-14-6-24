package Code11_6;

public class MyThreadExecutor {

	public static void main(String[] args) {
		
		
		MyThread mt = new MyThread();

		System.out.println("Before Runnable Stage Thread is alive or not? " +mt.isAlive());

		mt.start();
		
		try
		{
			Thread.sleep(4000);
		}
		catch(Exception e)
		{
			System.out.println("Thread is Interrupted...");
		}
	
	System.out.println("After Complete execution of thread,is alive or not?" +mt.isAlive());
	}

}
