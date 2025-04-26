import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,r;
        int nfaktoriyel = 1;
        int rfaktoriyel = 1;
        int farkfaktoriyel = 1;
        System.out.println("n sayısını giriniz:");
        n = sc.nextInt();
        System.out.println("r sayısını giriniz:");
        r = sc.nextInt();

        for(int i=1;i<=n;i++){
            nfaktoriyel *= i;
        }

        for(int i=1;i<=r;i++){
            rfaktoriyel *= i;
        }

        for(int i=1;i<=(n-r);i++){
            farkfaktoriyel *= i;
        }

        int kombinasyon = nfaktoriyel / (rfaktoriyel * farkfaktoriyel);

        System.out.println("C(" + n + "," + r + ") = " + kombinasyon);




    }
}