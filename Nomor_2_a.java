
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;


/**
 *
 * @author Dwiki
 */
public class Nomor_2_a extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        g.setColor(Color.BLACK);
        int[] x = { 150, 250, 250, 250, 250, 150, 150, 310 };
        int[] y = { 250, 125, 125, 280, 280, 150, 150, 200 };
        g.drawPolygon(
            x, 
            y, 
            8
        );
    }
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("201943500183 - Nomor 2.a");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBackground(Color.white);
        frame.setSize(450, 500);
        
        Nomor_2_a panel = new Nomor_2_a();
        
        frame.add(panel);
        
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
