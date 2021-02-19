/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kuadrat.equation;

/**
 *
 * @author Restuaji
 */
public class JumlahHasilAkar {
    public static void main (String args[]){
        int a = 1, b = -3, c =5;
        double xpx = -b/a;
        double xmx = c/a;
        double x2px2 = (xpx*xpx) - (2*xmx);
        double xpxp = x2px2/xmx;
        
        System.out.println(xpx);
        System.out.println(xmx);
        System.out.println(x2px2);
        System.out.println(xpxp);
    }
}
