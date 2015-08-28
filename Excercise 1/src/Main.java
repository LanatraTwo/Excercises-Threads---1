public class Main {

	public static boolean task3 = true;

	public static Even even = new Even();

	public static void main(String[] args) throws InterruptedException {

		Thread.

	// Assignment 1
		CThread t1 = new CThread();
		ThreadTwo t2 = new ThreadTwo();
		ThreadThree t3 = new ThreadThree();
		t1.start();
		t2.start();
		t3.start();
		t1.join();
		t2.join();
		try {
			Thread.sleep(10000);
		} catch (Exception e) {}
		task3 = false;
		t3.join();
		System.out.println("done");


	// Assignment 2

		CallEven t1 = new CallEven();	
		CallEven t2 = new CallEven();
		t1.start();
		t2.start();

	}

}