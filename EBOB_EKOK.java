import java.util.Scanner;
public class EBOB_EKOK {
    public static void main(String[] args) {
        int a, b, ebob = 0, ekok = 0, i=1;
        Scanner inp = new Scanner(System.in);
        System.out.println("Lütfen iki sayı giriniz.");
        a = inp.nextInt();
        b = inp.nextInt();
        if(a<b){
            while(i<=a){
                if(a%i==0 && b%i==0){
                    ebob = i;
                }
                i++;
            }
        }
        else{
            while (i<=b){
                if(a%i==0 && b%i==0){
                    ebob = i;
                }
                i++;
            }
        }
        ekok = (a*b)/ebob;
        System.out.println(a+" ve "+b+" sayılarının EBOBu : "+ebob);
        System.out.println(a+" ve "+b+" sayılarının EKOKu : "+ekok);
    }
}
