package Recursion_problems;

import java.util.ArrayList;
import java.util.List;

public class SubsequencesArray {

    public static void printSubsequences(int[] arr, List<Integer> output, int index){

        // Base case
        if(index == arr.length){
            System.out.println(output);
            return;
        }

        // Recursive case
        // 1. Include current element
        output.add(arr[index]);
        printSubsequences(arr, output, index+1);

        // Backtrack (remove last element)
        output.remove(output.size()-1);

        // 2. Exclude current element
        printSubsequences(arr, output, index+1);

    }

    public static void main(String[] args){

        int[] arr = {1,2,3};
        printSubsequences(arr, new ArrayList<>(), 0);
    }
}
