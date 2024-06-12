package Programs.arrayPrograms;

public class CopyArray {
    public static void main(String[] args) {

        //original array
        int[] arr1 = new int[] {1,2,3,4,5};

        //aaray need to update clone
        int[]arr2 = new int[arr1.length];

        //copy each element into new array
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }

        //Show all elements in original array
        System.out.println("Original array");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        System.out.println("Copied array");
        //Show copied array
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
