
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterInJava {
    public static void main(String[] args) {
        
        try (FileWriter writer = new FileWriter("Test.txt")) {
            writer.write("I love Movies and Anime.");
        } catch (IOException e) {
           
        }
    }
}
