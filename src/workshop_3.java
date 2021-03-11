import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class workshop_3 {
    public static void main(String args[]) {

        /*
		 Kullanicidan toplamak uzere pozitif sayilar isteyin,
		 islemi bitirmek icin 0’a basmasini soyleyin.
		 Kullanici yanlislikla negative sayi girerse o sayiyi toplama eklemeyin ve
		 “Negatif sayi giremezsiniz” yazdirip basa donun
		 Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini,
		 yanlislikla kac negative sayi girdigini ve
		 girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.


       Scanner scanner=new Scanner(System.in);
       int countPozitif=0;
       int countNegatif=0;
       int toplamPozitif=0;
        int sayı=1;
        do{
            System.out.println("Oyuna hosgeldiniz.Bitirmek istediginizde 0 a basınız.");
            sayı=scanner.nextInt();
            if(sayı>0){
                countPozitif++;
                toplamPozitif +=sayı;


                }
            if(sayı<0){
                countNegatif++;
                System.out.println("Negatif sayi giremezsiniz");
            }
            }while(sayı!=0);
        System.out.println("toplam"+countPozitif+"Pozitif sayı girdiniz.");
        System.out.println("toplam"+countNegatif+"Negatif sayı girdiniz.");
        System.out.println("Girilen pozitif sayıiarın toplamı:"+toplamPozitif);


        Scanner scanner=new Scanner(System.in);
        int sayı=0;
      do{
          System.out.println("Lütfen pozitif bir tamsayı giriniz:");
          sayı= scanner.nextInt();

      }while(sayı<=0);
      System.out.println("aferin");}

        // Kullanicidan bir cumle alin, while loop kullanarak
        // Cumlede buyuk harf varmi, yok mu yazdirin.

        Scanner scanner=new Scanner(System.in);
        String cumle=scanner.next();
        String flag="yok";
        int index=0;

        while(index<cumle.length()){
            if (cumle.charAt(index) >= 'A' && cumle.charAt(index) <= 'Z') {
                flag = "var";
            }
            index++;
        }
        System.out.println("Verdiginiz cumlede buyuk harf "+flag);
        // Kullanicidan bir cumle ve bir harf isteyin
        // while loop kullanarak cumlede istenen harf kac kez kullanilmis bulunuz
        // program Case Sensitive olsun
          Scanner scan=new Scanner(System.in);
          System.out.println("Lütfen cümle giriniz:");
          String cumle=scan.nextLine();
          System.out.println("Lütfen saymak istediğiniz harfi giriniz:");
          String harf=scan.next().substring(0,1);


          int count=0;

          int index=0;

          while(index<cumle.length()){
              if(cumle.substring(index,index+1).equals(harf)){

                  count++;
              }
              index++;
          }
        System.out.println("cumlede " + harf + " harfi " + count + " defa kullanilmis");
        scan.close();*/
        // verilen sayinin asal olup olmadigini bulan bir program yazin
        // asal sayi : 1 ve kendisi disinda hic bir pozitif tamsayiya kalansiz bolunmeyen

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int sayı = scanner.nextInt();

        int sayac = 0;

        for (int i = 2; i <= sayı; i++) {

            if (sayı % i != 0) {
                sayac++;
                if (sayac == sayı - 2) {
                    System.out.println(sayı + " asal sayıdır.");
                    break;


                }


            }
            else{
                System.out.println(sayı+" asal sayı degildir");
            }
        }
    }
}







