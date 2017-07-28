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
    
    // Root of Binary Tree
    BinaryTree root;
 
    // Constructor 1
    BinaryTree(int key){
        this.root = new BinaryTree(key);
    }

    // Constructor 2
    BinaryTree(){
        this.root = null;
    }    

} 

class Node {
    int key;
    BinaryTree left;
    BinaryTree right;
    
    public Node(int key) {
        this.key = key;
        left = right = null;
    }
}

