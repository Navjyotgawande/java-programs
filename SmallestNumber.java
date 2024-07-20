package Programs.arrayPrograms;

public class SmallestNumber {

    public static void main(String[] args) {
        int arr[] = new int[]{2,3,4,5, 1};

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] < arr[j]) {
                    min = arr[0];
                }
            }
        }
        System.out.println("Smallest number is " + min);
    }
}
