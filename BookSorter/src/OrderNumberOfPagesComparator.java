import java.util.Comparator;

public class OrderNumberOfPagesComparator implements Comparator<Book> {
   //Sayfa sayısına göre sıralama
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getNumberOfPages() - o2.getNumberOfPages();
    }
}
