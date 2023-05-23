package day03;

import java.util.Scanner;

public class C01_Substring {


 /*
    Kullanıcıdan ad ve soyadını aralarında bir bosluk olacak sekılde sisteme girmesini isteyiniz
    Ad ve Soyadı ilk harfleri buyuk olacak sekılde alt alta yazdırın
    Ad : Emine
    Soyad : Aslan
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen ad ve soyadınızı aralarında bir bosluk olacak sekilde girin\n"+
                "Yalnızca bir ad bir soyad girilmeli");

        String adSoyad = scan.nextLine();
        System.out.println(adSoyad);
        //substring methodunuun 2 formu var
        //1.substring(İndex)->index dahil olmak uzere stringin sonuna kadar olan kısmı yeni bir sring olarak dondurur
        //2.substring(index1,index2)->index1 dahil,index2 hariç olmak uzere yeni bir string dondurur

        int spaceIndex = adSoyad.trim().indexOf(" ");
        String ad = adSoyad.substring(0,spaceIndex);
        System.out.println(ad);
        String soyad  = adSoyad.substring(spaceIndex+1);
        System.out.println(soyad);
        //ad isimli variable in ilk karakterini büyük harf olacak sekilde alalım
        char adIlkHarf = ad.toUpperCase().charAt(0);
        //ad isimli variable in geri kalan kısmını kucuk harf olarak alalım
        String adGeriKalan = ad.substring(1).toLowerCase();
        ad = adIlkHarf+adGeriKalan;//concatenation
        System.out.println(ad);

        //soyad isimli variable ın ilk harfini buyuk olarak alalım
        char soyadIlkHarf=soyad.toUpperCase().charAt(0);
        String soyadGeriKalan=soyad.substring(1).toLowerCase();
        soyad=soyadIlkHarf+soyadGeriKalan;






    }
}
