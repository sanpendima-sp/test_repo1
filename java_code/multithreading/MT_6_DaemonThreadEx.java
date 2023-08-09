package multi_theading;

public class MT_6_DaemonThreadEx extends Thread{
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println("Thread is: " + name + " : " + Thread.currentThread().isDaemon());
	}
	
	public static void main(String[] args) {
		MT_6_DaemonThreadEx t1 = new MT_6_DaemonThreadEx();
		MT_6_DaemonThreadEx t2 = new MT_6_DaemonThreadEx();
		
		t1.setDaemon(true);
		t2.start();
		t1.start();
	}
}
