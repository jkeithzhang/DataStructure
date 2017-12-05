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
    
    public BinaryTree(int val) {
        node root = new node(val);
        this.root = root;
    }
    
    private class node {
        private node left;
        private node right;
        private int data;

        public node(int val) {
            this.data = val;
            this.right = null;
            this.left = null;
        }
    }
    
    public void addNodeToLeft(node n, int val) {
        node t = new node(val);
        n.left = t;
    }
    
    public void addNodeToRight(node n, int val) {
        node t = new node(val);
        n.right = t;
    }
     
   public void inOrderTraversal(node n) {
        if(n==null)
            return;
        inOrderTraversal(n.left);
        System.out.print(n.data);
        inOrderTraversal(n.right);
    }
    
    public void preOrderTraversal(node n) {
        if(n==null)
            return;
        System.out.print(n.data);
        preOrderTraversal(n.left);
        preOrderTraversal(n.right);
    }
    
    public void postOrderTraversal(node n) {
        if(n==null)
            return;
        postOrderTraversal(n.left);
        postOrderTraversal(n.right);
        System.out.print(n.data);
    }
    
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree(5);
        bt.addNodeToLeft(bt.root, 4);
        bt.addNodeToRight(bt.root, 6);
        bt.addNodeToRight(bt.root.left, 3);
        bt.addNodeToLeft(bt.root.left, 2);
        bt.addNodeToRight(bt.root.right, 7);
        bt.inOrderTraversal(bt.root);
        
    }
} 
