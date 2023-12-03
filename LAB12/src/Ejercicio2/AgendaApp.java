package Ejercicio2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class AgendaApp {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/actividad1";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    private JFrame frame;
    private JTextField nombreField, apellidoField, emailField, telefonoField, apellidoBuscarField;
    private JButton buscarButton, insertarButton, siguienteButton, anteriorButton;
    private ResultSet resultSet;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new AgendaApp().createAndShowGUI());
    }

    private void createAndShowGUI() {
        frame = new JFrame("Agenda App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Campos relacionados con la tabla
        nombreField = new JTextField(20);
        apellidoField = new JTextField(20);
        emailField = new JTextField(20);
        telefonoField = new JTextField(20);

        // Sección de búsqueda por apellido
        apellidoBuscarField = new JTextField(20);
        buscarButton = new JButton("Buscar por Apellido");
        buscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buscarPorApellido();
            }
        });

        // Botones de inserción y navegación
        insertarButton = new JButton("Insertar Entrada");
        insertarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                insertarRegistro();
            }
        });

        siguienteButton = new JButton("Siguiente Entrada");
        siguienteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarSiguienteRegistro();
            }
        });

        anteriorButton = new JButton("Anterior Entrada");
        anteriorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarRegistroAnterior();
            }
        });

        JPanel panelDatos = new JPanel(new GridLayout(4, 2));
        panelDatos.add(new JLabel("Nombre:"));
        panelDatos.add(nombreField);
        panelDatos.add(new JLabel("Apellido:"));
        panelDatos.add(apellidoField);
        panelDatos.add(new JLabel("Email:"));
        panelDatos.add(emailField);
        panelDatos.add(new JLabel("Teléfono:"));
        panelDatos.add(telefonoField);

        JPanel panelBuscar = new JPanel(new GridLayout(2, 2));
        panelBuscar.add(new JLabel("Buscar por Apellido:"));
        panelBuscar.add(apellidoBuscarField);
        panelBuscar.add(buscarButton);

        JPanel panelBotones = new JPanel(new GridLayout(1, 3));
        panelBotones.add(anteriorButton);
        panelBotones.add(insertarButton);
        panelBotones.add(siguienteButton);

        frame.getContentPane().setLayout(new BorderLayout());
        frame.getContentPane().add(panelDatos, BorderLayout.NORTH);
        frame.getContentPane().add(panelBuscar, BorderLayout.CENTER);
        frame.getContentPane().add(panelBotones, BorderLayout.SOUTH);

        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        conectarBaseDeDatos();
        mostrarSiguienteRegistro();
    }

    private void conectarBaseDeDatos() {
        try {
            Connection connection = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
            Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            resultSet = statement.executeQuery("SELECT * FROM Agenda");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void buscarPorApellido() {
        try {
            String apellidoABuscar = apellidoBuscarField.getText();
            String query = "SELECT * FROM Agenda WHERE Apellido LIKE '%" + apellidoABuscar + "%'";
            resultSet = resultSet.getStatement().executeQuery(query);

            if (resultSet.next()) {
                mostrarRegistroActual();
            } else {
                JOptionPane.showMessageDialog(frame, "No se encontraron registros con el apellido especificado.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void insertarRegistro() {
        try {
            resultSet.moveToInsertRow();
            resultSet.updateString("Nombre", nombreField.getText());
            resultSet.updateString("Apellido", apellidoField.getText());
            resultSet.updateString("Email", emailField.getText());
            resultSet.updateString("Telefono", telefonoField.getText());
            resultSet.insertRow();
            resultSet.moveToCurrentRow();
            JOptionPane.showMessageDialog(frame, "Registro insertado correctamente.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void mostrarRegistroActual() {
        try {
            nombreField.setText(resultSet.getString("Nombre"));
            apellidoField.setText(resultSet.getString("Apellido"));
            emailField.setText(resultSet.getString("Email"));
            telefonoField.setText(resultSet.getString("Telefono"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void mostrarSiguienteRegistro() {
        try {
            if (resultSet.next()) {
                mostrarRegistroActual();
            } else {
                JOptionPane.showMessageDialog(frame, "No hay más registros.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void mostrarRegistroAnterior() {
        try {
            if (resultSet.previous()) {
                mostrarRegistroActual();
            } else {
                JOptionPane.showMessageDialog(frame, "No hay registros anteriores.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
