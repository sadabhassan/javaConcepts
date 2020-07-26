package fileSystem;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingFile {
    public static void main(String[] args) throws IOException{
        WritingFile writingFile = new WritingFile();
        File file = new File("./write.txt");
        String message = "This is the example of writing a file.";
        writingFile.writeFile(file, message);
    }
    public void writeFile(File file, String message) throws IOException {
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(message);
        fileWriter.close();
    }
}
