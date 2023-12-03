package Actividades;

import java.sql.*;

public class Act_d {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/actividad1";
        String usuario = "root";
        String contraseña = "";

        try (Connection connection = DriverManager.getConnection(url, usuario, contraseña)) {
            String sql = "{call obtenerNombre (?, ?)}"; 
            try (CallableStatement statement = connection.prepareCall(sql)) {
                statement.setInt(1, 25);  
                statement.registerOutParameter(2, Types.VARCHAR);

                statement.execute();

                String resultado = statement.getString(2);
                System.out.println("Resultado: " + resultado);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
