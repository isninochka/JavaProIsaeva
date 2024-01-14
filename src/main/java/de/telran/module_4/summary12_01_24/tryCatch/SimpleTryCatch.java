package de.telran.module_4.summary12_01_24.tryCatch;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

public class SimpleTryCatch {

    public static void main(String[] args) throws IOException {


    Path path = Paths.get("testFile.txt");
    int nameCount = path.getNameCount();
        System.out.println(nameCount);
        System.out.println(path.getParent());
        System.out.println(path.toAbsolutePath());

        Path pathDest = Paths.get("copyFile.txt");
        try {
            Files.copy(path, pathDest, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        List<String> strings = Files.readAllLines(path);
        System.out.println(strings);

    }
}