/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsstack;

/**
 *
 * @author Ke Zhang
 */
public class Stack {
    static final int MAX = 1000;
    int top = -1;
    int a[] = new int[MAX];
    
    boolean isEmpty() {
        return (this.top < 0);
    }
    
    boolean push(int x) {
        if(top>=MAX) {
            System.out.println("Stack Overflow.");
            return false;
        } else {
            a[++top] = x;
            return true;
        }
    }
    
    int pop() {
        if(top<0) {
            System.out.println("Stack Underflow.");
            return 0;
        } else {
            int x = a[top--];
            return x;
        }
    }
    
    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(1);
        s.pop();
        System.out.println(s.top);
        System.out.println(s.isEmpty());
    }
}
