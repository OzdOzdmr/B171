package day01;

public class C05MethodCreation {
    public static void main(String[] args) {




        //iki sayının kareleri toplamını bulan ve yazdıran bır method olusturunuz

        //3 ve 5 ->34 yazdıracak
        //methodum sadece yazdırma işlemi yapacak bu yüzden return type voıd olabilir


        kareTopla(3,5);//argument diyoruz
        kareTopla(10,100);
        kareTopla(4,9);


    }

    public static void kareTopla(int sayi1, int sayi2)
            // parametre ddiyoruz ve burada deklare ettiğimz variable lar
            //method body kısmında kullanılablir
    {


        int sonuc=sayi1*sayi1+sayi2*sayi2;
        System.out.println(sonuc);



    }
}
