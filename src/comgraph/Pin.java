/*
 * Tar.java
 *
 * Created on 6 �ѹ��¹ 2550, 17:29 �.
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package comgraph;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
/**
 *
 * @author Administrator
 */
public class Pin extends JPanel {
    
    GeneralPath pinface = new GeneralPath(GeneralPath.WIND_EVEN_ODD); // Face
    GeneralPath pinface2 = new GeneralPath(GeneralPath.WIND_EVEN_ODD); // Face2
    GeneralPath pinhair = new GeneralPath(GeneralPath.WIND_EVEN_ODD); // Hair
    GeneralPath pinhairup = new GeneralPath(GeneralPath.WIND_EVEN_ODD); // Hair up;
    GeneralPath pineyelash = new GeneralPath(GeneralPath.WIND_EVEN_ODD); // Eyelash
    GeneralPath pineyebrown = new GeneralPath(GeneralPath.WIND_EVEN_ODD); // Eyebrown
    GeneralPath pinmouth = new GeneralPath(GeneralPath.WIND_EVEN_ODD); // Mouth
    GeneralPath pintongue = new GeneralPath(GeneralPath.WIND_EVEN_ODD); // Tongue
    Ellipse2D.Double e1,e2,e3,e4; // Eyeball
    Area a;
    Uniform pu = new Uniform(); 
    Arm ar = new Arm();
    Face pf = new Face();
    
    public Pin() {

        /*--------Pin Face-----------*/
        pinface.moveTo(46.525,65.2);
        pinface.quadTo(45.25,73.03,48.65,81.73);
        pinface.quadTo(41.0,80.425,39.725,67.375);
        pinface.quadTo(33.35,74.335,32.5,93.475);
        pinface.quadTo(27.4,79.99,28.25,73.9);
        pinface.quadTo(18.9,76.51,22.725,95.65);
        pinface.quadTo(14.225,87.82,14.225,82.6);
        pinface.quadTo(11.675,86.08,7.0,100.0);
        pinface.quadTo(7.0,139.15,36.75,152.2);
        pinface.quadTo(49.5,160.9,62.25,152.2);
        pinface.quadTo(92.0,139.15,92.0,100.0);
        pinface.quadTo(92.0,97.39,87.75,78.25);
        pinface.quadTo(86.475,74.335,84.775,73.9);
        pinface.quadTo(82.65,74.335,84.775,82.6);
        pinface.quadTo(77.55,73.9,75.85,69.55);
        pinface.quadTo(77.125,66.94,71.6,86.95);
        pinface.quadTo(69.475,66.94,60.975,65.2);
        pinface.quadTo(52.475,68.245,57.15,86.95);
        pinface.quadTo(49.925,73.9,46.525,69.55);
        pinface.closePath();
          
        pinface2.moveTo(7.0,100.0);
        pinface2.quadTo(7.0,139.15,36.75,152.2);
        pinface2.quadTo(49.5,160.9,62.25,152.2);
        pinface2.quadTo(92.0,139.15,92.0,100.0);
        pinface2.quadTo(92.0,56.5,49.5,56.5);
        pinface2.quadTo(7.0,56.5,7.0,100.0);
        pinface2.closePath();
        
        a = new Area(pinface2);
        
        /*--------Pin Hair-----------*/
        pinhair.moveTo(46.525,65.2);
        pinhair.quadTo(45.25,73.03,48.65,81.73);
        pinhair.quadTo(41.0,73.03,39.725,63.895);
        pinhair.quadTo(33.35,74.335,32.5,89.125);
        pinhair.quadTo(27.4,79.99,28.25,69.55);
        pinhair.quadTo(18.9,76.51,20.6,92.17);
        pinhair.quadTo(14.225,87.82,14.225,77.815);
        pinhair.quadTo(7.425,86.08,7.0,98.695);
        pinhair.quadTo(8.275,121.75,19.75,140.455);
        pinhair.quadTo(3.175,121.75,-0.225,103.045);
        pinhair.quadTo(4.45,65.2,29.1,48.67);
        pinhair.quadTo(55.875,44.755,80.525,54.325);
        pinhair.quadTo(96.25,73.9,94.125,106.09);
        pinhair.quadTo(86.9,130.45,85.625,134.8);
        pinhair.quadTo(92.0,97.39,87.75,78.25);
        pinhair.quadTo(86.475,74.335,84.775,71.725);
        pinhair.quadTo(82.65,74.335,84.775,78.25);
        pinhair.quadTo(77.55,73.9,75.85,64.765);
        pinhair.quadTo(77.125,66.94,71.6,82.6);
        pinhair.quadTo(69.475,66.94,60.975,62.59);
        pinhair.quadTo(52.475,68.245,57.15,82.6);
        pinhair.quadTo(49.925,73.9,46.525,65.2);
        pinhair.closePath();
        
        a.add(new Area(pinhair));
        
        /*--------Pin Hairup-----------*/
        pinhairup.moveTo(49.5,17.32);
        pinhairup.quadTo(60.975,18.49,61.825,25.9);
        pinhairup.quadTo(27.825,12.25,1.05,37.99);
        pinhairup.quadTo(9.125,33.7,13.375,34.09);
        pinhairup.quadTo(-6.6,49.69,-7.45,78.16);
        pinhairup.quadTo(-10.425,89.47,-3.2,102.73);
        pinhairup.quadTo(-1.5,121.45,13.8,133.15);
        pinhairup.quadTo(4.875,122.62,4.45,117.55);
        pinhairup.quadTo(8.275,128.47,21.875,137.44);
        pinhairup.quadTo(53.75,122.23,88.175,117.55);
        pinhairup.quadTo(93.7,121.84,89.875,129.25);
        pinhairup.quadTo(106.875,101.95,102.625,79.33);
        pinhairup.quadTo(99.65,30.58,76.7,35.65);
        pinhairup.quadTo(76.275,25.9,87.75,35.26);
        pinhairup.quadTo(76.275,22.0,69.9,31.75);
        pinhairup.quadTo(65.225,14.98,49.5,17.32);
        pinhairup.closePath();
        
        a.add(new Area(pinhairup));
        
        /*--------Pin Eyelash-----------*/
        pineyelash.moveTo(27,99);
        pineyelash.quadTo(24,99,24,97);
        pineyelash.moveTo(30,99);
        pineyelash.quadTo(28,99,27,95);
        pineyelash.moveTo(71,99);
        pineyelash.quadTo(74,99,74,97);
        pineyelash.moveTo(69,99);
        pineyelash.quadTo(71,99,71,95);
        
        /*--------Pin Eyebrown-----------*/
        pineyebrown.moveTo(19,92);
        pineyebrown.quadTo(28,87,36,92);
        pineyebrown.moveTo(64,92);
        pineyebrown.quadTo(75,87,81,92);
        
        /*--------Pin Eyeball-----------*/
        e1 = new Ellipse2D.Double(26,98,6,8);
        e2 = new Ellipse2D.Double(65,98,6,8);

        e3 = new Ellipse2D.Double(26,100,2,3);
        e4 = new Ellipse2D.Double(65,100,2,3);
        
        /*--------Pin Mouth-----------*/
        pinmouth.moveTo(41.0,126.1);
        pinmouth.quadTo(49.5,139.15,58.0,126.1);
        pinmouth.closePath();
        
        /*--------Pin Tongue-----------*/
        pintongue.moveTo(42.4,129.58);
        pintongue.quadTo(47.5,134.8,53.025,129.58);
        pintongue.quadTo(47.5,127.405,42.4,129.58);
        
    }
    
