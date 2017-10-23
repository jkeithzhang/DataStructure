/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

import java.io.FileReader;
import java.io.RandomAccessFile;
import java.io.Reader;

/**
 *
 * @author kezhang
 */
public class Child {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("buffering");
        sb.replace(2,7,"BUFFER");
        sb.delete(2,4);
        String s = sb.substring(1,5);
        System.out.println(s);
    }
}
