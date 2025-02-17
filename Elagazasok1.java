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
        System.out.println("\n");
        
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
        
        
        // Ternáris operátor
        // (feltétel) ? igaz: hamis
        String eredmeny = (szazalek % 2 == 0) ? "Páros" : "Páratlan";
        
        // Switch-case
        String honap = "Február";
        switch(honap) {
            case "Január":
                System.out.println("01");
                break;
            case "Február":
                System.out.println("02");
                break;
            case "Március":
                System.out.println("03");
                break;
            default:
                System.out.println("Nincs ilyen hónap");
                break;
        }
        // Felhasználó megad egy szorszámot, válaszul megkapja az melyik hónap
        System.out.println("Adja meg a hónap sorszámát pl.: 6");
        Scanner adat = new Scanner(System.in);
        int bekertAdat = adat.nextInt();
        
        switch(bekertAdat) {
            case 1:
                System.out.println("Január");
                break;
            case 2:
                System.out.println("Február");
                break;
            case 3:
                System.out.println("Március");
                break;
            case 4:
                System.out.println("Április");
                break;
            case 5:
                System.out.println("Május");
                break;
            case 6:
                System.out.println("Június");
                break;
            case 7:
                System.out.println("Július");
                break;
            case 8:
                System.out.println("Augusztus");
                break;
            case 9:
                System.out.println("Szeptember");
                break;
            case 10:
                System.out.println("Október");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Nincs ilyen hónap");
                break;
        }       
    }
}
