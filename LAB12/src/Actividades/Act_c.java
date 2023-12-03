package Actividades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Act_c {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/actividad1";
        String usuario = "root";
        String contraseña = "";

        try (Connection connection = DriverManager.getConnection(url, usuario, contraseña)) {
            String sql = "INSERT INTO actividad (id, nombre, edad) VALUES (?, ?, ?)";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setInt(1, 22);
                statement.setString(2, "Jose");
                statement.setInt(3, 22);
                statement.executeUpdate();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
