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
public class ValidParentheses {
    
    public boolean validParentheses(String s) {
        Stack<Character> mystack = new Stack<Character>();
        for(int i=0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '(' || c == '{' || c == '[') {
                mystack.push(c);
            } else {
                if(c==')') {
                    char compare = mystack.pop();
                    if(compare != '(')
                        return false;
                }
                if(c==']') {
                    char compare = mystack.pop();
                    if(compare != '[')
                        return false;
                }
                if(c=='}') {
                    char compare = mystack.pop();
                    if(compare != '{')
                        return false;
                }                    
            }
        }
        return true;
    }
    
    
    //test with main function
    public static void main(String[] args) {
        String str1 = "My String";
        String str2 = new String("My String");
        
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));
//        System.out.println(String.parse(str1)==str2);
        System.out.println(str1.matches(str2));
        System.out.println(str1.hashCode() == str2.hashCode());
    }
}
