public class CThread extends Thread {

	public void run() {
		long c = 0;
		for (int i = 0; i < 1000000000 ; i++) {
			c += i;
		}
		System.out.println(c);
	}


}