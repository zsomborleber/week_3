package hu.progmatic;

import java.lang.module.FindException;
import java.util.Scanner;

public class gyak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// Medvés harc


     /*   int hp1 = 100;  int ap1 = 10;
        int hp2 = 80;   int ap2 = 50;


        while (hp1 > 0 && hp2 > 0) {

            hp1 -= ap2;
            hp2 -= ap1;
        }

             if (hp1 == hp2){
                System.out.println("Döntetlen");
            }else if (hp2 <= 0){
                System.out.println("Az első medve nyert");
            }else if (hp1 <= 0){
                System.out.println("A második medve nyert");
            }*/


// Szökőév
     /*   System.out.println("Kérném az évet!");
        int ev = scanner.nextInt();

        if (ev % 100 == 0 ){
            if (ev % 400 == 0){
                System.out.println("Szökőév");

            }else {
                System.out.println("Nem Szököév");
            }


        }else if (ev > 1582 && ev % 4 == 0 ){
            System.out.println("Szökőév");

        }else {
            System.out.println("Nem szököév");
        }*/


// Osztószámlálás

     /*   System.out.println("Kérem a számot!");

        int szam = scanner.nextInt();

        int szamlalo = 0;

        for (int i = 1; i < (szam + 1); i++) {


            if (szam % i == 0) {

                szamlalo++;

            }


        }
        System.out.print("Az osztók száma: " + szamlalo + " (Mert az osztó számok: ");

        for (int i = 1; i < (szam + 1); i++) {

            if (szam % i == 0) {

                System.out.print(i + ", ");
            }*/

// Char felcserélős

     /*   char[] chars = {'a', 'A'};

        String myString = "{'";

        for (int i = 0; i < chars.length ; i++) {

            myString += chars[i];





            if (i < chars.length-1){
                myString += "', ";

                myString += "'";
            }


        }


        myString += "'}";


        System.out.println("elvárt eredmény: " + myString); */

// Prímszám

   /*     System.out.println("Kérem a számot!");

        int szam = scanner.nextInt();

        int szamlalo = 0;

        for (int i = 1; i < (szam + 1); i++) {


            if (szam % i == 0) {

                szamlalo++;
            }


        }

        if (szamlalo == 2){
            System.out.println("Prímszám");
        }else{

            System.out.println("Nem prímszám");
        }*/

// Legnagyobb közös osztó!

      /*  System.out.println("Kérek egy számot!");
        int szam1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Kérek még egy számot!");
        int szam2 = scanner.nextInt();

        int lnko = 0;

        for (int i = 1; i < (szam1 + 1); i++) {


            if (szam1 % i == 0 && szam2 % i ==0) {

                lnko = i;


            }

        }

        System.out.println("Legnagyobb közös osztó: " + lnko);*/



        }
}