import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //  Faktöriyel************
        //  n! = 1*2*3*.......*n
/*
        int n,result=1;
        Scanner input = new Scanner(System.in);
        System.out.println("Faktöriyel sayısını giriniz.");
        n = input.nextInt();

        for(int i=1; i<=n;i++){
            result*=i;
        }
        System.out.println(result);
 */
        // Kombinasyon
        // n'nin r'li kombinasyonunu hesaplamak için;  C(n,r)=n!/(r!*(n-r)!)

        int n,r,result,payda=1;
        System.out.println("n'nin r'li kombinasyonunu hesaplamak için;");
        Scanner input = new Scanner(System.in);
        System.out.print("n sayısını giriniz: ");
        n = input.nextInt();
        System.out.print("r sayısını giriniz: ");
        r = input.nextInt();
        result = n;
        for(int i=1; i<(n-(n-r)); i++){
            result*=(n-i);
        }
        for(int j=1; j<=r; j++){
            payda*=j;
        }
        System.out.println(result/payda);
    }
}
