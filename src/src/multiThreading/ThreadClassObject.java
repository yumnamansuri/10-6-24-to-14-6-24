package multiThreading;

public class ThreadClassObject {

	public static void main(String[] args) {
		ThreadClass tc1 = new ThreadClass(5,"First");
		ThreadClass tc2 = new ThreadClass(7,"Second");
		
		tc1.start();
		tc2.start();
		
	}

}
