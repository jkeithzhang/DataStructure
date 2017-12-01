/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dslinkedlist;

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
        }
    }
}

