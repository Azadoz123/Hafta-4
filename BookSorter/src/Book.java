import java.util.Date;

public class Book {
    private String name;
    private int numberOfPages;
    private String autherName;
    private int releaseDate;


    public Book(String name, int numberOfPages, String autherName, int releaseDate) {
        this.name = name;
        this.numberOfPages = numberOfPages;
        this.autherName = autherName;
        this.releaseDate = releaseDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getAutherName() {
        return autherName;
    }

    public void setAutherName(String autherName) {
        this.autherName = autherName;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }
}
