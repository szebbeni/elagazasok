/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package elagazasok1;

import java.util.Scanner;

/**
 *
 * @author szebb
 */
public class Elagazasok1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Kérek egy számot: ");
        Scanner be = new Scanner(System.in);
        int a = be.nextInt();
        
        System.out.println("Kérek egy másik számot");
        int b = be.nextInt();
        
        if(a < b) {
            System.out.printf("A %d kisebb, mint %d", a, b);
        }
        else {
            System.out.printf("A %d kisebb, mint %d", b, a);
        }
        
        System.out.println("\n");
        
        int egesz = 30;
        if(egesz % 10 == 0 && egesz % 3 == 0) {
            System.out.printf("A 30 osztható 10-zel és 3-mal maradék nélkül");
        }
        else {
            System.out.printf("A 30 nem osztható 10-zel és 3-mal maradék nélkül");
        }
        egesz = 27;
        if(egesz % 10 == 0 || egesz % 3 == 0) {
            System.out.println("A 27 osztható 10-zel és 3-mal maradék nélkül");
        }
        else {
            System.out.println("A 27 nem osztható 10-zel és 3-mal maradék nélkül");

        }
        
        double szazalek = 60.0;
        if(szazalek >= 80) {
            System.out.println("Jeles");
        }
        else if(szazalek >= 60 && szazalek < 80) {
            System.out.println("Jó");
        }
        else if(szazalek >= 50 && szazalek < 60) {
            System.out.println("Közepes");
        }
        else if(szazalek >= 40 && szazalek < 50) {
            System.out.println("Elégséges");
        }
        else {
            System.out.println("Elégtelen");
        }
    }
}
