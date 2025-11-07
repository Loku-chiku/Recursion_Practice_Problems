package Recursion_problems;

public class PrintNumbersDescending {

    //Pre-recursion or Tail recursion
    public static void printDescending(int n){

        //Base case
        if(n == 0) return;

        //Process(before recursion)
        System.out.println(n + " ");

        //Recursive case
        printDescending(n - 1);
    }

    public static void main(String[] args){
        printDescending(10);
    }
}
