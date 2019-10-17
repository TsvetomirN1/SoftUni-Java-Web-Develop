package StreamsFilesDirectories;

import java.io.*;

public class LineNumbers {
    public static void main(String[] args) {

        String basePath = "E:\\JAVA DEVELOP\\Modules\\Java Advanced\\resources";

        String inputPath = basePath + "\\inputLineNumbers.txt";
        String outPath = basePath + "\\3output.txt";

        try (
                BufferedReader reader = new BufferedReader(new InputStreamReader(
                                new FileInputStream(new File(inputPath))));

                PrintWriter out = new PrintWriter(new FileWriter(outPath))
        ) {
            int lineCount = 1;

            String line;
            while ((line = reader.readLine()) != null) {
                out.println(String.format("%d. %s", lineCount++, line));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
