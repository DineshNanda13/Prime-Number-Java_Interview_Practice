package Fib_Rec;

/**
 *
 * @author  Dinesh Nanda
 */

public class Fib_Rec {
    
    public int fib(int num){
        if(num == 0 || num == 1){
            return num;
        }
        else{
            return fib(num - 1) + fib(num - 2);
        }
    }
    public static void main(String[] args) {
        Fib_Rec fibonacci = new Fib_Rec();
        System.out.println(fibonacci.fib(7));
    }
}
