
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Dwiki
 */
public class Nomor_2_b extends JPanel {
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        g.setColor(Color.RED);
        g.fillOval(195, 180, 150, 150);
        
        g.setColor(Color.GREEN);
        g.fillOval(125, 190, 150, 150);
        
        g.setColor(Color.BLUE);
        g.fillOval(125, 120, 150, 150);
        
        g.setColor(Color.YELLOW);
        g.fillOval(195, 120, 150, 150);
    }
    
    
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("201943500183 - Nomor 2.b");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBackground(Color.white);
        frame.setSize(500, 500);
        
        Nomor_2_b panel = new Nomor_2_b();
        
        frame.add(panel);
        
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
