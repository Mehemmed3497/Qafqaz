package dao;

import java.sql.*;

public class SelectCLS {
    //mehmed sen bura yazdighini commit ve push ediisen
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "GR99", "1234");
            String sqlcmd = "SELECT * FROM BOOKS";
            PreparedStatement pst = con.prepareStatement(sqlcmd);
            ResultSet resultset = pst.executeQuery();
            while (resultset.next()) {
                int id = resultset.getInt("ID");
                String bookname = resultset.getString(2);
                String bookauthor = resultset.getString("BOOK_AUTHOR");
                int bookpage = resultset.getInt(4);
                double bookprice = resultset.getDouble("BOOK_PRICE");
                String bookdate = resultset.getString(6);
                String publishhouse = resultset.getString(7);

                System.out.println(id + " " + bookname + " " + bookauthor + " " + bookpage + " " + bookprice + " " + bookdate + " " + publishhouse);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
