/*
 * Main.java
 *
 * Created on 4 ���Ҥ� 2550, 17:33 �.
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package comgraph;
import java.awt.*;
import java.awt.image.*;
import java.awt.geom.*;
import javax.swing.*;
/**
 *
 * @author Administrator
 */

public class bg extends JPanel {

    GradientPaint gp,gr;
    Rectangle2D.Double r;
    Ellipse2D.Double e;
    
    public bg() {
        r = new Rectangle2D.Double(50,50,600,300);
        e = new Ellipse2D.Double(400,80,300,300);
    }
    
    public void init() {
    }
    
    public Graphics2D draw(Graphics g, Color c1, Color c2,int a,Color c3) {
        Graphics2D g2 = (Graphics2D)g;
        gp = new GradientPaint(100,400,c1,100,600,c2,false);
        gr = new GradientPaint(100,200,c3,100,300,c1,false);
        g2.setPaint(gp);
        g2.fillRect(0,0,800,600);
        if(a==1) {
            g2.setColor(c3);
            g2.fill(r);
        }
        else if(a==2) {
            g2.setPaint(gr);
            g2.fill(e);
        }
        else;
        
        return g2;
    }
    
}
