import java.util.Set;
import java.util.TreeSet;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //TreeSet oluştur
        Set<Book> books = new TreeSet<>(new OrderNameComparator());

        //Verileri TreeSete ekle
        books.add(new Book("Ali",10,"Mehmet",1990));
        books.add(new Book("Fatih",20,"Can",1991));
        books.add(new Book("Faruk",150,"Salih",1992));
        books.add(new Book("Kemal",40,"Cihan",1993));
        books.add(new Book("Azad",400,"Ahmet",1996));

        //Verileri isme göre yazdır
        for (Book book: books){
            System.out.println(book.getName());
        }

        //TreeSet oluştur
        Set<Book> books2 =  new TreeSet<>(new OrderNumberOfPagesComparator().reversed());

        //Verileri TreeSete ekle
        for (Book book: books){
            books2.add(book);
        }

        System.out.println();

        //Verileri sayfa sayısına göre yazdır
        for (Book book: books2){
            System.out.println(book.getName());
        }
    }
}