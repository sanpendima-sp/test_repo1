package file_handling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FH_2_WriteToFileExample {
	public static void main(String[] args) {
		// Specify the path and filename for the file
		String filePath = "E:\\Programming\\eclipse-workspace\\Sample\\src\\file_handling\\example.txt";

		try {
			// Create a File object representing the file
			File file = new File(filePath);

			// Create a BufferedWriter to write to the file
			// FileWriter writer = new FileWriter(file);
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));

			// Write data to the file
			writer.write("Hello, this is some data written to the file.");
			writer.newLine(); // Write a new line
			writer.write("This is another line of data.");

			// Don't forget to close the writer to release resources
			writer.close();

			System.out.println("Data has been written to the file successfully.");
		} catch (IOException e) {
			System.err.println("An error occurred while writing to the file: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
