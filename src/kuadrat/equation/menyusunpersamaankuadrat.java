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
public class menyusunpersamaankuadrat {
    public static void main(String args[]){
        int x1=-2,x2=5,hasilx1,hasilx2;
        hasilx1 = -x1+-x2;
        hasilx2 = -x1*-x2;
        String hasil = "";
        if(hasilx1 >= 0){
        hasil = "x^2 +" + hasilx1 +"x " + hasilx2 + " = 0"; 
        }
        else if(hasilx2 >= 0){
        hasil = "x^2 " + hasilx1 +"x +" + hasilx2 + " = 0"; 
        }
        else if(hasilx1 >=0 && hasilx2 >=0 ){
        hasil = "x^2 +" + hasilx1 +"x   +" + hasilx2 + " = 0"; 
        }else{
        hasil = "x^2 " + hasilx1 +"x " + hasilx2 + " = 0"; 
        }
        System.out.println(hasil);
    }
}
