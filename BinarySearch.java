package Programs.SearchSort;

public class BinarySearch {
//    Binary search is used to search a key element from multiple elements.
//    Binary search is faster than linear search.
//        In case of binary search, array elements must be in ascending order.
//    If you have unsorted array, you can sort the array using Arrays.sort(arr) method.

    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        int key = 40;
        int last=arr.length-1;
        binarySearch(arr,0,last,key);
    }

    public static void binarySearch(int arr[], int first, int last, int key) {
        int mid = (first + last) / 2;
        while (first <= last) {
            if (arr[mid] < key) {
                first = mid + 1;
            } else if (arr[mid] == key) {
                System.out.println("Element is found at index: " + mid);
                break;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
        if (first > last) {
            System.out.println("Element is not found!");
        }
    }
}

