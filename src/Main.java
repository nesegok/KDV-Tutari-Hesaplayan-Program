import java.util.Scanner;


public class Main
{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Tutar gir: ");
        double number = inp.nextDouble();

        System.out.println("KDV'siz Fiyat: "+number);

        if (number>0 && number<=1000){
            double kdv = number*18/100;
            System.out.println("KDV'li Fiyat: "+(number+kdv));
            System.out.print("KDV tutarı: "+kdv);
        }
        else {
            double kdv = number*8/100;
            System.out.println("KDV'li Fiyat: "+(number+kdv));
            System.out.print("KDV tutarı: "+kdv);
        }

    }
}

