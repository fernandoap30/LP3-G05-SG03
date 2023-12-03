package Ejercicio1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class MySQLApp {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/actividad1";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    private JFrame frame;
    private JTextField sqlField;
    private JTextField filterField;
    private JTable resultTable;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MySQLApp().createAndShowGUI());
    }

    private void createAndShowGUI() {
        frame = new JFrame("SQL Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        sqlField = new JTextField();
        filterField = new JTextField();
        resultTable = new JTable();

        JButton executeButton = new JButton("Ejecutar");
        executeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                executeSQL();
            }
        });

        JPanel panel = new JPanel(new GridLayout(4, 2));
        panel.add(new JLabel("Sentencia SQL:"));
        panel.add(sqlField);
        panel.add(new JLabel("Filtro"));
        panel.add(filterField);
        panel.add(executeButton);

        frame.getContentPane().setLayout(new BorderLayout());
        frame.getContentPane().add(panel, BorderLayout.NORTH);
        frame.getContentPane().add(new JScrollPane(resultTable), BorderLayout.CENTER);

        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void executeSQL() {
        String sqlStatement = sqlField.getText();
        String filterValue = filterField.getText();

        try (Connection connection = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
             Statement statement = connection.createStatement()) {

            if (!filterValue.isEmpty()) {
                sqlStatement += " WHERE " + filterValue;
            }

            if (sqlStatement.toUpperCase().startsWith("SELECT")) {
                ResultSet resultSet = statement.executeQuery(sqlStatement);
                resultTable.setModel(buildTableModel(resultSet));
            } else {
                int rowCount = statement.executeUpdate(sqlStatement);
                JOptionPane.showMessageDialog(frame, rowCount + " rows affected.");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(frame, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
    
    private DefaultTableModel buildTableModel(ResultSet resultSet) throws SQLException {
        ResultSetMetaData metaData = resultSet.getMetaData();

        // Nombres de columnas
        int columnCount = metaData.getColumnCount();
        String[] columnNames = new String[columnCount];
        for (int i = 1; i <= columnCount; i++) {
            columnNames[i - 1] = metaData.getColumnName(i);
        }

        // Datos de la tabla
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);
        while (resultSet.next()) {
            Object[] rowData = new Object[columnCount];
            for (int i = 1; i <= columnCount; i++) {
                rowData[i - 1] = resultSet.getObject(i);
            }
            tableModel.addRow(rowData);
        }

        return tableModel;
    }
}
