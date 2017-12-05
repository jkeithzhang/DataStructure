/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dsgraph;

import java.util.*;

/**
 *
 * @author kezhang
 */
public class graph {
    private List<edge> g[];
    public graph(int n) {
        this.g = new LinkedList[n];
        for(int i=0; i<this.g.length; i++) {
            g[i]=new LinkedList<edge>();
        }
    }
    private class edge {
        private int v;
        private int w;
        public edge(int v, int w) {
            this.v = v;
            this.w = w;
        }
        @Override
        public String toString() {
            return "("+this.v+','+this.w+")";
        }
    }
    
    @Override
    public String toString() {
        String result = "";
        for(int i=0; i<this.g.length; i++) {
            result += i+"=>"+g[i]+"\n";
        }
        return result;
    }
    
    public boolean isConnected(int u, int v) {
        for(edge e : g[u]) {
            if(e.v==v)
                return true;
        }
        return false;
    }
    
    public void addEdge(int u, int v, int w) { 
       this.g[u].add(new edge(v, w));//有0也可以
    }
    
    public static void main(String[] args) {
        graph a = new graph(10);
        a.addEdge(0, 1, 10);
        a.addEdge(0, 2, 20);
        a.addEdge(0, 3, 30);
        a.addEdge(1, 9, 30);
        a.addEdge(9, 3, 50);
        System.out.println(a);
    }
    
}
