package solutions;

import common.InputReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DayOne {

    private static final String day = "one";

    public static void main(String[] args) throws IOException {

        partOne();

    }

    static void partOne() throws IOException {
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        var io = InputReader.readInput(day);

        for (var i : io) {
            var vals = i.split(" {3}");
            left.add(Integer.parseInt(vals[0]));
            right.add(Integer.parseInt(vals[1]));
        }

        left.sort(Integer::compareTo);
        right.sort(Integer::compareTo);

        List<Integer> diffs = new ArrayList<>();

        for (var i = 0; i < left.size(); i++) {
            var l = left.get(i);
            var r = right.get(i);
            if (l > r) {
                diffs.add(l - r);
            }
            else if (l < r) {
                diffs.add(r - l);
            } else {
                diffs.add(0);
            }
        }

        int sum = diffs.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Day One :: Part One :: Solution: " + sum);

        partTwo(left, right);
    }

    static void partTwo(List<Integer> l, List<Integer> r) {
        int similarityScore = 0;

        for (var i : l) {
            var count = r.stream().filter(n -> n.equals(i)).toList();
            similarityScore += count.size() * i;
        }

        System.out.println("Day One :: Part Two :: Solution: " + similarityScore);
    }

}
