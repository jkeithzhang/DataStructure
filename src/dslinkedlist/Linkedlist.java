/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dslinkedlist;

import java.util.Stack;

/**
 *
 * @author Ke Zhang
 */
public class Linkedlist {
    node head;
    public Linkedlist(int d) {
        node head = new node(d);
        this.head = head;
    }    
    
    private class node {
        private int data;
        private node next;
        
        public node(int d) {
            this.data = d;
            this.next=null;
        }
    }
    
    public void insertToTail(int val) {
        node n = new node(val);
        node a = head;
        while(a.next != null) {
            a = a.next;
        }
        a.next = n;
    }
 
    public void insertToHead(int val) {
        node n = new node(val);
        n.next = head;
        this.head = n;   
    }
    
    public boolean delete(int val) {
        node a = head;
        if(a.data == val) {
            head = head.next;
            return true;
        }
        node b=a.next;
        while(b!=null) {
            if(b.data == val) {
                a.next = b.next;
                b.next = null;
                return true;
            }
            a=a.next;
            b=b.next;
        }
        return false;
    }
    
    public void printLinkedList() {
        node a = head;
        while(a!=null) {
            System.out.print(a.data + "->");
            a=a.next;
        }
        System.out.println("null");
    }
    
    public int getSize() {
        node a = head;
        int size = 0;
        while(a!=null) {
            size++;
            a=a.next;
        }     
        return size;
    }
    
    public void reverse() {
        Stack<node> a = new Stack<node>();
        while(head!=null) {
            a.push(head);
            head = head.next;
        }
        this.head = null;
        if(!a.empty()) {
            this.head = a.pop();
            this.head.next = null;
        }
        node t = this.head;
        while(!a.empty()) {
            node n = a.pop();
            n.next = null;
            t.next = n;
            t=t.next;
        }
    }
    
    public void sort() {
        node a = head;
        while(a!=null) {
            node b = a.next;
            while(b!=null) {
                if(b.data<a.data) {
                    int temp = a.data;
                    a.data = b.data;
                    b.data = temp;
                }
                b=b.next;
            }
            a=a.next;
        }
    }
    
    public static void main(String[] args) {
        Linkedlist a = new Linkedlist(5);
        a.insertToTail(4);
        a.insertToTail(6);
        
        a.sort();
        a.printLinkedList();
//        System.out.println(a.getSize());
    }
}

