 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dstree;

/**
 *
 * @author Ke Zhang
 */
public class BinaryTree {
    private node root;
    
    public BinaryTree() {
    
    }
    
    private class node {
        private node left;
        private node right;
        private int data;
    }
    
    public static void main(String[] args) {
//        BinaryTree a = new BinaryTree();
//        a.root = new node();
        node a = new node();
        a.data = 2; 
   }
} 
