import java.util.Scanner;
public class EbobEkok {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int n1,n2,i=1,ebob=0,ekok;

        System.out.println("Birinci sayiyi giriniz : ");
        n1= girdi.nextInt();
        System.out.println("Ikinci sayiyi giriniz : ");
        n2= girdi.nextInt();

        while(i<=n1 && i<=n2 ){
            if((n1%i) == 0 && (n2%i) == 0){
                ebob=i;
            }
            i++;
        }
        System.out.println("EBOB: "+ebob);
        System.out.println("EKOK: "+(n1*n2/ebob));




    }

}
