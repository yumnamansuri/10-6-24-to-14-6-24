package Code11_6;

//Runnable Interface



//Interface is a blueprint of a class
//Interface cannot create Object
// Interface can have only abstract methods
// Implements keyword

class ThreadOne  implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Print Thread One");
		}
		try
		{
			Thread.sleep(500);
			
		}
		catch(Exception exp)
		{
			System.out.println("");
		}
	}


}

class ThreadTwo implements Runnable
{
	
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Print Thread Two");
		}
		try
		{
			Thread.sleep(1000);
			
		}
		catch(Exception exp)
		{
			System.out.println("");
		}
	}

}
public class RunnableDemo {

	public static void main(String[] args) {
		
		Runnable ob1 = new ThreadOne();
		Runnable ob2 = new ThreadTwo();

		Thread t1 = new Thread(ob1);
		Thread t2 = new Thread(ob2);
		
		t1.start();
		t2.start();
		
		
	}

}
