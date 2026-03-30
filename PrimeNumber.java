/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primenumber;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num=obj.nextInt();
        if((num%1==0)||(num%3==0)||(num%5==0)||(num%7==0))
        {
             System.out.println(num+" is a prime number");   
        }
        else
        {
            System.out.println("not a prime number");
        }
    }
    
}
