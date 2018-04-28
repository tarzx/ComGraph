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
public class Flower extends JPanel {

    int r = 50, x=100, y=100, dgg=60;
    int[] dg = new int[6];
    double xr, yr, degree = Math.PI/3;
    double[] an = new double[6];
    Area flower = new Area();
    Area[] ae = new Area[8];
    
    public Flower() {
        for (int i=0;i<6;i++) {
            an[i] = degree*i;
            dg[i] = dgg;
            dgg -= 60;
        }
        
        for(int k=0;k<6;k++) {
            xr = x+r*Math.cos(an[k])+r*Math.cos(an[(k+2)%6]);
            yr = y+r*Math.sin(an[k])+r*Math.sin(an[(k+2)%6]);
            ae[k] = new Area(new Arc2D.Double(xr,yr,2*r,2*r,dg[k],120,Arc2D.CHORD));
        }
        ae[6] = new Area(ae[0]);
        ae[7] = new Area(ae[1]);
        
        for(int j=0;j<6;j++) {
            ae[j].intersect(ae[j+2]);
            flower.add(ae[j]);
        }
    }
    
    public void init() {
    }
    
    public Graphics2D draw(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        g2.fill(flower);
        
        return g2;
    }
}
