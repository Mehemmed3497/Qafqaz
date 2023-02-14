package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookDao {


    private static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "GR99", "1234");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return connection;
    }

    //read
    public List<Book> getBookList() {
        List<Book> bookList = new ArrayList<>();


        try {
            Connection con = getConnection();

            String sqlcmd = "SELECT * FROM BOOKS";


            PreparedStatement pst = con.prepareStatement(sqlcmd);
            ResultSet resultSet = pst.executeQuery(); // burda bnazadan table in  datalari gelir

            while (resultSet.next()) {  // datalarin ustunde gezirem
                Book book = new Book();
                book.setId(resultSet.getInt("ID"));
                book.setBookName(resultSet.getString(2));
                book.setBookAuthor(resultSet.getString("BOOK_AUTHOR"));
                book.setBookPage(resultSet.getInt(4));
                book.setBookPrice(resultSet.getDouble("BOOK_PRICE"));
                book.setBookDate(resultSet.getString(6));
                book.setBookPublishingHouse(resultSet.getString(7));
                bookList.add(book);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return bookList;

    }








    //create insert
    public void createBook(Book book) {
//insert olunacaq bazaya book

        Connection connection = getConnection();


        String sqlcmd = "INSERT INTO BOOKS " +
                "VALUES (gr99_seq.NEXTVAL, 'Meh', 'Mehdi', ,50,TO_DATE('07.06.1995','DD.MM.YYYY'),'GUNESH')"+book.getBookPublishingHouse();
        Statement st = null;
        try {
            st = connection.createStatement();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        try {
            st.executeUpdate(sqlcmd);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
//INSERT INTO BOOKS VALUES(gr99_seq.NEXTVAL,'CINAYET VE CEZA','DOSTOYEVSKI',400,50,TO_DATE('07.06.1995','DD.MM.YYYY'),'GUNESH');

    }

    //delete
    public void deleteBook(int bookId) {

    }
}
