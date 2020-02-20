# Prime-Number-Java_Interview_Practice
Java Program to determine whether the number is prime or not

package primeNumber;

/**
 *
 * @author Dinesh Nanda
 */
public class PrimeNumber {

    public static void main(String[] args) {
        int number = 7;
        int count = 0;
        
        for(int i = 2; i < number; i++){
            
            if(number % i == 0){
                count++;
            }
        }
        if(count > 0){
            System.out.println("Not a Prime Number");
        }else if(number<=1){
            System.out.println("Not a Prime Number");
        }
        else{
            System.out.println("Prime Number");
        }
    }
}

