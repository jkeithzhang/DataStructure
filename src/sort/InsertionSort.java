/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sort;

/**
 *
 * @author kezhang
 */
public class InsertionSort {
    public void insertionSort(int[] arr) {
        int n=arr.length;
        if(n<=1)
            return; 
        int start, end;
        for(int i=1; i<n; i++) {
            int j=i-1;
            int key = arr[i];
            while(j>=0&&arr[j]>key) {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }   
    
    public void printArray(int arr[]) {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    
    public static void main(String[] args) {
        InsertionSort is = new InsertionSort();
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        is.insertionSort(arr);
        System.out.println("Sorted array");
        is.printArray(arr);
    }
}
