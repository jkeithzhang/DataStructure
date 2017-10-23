/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

/**
 *
 * @author kezhang
 */
public class test2 {
    
    static int fact(int n) {
        int result;
        if(n==1) return 1;
        result = fact(n-1) * n;
        return result;
    }
    
    public static void main(String[] args){
        System.out.println(test2.fact(3));
    }
}
