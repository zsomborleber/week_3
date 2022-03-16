package hu.progmatic;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        /*  System.out.println("Kérek egy számot!");
        int szam1 = scanner.nextInt();
        System.out.println("Kérem a második számot!");
        int szam2 = scanner.nextInt();

        if (szam2 == 0){
            System.out.println("Nem oszthatsz 0-val");
        }else {
            System.out.println("A két szám egymással osztva: " + szam1 / szam2);
        }*/


      /*  System.out.println("Kérek egy számot!");
        int szam1 = scanner.nextInt();
        System.out.println("Kérem a második számot!");
        int szam2 = scanner.nextInt();

        while (szam2==0){

            System.out.println("Nem oszthatsz 0-val");

            System.out.println("Kérem a második számot!");
            szam2 = scanner.nextInt();

        }

        System.out.println("A két szám egymással osztva: " + szam1 / szam2); */



// 2.Feladat

      /*  System.out.println("Kérek egy számot!");
        int szam = scanner.nextInt();


        if (szam <= 0){
            System.out.println("A számod: " + szam);


        }else{
            szam--;
            System.out.println("A szám egyel kisebb értéke: " + szam);

        }*/


      /*  System.out.println("Kérek egy számot!");
        int szam1 = scanner.nextInt();
        if (szam1 < 0){
            System.out.println("A szám negativ");
        }else if (szam1 > 0){
            System.out.println("A szám pozitov");
        }else{
            System.out.println("A szám: 0");
        }*/

// Lámpás feladat
      /*  System.out.println("Kérem a lámpa színét!");
        String szín = scanner.nextLine();

        if (szín.equalsIgnoreCase("Zöld")){
            System.out.println("Szabad!!");
        }else if (szín.equalsIgnoreCase("Sárga")){
            System.out.println("Lassíts!");
        }else if (szín.equalsIgnoreCase("Piros")){
            System.out.println("Lassíts!");
        }else {
            System.out.println("Nem tudom!");
        }*/

//Évszakos feladat

     /*   System.out.println("Kérem a hónapot!");
        String honap = scanner.nextLine();


        if (honap.equalsIgnoreCase("december")||honap.equalsIgnoreCase("február")||honap.equalsIgnoreCase("január")){
            System.out.println("Téli évszak!");
        }else if (honap.equalsIgnoreCase("március")||honap.equalsIgnoreCase("április")||honap.equalsIgnoreCase("május")){
            System.out.println("tavaszi évszak");
        }else if (honap.equalsIgnoreCase(" június")||honap.equalsIgnoreCase("július")||honap.equalsIgnoreCase("augusztus")){

        }else if (honap.equalsIgnoreCase(" szeptember")||honap.equalsIgnoreCase("október")||honap.equalsIgnoreCase("november")){

        }else{
            System.out.println("Nincs ilyen hónap!");
        }*/
//Számok kiírása felfele

      /*  System.out.println("Mennyi számot szeretnél kiírni?");
        int hossz = 5;

        int szam = 0;

        while (szam <= hossz -1) {
            szam++;

            System.out.println(szam);
        }*/

      /*  int szam = 5;

        for (int i = 1; i <= szam; i++){
            System.out.println(i);
        }*/

// szamok lefele írása:
      /*  int szam = 5;

        for (int i = szam; i >= 0; i--){
            System.out.println(i);
        }*/

 // FAKTORIÁLIS

      /*  int n = 5; // 5*4*3*2*1=120

        int x = n - 1;

        while (x > 0){
            n = n * x;
            x--;

        }

        System.out.println(n);*/

// ABC kiírása

        int n = 26;

        char letter = 'a';
        String result = "";


        for (int i = 0; i < n; i++) {

            result += letter;

            letter++;

        }

        String expected = "abcdefghijklmnopqrstuvwxyz";

        System.out.println("az elvárt eredmény: " + expected);
        System.out.println("az én megoldásom: " + result);
        System.out.println("helyes megoldás? " + expected.equals(result) );



// Tömb szöveggé


        System.out.println("Mennyi számot szeretnél megadni?");


        int usercount = scanner.nextInt();
        int[] userNumbers = new int[usercount];
        System.out.println("Add meg a számaid!");

        String myString="[";

        for (int i=0 ;i < userNumbers.length; i++ ) {
            userNumbers[i]= scanner.nextInt();
            myString +=userNumbers[i];

            if(i<userNumbers.length-1) {
                myString += ",";
            }


        }
        myString+="]";

        System.out.println("Number in string : "+myString);

        System.out.println("----------------------------");

        for (int i=0 ;i<userNumbers.length; i++ ) {
            System.out.println("Kiiras tömben: "+ (i+1) +". elem : "+userNumbers[i]);

        }


// UGYAN AZ MINT FENT CSAK RÖVIDEBBEN=


     /*   int[] numbers = {-33, 66, 42, -13, 54, 89};

        String result = "[";

        int index = 0;

        while (index < numbers.length) {

            result += numbers[index] ;

            index++;
            if (index < numbers.length){
                result += ", ";
            }

        }

        result += "]";

        System.out.println( result );*/




    }
}
