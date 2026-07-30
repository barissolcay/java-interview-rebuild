import java.util.*;

public class Day1Baseline {
    public static void main(String[] args){

        //Kelime frekansı test - 1
        String cümle = "elma elma patates kiraz karpuz kiraz elma";
        Map<String, Integer> sonuc1 = wordFreq(cümle);
        System.out.println(sonuc1);


        //Parantez ayrımı test - 2
        String parantezler = "{[]}()";
        boolean sonuc2 = isValidBrackets(parantezler);
        System.out.println(sonuc2);


        //İlk tekrar eden sayı test - 3
        int[] sayilar = {1, 2, 3, 4, 2, 1};
        int tekrar = ilkTekrar(sayilar);
        System.out.println(tekrar);
    }

    //Kelime frekansı fonksiyonu - 1
    public static Map<String, Integer> wordFreq(String input){
        String[] kelimeler = input.split(" ");  //Boşluk karakterine göre metni bölüyoruz

        Map<String, Integer> frekansHaritasi = new HashMap<>();
        for(String kelime : kelimeler){
            int mevcut = frekansHaritasi.getOrDefault(kelime, 0);  // getOrDefault çok faydalı, eğer bulunmazsa null yerine default değer dönüyor. get kullanmaktan daha güvenlir bir seçenek.

            if (mevcut == 0){
                frekansHaritasi.put(kelime, 1);
            }
            else{
                frekansHaritasi.put(kelime , (mevcut + 1));
            }
        }

        return frekansHaritasi;
    }
    /*
    Örnek input: String cümle = "elma elma patates kiraz karpuz kiraz elma";
    Beklenen output: {elma=3, patates=1, kiraz=2, karpuz=1}
    Zaman Karmaşıklığı: O(n)
    Alan Karmaşıklığı: Emin değilim bilmiyorum. Farklı kelime sayısına bağımlı. - farklı kelime sayısı k ise temel ek alan O(k) olarak açıklanabilir.
    Edge Case 1: Büyük küçük harfe duyarlı değil. Java ile java farklı kelime olarak sayılıyor.
    Edge Case 2: java, java inputu sorun yaratabilir. java, = 1 java = 1 değerini alır. kelimeyi temizlemiyor.
     */



    //Parantez ayrımı fonksiyonu - 2
    public static boolean isValidBrackets(String input){
        Stack<Character> stack = new Stack<>();

        for(char c : input.toCharArray()){

            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }

            else if(c == ')' || c == '}' || c == ']'){

                if(stack.isEmpty()){
                    return false;
                }

                char sonAcilis = stack.pop();

                if(!((c == ')' && sonAcilis == '(') || (c == ']' && sonAcilis == '[') || (c == '}' && sonAcilis == '{'))){
                    return false;
                }
            }

            else{
                return false;
            }
        }

        return stack.isEmpty();
    }
    /*
    Örnek input: String parantezler = "{[]}()";
    Beklenen output: true
    Zaman Karmaşıklığı: O(n)
    Alan Karmaşıklığı: O(n) fakat emin değilim. - Alan: O(d); burada d, aynı anda açık bulunan maksimum parantez derinliğidir.
    Edge Case 1: Boş ifade true çıktısı üretir.
    Edge Case 2: Parantezlerin sayısı eşit olsa da sırlama önemlidir.

    Yapay zekadan öneri: Stack yerine ArrayDeque kullanmak daha modern olabilir.
     */



    //İlk tekrar eden sayı fonksiyonu - 3
    public static int ilkTekrar(int[] input){
        Set<Integer> gorulenSayilar = new HashSet<>();

        for(int sayi : input){
            if(gorulenSayilar.contains(sayi)){
                return sayi;
            }

            gorulenSayilar.add(sayi);
        }
        return -1;
    }
        /*
    Örnek input: int[] sayilar = {1, 2, 3, 4, 2, 1};
    Beklenen output: 2
    Zaman Karmaşıklığı: O(n)
    Alan Karmaşıklığı: O(n)
    Edge Case 1: -1 değeri içerirse -1 çıktısı yanıltabilir.
    Edge Case 2: null değerde geçersiz input olur.
     */
}
