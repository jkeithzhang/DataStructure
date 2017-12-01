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
public class lcm {
    public int lcm(int a, int b) {
        int l = a*b;
        for(int i=1; i<l; i++) {
            if(i%a==0 && i%b==0) {
                return i;
            }
        }
        return -1;
    }
}
