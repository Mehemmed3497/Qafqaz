package update;

import config.SqlQueries;
import delete.CreateConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateCls {
    public static void main(String[] args) throws Exception {
        Connection con = CreateConnection.getConnection();
        PreparedStatement pst = con.prepareStatement(SqlQueries.sqlUpdate);
        pst.execute();




    }
}
