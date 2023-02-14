package dao;

public class Book {
    private  int id;
    private  String bookName;
    private  String bookAuthor;
    private  int bookPage;
    private  double bookPrice;
    private  String bookDate;
    private  String bookPublishingHouse;


    public Book() {
        System.out.println("axiret");
    }

    public Book(int id, String bookName, String bookAuthor, int bookPage, double bookPrice, String bookDate, String bookPublishingHouse) {
        this.id = id;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookPage = bookPage;
        this.bookPrice = bookPrice;
        this.bookDate = bookDate;
        this.bookPublishingHouse = bookPublishingHouse;
    }




    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookPage=" + bookPage +
                ", bookPrice=" + bookPrice +
                ", bookDate=" + bookDate +
                ", bookPublishingHouse='" + bookPublishingHouse + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public int getBookPage() {
        return bookPage;
    }

    public void setBookPage(int bookPage) {
        this.bookPage = bookPage;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getBookDate() {
        return bookDate;
    }

    public void setBookDate(String bookDate) {
        this.bookDate = bookDate;
    }

    public String getBookPublishingHouse() {
        return bookPublishingHouse;
    }

    public void setBookPublishingHouse(String bookPublishingHouse) {
        this.bookPublishingHouse = bookPublishingHouse;
    }

}
