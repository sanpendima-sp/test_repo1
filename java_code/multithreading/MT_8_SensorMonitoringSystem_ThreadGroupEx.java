package multi_theading;

class SensorMonitor implements Runnable {
	private String sensorName;

	public SensorMonitor(String sensorName) {
		this.sensorName = sensorName;
	}

	@Override
	public void run() {
		while (!Thread.currentThread().isInterrupted()) {
			// Simulate sensor monitoring logic
			System.out.println(sensorName + " reading: " + Math.random());

			try {
				Thread.sleep(2000); // Sleep for 2 seconds between readings
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
	}
}

public class MT_8_SensorMonitoringSystem_ThreadGroupEx {
	public static void main(String[] args) {
		ThreadGroup sensorGroup = new ThreadGroup("SensorGroup");

		Thread sensorThread1 = new Thread(sensorGroup, new SensorMonitor("Sensor 1"));
		Thread sensorThread2 = new Thread(sensorGroup, new SensorMonitor("Sensor 2"));
		Thread sensorThread3 = new Thread(sensorGroup, new SensorMonitor("Sensor 3"));

		sensorThread1.start();
		sensorThread2.start();
		sensorThread3.start();

		// Simulate running the sensor monitoring system for a period of time
		try {
			Thread.sleep(10000); // Run for 10 seconds
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Interrupt all threads in the group and wait for their completion
		sensorGroup.interrupt();

		System.out.println("Sensor monitoring system shutting down.");
	}

}

/*
 * A thread pool in Java is a collection of pre-initialized worker threads that
 * are managed by a thread pool manager. Instead of creating and destroying
 * threads for each task, a thread pool allows for the reuse of threads, leading
 * to more efficient resource management and reduced overhead.
 * 
 * Thread pools are commonly used in multi-threaded applications to handle tasks
 * concurrently while minimizing the overhead of creating and destroying
 * threads. They are particularly useful in scenarios where you have a large
 * number of short-lived tasks to be executed.
 * 
 * The main components of a thread pool are:
 * 
 * 1. **Worker Threads**: These are the threads in the pool that are ready to
 * execute tasks. They are created when the pool is initialized and remain alive
 * throughout the pool's lifetime. Instead of creating new threads for each
 * task, the thread pool reuses these worker threads.
 * 
 * 2. **Task Queue**: This is a queue that holds the tasks that need to be
 * executed by the worker threads. When a task arrives, it is placed in the
 * queue, and an available worker thread picks it up and executes it. If all
 * worker threads are busy, the tasks wait in the queue until a thread becomes
 * available.
 * 
 * 3. **Thread Pool Manager**: This component manages the creation, allocation,
 * and execution of threads and tasks. It ensures that the number of active
 * threads in the pool doesn't exceed a certain limit. If a thread becomes
 * available (i.e., finishes its task), it is assigned the next task from the
 * queue.
 * 
 * Java provides built-in support for thread pools through the `Executor`
 * framework, which includes interfaces like `ExecutorService` and classes like
 * `ThreadPoolExecutor`. Some common implementations of thread pools are
 * `Executors.newFixedThreadPool`, `Executors.newCachedThreadPool`, and
 * `Executors.newScheduledThreadPool`.
 * 
 * 
 * In the above example, a fixed-size thread pool with 5 threads is created using
 * `Executors.newFixedThreadPool`. Tasks are submitted to the pool using the
 * `submit` method. The thread pool is shut down using the `shutdown` method
 * when tasks are completed.
 */
