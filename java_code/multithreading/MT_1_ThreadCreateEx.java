package multi_theading;

public class MT_1_ThreadCreateEx extends Thread {
	public void run() {

		for (int i = 1; i <= 10; i++) {
			System.out.println("Thread is: " + Thread.currentThread().getName() + " : " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// create object for thread class
		MT_1_ThreadCreateEx t1 = new MT_1_ThreadCreateEx();
		MT_1_ThreadCreateEx t2 = new MT_1_ThreadCreateEx();

		// change the name of the thread
		t1.setName("Thread1");
		t2.setName("Thread2");

		t1.start();
		t2.start();
	}
}
