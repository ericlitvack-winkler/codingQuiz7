import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

import javafx.util.Pair;

class Result {

    /*
     * Complete the 'icecreamParlor' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER m
     *  2. INTEGER_ARRAY arr
     */
    public static Integer iceCream(List<Integer> arr, int i, int j) {

        int n = 0;
        if (i == 0 && j == 1) {
            return n;
        } else {
            if (i != j) {
                n++;
            }
            if (j == 0) {
                return iceCream(arr, i - 1, arr.size() - 1);
            } else {
                return iceCream(arr, i, j - 1);
            }
        }

    }

    public static Integer icecreamParlor(int m, List<Integer> arr) {
        // Write your code here
        int size = arr.size();
        return 0; //iceCream(arr, size, size - 1);

    }

    public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int t = Integer.parseInt(bufferedReader.readLine().trim());

            IntStream.range(0, t).forEach(tItr -> {
                try {
                    int m = Integer.parseInt(bufferedReader.readLine().trim());

                    int n = Integer.parseInt(bufferedReader.readLine().trim());

                    List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                            .map(Integer::parseInt)
                            .collect(toList());

                    Integer result = Result.icecreamParlor(m, arr);
                    bufferedWriter.write(result.toString() + "\n");

                    // bufferedWriter.write(
                    //     result.stream()
                    //         .map(Object::toString)
                    //         .collect(joining(" "))
                    //     + "\n"
                    // );
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            });

            bufferedReader.close();
            bufferedWriter.close();
        }
    }

}
