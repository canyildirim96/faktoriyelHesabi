import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    int a,b;
    int total1=1, total2=1, total3=1;
    int kombi;
    Scanner inp = new Scanner(System.in);

        System.out.print("İlk Değeri Giriniz: ");
        a = inp.nextInt();

        System.out.print("İkinci Değeri Giriniz: ");
        b = inp.nextInt();


        for (int i = 1; i<= a; i++){
            total1 = total1*i;
        }
        System.out.println(a + " Faktöriyel: " + total1);
        for (int i = 1; i<=b; i++){
            total2 = total2*i;
        }
        System.out.println(b + " Faktöriyel: " + total2);
        for (int i = 1; i<=(a-b); i++){
            total3 = total3*i;
        }

        kombi = total1 / (total2 * total3);
        System.out.println("Kombinasyon: " + kombi);

        if(b>a){
            System.out.println("Hatalı Giriş Yaptınız, Lütfen Tekrar Deneyin.");
        }
    }
}