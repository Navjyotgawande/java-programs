package Programs;

public class Patterns {

    public static void main(String[] args) {

        int n = 5;

        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n; j++) {
                  System.out.print("*");
            }
          System.out.println();
        }
//         *****
//         *****
//         *****
//         *****
//         *****
//         *****

        System.out.println("__________________________________________");


        int num1 =5;

        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

//        *
//        **
//        ***
//        ****
//        *****

        System.out.println("__________________________________________");


         int num2 = 5;

//        for (int i = 0; i < num2; i++) {
//            for (int j = num2; j > i; j--) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        for (int i = 0; i < num2; i++) {
            for (int j = i; j < num2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("__________________________________________");

//*****
//****
//***
//**
//*


        int num3 = 5 ;

        for (int i = 0; i < num3; i++) {
            for (int j = i; j < num3; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

//               *
//              **
//             ***
//            ****

        System.out.println("__________________________________________");
           int num4 =5;

        for (int i = 0; i < num4; i++) {

            for (int j = 0; j < i; j++) {
             System.out.print(" ");
            }
            for (int k = i; k < num4; k++) {
           System.out.print("*");
            }

            System.out.println();
        }

    }
}
