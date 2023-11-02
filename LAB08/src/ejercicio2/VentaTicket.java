package ejercicio2;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentaTicket extends JFrame implements ActionListener {

    private JTextField Nombre, Dni, FechaViaje;
    private JCheckBox audifonos, manta, revistas;
    private JRadioButton piso1, piso2;
    private JComboBox<String> origen, destino;
    private JList<String> calidadServicio;
    private DefaultListModel<String> modelocalidadservicio;
    
    public VentaTicket() {
        setTitle("Compra de Pasajes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 500);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new BorderLayout());

        JPanel formPanel = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(5, 5, 5, 5);

        formPanel.add(new JLabel("Nombre:"), c);
        Nombre = new JTextField(20);
        c.gridx = 1;
        formPanel.add(Nombre, c);

        c.gridy = 1;
        c.gridx = 0;
        formPanel.add(new JLabel("Documento de Identidad:"), c);
        c.gridx = 1;
        Dni = new JTextField(20);
        formPanel.add(Dni, c);

        c.gridy = 2;
        c.gridx = 0;
        formPanel.add(new JLabel("Fecha de Viaje:"), c);
        c.gridx = 1;
        FechaViaje = new JTextField(20);
        formPanel.add(FechaViaje, c);

        c.gridy = 3;
        c.gridx = 0;
        formPanel.add(new JLabel("Servicios adicionales:"), c);
        audifonos = new JCheckBox("Audifonos");
        manta = new JCheckBox("Manta");
        revistas = new JCheckBox("Revistas");
        c.gridx = 1;
        formPanel.add(audifonos, c);
        c.gridy = 4;
        formPanel.add(manta, c);
        c.gridy = 5;
        formPanel.add(revistas, c);

        c.gridy = 6;
        c.gridx = 0;
        formPanel.add(new JLabel("Piso:"), c);
        piso1 = new JRadioButton("Primer Piso");
        piso2 = new JRadioButton("Segundo Piso");
        ButtonGroup floorGroup = new ButtonGroup();
        floorGroup.add(piso1);
        floorGroup.add(piso2);
        JPanel floorPanel = new JPanel();
        floorPanel.add(piso1);
        floorPanel.add(piso2);
        c.gridx = 1;
        formPanel.add(floorPanel, c);

        c.gridy = 7;
        c.gridx = 0;
        formPanel.add(new JLabel("Lugar de Origen:"), c);
        c.gridx = 1;
        String[] origins = {"Arequipa", "Puno", "Tacna"};
        origen = new JComboBox<>(origins);
        formPanel.add(origen, c);

        c.gridy = 8;
        c.gridx = 0;
        formPanel.add(new JLabel("Lugar de Destino:"), c);
        c.gridx = 1;
        String[] destinations = {"Lima", "Loreto", "Cajamarca"};
        destino = new JComboBox<>(destinations);
        formPanel.add(destino, c);

        c.gridy = 9;
        c.gridx = 0;
        formPanel.add(new JLabel("Calidad de servicio:"), c);
        c.gridx = 1;
        modelocalidadservicio = new DefaultListModel<>();
        modelocalidadservicio.addElement("Económico");
        modelocalidadservicio.addElement("Standard");
        modelocalidadservicio.addElement("VIP");
        calidadServicio = new JList<>(modelocalidadservicio);
        calidadServicio.setVisibleRowCount(2);
        calidadServicio.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane serviceQualityScrollPane = new JScrollPane(calidadServicio);
        formPanel.add(serviceQualityScrollPane, c);

        panel.add(formPanel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel(new FlowLayout());
        JButton summaryButton = new JButton("Mostrar Resumen");
        summaryButton.addActionListener(this);
        buttonPanel.add(summaryButton);

        JButton resetButton = new JButton("Reiniciar");
        resetButton.addActionListener(e -> resetFields());
        buttonPanel.add(resetButton);

        panel.add(buttonPanel, BorderLayout.SOUTH);

        add(panel);
    }

    public void actionPerformed(ActionEvent e) {
    	StringBuilder summary = new StringBuilder();
        summary.append("Nombre: ").append(Nombre.getText()).append("\n");
        summary.append("Documento de Identidad: ").append(Dni.getText()).append("\n");
        summary.append("Fecha de Viaje: ").append(FechaViaje.getText()).append("\n");
        summary.append("Servicios adicionales: ");
        if (audifonos.isSelected()) {
            summary.append("Audifonos, ");
        }
        if (manta.isSelected()) {
            summary.append("Manta, ");
        }
        if (revistas.isSelected()) {
            summary.append("Revistas");
        }
        summary.append("\n");
        summary.append("Piso elegido: ").append(piso1.isSelected() ? "Primer Piso" : "Segundo Piso").append("\n");
        summary.append("Lugar de Origen: ").append(origen.getSelectedItem()).append("\n");
        summary.append("Lugar de Destino: ").append(destino.getSelectedItem()).append("\n");
        summary.append("Calidad de servicio: ").append(calidadServicio.getSelectedValue());

        JOptionPane.showMessageDialog(this, summary.toString(), "Resumen de Compra de Pasajes", JOptionPane.INFORMATION_MESSAGE);
    }

    private void resetFields() {
    	Nombre.setText("");
        Dni.setText("");
        FechaViaje.setText("");
        audifonos.setSelected(false);
        manta.setSelected(false);
        revistas.setSelected(false);
        piso1.setSelected(false);
        piso2.setSelected(false);
        origen.setSelectedIndex(0);
        destino.setSelectedIndex(0);
        calidadServicio.setSelectedIndex(0);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            VentaTicket app = new VentaTicket();
            app.setVisible(true);
        });
    }
}
