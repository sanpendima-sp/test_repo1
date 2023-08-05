package file_handling;

import java.io.File;

public class FH_3_ReadFileInfoExample {
	public static void main(String[] args) {
		// Specify the path and filename for the file
		String filePath = "E:\\Programming\\eclipse-workspace\\Sample\\src\\file_handling\\sample.txt";

		// Create a File object representing the file
		File file = new File(filePath);

		// Check if the file exists
		if (file.exists()) {
			System.out.println("File name: " + file.getName());
			System.out.println("Absolute path: " + file.getAbsolutePath());
			System.out.println("Is directory: " + file.isDirectory());
			System.out.println("Is file: " + file.isFile());
			System.out.println("File size (in bytes): " + file.length());
			System.out.println("Last modified timestamp: " + file.lastModified());
		} else {
			System.out.println("File does not exist.");
		}
	}
}
