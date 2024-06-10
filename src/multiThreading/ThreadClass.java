package multiThreading;

public class ThreadClass extends Thread{

	private int n;
	private String msg;
	
	public ThreadClass(int n,String msg)
	{
		this.n=n;
		this.msg=msg;
		
	}
	public void show()
	{
		for(int i=0;i<=n;i++)
		{
			System.out.println(msg+i+" "+"Current Thread => " +Thread.currentThread().getName());
		}
	}
}
