package Actividades;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.SQLException;

public class Act_b {
    public static void main(String[] args) {
        try {
            JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();
            rowSet.setUrl("jdbc:mysql://localhost:3306/actividad1");
            rowSet.setUsername("root");
            rowSet.setPassword("");

            rowSet.setCommand("SELECT * FROM actividad");
            rowSet.execute();

            while (rowSet.next()) {
                System.out.println(rowSet.getString("nombre") + " " + rowSet.getString("edad"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
