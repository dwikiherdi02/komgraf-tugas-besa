
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;


/**
 *
 * @author Dwiki
 */
public class Nomor_1_alternative extends JPanel {
    
    int size = 50;

    public Nomor_1_alternative() {
    }
    
    public Nomor_1_alternative(int size) {
       this.size = size;
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int j, k;
        int r = 0, s = 0;
        j = k = this.size;
        for (int i = 0; i < 3; i++) {
            int l = j;
            
            j = j + (k*2);
            
            if(i%2 == 0) {
                g.setColor(Color.BLACK);
            } else {
                g.setColor(Color.WHITE);
            }
            
            r = l+k;
            s = k*2;
            int[] x = { l, r, r, l, l, r};
            int[] y = { k, s, s, s, s, k};
            
            g.fillPolygon(x, y, 6);
            
            g.setColor(Color.BLACK);
            g.drawPolygon(x, y, 6);
            
            if((i+1) != 3) {
                g.setColor(Color.BLACK);
                int m = ((l+k) + ((j - (l+k)) / 2)) - 5;
                int n = k / 10;
                int o = k + (((k*2) - k) / 2);
                int[] a = { m, m+n, m+n, m+(n*2) };
                int[] b = { o, o-10, o-10, o };
                g.fillPolygon(a, b, 4);
                g.drawLine(m+n, o, m+n, o+10);
            }
        }
        g.setColor(Color.BLACK);
        g.drawRoundRect((k/2), (k/2), r, s, 20, 20);
    } 

    public static void main(String[] args) {
        JFrame frame = new JFrame("201943500183 - Nomor 1");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBackground(Color.white);
        frame.setSize(360, 200);
        
        Nomor_1_alternative panel = new Nomor_1_alternative(50);
        
        frame.add(panel);
        
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
