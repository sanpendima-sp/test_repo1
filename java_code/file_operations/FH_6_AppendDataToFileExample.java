package file_handling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FH_6_AppendDataToFileExample {

	public static void appendDataToFile(String filePath, String data) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
			// The second parameter "true" in FileWriter constructor specifies append mode
			
			writer.newLine(); // Add a new line after the appended data (optional)
			writer.write(data);
			
			System.out.println("Data appended to the file successfully.");
		} catch (IOException e) {
			System.out.println("An error occurred while appending data to the file: " + e.getMessage());
		}
	}

	public static void main(String[] args) {
		// File path to the text file
		String filePath = "E:\\Programming\\eclipse-workspace\\Sample\\src\\file_handling\\sample.txt";

		// Data to append to the file
		String dataToAppend = "This data will be appended to the text file.";

		// Call the method to append data to the file
		appendDataToFile(filePath, dataToAppend);
	}
}
