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
public class pertidaksamaankuadrat {
    public static void main(String args[]){
        int a = -1, b = 3, c = 18;
        String equivalent = "<";
        String hasil = "";
        double root = Math.sqrt(b*b - 4*a*c);
        double answerPlus = (-(b)+root)/2*a;
        double answerMin = (-(b)-root)/2*a;
        double test;
            test = a*((answerPlus-1)*(answerPlus-1)) + b * (answerPlus-1) + c;

        boolean if1 = answerPlus > answerMin,if2 = answerPlus < answerMin;
        if(answerPlus > answerMin){
            test = a*((answerMin-1)*(answerMin-1)) + b * (answerMin-1) + c;
                if(test > 0){
                if(equivalent == "<"){
                    hasil = answerMin + " < x < " + answerPlus;
                }else if(equivalent == "<="){
                    hasil = answerMin + " <= x <= " + answerPlus;
                }else if(equivalent == ">"){
                    hasil = "x < " + answerMin + " atau x > "+ answerPlus;
                }else if(equivalent == ">="){
                    hasil = "x <= " + answerMin + " atau x >= "+ answerPlus;
                }
            }else if(test < 0){
                if(equivalent == "<"){
                    hasil = "x < " + answerPlus + " atau x > "+ answerMin;
                }else if(equivalent == "<="){
                    hasil = "x <= " + answerPlus + " atau x >= "+ answerMin;
                }else if(equivalent == ">"){
                    hasil = answerPlus + " < x < " + answerMin;
                }else if(equivalent == ">="){
                    hasil = answerPlus + " <= x <= " + answerMin;
                }
            }
        }else if(answerPlus < answerMin){
            test = a*((answerPlus-1)*(answerPlus-1)) + b * (answerPlus-1) + c;
                if(test > 0){
                if(equivalent == "<"){
                    hasil = answerPlus + " < x < " + answerMin;
                }else if(equivalent == "<="){
                    hasil = answerPlus + " <= x <= " + answerMin;
                }else if(equivalent == ">"){
                    hasil = "x < " + answerPlus + " atau x > "+ answerMin;
                }else if(equivalent == ">="){
                    hasil = "x <= " + answerPlus + " atau x >= "+ answerMin;
                }
            }else if(test < 0){
                if(equivalent == "<"){
                    hasil = "x < " + answerPlus + " atau x > "+ answerMin;
                }else if(equivalent == "<="){
                    hasil = "x <= " + answerPlus + " atau x >= "+ answerMin;
                }else if(equivalent == ">"){
                    hasil = answerPlus + " < x < " + answerMin;
                }else if(equivalent == ">="){
                    hasil = answerPlus + " <= x <= " + answerMin;
                }
            }
        }
        System.out.println(hasil);
    }
}
