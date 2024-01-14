// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void checkAge(int age) throws AgeCheckExeption {
        if(age < 18){
            throw new AgeCheckExeption("Yaş hatası alındı !");
        }
    }
    public static void main(String[] args) throws AgeCheckExeption {

        checkAge(12);

       /* System.out.println("Program başladı !");

        int a = 0;
        int b = 20;

        try {
            System.out.println(b/a);
        }catch (Exception e){

        }

        System.out.println("Program bitti !");*/
    }
}