import java.util.Scanner;
public class KdvCalculate {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double amount,kdvRate=0.18;
        System.out.print("Urun tutarini giriniz:");
        amount = input.nextDouble();
        if(0<amount && amount<1000)
        {
            double kdv = amount*kdvRate;
            double result = amount+kdv;
            System.out.println("Urunun kdv olmadan fiyati :"+amount+"tl"+" Urunun kdv tutari:"+kdv +"tl"+ " Urunun kdv dahil fiyati:"+ result+"tl");
        }
        else if (amount>=1000)
        {
            double kdv = amount*kdvRate;
            double result = amount+kdv;
            System.out.println("Urunun kdv olmadan fiyati :"+amount+"tl"+" Urunun kdv tutari:"+kdv +"tl"+ " Urunun kdv dahil fiyati:"+ result+"tl");
        }
        else{
            System.out.println("Hatali veya eksik tutar girdiniz");
        }



    }
}
