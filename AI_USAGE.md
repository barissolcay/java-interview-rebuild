## Gün 1

* AI'ı hangi amaçla kullandım?
Java syntax ve bazı API kullanımlarını hatırlamak için.
* İlk çözümüm neydi?
Word frequency için HashMap, parantez kontrolü için stack,
tekrar eden sayı için HashSet kullanmak.
* AI ne önerdi?
Syntax konusunda yardımcı oldu ve Stack yerine ArrayDeque
kullanılabileceğini belirtti.
* Hangi öneriyi reddettim?
İlk baseline sürümünde çalışan Stack çözümünü korudum.
* Aynı kodu yarın AI olmadan yazabilir miyim?
Henüz emin değilim; tekrar denemem gerekiyor.

\- SQL tarafında hangi yardımı aldım?

&#x20; Tablo ilişkilerini anlamak, foreign key ve bağlantı tablosu kurmak,

&#x20; SELECT, JOIN, SUM, GROUP BY, ORDER BY ve LIMIT syntax'ını yazmak için

&#x20; adım adım yönlendirme aldım.



\- SQL'deki ilk bağımsız seviyem neydi?

&#x20; Veri modelinin genel amacını düşünebildim fakat tablo ve sorguları

&#x20; bağımsız olarak yazamadım.



\- Benzer SQL'i yarın AI olmadan yazabilir miyim?

&#x20; Basit SELECT ve WHERE sorgularını deneyebilirim; JOIN ve GROUP BY

&#x20; için henüz bağımsız olduğumu söyleyemem.



## Gün 2

- AI'ı hangi amaçla kullandım?
  Görevlerin kapsamını netleştirmek, yazdığım kodu inceletmek ve ilk mantık hatalarını görmek için kullandım.

- İlk çözümüm neydi?
  Contains Duplicate için HashSet kullandım.
  Valid Anagram problemini başlangıçta palindrome kontrolü olarak yanlış yorumladım.
  Daha sonra karakter sayılarını HashMap içinde tutan bir çözüm geliştirdim.

- AI ne önerdi?
  Anagram ve palindrome arasındaki farkı açıkladı.
  İkinci metinde bulunmayan karakterlerin görmezden gelindiği edge case'i gösterdi.
  Java pass-by-value davranışını daha doğru teknik ifadelerle açıklamama yardım etti.
  StringBuilder sonucundaki gereksiz son boşluğu fark ettirdi.

- Hangi dış yardımları kullandım?
  Valid Anagram probleminin tanımını internetten kontrol ettim.
  char değerini String'e dönüştürmek için String.valueOf kullanımına baktım.
  Set oluşturma syntax'ını hatırlamak için eski koduma kısa süre baktım.

- Hangi öneriyi reddettim?
  Çalışan kodu gereksiz yere yeniden tasarlamadım.
  Hazır kod kopyalamadım; düzeltmeleri kendim yazdım.

- Aynı kodu yarın AI olmadan yazabilir miyim?
  Contains Duplicate ve Valid Anagram çözümlerini tekrar yazabileceğimi düşünüyorum.
  Valid Anagram metodunu günün sonunda önceki koda bakmadan tekrar yazdım.



## Gün 3

- AI'ı hangi amaçla kullandım?
  Yazdığım Collections örneklerini, Two Sum çözümlerini ve mini HealthVerse modelini inceletmek için kullandım.
  Çalışan kodu doğrudan yeniden yazdırmak yerine doğruluk, edge case, okunabilirlik ve veri yapısı seçimi açısından reviewer geri bildirimi aldım.
  Takıldığım yerlerde yalnızca ilk mantık hatasını veya tek bir syntax ipucunu sordum.

- İlk çözümüm neydi?
  List, Set ve Map arasındaki farkları hafızamdan açıkladım.
  ArrayList, HashSet, HashMap, LinkedHashMap ve TreeMap için çalışan örnekler yazdım.
  User nesnelerini HashSet içine ekleyerek varsayılan eşitlik davranışını gözlemledim.
  Two Sum problemini önce çift döngüyle, ardından HashMap kullanarak çözdüm.
  User, Goal ve ProgressEntry sınıflarından oluşan saf Java modelini oluşturdum.
  İlk modelde goal ve progress kayıtları için array kullandım ve calculateProgress metoduna progress dizisini dışarıdan verdim.

