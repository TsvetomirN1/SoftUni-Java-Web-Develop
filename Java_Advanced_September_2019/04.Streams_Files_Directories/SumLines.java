package StreamsFilesDirectories;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SumLines {
    public static void main(String[] args) {

        String path = "E:\\JAVA DEVELOP\\Modules\\Java Advanced\\src" +
                "\\StreamsFilesDirectories\\resources\\input.txt";


        try {
            BufferedReader reader = Files.newBufferedReader(Paths.get(path));
            String line = reader.readLine();
            while (line != null) {
                int sum = 0;
                for (char c : line.toCharArray()) {
                    sum += c;
                }
                System.out.println(sum);
                line = reader.readLine();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
