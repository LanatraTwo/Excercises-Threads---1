public class ThreadThree extends Thread {

	public void run() {
		int t = 10;
		while(Main.task3) {
			System.out.println(++t);
			try {
				Thread.sleep(3000);
			} catch (Exception e) {}
		}
	}

}