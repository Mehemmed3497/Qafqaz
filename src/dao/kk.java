package dao;

import java.sql.*;

public class kk {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","GR99","1234");

            String sqlcmd = "SELECT * FROMM BOOKS";
            PreparedStatement pst = con.prepareStatement(sqlcmd);
            ResultSet resultSet = pst.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("ID");
                String bookName = resultSet.getString("2");
                String bookAuthor = resultSet.getString("BOOK_AUTHOR");
                int bookPage = resultSet.getInt("4");
                int bookPrice = resultSet.getInt("BOOK_PRICE");
                int bookDate = resultSet.getInt("6");
                String publishHouse = resultSet.getString("7");

                System.out.println(id+" "+bookName+" "+bookAuthor+" "+bookPage+" "+bookPrice+" "+bookDate+" "+publishHouse);
            }

        }catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
