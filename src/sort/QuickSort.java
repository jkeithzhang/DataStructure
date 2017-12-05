/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

/**
 *
 * @author Ke Zhang
 */
public class QuickSort {
    public void quickSort(int[] arr, int low, int high) {
        int len = arr.length;
        int pivot = len/2;
        int l = 0;
        int r = len - 1;
        
        
    }   
    
    public void printArray(int arr[]) {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    
    public static void main(String[] args) {
        QuickSort qs = new QuickSort();
        int arr[] = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Sorted array");
        qs.printArray(arr);
    }
}
