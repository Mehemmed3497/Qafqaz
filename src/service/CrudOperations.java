package service;

import config.SqlQueries;
import delete.CreateConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CrudOperations {
    Connection con;

    {
        try {
            con = CreateConnection.getConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }


    //insert
    public void ins() throws SQLException {
        general(con, SqlQueries.sqlInsert);
    }

    public void upd() throws SQLException {
        general(con, SqlQueries.sqlUpdate);
    }

    public void del() throws SQLException {
        general(con, SqlQueries.sqlDelete);
    }

    public void ord() throws SQLException {
        general(con, SqlQueries.sqlOrderByNameDesc);
    }

    public void general(Connection con, String sql) throws SQLException {
        PreparedStatement pst = con.prepareStatement(sql);
        pst.execute();
    }

}
