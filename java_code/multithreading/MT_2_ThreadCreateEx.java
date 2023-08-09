package multi_theading;

public class MT_2_ThreadCreateEx implements Runnable {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Value is: " + i);
		}
	}

	public static void main(String[] args) {
		MT_2_ThreadCreateEx t1 = new MT_2_ThreadCreateEx();
		MT_2_ThreadCreateEx t2 = new MT_2_ThreadCreateEx();
		
		Thread t3 = new Thread(t1);
		Thread t4 = new Thread(t2);
		
		t3.start();
		t4.start();
	}
}
