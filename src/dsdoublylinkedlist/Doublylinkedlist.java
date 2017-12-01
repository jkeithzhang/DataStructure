/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsdoublylinkedlist;

/**
 *
 * @author Ke Zhang
 */
public class Doublylinkedlist {
    private node head;
    
    public Doublylinkedlist(int val) {
        this.head = new node(val);
        head.next = null;
        head.prev = null;
    }
    
    private class node{
        private int val;
        private node next;
        private node prev;
        
        public node(int val) {
            this.val = val;
        }
    }
    
    
}
