package test;

import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ke Zhang
 */
public class FindAllAnagramsBrutal {
    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        List<Integer> result = new LinkedList<Integer>();
        char[] pc = p.toCharArray();
        char[] sc = s.toCharArray();
        for(int i=0; i<pc.length; i++) {
            if(hm.containsValue(pc[i])) {
                int temp = hm.get(pc[i]);
                hm.put(pc[i], ++temp);
            }
        }
        for(int j=0; j<sc.length; j++) {
            HashMap<Character, Integer> comp = new HashMap<Character, Integer>();
            for(int k=j; k<j+3; k++) {
                if(comp.containsValue(pc[k])) {
                    int temp = comp.get(pc[k]);
                    comp.put(pc[k], ++temp);
                }
            }
            if(comp == hm) {
                result.add(j);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        FindAllAnagrams a = new FindAllAnagrams();
        System.out.println(a.findAnagrams("abcdabcdef", "abc"));
    }
}
