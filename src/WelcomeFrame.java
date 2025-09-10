import javax.swing.*;
import java.awt.*;

public class WelcomeFrame extends JFrame {
    public WelcomeFrame() {
        setTitle("Bienvenid@");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(420, 200);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(228, 87, 87)); // color de fondo

        JButton btn = new JButton("Mostrar saludo");
        btn.setPreferredSize(new Dimension(160, 40));
        btn.setFocusPainted(false);

        btn.addActionListener(e -> {
            String name = GreetingService.askName(this);
            if (name == null) return; // canceló
            String message = GreetingService.buildGreeting(name);
            JOptionPane.showMessageDialog(this, message);
        });

        panel.add(btn);
        this.add(panel);
    }

    // Cargar icono desde el classpath (coloca icon.png en src/resources o mismo folder)
    public void setAppIcon(String resourcePath) {
        try {
            java.net.URL imgUrl = getClass().getResource(resourcePath);
            if (imgUrl != null) {
                Image img = Toolkit.getDefaultToolkit().getImage(imgUrl);
                setIconImage(img);
            } else {
                System.err.println("Icono no encontrado en: " + resourcePath);
            }
        } catch (Exception ex) {
            System.err.println("Error cargando icono: " + ex.getMessage());
        }
    }
}