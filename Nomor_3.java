
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;


/**
 *
 * @author Dwiki
 */
public class Nomor_3 extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int r=30, e=45, h=65, t=33; 

        for(int i=0; i<56; i++) {   
            t=i%4;

            g.drawRect(r,e+t*h,43,56);                

            g.drawOval(183,135,65,65);                

            g.drawLine(73,e+t*h,216,166);             

            g.drawLine(73,e+56+t*h,216,166); 

        } 
    }
    
    public static void main(String[] args) {
        JFrame f = new JFrame();

        f.getContentPane().add(new Nomor_3()); 

        f.setSize(500,500); 
        
        f.setLocationRelativeTo(null);
        
        f.setVisible(true); 
    }
}
