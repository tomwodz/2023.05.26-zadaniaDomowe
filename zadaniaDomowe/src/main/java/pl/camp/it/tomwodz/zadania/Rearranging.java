package pl.camp.it.tomwodz.zadania;

//Rearranging digits to get a multiple of 5

import java.util.Scanner;

public class Rearranging {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++){
            int n = scanner.nextInt();
            System.out.println(spr(scanner.next(), n));
        }
    }

    public static String spr(String str, int n){
        if(n==0){
            return "No";
        }
        else{
            if(str.substring(0,1).equals("0") || str.substring(0,1).equals("5")){
                return "Yes";
            }
            else {return spr(str.substring(1,str.length()),n-1);}
        }
    }

}

