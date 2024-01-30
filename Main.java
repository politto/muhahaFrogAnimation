import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;

public class Main extends JPanel implements Runnable {
    public static void main(String[] args) {
        Main m = new Main();

        JFrame f = new JFrame();
        f.add(m);
        f.setTitle("Muhaha_frog_65050101_65050301");
        m.setPreferredSize(new Dimension(600, 600));
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setVisible(true);
        f.setLocationRelativeTo(null);

        (new Thread(m)).start();

    }

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        // g2.drawRect(265, 265, 200, 200);
        g2.setTransform(new AffineTransform(1.5, 0, 0, 1.5, 200, 200));
        // g2.setTransform(new AffineTransform(0, -1, 1, 0, 0, 60));
        g2.drawRect(200, 200, 200, 200);
        // g2.drawRect(0, 0, 600, 600);
        // int[] xpoly = {0, 60, 30};
        // int[] ypoly = {0, 0, 30};
        // g2.drawPolygon(xpoly, ypoly, 3);
        // g2.drawRect(0, 0, 200, 200);
        // g2.setTransform(new AffineTransform(0.866, -0.5, 0.5, 0.866, -246.3,  167.4));
        g2.setTransform(new AffineTransform(0.866 * 1.5, -0.5, 0.5, 0.866 * 1.5, 115,  415));
        g2.drawRect(200, 200, 200, 200);
        g2.setTransform(new AffineTransform(0.866 * 3, -1, 1, 0.866 * 3, -244 - 50,  254 + 50));
        g2.drawRect(200, 200, 200, 200);




    }

    public void run () {
        double lastTime = System.currentTimeMillis();
        double currentTime, elapsedTime;
        double startTime = lastTime;

        while (true) {
            currentTime = System.currentTimeMillis();
            elapsedTime = currentTime - lastTime;
            lastTime = currentTime;

            repaint();
        }
    }

    void run1To3() {

    }

    void run3To5() {
        
    }


}