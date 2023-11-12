package Ejercicio1;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmpleadosApp extends JFrame {

    private static final String ARCHIVO_PATH = "empleados.txt";
    private final DefaultTableModel tableModel;

    public EmpleadosApp() {
        super("Gestión de Empleados");

        tableModel = new DefaultTableModel();
        tableModel.addColumn("Número");
        tableModel.addColumn("Nombre");
        tableModel.addColumn("Sueldo");

        JTable table = new JTable(tableModel);

        JScrollPane scrollPane = new JScrollPane(table);

        JButton reporteButton = new JButton("Reporte de Empleados");
        reporteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reporteEmpleados();
            }
        });

        JButton agregarButton = new JButton("Agregar Empleado");
        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarEmpleado();
            }
        });

        JPanel panelBotones = new JPanel();
        panelBotones.add(reporteButton);
        panelBotones.add(agregarButton);

        setLayout(new BorderLayout());
        add(scrollPane, BorderLayout.CENTER);
        add(panelBotones, BorderLayout.SOUTH);

        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void reporteEmpleados() {
        try {
            List<Empleado> empleados = new ArrayList<>();

            File archivo = new File(ARCHIVO_PATH);
            if (!archivo.exists()) {
                JOptionPane.showMessageDialog(this, "El archivo de empleados no existe.");
                return;
            }

            Scanner scanner = new Scanner(archivo);

            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                String[] campos = linea.split(",");

                Empleado empleado = new Empleado();
                empleado.setNumero(Integer.parseInt(campos[0]));
                empleado.setNombre(campos[1]);
                empleado.setSueldo(Double.parseDouble(campos[2]));

                empleados.add(empleado);
            }

            mostrarTabla(empleados);
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(this, "El archivo de empleados no existe.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al leer el archivo: " + e.getMessage());
        }
    }

    private void agregarEmpleado() {
        try {
            JTextField numeroField = new JTextField();
            JTextField nombreField = new JTextField();
            JTextField sueldoField = new JTextField();

            Object[] message = {
                    "Número:", numeroField,
                    "Nombre:", nombreField,
                    "Sueldo:", sueldoField
            };

            int option = JOptionPane.showConfirmDialog(this, message, "Agregar Empleado", JOptionPane.OK_CANCEL_OPTION);
            if (option == JOptionPane.OK_OPTION) {
                int numero = Integer.parseInt(numeroField.getText());
                String nombre = nombreField.getText();
                double sueldo = Double.parseDouble(sueldoField.getText());

                Empleado nuevoEmpleado = new Empleado();
                nuevoEmpleado.setNumero(numero);
                nuevoEmpleado.setNombre(nombre);
                nuevoEmpleado.setSueldo(sueldo);

                try (PrintWriter writer = new PrintWriter(new FileWriter(ARCHIVO_PATH, true))) {
                    writer.println(nuevoEmpleado.toCSV());
                }

                JOptionPane.showMessageDialog(this, "Empleado agregado con éxito.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al agregar empleado: " + e.getMessage());
        }
    }

    private void mostrarTabla(List<Empleado> empleados) {
        tableModel.setRowCount(0);

        for (Empleado empleado : empleados) {
            Object[] row = {empleado.getNumero(), empleado.getNombre(), empleado.getSueldo()};
            tableModel.addRow(row);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EmpleadosApp();
            }
        });
    }
}
