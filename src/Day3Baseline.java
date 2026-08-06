import java.util.*;

public class Day3Baseline {
    public static void main(String[] args) {
        // 1. ArrayList: Bir kullanıcının günlük aktivitelerini eklenme sırasıyla sakla.
        ArrayList<String> günlükListe = new ArrayList<>();
        addActivity("Süpürge", günlükListe);
        addActivity("Çamaşır", günlükListe);
        addActivity("Spor", günlükListe);
        System.out.println(günlükListe.toString());

        System.out.println();

        // 2. HashSet: Aynı kullanıcı ID’sinin iki kez eklenmesini engelle.
        HashSet<Integer> benzersizSet = new HashSet<>();
        addHashSet(10,benzersizSet);
        addHashSet(10,benzersizSet);
        addHashSet(15,benzersizSet);
        addHashSet(20,benzersizSet);
        System.out.println(benzersizSet.toString());

        System.out.println();

        // 3. HashMap: Kullanıcı ID’si ile toplam puanını eşleştir.
        HashMap<Integer, Integer> puanMap = new HashMap<>();
        addPointsToUser(10, 25, puanMap);
        addPointsToUser(10,15, puanMap);
        addPointsToUser(15, 10, puanMap);
        System.out.println(puanMap.toString());

        System.out.println();

        // 4. LinkedHashMap: Event adı ve zaman bilgisini ekleme sırasıyla sakla.
        LinkedHashMap<String, String> bagliEventMap = new LinkedHashMap<>();
        addEvent("Sahne", "19.00", bagliEventMap);
        addEvent("Yüzme", "9.00", bagliEventMap);
        addEvent("Konser", "15.00", bagliEventMap);
        addEvent("Müzik", "17.00", bagliEventMap);
        addEvent("Spor", "20.00", bagliEventMap);
        addEvent("Kahve", "22.00", bagliEventMap);
        System.out.println(bagliEventMap.toString());

        System.out.println();

        // 5. TreeMap: Kullanıcı skorlarını key’e göre sıralı göster.
        TreeMap<Integer, Integer> agacScoreMap = new TreeMap<>();
        addScore(10, 20, agacScoreMap);
        addScore(15, 20, agacScoreMap);
        addScore(1, 20, agacScoreMap);
        addScore(20, 20, agacScoreMap);
        System.out.println(agacScoreMap.toString());


        System.out.println();


        // 1. Problem - Two Sum with Brute-Force
        int target = 6;
        int[] sayilar = {3,3};
        int[] sayilarinIndisleri = new int[2];

        for (int i = 0; i < sayilar.length - 1; i++) {
            for (int j = i+1; j < sayilar.length; j++) {
                if(sayilar[i] + sayilar[j] == target){
                    sayilarinIndisleri[0] = i;
                    sayilarinIndisleri[1] = j;

                    break;
                }
            }
        }

        if(sayilarinIndisleri[0] == 0 && sayilarinIndisleri[1] == 0){
            System.out.println("Uygun çift bulunamadı.");
        }
        else{
            System.out.println(sayilarinIndisleri[0] + " " + sayilarinIndisleri[1]);
        }


        // 1. Problem - Two Sum with HashMap
        int[] cikti1 = twoSum(target, sayilar);
        for (int sayi : cikti1){
            System.out.print(sayi + " ");
        }
    }

    // 1. ArrayList: Bir kullanıcının günlük aktivitelerini eklenme sırasıyla sakla.
    public static void addActivity(String aktivite, ArrayList<String> list){
        list.add(aktivite);
    }

    // 2. HashSet: Aynı kullanıcı ID’sinin iki kez eklenmesini engelle.
    public static void addHashSet(int id, HashSet<Integer> benzersizSet){
        if(benzersizSet.contains(id)){
            System.out.println("Maalesef bu ID (" + id + ") sistemde kayıtlı, tekrar eklenemez.");
        }
        else{
            benzersizSet.add(id);
        }
        System.out.println("İşlem tamamlandı.");
        System.out.println();
    }

    // 3. HashMap: Kullanıcı ID’si ile toplam puanını eşleştir.
    public static void addPointsToUser(int id, int points, HashMap<Integer, Integer> puanListesi){
        if(puanListesi.containsKey(id)){
            int mevcutPuan = puanListesi.get(id);
            puanListesi.replace(id,mevcutPuan + points);
            System.out.println("Kullanıcı bulundu ve puan kullanıcıya puan eklendi.");
        }
        else{
            puanListesi.put(id,points);
            System.out.println("Kullanıcı bulunamadı ve Yeni kullanıcı kaydı oluşturuldu. Puan başarıyla yeni kullanıcıya eklendi");
        }
    }

    // 4. LinkedHashMap: Event adı ve zaman bilgisini ekleme sırasıyla sakla.
    public static void addEvent(String EventName, String EventTime, LinkedHashMap<String, String> SiraliHashMap){
        SiraliHashMap.put(EventName, EventTime);
    }

    // 5. TreeMap: Kullanıcı skorlarını key’e göre sıralı göster.
    public static void addScore(int id, int score, TreeMap<Integer, Integer> treeMap){
        treeMap.put(id, score);
    }



    //Bir integer dizisi ve bir hedef sayı veriliyor.
    // Dizideki toplamları hedef sayıya eşit olan iki farklı elemanın index’lerini döndür.
    // 1. Problem - Two Sum
    public static int[] twoSum(int target, int[] numbers){
        int[] toplamSayilarIndisi = new int[2];
        //ilk int kısmı sayı, ikinci int kısmı indisi olacak
        HashMap<Integer, Integer> gorulmusOlanSayilar = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            int lazimOlan = target - numbers[i];

            if(gorulmusOlanSayilar.containsKey(lazimOlan)){
                toplamSayilarIndisi[0] = i;
                toplamSayilarIndisi[1] = gorulmusOlanSayilar.get(lazimOlan);

                break;
            }

            gorulmusOlanSayilar.put(numbers[i], i);
        }

        return toplamSayilarIndisi;
    }
}
