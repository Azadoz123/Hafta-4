import java.util.Comparator;

public class OrderNameComparator implements Comparator<Book> {
    //Kitap ismine göre sıralama
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
