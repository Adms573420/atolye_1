import java.util.Scanner;

public class workshop_2 {
    public static void main (String[] args){
        int sayı;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        sayı=scanner.nextInt();
        int toplam=0;

        for (int i = 1; i < sayı; i++) {
            if(sayı % i==0){
                toplam +=toplam+i;


            }
        }
        System.out.println(toplam);

        }

    }
