package dao;

import java.util.List;

public class CrudMain {
    public static void main(String[] args) {
        BookDao bookDao = new BookDao();

        //read
        List<Book> bookList = bookDao.getBookList();
        System.out.println(bookList);

        //create
        Book book=new Book();
        book.setBookName("MehmedTest");
        book.setBookAuthor("Mehdizade");
        bookDao.createBook(book);



    }
}
