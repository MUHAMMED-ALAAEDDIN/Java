/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package math;

public class Math {
    public static double powE(double x){
    return 1+x+x*x/2+x*x*x/6+x*x*x*x*x/120;
   }
   public static double ln(double x){
   return (x-1)-(x-1)*(x-1)/2+(x-1)*(x-1)*(x-1)/3-(x-1)*(x-1)*(x-1)*(x-1)/4+(x-1)*(x-1)*(x-1)*(x-1)*(x-1)/5;
   }
   public static double power(double a,double b){
    double lna=ln(a);
    double lnx=b*ln(a);
    return powE(lnx);
   }
    public static void main(String[] args) {
        System.out.println(Math.powE(2.3));
        System.out.println(Math.ln(1.6));
        System.out.println(Math.power(1.7, 1.5));
    }
    
}
