package Programs.SearchSort;

public class LinearSearch {
    public static void main(String[] args) {
        int nums[] = {10,20,30,40,50};
        int key = 0;
        System.out.println(key + " is found at index: " +linearSearch( nums ,key));
    }

    public static int linearSearch(int[]arr , int key){
        for (int i = 0; i < arr.length; i++) {
            if(key == arr[i]) {
                return i;
            }
        }
        return -1;
    }

}
