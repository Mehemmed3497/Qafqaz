package delete;

import config.SqlQueries;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeleteCls {
    public static void main(String[] args) throws Exception {
        Connection con = CreateConnection.getConnection();
        PreparedStatement pst = con.prepareStatement(SqlQueries.sqlDelete);
        pst.execute();








    }


}
