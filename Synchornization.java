package Code12_6;

//Synchronized Process - Thread Safe

class Counter
{
	private int count; //5

	public synchronized void increment()
	{
		count = count+1;  // 6-t1 //6-t2
	}

	public int getCount()
	{
		return count;
	}
}


public class Synchornization {

	
	public static void main(String[] args) throws InterruptedException
	{
		Counter c = new Counter();
		
		Thread t1 = new Thread(() ->
		{
			for(int i=0;i<20;i++)
			{
				c.increment();
			}
			
	});
		
		Thread t2 = new Thread(() ->
		{
			for(int i=0;i<20;i++)
			{
				c.increment();
			}
			
	});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
	//	c.increment();
		System.out.println(c.getCount());
		
	}

}
