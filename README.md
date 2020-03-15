
# Ödev Sorusu

**Açıklama1:** Soruların her biri ayrı ayrı algoritmaları ifade eder. Algoritma dediğimiz kavram bilgisayar programcılığı için çok önemli bir konudur.
Algoritma düşünce sistematiğini geliştirmeyen bir yazılımcı yazılım kütüphanelerini, programlama dillerini öğrenerek iyi bir programcı olma yolunda çok ileriye gidemez.

**Açıklama2:** Bu önemine istinaden ekstra algoritma ödevleriyle bu sizlerin bu yönünü geliştirmek hedefindeyiz.

**Açıklama3:** Verilen soruları Java dilinde kodlamanızı rica ediyorum. Ayrıca, hazır çözümler kullanmadan herkesin bireysel kodlamalasını rica ediyorum.
Yardımlaşma için birbirinizden ve benden yardım alabilirsiniz. Tek şart copy-paste kodlar lütfen olmasın :) Sizin gelişiminiz için bu çok önemlidir.

**Açıklama4:** Ödev sorularını yaparken takıldığınız yerlerde Google'da aramalar yaparak yardım alabilirsiniz. Unutmayın Google en büyük yardımcınız :)

#Sorular

**Soru1:** 

M x N boyutunda her elemanı 1 veya 0 değerlerinden oluşan bir matris tanımlayınız. 
Matrisin her elemanı bir hücredir. 
1 değerine sahip hücre canlı olarak kabul edilir.
0 değerine sahip hücre ölü olarak kabul edilir.

Örnek: 1 ve 0'lardan oluşan 5 x 5' lik matris 

1 0 1 1 0
0 0 0 1 0
1 1 0 0 1
0 0 1 0 1
1 1 0 1 1



Her hücre üstündeki, altındaki, sağındaki ve solundaki komşu ile etkileşim halindedir.
Bu etkileşim aşağıdaki kurallar ile tarif edilmiştir.

1- Canlı hücre etrafında 2'den az canlı hücre varsa ölür. (1'den 0'a dönüşür)
2- Canlı hücre etrafında 2 veya 3 canlı hücre varsa yaşamaya devam eder. (1 değeri almaya devam eder)
3- Canlı hücre etrafında 3'ten fazla canlı hücre varsa ölür. (1'den 0'a dönüşür)
4- Ölü bir hücre etrafında 3 tane canlı hücre varsa canlı hale gelir. (0'dan 1'e dönüşür)


Yukarıdaki bilgiler ışığında verilen matrisin bir sonraki durumda hangi değerlerden oluşacağını hesaplayan bir fonksiyon yazınız.

Örnek:

Input: 

0 1 0
0 0 1
1 1 1
0 0 0

Output: 

0 0 0
1 0 1
0 1 1
0 1 0


**Soru2:**

Girdi:

1  2  3  4  5
16 17 18 19 6
15 24 25 20 7
14 23 22 21 8
13 12 11 10 9

Çıktı:

1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25

Yukarıdaki matrisi Spiral bir biçimde ekrana yazdıran algoritmayı yazınız. Matrisi sabit şekilde oluşturabilirsiniz. Örnek girdi ve çıktı yukarıda yer almaktadır.


**Soru3:**

N x M ile M x T boyutlarında 0-10 arası rastgele sayılardan oluşan iki matris tanımlayınız. Bu iki matrisin çarpımını yapan fonksiyonu yazın. Çarpım sonucu oluşan matrisi ekrana yazdırın.


**Soru4:**

N boyutunda 0-10 arası rastgele sayılardan oluşan bir dizi tanımlayınız. Bu dizi içinde mükerrer olan elemanları ekrana yazdıran algoritmayı tasarlayınız.

Örnek: { 2, 4, 5, 11, 33, 2, 5, 55, 100, 1 }

Örnek çıktı:
2
5

**Bu bir sınav değildir! Yeni sloganımız ==> Geliştirmek için kodluyoruz ... :))**
