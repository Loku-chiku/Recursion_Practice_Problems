package Recursion_problems;

public class SubsetsString {

    public static void printSubsets(String input, String output, int index){

        // Base case
        if(index == input.length()){
            System.out.println(output);
            return;
        }

        // Recursive case
        //1. Include current char
        printSubsets(input, output + input.charAt(index), index+1);

        //2. Exclude current char
        printSubsets(input, output, index+1);

    }

    public static void main(String[] args){
        printSubsets("abcd", "", 0);
    }
}
