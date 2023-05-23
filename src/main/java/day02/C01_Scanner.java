package day02;

import java.util.Scanner;

public class C01_Scanner {

    //kullanıcıdan aldıgınız iki sayının karelerinin birbirine esıt olup olmadıgını kontrol eden bir method yazınız
    //yani alınan iki sayının kareleri esıt ıse true, degıl ıse false yazdırın

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("lutfen birinci sayiyi giriniz");
        int x = input.nextInt();
        System.out.println("lutfen ikinci sayiyi giriniz");
        int y = input.nextInt();

        boolean sonuc = karelerEsitmi(x,y);
        System.out.println("sonuc = " + sonuc);


    }

    private static boolean karelerEsitmi(int x, int y) {

        boolean sonuc = x*x==y*y;

        return sonuc;
    }
}
