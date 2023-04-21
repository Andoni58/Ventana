import javax.swing.*;
import java.awt.*;

class RoundedPanel extends JPanel {

    public RoundedPanel() {
        super();
        setOpaque(false);
    }
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth()-1, getHeight()-1, 20, 20);
    }
}