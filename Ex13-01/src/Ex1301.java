class CountingThread implements Runnable {

	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
		}
	}
}

public class Ex1301 {

	static public void main(String[] args) {

		Thread th = new Thread(new CountingThread());
		th.start();
		System.out.println("After Starting Thread");
		try {
			th.join();
		} catch (InterruptedException e) {
			return;
		}
		System.out.println("After Join");

	}

}