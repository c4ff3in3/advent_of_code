package common;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class InputReader {

    public static List<String> readInput(String day) throws IOException {
        Path p = Paths.get("aoc2024/src/main/resources/inputs/" + day + "_input.txt");
        return Files.readAllLines(p);
    }

}
