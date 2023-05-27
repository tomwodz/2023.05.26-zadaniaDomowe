package pl.camp.it.tomwodz.zadania;

//Make all equal using Pairs

import java.util.Arrays;
import java.util.Scanner;

public class Pairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for(int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] tab = new int[n];
            for (int j = 0; j < n; j++) {
                tab[j] = Integer.parseInt(scanner.next());
            }
            Arrays.sort(tab);
            int max = 0;
            int temp = 0;
            for(int k = 0; k < tab.length-1; k++){
                if(tab[k] == tab[k+1]){
                    temp = temp + 1;
                    if(temp>max){
                        max = temp;
                    }
                }
                else {temp = 0;}
            }
            int r;
            r = n - max - 1;
            System.out.println(r);
        }
    }

}
