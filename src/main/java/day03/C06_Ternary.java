package day03;

import java.util.Scanner;

public class C06_Ternary {
    public static void main(String[] args) {

        //kullanıcıdan bir sayı alınız
        //verılen sayının 3 veya daha cok bsmklı olup olmadıgını  ternary ile kontrol eden
        // ve yazdıran bir method olusturun

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen 3 veya daha cok basamaklı bir sayı giriniz");
        int sayi = scan.nextInt();

        kacBasamakli(sayi);


    }

    public static void kacBasamakli(int sayi) {
        //bir sayi 99 dan büyükse 3 veya daha cok basamaklidir
        System.out.println(sayi>99 ? "sayi 3 veya daha cok basamaklı" : "sayi 3 ten az basamaklı");



    }
}
