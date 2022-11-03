import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n,r,sonuc=1;
        Scanner input = new Scanner(System.in);
        System.out.println("Üssü alınacak sayı :");
        n=input.nextInt();
        System.out.println("Üs olacak sayı");
        r=input.nextInt();
        for(int i=1;i<=r;i++){
            sonuc = sonuc * n;
        }
        System.out.println(sonuc);
    }
}