/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

import java.util.*;

/**
 *
 * @author kezhang
 */
public class Generic {
    
    public static void main(String[] args) {   
        List<String> result = new ArrayList<String>();
        
        List<String> tmp = new LinkedList<String>();
        tmp.add("1");
        tmp.add("2");
        tmp.add("3");
        tmp.add("4");
        tmp.add("5");
        
        List<String> comp = new LinkedList<String>();
        comp.add("1");
        comp.add("2");
        comp.add("2");
        comp.add("2");
        comp.add("6");
        
        Set<String> res = new HashSet<String>();
                
        for(int i=0; i<tmp.size(); i++) {
            if(!res.contains(tmp.get(i))) {
                res.add(tmp.get(i));
            }
        }
        
        for(int i=0; i<comp.size(); i++) {
            if(res.contains(comp.get(i))) {
               res.remove(comp.get(i));
               result.add(comp.get(i));
            }
        }
        
        for(String n : result) {
            System.out.println(n);
        }
   }
            
}
