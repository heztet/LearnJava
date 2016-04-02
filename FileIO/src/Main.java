import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
    // When writing to a file, function must catch or throw exception
    public static void main(String[] args) throws Exception{
        /* File file = new File("test.txt");

        try {
            file.createNewFile();
        } catch (Exception e) {
            System.out.println("File could not be written. Error: " + e.getMessage());
        }
        */

        FileWriter writer = new FileWriter("file.txt");
        writer.write("Hi file!\n");
        writer.write("Adding text\n");
        writer.close(); // Required to close file and write contents
    }

    // Returns file contents (with newline chars)
    public String readFile(File f) throws Exception{
        Scanner reader = null;
        String string = "";

        /* try {
            reader = new Scanner(f);
        } catch (Exception e) {
            System.out.println("We couldn't find the file. Error: " + e.getMessage());
            return;
        } */

        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            string += line + "\n";
        }

        reader.close();
        return string;
    }
}
