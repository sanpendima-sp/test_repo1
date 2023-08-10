package multi_theading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MT_9_ThreadPoolExample {
	public static void main(String[] args) {
		// Create a fixed-size thread pool with 5 threads
		ExecutorService executor = Executors.newFixedThreadPool(5);

		// Submit tasks to the thread pool
		for (int i = 0; i < 10; i++) {
			int taskNumber = i;
			executor.submit(() -> {
				System.out.println("Task " + taskNumber + " executed by thread " + Thread.currentThread().getName());
			});
		}

		// Shutdown the thread pool when tasks are done
		executor.shutdown();
	}
}
