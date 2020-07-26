package fileSystem;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyingFile {
    public static void main(String... args) throws IOException {
        File file = new File("./input.txt");
        FileReader fileReader;
        FileWriter fileWriter;
        if(!file.exists()) {
            file.createNewFile();
            fileWriter = new FileWriter(file);
            fileWriter.write("this text is written by automation script");
            fileWriter.close();
        }
        fileWriter = new FileWriter(new File("./output.txt"));
        fileReader = new FileReader(file);
        int c;
        while((c=fileReader.read()) != -1) {
            fileWriter.write(c);
        }
        fileWriter.close();
        fileReader.close();
    }
}
