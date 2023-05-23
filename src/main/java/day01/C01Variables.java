package day01;

public class C01Variables {

    public static void main(String[] args) {




        //Bir variable olustur, yazdır
        //Syntax:data turu + datanın ismi=(atama operatörü) variable değeri
        int yas = 35;
        int sayi =50;


        System.out.println(yas);// ln => line next işlemi yap ve alt satıra geç
        System.out.print(sayi);

          //sayi = 50 şeklinde yazdır etiketiyle birlikte yazır

        System.out.println("sayi = "+ sayi);

        System.out.println("sayi = " + sayi);//soutv degişken etiketiyle birlikte yazdırma işlemi yapar


        //String bir data olusturalım=> non primitive

        String isim= "Ali";

        System.out.println("isim = " + isim);


        //Olusturdugun variable'ı farkli bir variable'a kopyala

        int benimYas = yas;

        System.out.println("benimYas = " + benimYas);
        String onunIsmi= isim;
        System.out.println("onunIsmi = " + onunIsmi);



        //Aynı satırda coklu variable deklare et

        int yil= 2023 , ay= 4, gun=21;
        System.out.println("yil = " + yil);



       //Bir variable degerini guncelle

         yil=2024;

        System.out.println("yil = " + yil);
        //java yukarıdan aşağı ve soldan sağa çalışılır,java runntime programming


        //Bir variable deklere et : x
        double x;

        //Bir variable baslat : y (initialize)
        double y =12.5;

        //Başka bir variable başlat : z degeri 33 olsun
        double z =33; // java bunu 33.0 olarak algıladı

        //x degişkenini y degişkeni ile başlat
        x =y;
        System.out.println("x = " + x);
        System.out.println("y = " + y);


        //Variable y'i guncelle 14.9 olarak güncelle
        y =14.9;
        System.out.println("x = " + x);
        System.out.println("y = " + y);


        // Degişkenleri(variable) yazdır




    }



}
