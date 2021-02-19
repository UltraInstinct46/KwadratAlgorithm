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
public class RumusAbc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 2, b = -38, c = 156;
        double root = Math.sqrt(b*b - 4*a*c);
        double answerPlus = (-(b)+root)/2*a;
        double answerMin = (-(b)-root)/2*a;
        System.out.println(answerPlus);
        System.out.println(answerMin);
    }
   
}
