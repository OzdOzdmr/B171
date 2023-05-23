package day01;

public class C06MethodCreation {
    public static void main(String[] args) {

        //Kare prizmanin hacmini bulan ve donduren bir method yaziniz
        //not: Kare prizmanin hacmi --> taban alani x yukseklik --> a*a*h

        int tabanKenar = 3;
        int yukseklik = 4;
        // taban kenari 3 ve yuksekligi 4 olan prizmanin hacmi --> 3*3*4 = 36

        System.out.println(karePrizmaHacimBul(3, 4));
        System.out.println(karePrizmaHacimBul(tabanKenar, yukseklik));


    }

    //access modifier + static + return type + isim + () + {}
    //public, protected, private, default --> access modifier
    public static int karePrizmaHacimBul (int tabanKenari, int yukseklik){

        int hacim = tabanKenari*tabanKenari*yukseklik;

        return hacim;

    }
}

