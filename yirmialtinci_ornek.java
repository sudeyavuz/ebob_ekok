package JAVA101;
import java.util.Scanner;
public class yirmialtinci_ornek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ebob=1,ekok=1;
        System.out.print("birinci sayıyı giriniz :");
        int n1 = input.nextInt();
        System.out.print("ikinci sayıyı giriniz: ");
        int n2 = input.nextInt();
           int i=1;
           while (i<=n1 &&i<n2 ){
               if (n1%i==0&& n2%i==0){
                   ebob=i;
               }
               i++;
           }
           ekok = (n1*n2)/ebob;
        System.out.println("ebob: "+ebob);
        System.out.println("ekok: "+ekok);

    }

}
