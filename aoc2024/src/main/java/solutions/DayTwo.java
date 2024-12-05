package solutions;

import common.InputReader;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class DayTwo {

    private static final String day = "two";

    public static void main(String[] args) throws IOException {
        var input = InputReader.readInput(day);
        partOne(input);
        partOne(input);
    }

    // Report = Row
    // Level = Col
    public static void partOne(List<String> input) throws IOException {
        int safeReportsCount = 0;

        for (String line : input) {
            var nums = Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).toArray();
            var asc = isSortedAscending(nums);
            var desc = isSortedDescending(nums);

            if (asc || desc) {
                // process
                System.out.println(Arrays.toString(nums) + " sorted");
            } else {
                System.out.println(Arrays.toString(nums) + " unsorted");
            }

        }

    }

    public static void partTwo(List<String> input) throws IOException {

    }


    public static boolean isSortedAscending(int[] input) {
        for (var i = 0; i < input.length; i++) {
            if (i == input.length - 1) {
                break;
            }
            if (input[i] < input[i + 1]) {
            }
            else {
                return false;
            }
        }
        return true;
    }


    public static boolean isSortedDescending(int[] input) {
        for (var i = 0; i < input.length; i++) {
            if (i == input.length - 1) {
                break;
            }
            if (input[i] > input[i + 1]) {
            }
            else {
                return false;
            }
        }
        return true;
    }


}
