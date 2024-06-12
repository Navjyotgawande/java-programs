package Programs.arrayPrograms;

public class ElementOnEven {
    public static void main(String[] args) {
        int[]arr = new int[]{1,2,3,4,5,2,4};

        System.out.println("Even numbers in an array ");
        for (int i = 1; i < arr.length; i= i +2) {
           System.out.println(arr[i]);
        }
        System.out.println("Odd numbers in an array ");
        for (int j = 0; j < arr.length; j= j +2) {
            System.out.println(arr[j]);
        }
    }
}
