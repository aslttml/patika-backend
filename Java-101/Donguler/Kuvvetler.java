package Donguler;

import java.util.Scanner;

public class Kuvvetler {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.print("Sınır Sayısını Giriniz: ");
        num = input.nextInt();

        for(int i=1; i<=num; i*=4){
            System.out.println(i);
        }
        System.out.println();
        for(int i=1; i<=num; i*=5){
            System.out.println(i);
        }
    }
}
