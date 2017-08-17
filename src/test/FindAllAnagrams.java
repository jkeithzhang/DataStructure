/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import java.util.*;
/**
 *
 * @author Ke Zhang
 */
public class FindAllAnagrams {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new LinkedList<Integer>();
        int[] hash = new int[256];
        int slen = s.length();
        int plen = p.length();
        int count = p.length();
        char[] sc = s.toCharArray();
        
        for(int i=0; i<plen; i++) {
            hash[p.charAt(i)]++;
        }
        
        int left = 0;
        int right = 0;
        
        while(right < slen) {
            if(hash[sc[right]] >= 1) {
                count--;
            }
            hash[sc[right]]--;
            right++;
            if(count==0)
                res.add(left);
            if(right-left==plen) {
                if(hash[sc[left]]>=0)
                    count++;
                hash[s.charAt(left)]++;
                left++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        FindAllAnagrams a = new FindAllAnagrams();
        System.out.println(a.findAnagrams("abcddef", "def"));
    }
}
