package multi_theading;

import java.io.File;
import java.util.Date;

class LogFileWatcherDaemon extends Thread {
	private String logFileName;

	public LogFileWatcherDaemon(String logFileName) {
		this.logFileName = logFileName;
	}

	@Override
	public void run() {
		File logFile = new File(logFileName);

		while (true) {
			if (logFile.exists()) {
				long status = logFile.lastModified();
				Date lastModifiedDate = new Date(status); // convert to normal time
				System.out.println("Log file updated: " + lastModifiedDate);
			} else {
				System.out.println("Log file does not exist.");
			}

			try {
				Thread.sleep(3000); // Sleep for 3 seconds before checking again
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class MT_7_DaemonThreadEx {
	public static void main(String[] args) {
		// Create a log file watcher daemon thread
		LogFileWatcherDaemon daemonThread = new LogFileWatcherDaemon(
				"E:\\Programming\\eclipse-workspace\\Sample\\src\\multi_theading\\app.log");
		daemonThread.setDaemon(true); // Set the thread as daemon
		daemonThread.start();

		// Simulate the main thread doing some work
		try {
			Thread.sleep(30000); // Main thread sleeps for 10 seconds
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Main thread exiting...");
	}
}

/*
 * In this example, we'll create a simple application that simulates a log file
 * watcher. The main thread will start a daemon thread that periodically checks
 * for changes in a log file and prints updates.
 * 
 * 
 * 
 * In the above example:
 * 
 * The LogFileWatcherDaemon class extends the Thread class and implements the
 * logic for checking the log file's last modified timestamp.
 * 
 * The DaemonThreadExample class contains the main method where the daemon
 * thread is created and started. The setDaemon(true) method call makes the
 * thread a daemon thread.
 * 
 * Daemon threads are automatically terminated when all non-daemon threads have
 * finished executing.
 * 
 * The main thread simulates doing some work by sleeping for 10 seconds before
 * printing "Main thread exiting..." and terminating.
 * 
 * Please note that in real-time scenarios, you would typically handle more
 * complex tasks and synchronization mechanisms to ensure thread safety and
 * efficient resource usage.
 */
