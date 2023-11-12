package Ejercicio2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class FileInfoViewer extends JFrame {

    private JTextArea infoTextArea;

    public FileInfoViewer(String fileName) {
        super("WordCount");
        infoTextArea = new JTextArea(getFileInfo(fileName));
        add(infoTextArea);
    }

    private String getFileInfo(String fileName) {
        StringBuilder fileInfo = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            fileInfo.append("Nombre del archivo: ").append(fileName).append("\n");

            int totalLines = 0;
            int totalWords = 0;
            int totalChars = 0;

            String line;
            while ((line = reader.readLine()) != null) {
                totalLines++;
                totalChars += line.length();

                String[] words = line.split("\\s+"); // Split por espacios en blanco
                for (String word : words) {
                    if (Character.isLetterOrDigit(word.charAt(0))) {
                        totalWords++;
                    }
                }
            }

            fileInfo.append("Total de líneas: ").append(totalLines).append("\n");
            fileInfo.append("Total de palabras: ").append(totalWords).append("\n");
            fileInfo.append("Total de caracteres: ").append(totalChars).append("\n");

        } catch (IOException e) {
            fileInfo.append("Error al leer el archivo: ").append(e.getMessage());
        }

        return fileInfo.toString();
    }

    public static void main(String[] args) {
        String filePath = "C:\\Users\\DELL\\Desktop\\lear.txt";

        FileInfoViewer viewer = new FileInfoViewer(filePath);
        viewer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        viewer.setSize(400, 150);
        viewer.setVisible(true);
    }
}
