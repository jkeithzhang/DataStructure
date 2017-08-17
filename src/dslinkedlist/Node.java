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
public class Node {
    int value;
    Node next = null;
    
    public Node(int d) {
        this.value = d;
    }
    
    public void appendtoTail(int d) {
        Node newnode = new Node(d);
        Node n = this;
        while(this.next!=null) {     
            n = n.next;
        }
        n.next = newnode;
    }
}
