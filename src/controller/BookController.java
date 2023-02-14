package controller;

import dao.Book;
import service.BookService;

import java.util.List;

public class BookController {
    BookService bookService=new BookService();
   //lisy
    public List<Book> getBooks(){
        return bookService.getBookList();
    }

    //"wwww/addbook
    public  void addBook(Book book){
        bookService.createBook(book);
    }
}
