package StreamsFilesDirectories;

import java.io.*;
import java.util.Scanner;

public class EveryThirdLine {
    public static void main(String[] args) throws FileNotFoundException {

        String basePath = "D:\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\";

        String inputPath = basePath + "input.txt";
        String outputPath = basePath + "third.txt";


        try (FileReader inputReader = new FileReader(inputPath);
             FileOutputStream outputStream = new FileOutputStream(outputPath)) {

            BufferedReader reader = new BufferedReader(inputReader);
            PrintStream writer = new PrintStream(outputStream);

            String line = reader.readLine();
            int counter = 1;
            while (line!=null) {
                if (counter % 3 ==0) {
                    writer.println(line);
                }

                counter++;
                line = reader.readLine();
            }
        } catch (IOException e) {
            System.out.println("BAD");
        }
    }
}
