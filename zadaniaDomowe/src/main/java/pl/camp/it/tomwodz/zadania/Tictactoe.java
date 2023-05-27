package pl.camp.it.tomwodz.zadania;

import java.util.Scanner;

public class Tictactoe {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Lest's play!");

        String[][] tab = new String[3][3];
        for(int i = 0; i < tab.length; i++){
            for(int j = 0; j< tab.length; j++){
                tab[i][j] = " ";
            }
        }
        int counter = 0;
        boolean run = true;
        boolean next = true;
        board(tab);

        while(counter < 9 && run) {
            if(next == true){
                switch (palyer1()){
                    case "1": tab[0][0] = "X"; break;
                    case "2": tab[0][1] = "X"; break;
                    case "3": tab[0][2] = "X"; break;
                    case "4": tab[1][0] = "X"; break;
                    case "5": tab[1][1] = "X"; break;
                    case "6": tab[1][2] = "X"; break;
                    case "7": tab[2][0] = "X"; break;
                    case "8": tab[2][1] = "X"; break;
                    case "9": tab[2][2] = "X"; break;
                }
                run = verification(tab, next);
                next = false;
            }
            else {
                switch (palyer2()){
                    case "1": tab[0][0] = "O"; break;
                    case "2": tab[0][1] = "O"; break;
                    case "3": tab[0][2] = "O"; break;
                    case "4": tab[1][0] = "O"; break;
                    case "5": tab[1][1] = "O"; break;
                    case "6": tab[1][2] = "O"; break;
                    case "7": tab[2][0] = "O"; break;
                    case "8": tab[2][1] = "O"; break;
                    case "9": tab[2][2] = "O"; break;
                }
                run = verification(tab, next);
                next = true;
            }
            counter++;
            board(tab);
            if(counter == 9){
                System.out.println("Remis!");
            }
        }

    }

    public static boolean verification(String[][] tab, boolean next){
        if(
                (tab[0][0].equals(tab[0][1]) && tab[0][1].equals(tab[0][2]) && (!tab[0][0].equals(" "))) ||
                        (tab[1][0].equals(tab[1][1]) && tab[1][1].equals(tab[1][2]) && (!tab[1][0].equals(" "))) ||
                        (tab[2][0].equals(tab[2][1]) && tab[2][1].equals(tab[2][2]) && (!tab[2][0].equals(" "))) ||
                        (tab[0][0].equals(tab[1][0]) && tab[1][0].equals(tab[2][0]) && (!tab[0][0].equals(" "))) ||
                        (tab[0][1].equals(tab[1][1]) && tab[1][1].equals(tab[2][1]) && (!tab[0][1].equals(" "))) ||
                        (tab[0][2].equals(tab[1][2]) && tab[1][2].equals(tab[2][2]) && (!tab[0][2].equals(" "))) ||
                        (tab[0][0].equals(tab[1][1]) && tab[1][1].equals(tab[2][2]) && (!tab[0][0].equals(" "))) ||
                        (tab[0][2].equals(tab[1][1]) && tab[1][1].equals(tab[2][0]) && (!tab[0][2].equals(" ")))
        )
        {
            if(next == true){
                System.out.println("Game over! Player 1 X Win!");
            }
            else { System.out.println("Game over! Player 2 O Win!");}
            return false;
        }
        return true;
    }
    public static void board(String[][] tab){
        System.out.println();
        System.out.println(tab[0][0] + " | " + tab[0][1] + " | " + tab[0][2]);
        System.out.println("-".repeat(8));
        System.out.println(tab[1][0] + " | " + tab[1][1] + " | " + tab[1][2]);
        System.out.println("-".repeat(8));
        System.out.println(tab[2][0] + " | " + tab[2][1] + " | " + tab[2][2]);
        System.out.println();
    }

    public static String palyer1(){
        System.out.println("Move Player 1: X");
        return scanner.nextLine();
    }

    public static String palyer2(){
        System.out.println("Move Player 2: O");
        return scanner.nextLine();
    }
}
