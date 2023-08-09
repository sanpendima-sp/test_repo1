package multi_theading;

class T1 extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
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

class T2 extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
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

class T3 extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
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

public class MT_5_ThreadJoinEx {
	public static void main(String[] args) {
		T1 t1 = new T1();
		T2 t2 = new T2();
		T3 t3 = new T3();
		
		t1.setName("T1");
		t2.setName("T2");
		t3.setName("T3");
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		//t3.setPriority(Thread.MAX_PRIORITY);
		
		t1.start();
		
		/*
		 * try { t1.join(3000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */		
		t2.start();
		t3.start();
	}
}
