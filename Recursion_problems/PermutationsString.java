package Recursion_problems;

public class PermutationsString {

    public static void printPermutations(char[] inputString, int left, int right){

        //Base case
        if(left == right){
            System.out.println(String.valueOf(inputString));
            return;
        }

        //Recursive case
        for(int i = left; i <= right; i++){

            //Swap
            swap(inputString, left, i);

            //Recurse
            printPermutations(inputString, left+1, right);

            //Backtrack(undo swap)
            swap(inputString, left, i);

        }
    }

    private static void swap(char[] inputString, int i, int j){
        char temp = inputString[i];
        inputString[i] = inputString[j];
        inputString[j] = temp;
    }

    public static void main(String[] args){
        String input = "abc";
        printPermutations(input.toCharArray(), 0, input.length()-1);
    }
}
