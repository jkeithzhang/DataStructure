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
public class test {
    public static void main(String[] args) {
        int a=2;
        int b=3;
        gcd test1 = new gcd();
        lcm test2 = new lcm();
        System.out.println(test1.gcd(20,36));
        System.out.println(test2.lcm(20,36));
    }
}
