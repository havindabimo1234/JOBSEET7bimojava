/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10
 */
public class Latihan1 {
    public static void main(String[] args){
        String identitas = "HAVINDA BIMO RUBIYANTORO / XR5 / 14";
        System.out.println("Identitas : "+ identitas);
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nilai a ?");
        int a = scanner.nextInt();
        
        System.out.println("\nIF.. 1");
        if(a < 5) System.out.println("nilai kurang dari 5");
        
        System.out.println("\nIF.. 2");
        if(a == 5)
            System.out.println("nilai a sama dengan 5");
        
        System.out.println("\nIF.. 3");
        if(a > 5){
            System.out.println("isi variabel a : "+a);
           System.out.println("nilai lebih dari 5");
            
            System.out.println("\nIF ELSE..");
            if (a < 5){
            System.out.println("isi variabel a : "+a);
            System.out.println("nilai kurang dari 5");
            
            } else System.out.println("nilai a lebih dari atau sama dengan 5");
            System.out.println("nIF..ELSE IF..ELSE.. 1");
            if(a < 5){
                System.out.println("nilai a kurang dari 5");
            }else if(a == 5) {
                System.out.println("nilai a sama dengan 5");
            }else
                System.out.println("nilai a lebih dari 5");
            
            System.out.println("\nIF..ELSE IF..ELSE..2");
            if(a < 2){
                System.out.println("nilai a kurang dari 2");
            }else if(a < 6){
                System.out.println("nilai a kurang dari 4");
            }else if(a < 6){
                System.out.println("nilai a kurang dari 6");
            }else if(a == 6){
                System.out.println("nilai a sama dengan 6");
            }else {
                System.out.println("nilai a lebih dari 5");
                        }
            }
        }
    }

