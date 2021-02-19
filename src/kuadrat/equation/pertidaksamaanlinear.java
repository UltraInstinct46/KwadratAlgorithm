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
public class pertidaksamaanlinear {
    public static void main(String args[]){
        double a=1,b=4,c=1,d=-8,e;
        String equivalent = "<";
        
        //form a + bx > c
//        double hasil = (c-b)/a;
//        if(a <0 && equivalent == "<"){
//            equivalent = ">";
//        }
//        else if(a <0 && equivalent == ">"){
//            equivalent = "<";
//        }
//        else if(a <0 && equivalent == "<="){
//            equivalent = ">=";
//        }
//        else if(a <0 && equivalent == ">="){
//            equivalent = "<=";
//        }
        
        //form a + bx < cx + d
        double hasil2 = (d-a)/(b-c);
        
        if((b-c) <0 && equivalent == "<"){
            equivalent = ">";
        }
        else if((b-c) <0 && equivalent == ">"){
            equivalent = "<";
        }
        else if((b-c) <0 && equivalent == "<="){
            equivalent = ">=";
        }
        else if((b-c) <0 && equivalent == ">="){
            equivalent = "<=";
        }
        //form a + b (cx + d) > ex + f
//        double hasil3 = a + ;
        System.out.println("x "+ equivalent + " " + hasil2);
    }
}
