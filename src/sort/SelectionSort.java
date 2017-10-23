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
public class SelectionSort {
    
    public void selectionSort(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            int index = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[index]>arr[j]) {
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
    }   
    
    public void printArray(int arr[]) {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    
    public static void main(String[] args) {
        SelectionSort os = new SelectionSort();
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        os.selectionSort(arr);
        System.out.println("Sorted array");
        os.printArray(arr);
    }
}
