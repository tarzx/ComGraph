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
public class Yim extends JPanel {
    
    GeneralPath yimface = new GeneralPath(GeneralPath.WIND_EVEN_ODD); // Face
    GeneralPath yimface2 = new GeneralPath(GeneralPath.WIND_EVEN_ODD); // Face2
    GeneralPath yimhair = new GeneralPath(GeneralPath.WIND_EVEN_ODD); // Hair
    GeneralPath yimhairup = new GeneralPath(GeneralPath.WIND_EVEN_ODD); // Hair up;
    GeneralPath yimhairback = new GeneralPath(GeneralPath.WIND_EVEN_ODD); // Hair back;
    GeneralPath yimeyelash = new GeneralPath(GeneralPath.WIND_EVEN_ODD); // Eyelash
    GeneralPath yimeyebrown = new GeneralPath(GeneralPath.WIND_EVEN_ODD); // Eyebrown
    GeneralPath yimeyeballleft = new GeneralPath(GeneralPath.WIND_EVEN_ODD); // Eyeball Left
    GeneralPath yimeyeballright = new GeneralPath(GeneralPath.WIND_EVEN_ODD); // Eyeball Right
    GeneralPath yimmouth = new GeneralPath(GeneralPath.WIND_EVEN_ODD); // Mouth
    Rectangle2D.Double file; // file
    GradientPaint gp = new GradientPaint(30,100,Color.YELLOW,70,100,Color.ORANGE,true); // file
    
    BasicStroke s = new BasicStroke(1.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND, 2.0f,new float[]{4.0f,6.0f},0.0f);
    BasicStroke def = new BasicStroke();
    
    Area a;
    Uniform yu = new Uniform();
    Arm ar = new Arm();
    Face yf = new Face();
    
    public Yim() {

        /*--------Yim Face-----------*/
        yimface.moveTo(3.0,100.0);
        yimface.quadTo(3.0,154.625,50.5,154.625);
        yimface.quadTo(98.0,154.625,98.0,100.0);
        yimface.quadTo(98.0,66.75,98.0,90.5);
        yimface.quadTo(88.5,76.25,79.0,69.125);
        yimface.quadTo(3.0,119.0,3.0,81.0);
        yimface.closePath();
          
        yimface2.moveTo(3.0,100.0);
        yimface2.quadTo(3.0,154.625,50.5,154.625);
        yimface2.quadTo(98.0,154.625,98.0,100.0);
        yimface2.quadTo(98.0,66.75,98.0,90.5);
        yimface2.quadTo(98.0,52.5,50.5,52.5);
        yimface2.quadTo(3.0,52.5,3.0,90.5);
        yimface2.closePath();
        
        a = new Area(yimface2);
        
        /*--------Yim Hair-----------*/
        yimhair.moveTo(79.0,62.0);
        yimhair.quadTo(45.75,90.5,7.75,102.375);
        yimhair.quadTo(3.0,116.625,8.7,133.25);
        yimhair.quadTo(-6.5,116.625,-6.5,85.75);
        yimhair.quadTo(26.75,31.125,71.875,47.75);
        yimhair.quadTo(131.25,78.625,90.875,140.375);
        yimhair.quadTo(107.5,88.125,79.0,62.0);
        yimhair.closePath();
        
        a.add(new Area(yimhair));
        
        /*--------Yim Hairup-----------*/
        yimhairup.moveTo(83.75,28.75);
        yimhairup.quadTo(79.0,12.125,52.875,9.75);
        yimhairup.quadTo(-6.5,9.75,-13.625,78.625);
        yimhairup.quadTo(-20.75,133.25,7.75,168.875);
        yimhairup.quadTo(3.0,154.625,5.375,147.5);
        yimhairup.quadTo(7.75,157.0,14.875,171.25);
        yimhairup.quadTo(14.875,130.875,48.125,138.0);
        yimhairup.quadTo(79.0,133.25,79.0,171.25);
        yimhairup.quadTo(86.125,159.375,88.5,152.25);
        yimhairup.quadTo(86.125,159.375,83.75,171.25);
        yimhairup.quadTo(121.75,128.5,117.0,85.75);
        yimhairup.quadTo(117.0,62.0,107.5,43.0);
        yimhairup.quadTo(100.375,26.375,83.75,28.75);
        yimhairup.closePath();
        
        a.add(new Area(yimhairup));
        
        /*--------Yim Hairback-----------*/
        yimhairback.moveTo(48.125,138.0);
        yimhairback.quadTo(7.75,157.0,14.875,130.875);
        yimhairback.quadTo(7.75,157.0,14.875,171.25);
        yimhairback.quadTo(14.875,166.5,48.125,166.5);
        yimhairback.quadTo(79.0,166.5,79.0,171.25);
        yimhairback.quadTo(79.0,166.5,79.0,133.25);
        yimhairback.quadTo(86.125,159.375,48.125,138.0);
        yimhairback.closePath();
        
        a.add(new Area(yimhairback));
        
        /*--------Yim Eyelash-----------*/
        yimeyelash.moveTo(12,100);
        yimeyelash.quadTo(22,96,31,100);
        yimeyelash.moveTo(69,100);
        yimeyelash.quadTo(79,96,88,100);
        
        /*--------Yim Eyebrown-----------*/
        yimeyebrown.moveTo(14,91);
        yimeyebrown.quadTo(24,86,33,91);
        yimeyebrown.moveTo(69,91);
        yimeyebrown.quadTo(79,86,88,91);
        
        /*--------Yim Eyeball-----------*/
        yimeyeballleft.moveTo(24.375,98.1);
        yimeyeballleft.quadTo(26.75,114.25,31.5,100.0);
        yimeyeballleft.quadTo(29.125,98.575,24.375,98.1);
        yimeyeballleft.closePath();

        yimeyeballright.moveTo(76.625,98.1);
        yimeyeballright.quadTo(74.25,114.25,69.5,100.0);
        yimeyeballright.quadTo(71.875,98.575,76.625,98.1);
        yimeyeballright.closePath();
        
        /*--------Yim Mouth-----------*/
        yimmouth.moveTo(43.375,132.3);
        yimmouth.quadTo(47.175,138.0,52.875,132.3);
        
        /*--------Yim File-----------*/
        file = new Rectangle2D.Double(10,220,80,80);
        
    }
    
