package file_handling;

import java.io.File;
import java.io.IOException;

public class FH_1_CreateFileExample {
	public static void main(String[] args) {
		// Specify the path and filename for the new file
		String filePath = "demo.txt";

		// Create a File object representing the new file
		File file = new File(filePath);

		try {
			// Create the file
			boolean fileCreated = file.createNewFile();

			if (fileCreated) {
				System.out.println("File created successfully.");
			} else {
				System.out.println("File already exists.");
			}
		} catch (IOException e) {
			System.err.println("An error occurred while creating the file: " + e.getMessage());
		}
	}
}
