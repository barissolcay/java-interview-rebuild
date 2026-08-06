import java.util.*;

public class Day3UserHash {
    int id;
    String username;

    public Day3UserHash(int id, String username){
        this.id = id;
        this.username = username;
    }

    @Override
    public String toString() {
        return "id: " + id + " - " + "username: " + username;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Day3UserHash){                // instanceof tür kontrolü için önemli
            return this.id == ((Day3UserHash) obj).id;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return id;
    }

    static void main(String[] args) {
        Day3UserHash baris = new Day3UserHash(1, "Barış");
        Day3UserHash cagla = new Day3UserHash(1, "Çağla");

        HashSet<Day3UserHash> day3UserHashTablosu = new HashSet<>();

        day3UserHashTablosu.add(baris);
        day3UserHashTablosu.add(cagla);

        System.out.println(day3UserHashTablosu.size());
        System.out.println(day3UserHashTablosu.toString());

        System.out.println(baris.equals(cagla));


        // İçerik olarak ne denersem deneyeyim hep size = 2 çıktısını aldım.
        // Id veya username fark etmeksizin hep 2 çıktısını aldım.
        // Hash fonksiyonuna bağlı diye düşünüyorum. Bellekte oluşan username adresleri birbirinden farklı.
        // Bu sebeple içeriğe değil de genel user adresine bakarak hash yapıyor olma ihtimali yüksek.
        // Yeni nesnelerde bu kontrolü sağlmak pek mantıklı değil, çünkü new dediğimiz zaman bellekte yeni yer açılır.

        // Artık equals ve hashCode id ile bağlantılı olduğu için farklı id gerekli
        // Aynı id farklı/aynı username geçersiz sayılır, tablodaki kişi sayısı artmaz.

        // Sonradan id değişirse set nesneyi doğru bölgede bulamayabilir.
        // Bu nedenle eşitlik ve hash hesabında kullanılan alanlar tercihen değişmez olmalıdır.
        // İleride id alanını private final yapmak bu davranışı korumaya yardımcı olur.
    }
}
