package StreamsFilesDirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class GetFolderSize {
    public static void main(String[] args) throws IOException {

        String basePath = "E:\\JAVA DEVELOP\\Modules\\Java Advanced\\resources\\Exercises Resources";
        Path folder = Paths.get(basePath);
        long size = Files.walk(folder)
                .filter(p -> p.toFile().isFile())
                .filter(p -> !p.toFile().getName().equals("output.txt"))
                .filter(p -> !p.toFile().getName().equals("result.txt"))
                .mapToLong(p -> p.toFile().length())
                .sum();

        System.out.println(String.format("Folder size: %d", size));
    }
}
