package Actividades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Act_e {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/actividad1";
        String usuario = "root";
        String contraseña = "";

        try (Connection connection = DriverManager.getConnection(url, usuario, contraseña)) {
            connection.setAutoCommit(false); // Desactiva el modo de autocommit

            try {
                // Realiza operaciones SQL dentro de la transacción
                insertarRegistro(connection, "Axel", 25);
                insertarRegistro(connection, "Gustavo", 30);

                // Confirma la transacción
                connection.commit();
            } catch (SQLException e) {
                // En caso de error, revierte la transacción
                connection.rollback();
                e.printStackTrace();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void insertarRegistro(Connection connection, String nombre, int edad) throws SQLException {
        String sql = "INSERT INTO actividad (nombre, edad) VALUES (?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, nombre);
            statement.setInt(2, edad);
            statement.executeUpdate();
        }
    }
}

