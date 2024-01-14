import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static int method(int x){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        return arr[x];
    }
    public static void main(String[] args) {

        //kullanıcıdan veri alma
        Scanner scan = new Scanner(System.in);
        System.out.println("İndeks numarası giriniz : ");
        int indeks = scan.nextInt();

        //Hata yakalama
        try {
            System.out.println(method(indeks));
        }catch (ArrayIndexOutOfBoundsException e){
            //hatayı yazdırma
            System.out.println(e.toString());
        }

    }
}