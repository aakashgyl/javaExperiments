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



class Result {

    /*
     * Complete the 'maxMin' function below.
     *
     * The function is expected to return a LONG_INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY operations
     *  2. INTEGER_ARRAY x
     */

    public static List<Long> maxMin(List<String> operations, List<Integer> x) {
        int[] elements = new int[x.size()];
        int end = -1;

        int i=0;
        for(String opr : operations){
            if(opr.equals("push")){
                end++;
                elements[end] = x.get(i);
                Arrays.sort(elements);
            }else if(opr.equals("pop")){
                end--;
            }
            i++;
        }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int operationsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> operations = IntStream.range(0, operationsCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        int xCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> x = IntStream.range(0, xCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        List<Long> result = Result.maxMin(operations, x);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
