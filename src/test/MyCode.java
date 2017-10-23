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
class MyCode {
    public static void main(String[] args) {
        Long l = new Long(1234);
        Long ll = l;
        if(l==ll)
            System.out.println("Equal Objects");
        else
            System.out.println("Not Equal Objects");
        
        l++;
        
        if(l==ll)
            System.out.println("Equal Objects");
        else
            System.out.println("Not Equal Objects");
    }
}
