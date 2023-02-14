package qaralama;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpDate1 {
    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","GR99","1234");
        String upDateCommand = "UPDATE BOOKS BB SET BB.BOOK_DATE=TO_DATE('30.08.2018', 'DD.MM.YYYY') WHERE ID=840";

        PreparedStatement pst = con.prepareStatement(upDateCommand);
        pst.execute();
        System.out.println("Cemill");
    }
}