    public void init() {
    }
    
    public Graphics2D draw(Graphics g,int te,int e,int m,int em,int armR,int armL,int w,boolean ia) {
        Graphics2D g2 = (Graphics2D)g;
        
        /*--------Yim Hair-----------*/
        g2.setColor(Color.BLACK);
        g2.fill(yimhairback);
            /*--------Yim Body-----------*/
            g2.translate(0,150);
            g2.scale(0.5,0.32);
            if(armR!=5&&armL!=5) g2 = ar.drawJ(g2);
            g2 = yu.drawN(g2);
            g2 = yu.draw(g2);

                /*----------Yim Leg---------*/
                ar.drawLL(g2,Color.BLACK);
                ar.drawLR(g2,Color.BLACK);
                
            if(ia) {
                g2.scale(2,3.125);                
                g2.translate(0,-150);

                    /*----------Yim File-----------*/
                    g2.setPaint(gp);
                    g2.fill(file);
                    g2.setColor(Color.BLACK);
                    g2.draw(file);

                g2.translate(0,150);
                g2.scale(0.5,0.32);
            }

                /*---------Yim Arm-----------*/
                g2 = ar.drawAR(g2,armR,w);
                g2 = ar.drawAL(g2,armL,w);

            g2.scale(2,3.125);                
            g2.translate(0,-150);

        g2.fill(yimhairup);
        
            /*--------Yim Face-----------*/
            g2.setColor(new Color(255,192,130));
            g2.fill(yimface2);
            g2.setColor(new Color(255,248,210));
            g2.fill(yimface);
            
            g2.setColor(Color.BLACK);
            g2.draw(yimface2);
             
            /*--------Yim Eye-----------*/
            if (e==0) {
                g2.setColor(Color.BLACK);
                g2.draw(yimeyelash);
                
                g2.setStroke(s);
                g2.draw(yimeyebrown);
                g2.setStroke(def);
                
                g2.fill(yimeyeballleft);
                g2.fill(yimeyeballright);
            }
            else g2 = yf.drawE(g2,e);

            /*--------Tar Mouth-----------*/
            if (m==0) {
                g2.draw(yimmouth);
            }
            else g2 = yf.drawM(g2,m);
            
        g2.fill(yimhair);
        g2 = yf.drawEM(g2,em);
        
        return g2;
    }
    
    public Graphics2D fill(Graphics g,int armR,int armL,int w) {
        Graphics2D g2 = (Graphics2D)g;
        
        g2.fill(a);
        g2.translate(0,150);
        g2.scale(0.5,0.32);
        if(armR!=5&&armL!=5) g2 = ar.fillJ(g2);
        g2 = yu.fill(g2);
        g2 = ar.fillL(g2);
        g2 = ar.fillA(g2,armR,armL,w);
        g2.scale(2,3.125);
        g2.translate(0,-150);
        
        return g2;
    }
    
}
