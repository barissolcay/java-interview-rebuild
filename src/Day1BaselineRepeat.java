import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Stack;

public class Day1BaselineRepeat {
    static void main(String[] args) {
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

    private static int ilkTekrar(int[] sayilar) {
        HashSet<Integer> gorulenSayilar = new HashSet<>();

        for (int sayi : sayilar){
            if(gorulenSayilar.contains(sayi)){
                return sayi;
            }

            gorulenSayilar.add(sayi);
        }

        return -1;
    }

    private static boolean isValidBrackets(String input) {
        Stack<Character> yigin = new Stack<>();

        for (char ch : input.toCharArray()){
            if(ch == '(' || ch == '[' || ch == '{'){
                yigin.push(ch);
            }

            else if(ch == ')' || ch == ']' || ch == '}'){
                if(yigin.isEmpty()){
                    return false;
                }

                char enUstAcma = yigin.pop();

                if(   !((ch == ')' && enUstAcma == '(') ||
                        (ch == ']' && enUstAcma == '[') ||
                        (ch == '}' && enUstAcma == '{'))){
                    return false;
                }
            }

            else{
                return false;
            }
        }
        if(yigin.isEmpty()){
            return true;
        }
        return false;
    }

    public static Map<String, Integer> wordFreq(String input){
        Map<String, Integer> sozluk = new HashMap<>();

        String[] kelimeler = input.split(" ");

        for(String kelime : kelimeler){
            int mevcut = sozluk.getOrDefault(kelime, 0);

            if(mevcut == 0){
                sozluk.put(kelime, 1);
            }
            else{
                sozluk.put(kelime, (mevcut + 1));
            }
        }
        return  sozluk;
    }
}
