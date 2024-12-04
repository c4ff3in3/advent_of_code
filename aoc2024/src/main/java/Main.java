import common.InputReader;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            var io = InputReader.readInput("one");
            System.out.println(io);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
