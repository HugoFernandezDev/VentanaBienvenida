import javax.swing.*;
import java.awt.*;
import java.util.Locale;

public class GreetingService {

    public static String askName(Component parent) {
        while (true) {
            String prompt = getMessage("promptName");
            String name = JOptionPane.showInputDialog(parent, prompt);
            if (name == null) return null; // canceló
            name = name.trim();
            if (name.isEmpty()) {
                JOptionPane.showMessageDialog(parent, getMessage("nameEmpty"), getMessage("titleWarning"), JOptionPane.WARNING_MESSAGE);
                continue;
            }
            return name;
        }
    }

    public static String buildGreeting(String name) {
        Locale loc = Locale.getDefault();
        if (loc.getLanguage().equals(new Locale("es").getLanguage())) {
            return "¡Hola, " + name + "! ¡Buen trabajo!";
        } else {
            return "Hello, " + name + "! Good job!";
        }
    }

    private static String getMessage(String key) {
        Locale loc = Locale.getDefault();
        boolean es = loc.getLanguage().equals(new Locale("es").getLanguage());
        switch (key) {
            case "promptName": return es ? "Ingrese su nombre:" : "Enter your name:";
            case "nameEmpty": return es ? "El nombre no puede estar vacío." : "Name cannot be empty.";
            case "titleWarning": return es ? "Aviso" : "Warning";
            default: return "";
        }
    }
}