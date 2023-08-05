package file_handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FH_4_ReadFileDataExample {
	public static void main(String[] args) {
		// Specify the path and filename for the file
		String filePath = "E:\\Programming\\eclipse-workspace\\Sample\\src\\file_handling\\example.txt";

		try {
			// Create a File object representing the file
			File file = new File(filePath);
			
			// Create a Bufferedreadr to read to the file
			// Filereadr readr = new Filereadr(file);
			BufferedReader reader = new BufferedReader(new FileReader(file));

			// read data to the file
			int i;
			while ((i = reader.read()) != -1) {
				System.out.print((char)i);
			}

			// Don't forget to close the reader to release resources
			reader.close();

			System.out.println("Data has been written to the file successfully.");
		} catch (IOException e) {
			System.err.println("An error occurred while writing to the file: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
