import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5.00,ucret;
        int a,e,d,m,p;

        Scanner input=new Scanner(System.in);
        System.out.print("Armutun kilosunu giriniz:");
        a=input.nextInt();
        System.out.print("Elmanin kilosunu giriniz:");
        e=input.nextInt();
        System.out.print("Domatesin kilosunu giriniz:");
        d=input.nextInt();
        System.out.print("Muzun kilosunu giriniz:");
        m=input.nextInt();
        System.out.print("Patlicanin kilosunu giriniz:");
        p=input.nextInt();

        ucret=(armut*a)+(elma*e)+(domates*d)+(muz*m)+(patlican*p);

        System.out.println("Odemeniz gereken tutar="+ucret);

    }
}
