package StreamsFilesDirectories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String path = "D:\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\"
                + "input.txt";

        Set<Character> punctuation = new LinkedHashSet<>();
        Collections.addAll(punctuation,',','.','!','?');

        FileInputStream inputStream = new FileInputStream(path);
        int readByte = inputStream.read();
        while (readByte >= 0) {
            char charByte  = (char)readByte;
            if (!punctuation.contains(charByte)){
                System.out.print(charByte);
            }

            readByte = inputStream.read();
        }
    }
}
