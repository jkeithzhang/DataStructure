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
public class gcd {
    
    public int gcd(int a, int b) {
        if(b==0)
            return a;
        else
            return gcd(b, a%b);
    }
}
