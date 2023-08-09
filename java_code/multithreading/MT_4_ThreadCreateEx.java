package multi_theading;

class MyThread1 implements Runnable{

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
}

class MyThread2 implements Runnable{

	@Override
	public void run() {
		for (int i = 11; i <= 20; i++) {
			System.out.println("Thread is: " + Thread.currentThread().getName() + " : " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

public class MT_4_ThreadCreateEx {
	public static void main(String[] args) {
		Runnable r1 = new MyThread1();
		Runnable r2 = new MyThread2();
		
		Thread t1 = new Thread(r1, "Ram: ");
		Thread t2 = new Thread(r2, "Sita: ");
		
		t1.start();
		t2.start();
	}
}
