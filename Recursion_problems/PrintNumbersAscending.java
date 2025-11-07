package Recursion_problems;

public class PrintNumbersAscending {

    //Post-recursion or Head recursion
    public static void printAscending(int n){

        //Base case
        if(n == 0) return;;

        //Recursive case
        printAscending(n - 1);

        //Process (after recursion)
        System.out.println(n + " ");
    }

    public static void main(String[] args){
        printAscending(10);
    }
}
