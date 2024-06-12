package Programs;

import java.util.Scanner;

public class isPalindrome {
    public static void main(String[] args) {

//        String original;
//        String reverse = "";
//        Scanner input = new Scanner(System.in);
//        original = input.nextLine();
//
//        int length = original.length();
//
//        for (int i = length -1; i >=0 ; i--) {
//            reverse = reverse + original.charAt(i);
//
//            if(original.equals(reverse)){
//                System.out.println("Entered string/number is palindrome");
//            }else  {
//                System.out.println("Entered string/number is not palindrome");
//            }
//        }
        Scanner input = new Scanner(System.in);
       String original = input.nextLine();

        if( isPalindrome(original)){
            System.out.println("it is palindrome");
        }else  {
            System.out.println("It is not palindrome");
        }


    }

    public static boolean isPalindrome(String str) {
        int length = str.length();
        String newString = "";
        for (int i = length -1; i >=0 ; i--) {
           newString = newString + str.charAt(i);
        }
        if(str.equals(newString) ) {
          return  true;
        }

        return  false;
    }
}