- AI ne önerdi?
  List'in sıralı fakat otomatik olarak sıralanmış olmadığını açıkladı.
  HashSet'in sıra garantisi vermediğini, LinkedHashMap'in ekleme sırasını koruduğunu ve TreeMap'in key'leri sıraladığını gösterdi.
  Custom nesnelerin HashSet içindeki benzersizlik davranışında equals ve hashCode metotlarının önemini açıkladı.
  Two Sum çözümünde Math.abs kullanımının işaret bilgisini bozduğunu fark ettirdi.
  Goal nesnesinin toplam progress hesabında kendi progressEntries alanını kullanmasının daha tutarlı olduğunu belirtti.
  Array yerine List kullanmamı ve sonradan eleman ekleneceği için mutable liste tercih etmemi önerdi.
  HashMap collision davranışında Java HashMap'i linear probing yaklaşımıyla karıştırdığımı düzeltti.

- Hangi syntax veya API yardımlarını aldım?
  İki nesneyi equals ile karşılaştırma syntax'ını öğrendim.
  equals(Object) içinde instanceof kontrolü ve User tipine casting konusunda yönlendirme aldım.
  Başlangıç elemanları bulunan mutable bir liste oluşturmak için new ArrayList<>(List.of(...)) kullanımını öğrendim.
  TreeMap'te descendingKeySet çağrısının map'i değiştirmediğini, dönen sonucun ayrıca kullanılması gerektiğini öğrendim.

- Hangi dış yardımları kullandım?
  Harici çözüm yazısı veya video kullanmadım.
  Kodları kendim yazdım ve yalnızca bu çalışma sırasında AI reviewer geri bildirimi aldım.

- Hangi öneriyi reddettim?
  Çalışan kodu yalnızca daha kısa veya daha modern görünsün diye tamamen yeniden yazmadım.
  HashMap ile puan ekleme kodum çalışan ve anlaşılır olduğu için farklı API alternatiflerine geçmedim.
  Two Sum çözümünü hazır olarak almadım; yalnızca kendi yaklaşımımdaki ilk mantık hatasını düzelttim.

- Aynı kodu yarın AI olmadan yazabilir miyim?
  Collections kullanım örneklerini ve brute-force Two Sum çözümünü tekrar yazabileceğimi düşünüyorum.
  HashMap Two Sum çözümünde gerekli sayının target - currentNumber olarak hesaplandığını hatırlamam gerekiyor.
  equals ve hashCode sözleşmesini anlıyorum, ancak equals(Object), instanceof ve casting syntax'ını tamamen bağımsız yazmak için tekrar yapmam gerekiyor.
  User, Goal ve ProgressEntry modelini List kullanarak yeniden kurabileceğimi düşünüyorum.






## Gün 4

- AI'ı hangi amaçla kullandım?
  Yazdığım stack, queue, PriorityQueue, Valid Parentheses ve RecentRequests kodlarını inceletmek için kullandım.
  Stack/heap memory ve JVM kavramlarını öğrenmek için teknik açıklama aldım.

- İlk çözümüm neydi?
  Stack ve queue için ArrayDeque kullandım.
  PriorityQueue'yu önce yalnızca Integer skorlarla kurdum.
  Daha sonra kullanıcı ve skoru birlikte tutmak için Day4UserScore sınıfı oluşturdum.
  Valid Parentheses ve RecentRequests çözümlerini kendim yazdım.

- AI ne önerdi?
  Queue örneğinde eleman eklemek ile gerçekten işlemek arasındaki farkı fark ettirdi.
  Döngü sırasında queue size değerinin değişmesinden kaynaklanan mantık hatasını gösterdi.
  PriorityQueue içinde custom nesnelerin karşılaştırılması gerektiğini açıkladı.
  Stack veri yapısı, JVM stack, heap veri yapısı ve JVM heap memory arasındaki farkları açıkladı.

- Hangi syntax veya API yardımını aldım?
  PriorityQueue için Comparator lambda syntax'ını doğrudan aldım:
  Day4UserScore nesnelerini score alanına göre sıralamak için Integer.compare kullanımı konusunda yardım aldım.
  Queue API'deki offer/poll/peek ve add/remove/element farklarını öğrendim.

- Hangi öneriyi reddettim?
  Çalışan kodu gereksiz yere yeniden tasarlamadım.
  Stack, queue ve Valid Parentheses çözümlerimi hazır kodla değiştirmedim.

- Aynı kodu yarın AI olmadan yazabilir miyim?
  ArrayDeque ile temel stack ve queue kullanımını ve Valid Parentheses çözümünü tekrar yazabileceğimi düşünüyorum.
  PriorityQueue'da custom nesne + Comparator kullanımını tamamen bağımsız yazabilmek için tekrar yapmam gerekiyor.