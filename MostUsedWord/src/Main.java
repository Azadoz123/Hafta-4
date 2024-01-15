import java.util.HashMap;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void method(String text) {

        String t ="";
        int max =0;

        HashMap<String, Integer> words = new HashMap<>();
        String[] str = text.split(" ");

        //Kelimelerin sayısını bulma
        for (int i = 0; i < str.length; i++) {
            //sayılan kelimeleri tekrar sayma
            if (!words.containsKey(str[i])) {
                int a = 0;
                for (int j = i; j < str.length; j++) {
                    if (str[i].equals(str[j])) {
                        a++;
                    }
                }
                //kelime sayısını hashMap'e ekleme
                words.put(str[i], a);
            }
        }

        //kelime sayılarını yazma
        for (String wordsKey : words.keySet()) {
            System.out.println(wordsKey + " : " + words.get(wordsKey));
            //en çok kullanılan kelimeyi bulma
            if (words.get(wordsKey) > max){
                max = words.get(wordsKey);
                t = wordsKey;
            }
        }
        //sonucu ekrana yazma
        System.out.println();
        System.out.println("Metinde en çok geçen kullanılan kelime " + t + "(" + max + ")");
    }
        public static void main(String[] args){

        //Kullanıcıdan veri alma
            Scanner scan = new Scanner(System.in);
            System.out.println("Lütfen bir metin giriniz : ");
            String text = scan.nextLine();
            method(text);
        }
    }
