package file_handling;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class FH_5_ReadXMLData {
	public static void main(String[] args) {
		try {
			// Specify the path to the XML file
			String filePath = "E:\\Programming\\eclipse-workspace\\Sample\\src\\file_handling\\data.xml";

			// Create a new File object representing the XML file
			File file = new File(filePath);

			// Create a DocumentBuilderFactory and DocumentBuilder
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();

			// Parse the XML file to create a Document object
			Document doc = builder.parse(file);

			// Get the root element
			Element rootElement = doc.getDocumentElement();
			
			// Get the list of 'person' elements
            NodeList personList = rootElement.getElementsByTagName("person");
			
         // Process each 'person' element
            for (int i = 0; i < personList.getLength(); i++) {
                Node personNode = personList.item(i);
                if (personNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element personElement = (Element) personNode;
                    
                    // Get the 'name' and 'age' elements for each 'person'
                    String name = personElement.getElementsByTagName("name").item(0).getTextContent();
                    String age = personElement.getElementsByTagName("age").item(0).getTextContent();

                    System.out.println("Person " + (i + 1) + ":");
                    System.out.println("Name: " + name);
                    System.out.println("Age: " + age);
                    System.out.println();
                }
            }
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
