import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n,k;
        Scanner input=new Scanner(System.in);
        System.out.print("Ussu Alinacak Sayi :");
        n=input.nextInt();
        System.out.print("Us olacak Sayi :");
        k=input.nextInt();
        int sonuc=1;
        for (int i=1;i<=k;i++){
            sonuc=sonuc*n;

        }
        System.out.println("Cevap :"+sonuc);

    }
}