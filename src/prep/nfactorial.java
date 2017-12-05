/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prep;

/**
 *
 * @author kezhang
 */
public class nfactorial {
    
    //bigO: O(n)
    //space: n
    public long nfactorial_v1(int n) {
        if(n==1)
            return 1;
        return n * nfactorial_v1(n-1);
    }
    //bigO: O(n)
    //Space: 1
    public long nfactorial_v2(int n) {
        long res = 1;
        for(int i=n; i>1; i--) {
            res*=i;
        } 
        return res;
    }
    
    public static void main(String[] args) {
        nfactorial a = new nfactorial();
        System.out.println(a.nfactorial_v1(6));
        System.out.println(a.nfactorial_v2(6));
    }
}
