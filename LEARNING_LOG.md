# Day 1

## What I practiced

* Java Map, Stack and Set usage
* Word frequency
* Valid brackets
* First repeated number
* Basic relational table design
* Foreign keys and many-to-many relationships
* SELECT, WHERE, JOIN, SUM, GROUP BY, ORDER BY and LIMIT

## What I learned

* Bir algoritmanın mantığını hatırlamak, syntax'ı hatırlamakla aynı şey değil.
* HashMap frekans hesaplamak için kullanılabilir.
* HashSet tekrar eden elemanı tespit etmek için kullanılabilir.
* Çoktan çoğa ilişkiler bağlantı tablosuyla modellenebilir.
* SQL tarafında yönlendirmesiz pratiğe ihtiyacım var.

## Tomorrow's recall

* Üç Java metodunun imzasını ve kullandığım veri yapılarını koda bakmadan yaz.
* Map, Set ve stack arasındaki farkı yaz.
* users ve goals tablolarını hafızadan oluşturmayı dene.
* Basit SELECT ve WHERE sorgusu yaz.


# Gün 2

## Çalıştığım konular

- Java döngüleri, metotlar, diziler ve String işlemleri
- StringBuilder kullanımı
- Primitive ve reference type davranışı
- Contains Duplicate
- Valid Anagram
- IntelliJ debugger kullanımı
- Çözümü hafızadan tekrar yazma

## Öğrendiklerim

- Java’da bütün argümanlar değer olarak aktarılır.
- Primitive değerlerin kopyası metoda gönderilir. Metot içindeki değişiklik çağıran taraftaki değişkeni etkilemez.
- Dizi metoda gönderildiğinde reference value kopyalanır. İki reference aynı dizi nesnesini gösterdiği için dizinin içeriğindeki değişiklik dışarıdan görülür.
- HashSet, bir değerin daha önce görülüp görülmediğini kontrol etmek için uygundur.
- HashMap, değerlerin kaç kez geçtiğini saymak için uygundur.
- Palindrome ve anagram farklı problemlerdir.
- Alt alta çalışan iki döngü O(n²) değil, O(n) olabilir.
- O(n/2), Big-O gösteriminde O(n) olarak ifade edilir.
- StringBuilder, metni parça parça oluşturmak için kullanılabilir.
- Debugger ile değişkenleri ve program akışını adım adım izlemek hatayı anlamayı kolaylaştırır.

## Bağımsız çalışma değerlendirmesi

- Contains Duplicate problemini bağımsız tamamladım.
- Valid Anagram problemini ilk başta palindrome olarak yanlış anladım.
- Problem açıklandıktan sonra HashMap tabanlı yaklaşımı kendim kurdum.
- İlk çözümdeki edge case hatasını yönlendirmeyle düzelttim.
- Günün sonunda Valid Anagram metodunu önceki koda bakmadan tekrar yazdım.
- Java syntax konusunda ara sıra API veya syntax kontrolüne ihtiyaç duyuyorum.
- Debugger arayüzünü kullanabiliyorum, ancak daha fazla pratik yapmam gerekiyor.

## Yarın hatırlamam gerekenler

- List, Set ve Map arasındaki farkları açıklamak
- HashSet ve HashMap kullanım alanlarını açıklamak
- Primitive ve array için Java pass-by-value davranışını açıklamak
- Valid Anagram çözümünü hafızadan yazmak



# Gün 3

## Çalıştığım konular

- List, Set ve Map arasındaki farklar
- ArrayList, HashSet, HashMap, LinkedHashMap ve TreeMap kullanımı
- equals ve hashCode ilişkisi
- Custom User nesnelerinin HashSet içindeki davranışı
- Two Sum probleminin brute-force ve HashMap çözümleri
- User, Goal ve ProgressEntry sınıflarıyla saf Java domain modeli
- Array ve List arasındaki kullanım farkı
- Mutable ve immutable listeler
- HashMap'in ortalama ve en kötü durum karmaşıklığı
- Bucket, collision ve equals kavramları

## Öğrendiklerim

