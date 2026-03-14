import java.io.*;
public class FileHandlingUtility {
    public static void createFile(String fileName) {
        try {
            File file = new File(fileName);
            if (file.createNewFile()) {
                System.out.println("File created successfully: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("Error while creating file.");
        }
    }
    public static void writeFile(String fileName, String content) {
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write(content);
            writer.close();
            System.out.println("Data written successfully.");
        } catch (IOException e) {
            System.out.println("Error while writing to file.");
        }
    }
    public static void readFile(String fileName) {
        try {
            FileReader reader = new FileReader(fileName);
            BufferedReader br = new BufferedReader(reader);
            String line;

            System.out.println("\nReading File Content:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
        } catch (IOException e) {
            System.out.println("Error while reading file.");
        }
    }
    public static void appendFile(String fileName, String content) {
        try {
            FileWriter writer = new FileWriter(fileName, true);
            writer.write(content);
            writer.close();
            System.out.println("Data appended successfully.");
        } catch (IOException e) {
            System.out.println("Error while appending to file.");
        }
    }
    public static void deleteFile(String fileName) {
        File file = new File(fileName);
        if (file.delete()) {
            System.out.println("File deleted successfully.");
        } else {
            System.out.println("Unable to delete file.");
        }
    }
    public static void main(String[] args) {
        String fileName = "internship_demo.txt";
        // 1. Create File
        createFile(fileName);
        // 2. Write Data
        writeFile(fileName, "Hello, this is a File Handling Utility Program.\n");
        // 3. Append Data
        appendFile(fileName, "This line is added later using append operation.\n");
        // 4. Read File
        readFile(fileName);
        // 5. Delete File (Optional - Uncomment if needed)
        // deleteFile(fileName);
    }
}
