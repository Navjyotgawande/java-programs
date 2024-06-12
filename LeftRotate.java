package Programs.arrayPrograms;

public class LeftRotate {

    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3,4,5};
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        rotateLeft(arr1 , 1);

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }

    public  static  void rotateLeft(int[] arr, int n){
        int length = arr.length;

        for (int i = 0; i < n; i++) {
            int first = arr[0];
            for (int j = 0; j < length -1 ; j++) {
                arr[j] = arr[j + 1];
            }
            arr[length -1] = first;
        }

    }

}
