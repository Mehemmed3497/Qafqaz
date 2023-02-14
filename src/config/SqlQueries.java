package config;

public class SqlQueries {

    public static String sqlInsert = "INSERT INTO BOOKS VALUES (GR99_SEQ.NEXTVAL,'LEPRCHI','CEYMS KOPER',480,40,TO_DATE('28.03.2018', 'DD.MM.YYYY'),'AY')";
    public static String sqlDelete = "DELETE BOOKS WHERE ID=870";
    public static String sqlUpdate = "UPDATE BOOKS BB SET BB.BOOK_DATE=TO_DATE('30.08.2018', 'DD.MM.YYYY') WHERE ID=840";
    public static String sqlOrderByNameDesc= "SELECT * FROM BOOKS BB ORDER BY BB.BOOK_NAME DESC";

}
