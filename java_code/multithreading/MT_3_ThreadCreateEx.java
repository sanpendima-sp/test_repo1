package multi_theading;

public class MT_3_ThreadCreateEx implements Runnable{

	@Override
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
		Runnable r1 = new MT_3_ThreadCreateEx();
		Thread t1 = new Thread(r1, "MyThread1");
		Thread t2 = new Thread(r1, "MyThread2");
		
		t1.start();
		t2.start();
	}
}
