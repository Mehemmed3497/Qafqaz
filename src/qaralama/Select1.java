package qaralama;

import java.sql.*;

public class Select1 {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","GR99","1234");
            String selectCommand = "SELECT * FROM BOOKS";

            PreparedStatement pst = con.prepareStatement(selectCommand);
            ResultSet resultSet=pst.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("ID");
                String bookname = resultSet.getString(2);
                String bookauthor = resultSet.getString("BOOK_AUTHOR");
                int bookpage = resultSet.getInt(4);
                double bookprice = resultSet.getDouble("BOOK_PRICE");
                String bookdate = resultSet.getString(6);
                String publishouse = resultSet.getString(7);
                System.out.println(id+" "+bookname+" "+bookauthor+" "+bookpage+" "+bookprice+" "+bookdate+" "+publishouse);
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
