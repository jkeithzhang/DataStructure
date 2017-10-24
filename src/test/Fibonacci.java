/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Ke Zhang
 */
public class Fibonacci {
    public int getNthFibonacciRecursive(int n) {
        if(n==0 || n==1) {
            return n;
        }
        return getNthFibonacciRecursive(n-1) + getNthFibonacciRecursive(n-2);
    }
    
    public int getNthFibonacciBottomUpDp(int n) {
        return 0;
    }
    public static void main(String[] args) {
        Fibonacci a = new Fibonacci();
        System.out.println(a.getNthFibonacciRecursive(100));
    }
}
