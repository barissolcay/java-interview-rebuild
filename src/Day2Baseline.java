import java.util.Scanner;

public class Day2Baseline {
    static void main(String[] args) {
        // 1. egzersiz - 1 ile n arasındaki sayıların toplamı (1 ile n dahil değil)
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        int sayiInput = input.nextInt();

        int toplam = 0;
        for (int i = 1; i <= sayiInput; i++) {
            toplam += i;
        }

        System.out.println(toplam);


        // 2. egzersiz - iki sayıdan büyük olanı döndüren method
        int a = 5, b = 7;
        System.out.println("Büyük olan sayı: " + hangiBuyuk(a,b));


        // 3. egzersiz - int[] içindeki en büyük sayı
        int[] sayilar = {1,4,6,3,6,0,2,5};
        int enBuyuk = sayilar[0];
        for (int i = 1; i < sayilar.length; i++) {
            if(sayilar[i] > enBuyuk){
                enBuyuk = sayilar[i];
            }
        }
        System.out.println("Dizi içerisindeki en büyük sayı: " + enBuyuk);


        // 4. egzersiz - Dizideki çift sayı adedi
        int ciftSayac = 0;
        for (int i = 0; i < sayilar.length; i++) {
            if(sayilar[i] % 2 == 0){
                ciftSayac++;
            }
        }
        System.out.println("Dizi içerisindeki çift sayısı: " + ciftSayac);


        // 5. egzersiz - Metindeki sesli harf adedi
        String metin = "ahmet yukarı gitti geldi.";
        int sesliSayac = 0;
        char[] charMetin = metin.toCharArray();
        String sesliHarfler = "aeoöıiuü";
        for (int i = 0; i < charMetin.length; i++) {
            if(sesliHarfler.contains(String.valueOf(charMetin[i]))){  //char nasıl stringe dönüştürülür bilmiyordum, bakınca öğrendim.
                sesliSayac++;
            }
        }
        System.out.println("Metin içerisindeki sesli harflerin sayısı: " + sesliSayac);


        // 6. Egzersiz - Kelimeleri ters sırada birleştiren StringBuilder kullanımı
        String[] kelimeler = metin.split(" ");
        StringBuilder tersSiraliEkleme = new StringBuilder();
        
        for (int i = kelimeler.length - 1 ; i >= 0 ; i--) {
            tersSiraliEkleme.append(kelimeler[i]);

            if(!(i == 0)){
                tersSiraliEkleme.append(" ");
            }
        }

        System.out.println("Cümlenin tersi: " + tersSiraliEkleme);


        // 7. egzersiz - Primitive değeri metoda gönderip değiştirme deneyi
        int deger1= 10, deger2= 20;
        degerDegistir(deger1, deger2);
        System.out.println("değer1: " + deger1);
        System.out.println("değer2: " + deger2);

        // 8. egzersiz - int[] dizisini metoda gönderip ilk elemanı değiştirme deneyi
        listeDegistir(sayilar);
        System.out.println(sayilar[0]);
    }

    // 8. egzersiz - int[] dizisini metoda gönderip ilk elemanı değiştirme deneyi
    private static void listeDegistir(int[] sayilar) {
        sayilar[0] = 10;
    }

    // 7. egzersiz - Primitive değeri metoda gönderip değiştirme deneyi
    private static void degerDegistir(int deger1, int deger2) {
        int temp = deger1;
        deger1 = deger2;
        deger2 = temp;
    }

    // 2. egzersiz - iki sayıdan büyük olanı döndüren method
    public static int hangiBuyuk(int a, int b){
        if(a > b){
            return a;
        }
        return b;

        //Eşit olduğunda ne yapılacağı söylenmemiş.
    }



}
