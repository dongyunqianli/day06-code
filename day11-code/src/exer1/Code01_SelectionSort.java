package exer1;

import Utils_sort.SortMethods;

import static Utils_sort.SortMethods.*;

public class Code01_SelectionSort {

    public static void selectionSort(int[] arr){
        if(arr==null||arr.length<2){
            return;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex=i;
            for (int j = i+1; j < arr.length; j++) {
                minIndex=arr[j]<arr[minIndex]?j:minIndex;

            }
            new SortMethods().swap(arr,i,minIndex);
        }
    }

    public static void main(String[] args){
        int testTime=500000;
        int maxSize=100;
        int maxValue=100;
        boolean succeed=true;
        for (int i = 0; i < testTime; i++) {
            int[] arr1=generateRandomArray(maxSize,maxValue);
            int[] arr2=copyArray(arr1);
            selectionSort(arr1);
            comparator(arr2);
            if(!isEqual(arr1,arr2)){
                succeed=false;
                printArray(arr1);
                printArray(arr2);
                break;
            }
        }
        System.out.println(succeed?"Nice":"Fucking fucked");
        int[] arr=generateRandomArray(maxSize,maxValue);
        printArray(arr);
        selectionSort(arr);
        printArray(arr);

    }
}





