- List elemanların konumunu ve eklenme düzenini korur, ancak elemanları otomatik olarak sıralamaz.
- HashSet benzersizlik ve üyelik kontrolü için uygundur; elemanlara index veya key üzerinden doğrudan erişim sağlamaz.
- HashSet belirli bir sıra garanti etmez.
- LinkedHashMap ekleme sırasını korur.
- TreeMap varsayılan olarak value'ları değil, key'leri doğal sıralarına göre sıralar.
- Aynı key ile tekrar put yapılırsa HashMap içinde yeni kayıt oluşmaz; eski value güncellenir.
- Custom nesnelerin HashSet ve HashMap içindeki eşitliği equals ve hashCode davranışına bağlıdır.
- İki nesne equals açısından eşitse aynı hashCode değerini üretmelidir.
- Bir nesne hash tabanlı collection içindeyken equals ve hashCode hesabında kullanılan alanlar değiştirilmemelidir.
- toString yalnızca nesnenin nasıl görüntülendiğini değiştirir; eşitlik davranışını değiştirmez.
- List.of ile oluşturulan liste değiştirilemez. Sonradan add yapılacaksa ArrayList gibi mutable bir liste kullanılmalıdır.
- Two Sum probleminde mevcut sayıyı tamamlayan değer target - currentNumber şeklinde hesaplanır. Math.abs kullanmak negatif değerlerde hataya yol açabilir.
- Brute-force Two Sum çözümünün zaman karmaşıklığı O(n²), ek alanı O(1)'dir.
- HashMap tabanlı Two Sum çözümünün ortalama zaman karmaşıklığı O(n), ek alanı O(n)'dir.
- Bir nesne kendi progress listesini tutuyorsa toplam progress hesabında dışarıdan tekrar liste almak yerine kendi alanını kullanması daha tutarlıdır.
- Boş progress listesi üzerinde toplam hesaplandığında sonuç doğal olarak 0 olur.
- HashMap, hashCode ile ilgili bucket'ı bulduğu için ortalama O(1) erişim sağlar.
- Collision olduğunda Java HashMap komşu boş bucket aramaz; aynı bucket içindeki key'leri equals ile ayırır.
- Java HashMap'in collision yaklaşımını linear probing ile karıştırmamak gerekir.
- Çok fazla key aynı bucket'a düşerse performans kötüleşebilir ve en kötü durumda O(n) seviyesine yaklaşabilir.

## Bağımsız çalışma değerlendirmesi

- List, Set ve Map arasındaki temel farkları herhangi bir kaynağa bakmadan açıkladım.
- Beş farklı collection implementation'ı için çalışan kullanım örneklerini bağımsız olarak yazdım.
- HashSet'in duplicate davranışını ve TreeMap'in key sıralamasını console çıktılarıyla doğruladım.
- User nesnelerinde varsayılan eşitlik davranışını bağımsız olarak gözlemledim.
- equals ve hashCode metotlarını yazarken instanceof, casting ve metot sözleşmesi konusunda yönlendirme aldım.
- Two Sum brute-force çözümünü bağımsız yazdım.
- HashMap yaklaşımını kendim kurdum, ancak gerekli sayıyı hesaplarken başlangıçta Math.abs kullandım. Tek ipucuyla hatayı düzelttim.
- Mini HealthVerse modelini bağımsız oluşturdum.
- İlk model çalışıyordu, ancak array kullanımı ve calculateProgress metodunun dışarıdan progress alması reviewer geri bildirimiyle düzeltildi.
- Modeldeki array alanlarını List'e dönüştürdüm ve sonradan eleman eklenebilmesi için mutable listeler kullandım.
- HashMap açıklamasını kendi cümlelerimle yaptım, ancak Java HashMap'in collision yöntemini linear probing ile karıştırdım.
- JUnit testi yazmadım; doğrulamaları main metotları ve console çıktılarıyla yaptım.
- Java syntax ve bazı API kullanımlarında hâlâ kısa yönlendirmelere ihtiyaç duyuyorum, ancak veri yapısı seçimi ve temel algoritma yaklaşımım gelişiyor.

## Yarın hatırlamam gerekenler

- List, Set ve Map arasındaki temel farkları açıklamak
- HashSet, LinkedHashMap ve TreeMap'in sıra davranışlarını ayırmak
- Custom bir nesnenin HashSet içinde doğru çalışması için equals ve hashCode ilişkisinin neden gerekli olduğunu açıklamak
- Two Sum HashMap çözümünde gerekli sayıyı `target - currentNumber` şeklinde hesaplamak
- `List.of(...)` ile oluşturulan liste ile mutable `ArrayList` arasındaki farkı hatırlamak
- Bir Goal nesnesinin toplam progress hesabında kendi `progressEntries` alanını kullanması gerektiğini açıklamak
- HashMap'in ortalama O(1) erişimini bucket, collision, hashCode ve equals kavramlarıyla anlatmak
- Java HashMap'in collision durumunda linear probing kullanmadığını hatırlamak