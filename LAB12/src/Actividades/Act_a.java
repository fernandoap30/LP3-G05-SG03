package Actividades;

import java.sql.*;
import java.util.Scanner;

public class Act_a {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/actividad1";
        String usuario = "root";
        String contraseña = "";

        try (Connection conexion = DriverManager.getConnection(url, usuario, contraseña)) {
            // Insertar Registro
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese el nombre:");
            String nombre = scanner.nextLine();
            System.out.println("Ingrese la edad:");
            int edad = scanner.nextInt();
            insertarRegistro(conexion, nombre, edad);

            // Recuperar registros
            recuperarRegistros(conexion);
            
            // Actualizar registro
            System.out.println("Ingrese el ID del registro que desea actualizar: ");
            int id = scanner.nextInt();
            System.out.println("Ingrese el Nuevo nombre: ");
            String modiNombre = scanner.nextLine();
            System.out.println("Ingrese la nueva Edad: ");
            int modiEdad = scanner.nextInt();
            actualizarRegistro(conexion,id,modiNombre,modiEdad);
            
            // Recuperar registros
            recuperarRegistros(conexion);

            // Prompt user to delete a record
            System.out.println("Ingrese el ID del registro que desea borrar:");
            int idToDelete = scanner.nextInt();
            borrarRegistro(conexion, idToDelete);
            
            // Recuperar registros
            recuperarRegistros(conexion);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void insertarRegistro(Connection conexion, String nombre, int edad) throws SQLException {
        String sql = "INSERT INTO actividad (nombre, edad) VALUES (?, ?)";
        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setString(1, nombre);
            statement.setInt(2, edad);
            statement.executeUpdate();
            System.out.println("Registro insertado con éxito.");
        }
    }

    private static void recuperarRegistros(Connection conexion) throws SQLException {
        String sql = "SELECT * FROM actividad";
        try (Statement statement = conexion.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                System.out.println("ID: " + resultSet.getInt("id") +
                        ", Nombre: " + resultSet.getString("nombre") +
                        ", Edad: " + resultSet.getInt("edad"));
            }
        }
    }

    private static void actualizarRegistro(Connection conexion, int id, String nuevoNombre, int nuevaEdad) throws SQLException {
        String sql = "UPDATE actividad SET nombre=?, edad=? WHERE id=?";
        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setString(1, nuevoNombre);
            statement.setInt(2, nuevaEdad);
            statement.setInt(3, id);
            statement.executeUpdate();
            System.out.println("Registro actualizado con éxito.");
        }
    }

    private static void borrarRegistro(Connection conexion, int id) throws SQLException {
        String sql = "DELETE FROM actividad WHERE id=?";
        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setInt(1, id);
            statement.executeUpdate();
            System.out.println("Registro borrado con éxito.");
        }
    }
}
