package service;

import java.sql.SQLException;

public class CrudService {
    public static void main(String[] args) throws SQLException {
        CrudOperations  crudOperations=new CrudOperations();
//ins
        crudOperations.ins();

        //del
        crudOperations.del();

        crudOperations.upd();

        crudOperations.ord();


    }
}
