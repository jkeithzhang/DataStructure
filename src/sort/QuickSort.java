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
public class QuickSort {
    
    public void quickSort(int[] arr) {
        this.quickSort(arr, 0, arr.length-1);
    }
    
    
    private void quickSort(int[] arr, int left, int right) {
        int len = arr.length;
        int l = left;
        int r = right;
        
        if(l>=r) {
            return;
        }
        int pivot = arr[l+(r-l)/2];
        
        while(l<=r) {
            while(arr[l]<pivot) {
                l++;
            }
            while(arr[r]>pivot) {
                r--;
            }
            if(l<=r) {
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
        }
        quickSort(arr, left, l-1);
        quickSort(arr, l, right);
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
        qs.quickSort(arr);
        System.out.println("Sorted array");
        qs.printArray(arr);
    }
}