    public void init() {
    }
    
    public Graphics2D draw(Graphics g,int te,int e,int m,int em,int armR,int armL,int w) {
        Graphics2D g2 = (Graphics2D)g;
        
        /*--------Pin Body-----------*/
        g2.translate(0,150);
        g2.scale(0.5,0.32);
        if(armR!=5&&armL!=5) g2 = ar.drawJ(g2);
        g2 = pu.drawN(g2);
        g2 = pu.draw(g2);
        
            /*----------Pin Leg---------*/
            ar.drawLL(g2,new Color(128,100,0));
            ar.drawLR(g2,new Color(128,100,0));
        
            /*---------Pin Arm-----------*/
            g2 = ar.drawAR(g2,armR,w);
            g2 = ar.drawAL(g2,armL,w);
        
        g2.scale(2,3.125);                
        g2.translate(0,-150);
        
        /*--------Pin Hair-----------*/
        g2.setColor(new Color(64,0,0));
        g2.fill(pinhairup);
        g2.setColor(Color.BLACK);
        g2.draw(pinhairup);
        
            /*--------Pin Face-----------*/
            g2.setColor(new Color(255,192,130));
            g2.fill(pinface2);
            g2.setColor(new Color(255,248,210));
            g2.fill(pinface);
            
            g2.setColor(Color.BLACK);
            g2.draw(pinface2);
             
            /*--------Pin Eye-----------*/
            if (e==0) {
                g2.setColor(Color.BLACK);
                g2.draw(pineyelash);
                g2.draw(pineyebrown);
                g2.fill(e1);
                g2.fill(e2);
                g2.setColor(new Color(255,248,210));
                g2.fill(e3);
                g2.fill(e4);
            }
            else g2 = pf.drawE(g2,e);

            /*--------Tar Mouth-----------*/
            if (m==0) {
                g2.setColor(new Color(249,153,125));
                g2.fill(pinmouth);
                g2.setColor(Color.BLACK);
                g2.draw(pinmouth);
                g2.setColor(new Color(255,102,179));
                //g2.fill(pintongue);
            }
            else g2 = pf.drawM(g2,m);
            
        g2.setColor(new Color(64,0,0));
        g2.fill(pinhair);
        g2 = pf.drawEM(g2,em);
        
        return g2;
    }
    
    public Graphics2D fill(Graphics g,int armR,int armL,int w) {
        Graphics2D g2 = (Graphics2D)g;
        
        g2.fill(a);
        g2.translate(0,150);
        g2.scale(0.5,0.32);
        if(armR!=5&&armL!=5) g2 = ar.fillJ(g2);
        g2 = pu.fill(g2);
        g2 = ar.fillL(g2);
        g2 = ar.fillA(g2,armR,armL,w);
        g2.scale(2,3.125);
        g2.translate(0,-150);
        
        return g2;
    }
    
}
