package Programs.arrayPrograms;

public class LargestNumber {
    public static void main(String[] args) {
        int[]arr = new int[]{1,2,3,4,5,2,4 ,12};

        int max = arr[0];
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length; j++) {
                 if(arr[i]> max) {
                     max = arr[i];
                 }

            }

        }
        System.out.println("Largest number is " + max);
    }
}
