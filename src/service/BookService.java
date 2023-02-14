package service;

import dao.Book;
import dao.BookDao;

import java.util.List;

public class BookService {

    BookDao bookDao = new BookDao();

    public List<Book> getBookList() {
        return bookDao.getBookList();
    }


    //delete
    public void deleteBook(int bookId) {
        bookDao.deleteBook(bookId);
    }
    //create insert
    public void createBook(Book book){
        bookDao.createBook(book);
    }

}


