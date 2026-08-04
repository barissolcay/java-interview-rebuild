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