package Programs;

import java.util.Scanner;

public class IsPrimeNumber {
    public static void main(String[] args) {
           //it is used to take input from user
        Scanner s= new Scanner(System.in);
        int num = s.nextInt();

        if(isPrime(num)) {
            System.out.println("it is prime number");
        }else  {
            System.out.println("It is not prime number");
        }
    }

    public static boolean isPrime(int num) {
          if(num <=1){
            return false;
          }
          for(int i = 2; i <= Math.sqrt(num); i++){
           if(num % i ==0){
            return  false;
          }
        }
        return  true;
    }
//public static boolean isPrime(int num) {
//    if (num <= 1) {
//        return false;
//    }
//    for (int i = 2; i <= Math.sqrt(num); i++) {
//        if (num % i == 0) {
//            return false;
//        }
//    }
//    return true;
//}
}
