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



class ResultOne {

    /*
     * Complete the 'degreeOfArray' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int degreeOfArray(List<Integer> arr) {
    // Write your code here
        int deg = 0;
        HashMap<Integer, HashMap<String, Integer>> valCount = new HashMap<Integer, HashMap<String, Integer>>();
        HashMap<String, Integer> newmap = null;
        int max = 1;

        for(int i=0; i< arr.size(); i++){
            int val = arr.get(i);
            if(valCount.containsKey(val)){
                newmap = valCount.get(val);
                int newcount = newmap.get("COUNT") + 1;
                newmap.put("COUNT", newcount);
                newmap.put("END", i);
                max = newcount > max ? newcount : max;
            }else{
                newmap = new HashMap<String, Integer>();
                newmap.put("START",i);
                newmap.put("COUNT", 1);
                newmap.put("END", i);

                valCount.put(val, newmap);
            }
            newmap = null;
        }
        
        for(int key : valCount.keySet()){
            int i = 0;
            HashMap<String, Integer> data = valCount.get(key);
            if(data.get("COUNT") == max){
                int degdiff = data.get("END") - data.get("START") + 1;
                if(i == 0){
                    deg = degdiff;
                }
                deg = deg < degdiff ? deg : degdiff;
            }
            i++;
        }

        return deg;
    }

}

class SolutionOne {
    public static void mainagain(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = IntStream.range(0, arrCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        int result = ResultOne.degreeOfArray(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
