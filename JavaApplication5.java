/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x;
        Scanner s=new Scanner(System.in);
        System.out.println("enter value:");
        x=s.nextInt();
        if(x>0)
        {
            System.out.println("number is positive");
           
      }
        else if(x==0)
        {
        System.out.println("number is 0");
         }
        else if (x<0)
        {
            System.out.println("umber is negative");
        }
    }
}
