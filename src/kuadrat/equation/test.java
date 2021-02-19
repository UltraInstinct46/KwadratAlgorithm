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
public class test {
    public static void main(String args[]){
        int a = 2, B = -6, C = -13,b,c;
        b = a * C + a * B;
        c = (a*B) * C;
        double root = Math.sqrt(b*b - 4*a*c);
        double disk = (b*b - 4*a*c);
        double answerPlus = (-(b)+root)/(2*a);
        double answerMin = (-(b)-root)/(2*a);
        System.out.println(answerPlus);
        System.out.println(answerMin);
        System.out.println(a + " " + b + " " + c);
        System.out.println(root);
    }
}
