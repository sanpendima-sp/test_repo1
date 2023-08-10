package multi_theading;

public class MT_10_ThreadShutDownHookExample {
	 public static void main(String[] args) {
	        // Register a shutdown hook
	        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
	            System.out.println("Shutdown hook executed: Performing cleanup...");
	            // Add your cleanup operations here
	        }));

	        // Simulate a long-running application
	        try {
	            System.out.println("Application started. Press Ctrl+C to exit.");
	            Thread.sleep(10000); // Simulate some work (e.g., 10 seconds)
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }
}
