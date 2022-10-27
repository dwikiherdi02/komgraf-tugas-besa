
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;


/**
 *
 * @author Dwiki
 */
public class Nomor_1 extends JPanel {
    
    protected void paintComponent(Graphics g) {
       super.paintComponent(g);       
       
       int[] x1 = { 50, 100, 100, 50, 50, 100};
       int[] y1 = { 50, 100, 100, 100, 100, 50};
       g.setColor(Color.BLACK);
       g.fillPolygon(x1, y1, 6);
       g.setColor(Color.BLACK);
       g.drawPolygon(x1, y1, 6);

       int[] a1 = { 120, 125, 125, 130 };
       int[] b1 = { 80, 70, 70, 80 };
       g.setColor(Color.BLACK);
       g.fillPolygon(a1, b1, 4);
       g.drawLine(125, 80, 125, 90);

       int[] x2 = { 150, 200, 200, 150, 150, 200};
       int[] y2 = { 50, 100, 100, 100, 100, 50};
       g.setColor(Color.WHITE);
       g.fillPolygon(x2, y2, 6);
       g.setColor(Color.BLACK);
       g.drawPolygon(x2, y2, 6);
       
       
       int[] a2 = { 220, 225, 225, 230 };
       int[] b2 = { 80, 70, 70, 80 };
       g.setColor(Color.BLACK);
       g.fillPolygon(a2, b2, 4);
       g.drawLine(225, 80, 225, 90);
       
       int[] x3 = { 250, 300, 300, 250, 250, 300};
       int[] y3 = { 50, 100, 100, 100, 100, 50};
       g.setColor(Color.BLACK);
       g.fillPolygon(x3, y3, 6);
       g.setColor(Color.BLACK);
       g.drawPolygon(x3, y3, 6);
       
       g.setColor(Color.BLACK);
       g.drawRoundRect(25, 25, 300, 100, 20, 20);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("201943500183 - Nomor 1");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBackground(Color.white);
        frame.setSize(360, 200);
        
        Nomor_1 panel = new Nomor_1();
        
        frame.add(panel);
        
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
