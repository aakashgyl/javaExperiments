package com.rs.expt;
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
     * Complete the 'rollTheString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER_ARRAY roll
     */

    public static String rollTheString(String s, List<Integer> roll) {
    // Write your code here
        int[] ctrArr = new int[s.length()];
        StringBuilder str = new StringBuilder(s);

        for(int count : roll){
            for(int i = 0; i < count; i++){
                ctrArr[i] = ctrArr[i]+1;
            }
        }
        System.out.println(Arrays.toString(ctrArr));

        for(int i=0; i < s.length(); i++){
            char c = str.charAt(i);
            int finalval = (int)c + ctrArr[i];
            if (finalval > 122) {
                c = (char) (finalval % 123 + 97);
            }else{
                c = (char) finalval;
            }
            str.setCharAt(i, c);
        }

        return str.toString();
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        int rollCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> roll = IntStream.range(0, rollCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        String result = Result.rollTheString(s, roll);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
