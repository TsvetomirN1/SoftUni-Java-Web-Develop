package StreamsFilesDirectories;

import java.io.*;
import java.util.Scanner;

public class ExtractIntegers {
    public static void main(String[] args) throws FileNotFoundException {

        String basePath = "D:\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\";

        String inputPath = basePath + "input.txt";
        String outputPath = basePath + "integers.txt";


        try (FileReader inputReader = new FileReader(inputPath);
             FileOutputStream outputStream = new FileOutputStream(outputPath)) {

            BufferedReader reader = new BufferedReader(inputReader);
            PrintWriter writer = new PrintWriter(outputStream);

            String line = reader.readLine();
int counter = 0;
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
