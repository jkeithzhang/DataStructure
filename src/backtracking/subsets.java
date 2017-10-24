/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backtracking;

import java.util.*;
/**
 *
 * @author Ke Zhang
 */
public class subsets {
    public List<List<Integer>> subsets(int[] nums) { 
        List<List<Integer>> res=new ArrayList<List<Integer>>(); 
        res.add(new ArrayList<Integer>()); 
        if(nums.length<=0){ 
            return res; 
        } 
        Arrays.sort(nums); 
        List<Integer> tmp=new ArrayList<Integer>(); 
        dfs(0,nums,tmp, res); 
        return res; 
    }
    
    public void dfs(int start,int[] nums,List<Integer> tmp, List<List<Integer>> res){ 
        for(int i=start;i<nums.length;i++){ 
            tmp.add(nums[i]); 
            res.add(new ArrayList<Integer>(tmp)); 
            dfs(i+1,nums,tmp,res); 
            tmp.remove(tmp.size()-1); 
        } 
    }
    
    public static void main(String[] args) {
         int[] input = {1,2,3,4,5};
         subsets a = new subsets();
         List<List<Integer>> ret = a.subsets(input);
         System.out.println(ret);
   }
}
