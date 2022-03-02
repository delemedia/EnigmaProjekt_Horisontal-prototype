package com.company;


import java.util.Scanner;



public class Main {


    // Cæsar Shift-værdi:
    char[] shiftArrayIndex = {' ', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V','W','X', 'Y','Z', 'Æ','Ø','Å','A','B','C'};
    /* -----------------------------------*/
    // Array - Alfabet indhold:
    char[] letterArrayIndex = {' ', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S','T','U', 'V','W', 'X','Y','Z','Æ','Ø','Å'};
    /* -----------------------------------*/



    Scanner reader = new Scanner(System.in);


    public void showMenu() throws InterruptedException {

        System.out.println("");
        System.out.println("");
        System.out.println("----------------------------------------");
        System.out.println("  Velkommen til kryptering programmet:");
        System.out.println("----------------------------------------");
        Thread.sleep(2000);
        System.out.println("");
        System.out.println(" | Vælg et af kryptering systemerne |");
        System.out.println("");
        System.out.println("------------------------------");
        System.out.println(" [0]. Kryptering systemerne ?");
        System.out.println("------------------------------");
        System.out.println("");
        System.out.println(" [1]. Ceasar   - Kryptering.");
        System.out.println(" [2]. Vigenere - Kryptering. ");
        System.out.println("");
        System.out.println(" [5]. Luk programmet.");
        System.out.println("-------------------------------------");
        System.out.print(" [Indtast]: ");


        int menuValg = reader.nextInt();



    switch ( menuValg ) {

    case 1:
        Thread.sleep(500);
        System.out.println("");
        System.out.println("");
        System.out.println("-----------------------");
        System.out.println(" [ Ceasar kryptering ]:");
        System.out.println("-----------------------");
        System.out.println("");
        System.out.println(" [0]. Hovedmenu.");
        System.out.println("");
        System.out.println(" [1]. Krypter    - 'Almen tekst' ");
        System.out.println(" [2]. Dekrypter  - 'Code  tekst' ");
        System.out.println("");
        System.out.println("-------------------------------------");
        System.out.print(" [Indtast]: ");


        int ceasar_Valg = reader.nextInt();


        /* ------------------------------------------------------------ */


        switch ( ceasar_Valg ) {

            case 0:

                showMenu();
                Thread.sleep(1000);

                break;


            case 1:

                // userInput_ceasarKryptering (kryptering)
                userInput_ceasarKryptering();


            break;


             case 2:

            // userInput_ceasarDekryptering (kryptering)
            userInput_ceasarDekryptering();

            break;



    }

            break;

        /* ------------------------------------------------------------ */


    case 2:

        Thread.sleep(500);
        System.out.println("");
        System.out.println("");
        System.out.println("-------------------------");
        System.out.println(" [ Vigenere kryptering ]:");
        System.out.println("-------------------------");
        System.out.println("");
        System.out.println(" [1]. Krypter    - 'Almen tekst' ");
        System.out.println(" [2]. Dekrypter  - 'Code  tekst' ");
        System.out.println("");
        System.out.println(" [0]. Hovedmenu.");
        System.out.println("-------------------------------------");
        System.out.print(" [Indtast]: ");


        int vigenere_Valg = reader.nextInt();


        switch ( vigenere_Valg ) {



            case 0:

                showMenu();
                Thread.sleep(1000);

                break;



            case 1:

                // userInput_vigenereKryptering (kryptering)
                userInput_vigenereKryptering();

                break;


            case 2:

                // userInput_vigenereDekryptering (kryptering)
                userInput_vigenereDekryptering();

                break;



        }



            break;

        /* ------------------------------------------------------------ */



    case 5:

        System.out.println("");
        System.out.println("------------------------");
        System.out.println("- Programmet lukkes... -");
        System.out.println("------------------------");
        System.out.println("");
        Thread.sleep(2000);
        System.exit(0);


        break;


    default:

        System.out.println("");
        System.out.println("------------------------");
        System.out.println("- Du indtastet forkert -");
        System.out.println("------------------------");
        System.out.println("");
        Thread.sleep(2000);

        showMenu();

}



    }

    /* ------------------------------------------------------------ */
    /* ------------------------------------------------------------ */
    /* ------------------------------------------------------------ */


    public void userInput_ceasarKryptering () {

        System.out.println("");
        System.out.println("-------------------------");
        System.out.println("Ceasar display dekryptering sektion:");
        System.out.println("-------------------------");
        System.out.println("");





    }

    public void convert_Letters_ceasar  ( ) {


        // TODO - implementere struktur.

        // ???

    }







    public void display_ceasarKryptering ( )  {

        // TODO - display Kryptering struktur.

        System.out.println("");
        System.out.println("-------------------------");
        System.out.println("Ceasar display dekryptering sektion:");
        System.out.println("-------------------------");
        System.out.println("");

    }

    /* ------------------------------------------------------------ */
    /* ------------------------------------------------------------ */
    /* ------------------------------------------------------------ */


    public void userInput_ceasarDekryptering ()  {


        // TODO - Dekryptering struktur.

        System.out.println("");
        System.out.println("-------------------------");
        System.out.println("Ceasar display dekryptering sektion:");
        System.out.println("-------------------------");
        System.out.println("");



    }


    public void convert_Numbers_ceasar () {

        // TODO - implementere struktur.

        // ???

    }





    public void display_ceasarDekryptering ()  {


        // TODO - display Dekryptering struktur.

        System.out.println("");
        System.out.println("-------------------------");
        System.out.println("Ceasar display dekryptering sektion:");
        System.out.println("-------------------------");
        System.out.println("");


    }



    /* ------------------------------------------------------------ */
    /* ------------------------------------------------------------ */
    /* ------------------------------------------------------------ */
    /* ------------------------------------------------------------ */
    /* ------------------------------------------------------------ */
    /* ------------------------------------------------------------ */


    public void userInput_vigenereKryptering () throws InterruptedException {

        // TODO - Kryptering struktur.


        System.out.println("");
        System.out.println("-------------------------");
        System.out.println("Vigenere display kryptering sektion:");
        System.out.println("-------------------------");
        System.out.println("");

    }

    public void display_vigenereKryptering () {

        // TODO - display kryptering struktur.

        System.out.println("");
        System.out.println("-------------------------");
        System.out.println("Vigenere display kryptering sektion:");
        System.out.println("-------------------------");
        System.out.println("");



    }

    public void userInput_vigenereDekryptering () throws InterruptedException {

        // TODO - Dekryptering struktur.

        System.out.println("");
        System.out.println("-------------------------");
        System.out.println("Vigenere display kryptering sektion:");
        System.out.println("-------------------------");
        System.out.println("");

    }

    public void display_vigenereDekryptering () {

        // TODO - display kryptering struktur.

        System.out.println("");
        System.out.println("-------------------------");
        System.out.println("Vigenere display kryptering sektion:");
        System.out.println("-------------------------");
        System.out.println("");




    }



    public void convert_Letters_vigenere () {

        // TODO - implementere struktur.

        // ?????


    }

    public void convert_Numbers_vigenere () {

        // TODO - implementere struktur.

        // ?????


    }


    /* ------------------------------------------------------------ */
    /* ------------------------------------------------------------ */
    /* ------------------------------------------------------------ */
    /* ------------------------------------------------------------ */
    /* ------------------------------------------------------------ */
    /* ------------------------------------------------------------ */



    public static void main(String[] args) throws InterruptedException {


        Main Enigma = new Main();

        Enigma.showMenu();



    }
}
