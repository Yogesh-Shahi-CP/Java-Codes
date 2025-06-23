import javax.swing.*;
import java.awt.*;

public class FaceDrawing extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Face outline
        g.drawRect(50, 50, 200, 200);

        // Eyes
        g.drawOval(90, 100, 30, 20);
        g.fillOval(100, 105, 10, 10);
        g.drawOval(180, 100, 30, 20);
        g.fillOval(190, 105, 10, 10);

        // Nose
        g.drawLine(150, 120, 150, 160);

        // Mouth
        g.drawOval(110, 170, 80, 20);

        // Ears
        g.drawRect(40, 110, 10, 40);
        g.drawRect(250, 110, 10, 40);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Face Drawing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(320, 320);
        frame.add(new FaceDrawing());
        frame.setVisible(true);
    }
}
