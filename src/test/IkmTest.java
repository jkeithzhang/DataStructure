/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author kezhang
 */
public class IkmTest {
    static class Helper{
        private int data = 5;
        public void bump(int inc) {
            inc++;
            data=data+inc;
        }
    }
    public static void main(String[] args) {
        Helper h = new Helper();
        int data = 2;
        h.bump(data);


        
//        String e = "1";
//        System.out.println(("1"!=e)?"true":"false");
//        
//        boolean b = false;
//        System.out.println((b=true)?"true":"false");
//        
//        Double d = null;
//        System.out.println((d instanceof Double)?"true":"false");
//        
//        int a = 0;
//        System.out.println((a!=0)?"true":"false");
//        
//        int c = 0;
//        System.out.println((0==c++)?"true":"false");
        
    }
}
