package StreamsFilesDirectories;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ALLCAPITALS {
    public static void main(String[] args) {


        String inputPath = "E:\\JAVA DEVELOP\\Modules\\Java Advanced\\src" +
                "\\StreamsFilesDirectories\\resources\\input.txt";


        try {
            File file = new File("myOutput.txt");
            BufferedReader reader =new BufferedReader(new FileReader(inputPath));
            BufferedWriter writer =new BufferedWriter(new FileWriter(file));

            String line = reader.readLine();
            while (line != null) {
                String upper = line.toUpperCase();

                writer.write(upper);
                writer.newLine();
                line = reader.readLine();
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
