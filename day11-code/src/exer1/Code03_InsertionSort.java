package exer1;

import static Utils_sort.SortMethods.*;

public class Code03_InsertionSort {
    public static void insertionSort(int[] arr){
        if(arr==null||arr.length<2){
            return;
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = i-1; j >=0 && arr[j]>arr[j+1] ; j--) {
                swap2(arr,j,j+1);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1=generateRandomArray(100,100);
        insertionSort(arr1);

        int[] arr2 = copyArray(arr1);
        comparator(arr2);

        printArray(arr1);
        printArray(arr2);

    }
}
