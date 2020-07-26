package fileSystem;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFile {
    public static void main(String[] args) throws IOException {
        ReadingFile readingFile = new ReadingFile();
        File file = new File("./read.txt");
        readingFile.readFile(file);
    }

    public void readFile(File file) throws IOException {
        FileReader fileReader = new FileReader(file);
        int character;
        while((character=fileReader.read()) != -1) {
            System.out.print((char)character);
        }
        fileReader.close();
    }
}
