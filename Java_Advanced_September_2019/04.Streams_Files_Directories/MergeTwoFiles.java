package StreamsFilesDirectories;

import java.io.*;

public class MergeTwoFiles {
    public static void main(String[] args) {

        String basePath = "E:\\JAVA DEVELOP\\Modules\\Java Advanced\\resources";
        String inputOnePath = basePath + "\\inputOne.txt";
        String inputTwoPath = basePath + "\\inputTwo.txt";
        String outPath = basePath + "\\5output.txt";

        try (
                BufferedReader inputOneReader = new BufferedReader(new InputStreamReader(
                        new FileInputStream(new File(inputOnePath))));

                BufferedReader inputTwoReader = new BufferedReader(new InputStreamReader(
                        new FileInputStream(new File(inputTwoPath))));

                PrintWriter out = new PrintWriter(new FileWriter(outPath)))
        {
            String line;

            while ((line = inputOneReader.readLine()) != null) {
                out.println(line);
            }


            while ((line = inputTwoReader.readLine()) != null) {
                out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
