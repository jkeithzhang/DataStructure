/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prep;

import java.util.*;

/**
 *
 * @author kezhang
 */
public class fibonacci {
    

    public int fib_v1(int n) {
        int[] arr = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;
        
        for(int i=2; i<n+1; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[n];
    }

    public int fib_v2(int n) {
        int a=0;
        int b=1;
        int c=0;
        
        for(int i=2; i<n+1; i++) {
            c=a+b;
            a=b;
            b=c;
        }
        return c;
    }
    
    public int fib_v3(int n) {
        if(n<=1)
            return n;
        return fib_v3(n-2)+fib_v3(n-1);
    }
    
    public static void main(String[] args) {
        fibonacci f = new fibonacci();
        System.out.println(f.fib_v3(9));
    }
}
