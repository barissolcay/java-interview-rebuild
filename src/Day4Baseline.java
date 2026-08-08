import java.util.*;

public class Day4Baseline {
     public static void main(String[] args) {
         // 1. Undo işlemi — Stack
         ArrayDeque<String> islemler = new ArrayDeque<>();
         addStack(islemler,"yüzme");
         addStack(islemler,"konser");
         addStack(islemler,"yemek ye");

         System.out.println("Başlangıç: " + islemler);
         System.out.println(undoStack(islemler));
         System.out.println("Bitiş: " + islemler);


         System.out.println();


         // 2. Challenge davet kuyruğu — Queue
         ArrayDeque<String> davetler = new ArrayDeque<>();
         String[] gelenDavetler = {"Ayşe", "Fatma", "Hayriye"};

         isleQueue(davetler, gelenDavetler);

         System.out.println(davetler);


         System.out.println();


         // 3. Kullanıcı skorları — Priority Queue
         PriorityQueue<Day4UserScore> kullaniciSkolari = new PriorityQueue<>((a,b) -> Integer.compare(b.score, a.score));
         Day4UserScore kisi1 = new Day4UserScore("Barış" , 100);
         Day4UserScore kisi2 = new Day4UserScore("Çağla", 200);
         Day4UserScore kisi3 = new Day4UserScore("Ahmet", 10);

         kullaniciSkolari.add(kisi1);
         kullaniciSkolari.add(kisi2);
         kullaniciSkolari.add(kisi3);

         System.out.println("Kuyruğun ilk hali: " + kullaniciSkolari);
         Day4UserScore enYuksekSkor = cikarPriQue(kullaniciSkolari);
         System.out.println("Çıkarılan en yüksek skor: " + enYuksekSkor);
         System.out.println("Skor çekildikten sonra kuyruk: " + kullaniciSkolari);
         System.out.println("Sonraki en yüksek skor: " + cikarPriQue(kullaniciSkolari));


         System.out.println();


         // 1. Problem - Valid Parentheses
         System.out.println(validParentheses("{[()]}"));
         System.out.println(validParentheses("([)]"));
         System.out.println(validParentheses("((("));


         System.out.println();


         // 2. Problem - Recent Requests
         ArrayDeque<String> fifoQueue = new ArrayDeque<>();
         Day4RecentRequests yakinIstekler = new Day4RecentRequests(fifoQueue);
         yakinIstekler.addRequest("yüzme");
         yakinIstekler.addRequest("ilerlemeyi güncelle");
         yakinIstekler.addRequest("liderlik");

         yakinIstekler.procesesQueue();

         yakinIstekler.showNextInQueue();
     }

    // 1. Undo işlemi — Stack
    public static String undoStack(ArrayDeque<String> stackYapisi){
        return stackYapisi.pop();
    }

    public static void addStack(ArrayDeque<String> stackYapisi, String eklenecek){
        stackYapisi.addFirst(eklenecek);
    }



    // 2. Challenge davet kuyruğu — Queue
    public static void isleQueue(ArrayDeque<String> queueYapisi , String[] islenecek){
         int i = 0;
         for(String isle : islenecek){

             queueYapisi.addLast(isle);
         }

         int size = queueYapisi.size();
        for (int j = 0; j < size-1; j++) {
            i++;
            System.out.println(i + ". İşlenen: " + queueYapisi.peek());
            queueYapisi.pop();
        }
    }



    // 3. Kullanıcı skorları — Priority Queue
    public static Day4UserScore cikarPriQue(PriorityQueue<Day4UserScore> oncelikliKuyruk){
         return oncelikliKuyruk.poll();
    }




    // 1. Problem - Valid Parentheses
    public static boolean validParentheses(String input){
         char[] parantezler = input.toCharArray();

         ArrayDeque<Character> yigin = new ArrayDeque<>();

         for(char parantez : parantezler){
             if(parantez == '(' || parantez == '[' || parantez == '{'){
                 yigin.addFirst(parantez);
             }

             else if (parantez == ')' || parantez == ']' || parantez == '}') {
                 if(yigin.isEmpty()){
                     return false;
                 }

                 char sonCikanAcilis = yigin.pop();
                 if(sonCikanAcilis == '(' && parantez == ')' ||
                    sonCikanAcilis == '[' && parantez == ']' ||
                    sonCikanAcilis == '{' && parantez == '}'){

                 }

                 else{
                     return false;
                 }
             }

             else{
                 return false;
             }
         }

         return yigin.isEmpty();
    }
}





