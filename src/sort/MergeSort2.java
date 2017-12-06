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
public class MergeSort2 {
    
    public void mergesort2(int arr[]) {
        int len = arr.length;
        int l = 0;
        int r = len-1;
        dnc(arr, l, r);
    }
    
    public void dnc(int arr[], int l, int r) {
        if(l<r) {
            int m = l+(r-l)/2;
            dnc(arr, l, m);
            dnc(arr, m+1, r);
            
            int size1 = m-l+1;
            int size2 = r-m;

            int[] leftTmp = new int[size1];
            int[] rightTmp = new int[size2];

            for(int i=0; i<size1; i++) {
                leftTmp[i] = arr[l+i];
            }
            for(int i=0; i<size2; i++) {
                rightTmp[i] = arr[m+1+i];
            }
            
            int i=0,j=0;
            int k = l;
            
            while(i<size1 && j<size2) {
                if(leftTmp[i]<=rightTmp[j]) {
                    arr[k] = leftTmp[i];
                    i++;
                } else {
                    arr[k] = rightTmp[j];
                    j++;
                }
                k++;
            }

            while(i<size1){
                arr[k] = leftTmp[i];
                i++;
                k++;
            }
            while(j<size2){
                arr[k] = rightTmp[j];
                j++;
                k++;
            }
        }
    }
    
    
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i=0; i<n; ++i)
        System.out.print(arr[i] + " ");
        System.out.println();
    }
 
    public static void main(String args[]) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Given Array");
        printArray(arr);
        MergeSort2 ob = new MergeSort2();
        ob.mergesort2(arr);
        System.out.println("\nSorted array");
        printArray(arr);
    }
}
