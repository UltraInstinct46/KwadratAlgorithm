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
public class NewClass1 {
    public static void main (String args[]){
        int A = 2, H = -3, K = -10,a,h,k;
        a = A*A;
        h = (H*A) + (H*A);
        h = h+h;
        k = ((H*A)*(H*A))+(K * A);
        
        double root = Math.sqrt(h*h - 4*a*k);
        double disk = (h*h - 4*a*k);
        double answerPlus = (h+root)/(2*a);
        double answerMin = (h-root)/(2*a);
        System.out.println(answerPlus);
        System.out.println(answerMin);
        System.out.println(a + " " + h + " " + k);
        System.out.println(root + " " + -h);
    }
}
