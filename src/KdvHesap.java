import java.util.Scanner;
public class KdvHesap {
    public static void main(String[] args) {



        double tutar,kdvOran,kdvTutar,kdvliTutar;

        Scanner cikti = new Scanner(System.in);
        System.out.print("ücret tutarı giriniz :");
        tutar = cikti.nextDouble();


        boolean kdvKosul = tutar <= 1000;
        kdvOran = kdvKosul ? 0.18 : 0.08;
        kdvTutar= tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;


        System.out.println("KDV'siz tutar : "+ tutar);
        System.out.println("KDV Oranı : " + kdvOran);
        System.out.println("KDV Tutarı :"+kdvTutar);
        System.out.println("KDV'li Tutar: "+kdvliTutar);

    }
}