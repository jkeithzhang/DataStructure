/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dstree;

/**
 *
 * @author kezhang
 */
public class BinarySearchTree {
    private node root;
    
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
}

