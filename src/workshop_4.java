import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class workshop_4 {
    public static void main(String args[]) {
       /* HashMap<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "Cebir");
        myMap.put(2, "Fizik");
        myMap.put(3, "Kimya");
        myMap.put(4, "Biyoloji");
        myMap.put(5, "Geometri");

        //boolean bir_iceriyor_mu=myMap.containsKey(1);
        //boolean sekiz_iceriyor_mu=myMap.containsKey(8);
        //System.out.println("Bir iceriyormu: "+bir_iceriyor_mu);
        //System.out.println("Sekiz iceriyormu: "+sekiz_iceriyor_mu);_
        //boolean cebir_kelimesini_iceriyormu=myMap.containsValue("Cebir");
        //boolean turk_kelimesini_iceriyormu=myMap.containsValue("Turk");
        //System.out.println("Cebir kelimesini iceriyor mu: "+cebir_kelimesini_iceriyormu);
        //System.out.println("turk kelimesini iceriyor mu: " + turk_kelimesini_iceriyormu);3
        System.out.println(myMap);
        myMap.remove(3);
        myMap.replace(4, "Biyoloji", "Analiz");
        System.out.println(myMap);
        for (Integer key : myMap.keySet()) {

        } System.out.println(myMap);
        //Soru 6 ) Kullanicidan pozitif bir tamsayi alin ve bu sayiyi tam bolen sayilari
        //ve toplam kac tane olduklarini ekranda yazdirin
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int sayı=scanner.nextInt();


        int count=0;

        for (int bölen = 1; bölen <=sayı ; bölen++) {
            if(sayı%bölen==0){
                System.out.println(sayı +"nın bölenleri:"+ bölen+" ");
                count++;

            }

        }
        System.out.println("bölenlerinin sayısı:"+count);
      // Soru 4) Kullanicidan baslangic ve bitis haflerini alin ve
      // baslangic harfinden baslayip bitis harfinde biten tum harfleri
      // buyuk harf olarak ekrana yazdirin.
      // Kullanicinin hata yapmadigini farz edin.
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir kelime yazınız:");
        String name=scan.nextLine();
       char bas_harf=name.toUpperCase(Locale.ROOT).charAt(0);
       char bit_harf=name.toUpperCase(Locale.ROOT).charAt(name.length()-1);
        System.out.print(bas_harf+"-");
        System.out.println(bit_harf);
        for (int i = 0; i <name.length() ; i++) {
            char harf_al=name.toUpperCase(Locale.ROOT).charAt(i);
            System.out.print(harf_al+"- ");

        }
        // Soru 2 ) For loop ve while Loop kullanarak 3 basamakli pozitif sayilardan
        // 15, 20 ve 90’na tam bolunebilen sayilari yazdirin.



       //for (int i = 100; i < 1000; i++) {

       //    if (i%15==0 && i%20==0 && i%90==0) {
       //        System.out.print(i + " ");
       //    }

       //}

     int  sayı=100;
       while(sayı<1000){
           if(sayı%15==0 && sayı% 20==0 && sayı%90==0){
               System.out.print(sayı+"-");
           }
           sayı++;
       }*/

    }
}
