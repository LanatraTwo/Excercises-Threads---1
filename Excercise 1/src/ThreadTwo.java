public class ThreadTwo extends Thread {

	public void run() {
		for (int i = 0; i < 5 ; i++) {
			System.out.println(i+1);
			try {
				Thread.sleep(2000);
			} catch (Exception e) {}
		}
	}

}