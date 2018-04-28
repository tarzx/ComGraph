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
public class Tar extends JPanel {
    
    GeneralPath tarface = new GeneralPath(GeneralPath.WIND_EVEN_ODD); // Face
    GeneralPath tarface2 = new GeneralPath(GeneralPath.WIND_EVEN_ODD); // Face2
    GeneralPath tarhair = new GeneralPath(GeneralPath.WIND_EVEN_ODD); // Hair
    GeneralPath tarhairup = new GeneralPath(GeneralPath.WIND_EVEN_ODD); // Hair up;
    GeneralPath tareyebrown = new GeneralPath(GeneralPath.WIND_EVEN_ODD); // Eyebrown
    GeneralPath tareyeballleft = new GeneralPath(GeneralPath.WIND_EVEN_ODD); // Eyeball right
    GeneralPath tareyeballright = new GeneralPath(GeneralPath.WIND_EVEN_ODD); // Eyeball left
    GeneralPath tarmouth = new GeneralPath(GeneralPath.WIND_EVEN_ODD); // Mouth
    Line2D.Double e1,e2; // Eyelash
    Area a;
    Uniform tu = new Uniform(); 
    Arm ar = new Arm();
    Hun th = new Hun();
    Face tf = new Face();
    
    public Tar() {

        /*--------Tar Face-----------*/
        tarface.moveTo(8.0,95.0);
        tarface.quadTo(35.625,95.0,46.25,66.5);
        tarface.quadTo(44.975,84.55,23.725,113.05);
        tarface.quadTo(54.75,92.625,68.775,66.5);
        tarface.quadTo(88.75,87.875,87.475,126.35);
        tarface.quadTo(78.975,144.875,63.25,152.0);
        tarface.quadTo(50.5,159.125,37.75,152.0);
        tarface.quadTo(8.0,137.75,8.0,95.0);
        tarface.closePath();
          
        tarface2.moveTo(8.0,95.0);
        tarface2.quadTo(8.0,137.75,37.75,152.0);
        tarface2.quadTo(50.5,159.125,63.25,152.0);
        tarface2.quadTo(93.0,137.75,93.0,95.0);
        tarface2.quadTo(93.0,47.5,50.5,47.5);
        tarface2.quadTo(8.0,47.5,8.0,95.0);
        tarface2.closePath();
        
        a = new Area(tarface2);
        
        /*--------Tar Hair-----------*/
        tarhair.moveTo(8.0,95.0);
        tarhair.quadTo(35.625,87.875,46.25,59.375);
        tarhair.quadTo(44.975,84.55,23.725,113.05);
        tarhair.quadTo(54.75,92.625,68.775,57.0);
        tarhair.quadTo(88.75,87.875,88.75,126.35);
        tarhair.quadTo(95.125,114.0,93.0,95.0);
        tarhair.quadTo(93.0,47.5,50.5,47.5);
        tarhair.quadTo(8.0,47.5,8.0,95.0);
        tarhair.closePath();
        
        a.add(new Area(tarhair));
        
        /*--------Tar Hairup-----------*/
        tarhairup.moveTo(80.25,2.375);
        tarhairup.quadTo(69.625,5.225,59.0,9.5);
        tarhairup.quadTo(44.975,11.875,32.65,17.575);
        tarhairup.quadTo(-2.625,30.4,-10.7,89.775);
        tarhairup.quadTo(-13.25,114.95,-4.75,125.875);
        tarhairup.quadTo(2.475,137.275,10.975,146.775);
        tarhairup.quadTo(6.3,154.375,-0.075,159.6);
        tarhairup.quadTo(8.425,159.125,17.35,152.0);
        tarhairup.quadTo(15.225,160.075,8.0,171.475);
        tarhairup.quadTo(34.775,160.075,50.5,142.5);
        tarhairup.quadTo(66.225,160.075,93.0,171.475);
        tarhairup.quadTo(85.775,160.075,83.65,152.0);
        tarhairup.quadTo(92.575,159.125,101.075,159.6);
        tarhairup.quadTo(93.85,154.375,90.025,146.775);
        tarhairup.quadTo(98.525,137.275,105.75,125.875);
        tarhairup.quadTo(114.25,114.95,113.825,89.775);
        tarhairup.quadTo(114.25,62.7,102.35,41.325);
        tarhairup.quadTo(99.8,31.825,90.875,23.75);
        tarhairup.quadTo(88.75,0.0,80.25,2.375);
        tarhairup.closePath();
        
        a.add(new Area(tarhairup));
        
        /*--------Tar Eyelash-----------*/
        e1 = new Line2D.Double(14,99,37,99);
        e2 = new Line2D.Double(59,99,82,99);
        
        /*--------Tar Eyebrown-----------*/
        tareyebrown.moveTo(12,83);
        tareyebrown.quadTo(20,92,37,92);
        tareyebrown.moveTo(88,83);
        tareyebrown.quadTo(80,92,65,92);
        
        /*--------Tar Eyeball-----------*/
        tareyeballleft.moveTo(25.0,99.75);
        tareyeballleft.quadTo(29.25,106.875,33.5,99.75);
        tareyeballleft.closePath();

        tareyeballright.moveTo(65.375,99.75);
        tareyeballright.quadTo(69.625,106.875,73.875,99.75);
        tareyeballright.closePath();
        
        /*--------Tar Mouth-----------*/
        tarmouth.moveTo(44.125,130.625);
        tarmouth.quadTo(47.525,128.25,52.625,130.625);
    }
    
    public void init() {
    }
    
    public Graphics2D draw(Graphics g,int te,int e,int m,int em,int armR,int armL,int w,boolean ih) {
        Graphics2D g2 = (Graphics2D)g;
        
        /*--------Tar Body-----------*/
        g2.translate(0,150);
        g2.scale(0.5,0.32);
        if(armR!=5&&armL!=5) g2 = ar.drawJ(g2);
        g2 = tu.drawN(g2);
        g2 = tu.draw(g2);
        
            /*----------Tar Leg---------*/
            ar.drawLL(g2,Color.WHITE);
            ar.drawLR(g2,Color.WHITE);
        
        g2.scale(2,3.125);
        
            /*-----------Hun------------*/
            if (ih) { 
                g2.translate(10,30);
                g2.scale(0.4,0.4);
                g2 = th.draw(g2,0,false);
                g2.scale(2.5,2.5);
                g2.translate(-10,-30);
            }
        
        g2.scale(0.5,0.32);
        
                /*---------Tar Arm-----------*/
                g2 = ar.drawAR(g2,armR,w);
                g2 = ar.drawAL(g2,armL,w);
        
        g2.scale(2,3.125);
        
            if (ih) {
                g2.translate(10,30);
                g2.scale(0.4,0.4);
                g2 = th.drawA(g2,0);
                g2.scale(2.5,2.5);
                g2.translate(-10,-30);
            }
                
        g2.translate(0,-150);
        
        /*--------Tar Hair-----------*/
        g2.setColor(Color.BLACK);
        g2.fill(tarhairup);
        
            /*--------Tar Face-----------*/
            g2.setColor(new Color(255,192,130));
            g2.fill(tarface2);
            g2.setColor(new Color(255,248,210));
            g2.fill(tarface);
            
            g2.setColor(Color.BLACK);
            g2.draw(tarface2);
             
            /*--------Tar Eye-----------*/
            if (e==0) {
                g2.draw(e1);
                g2.draw(e2);
                g2.draw(tareyebrown);
                g2.translate(te,0);
                    g2.fill(tareyeballleft);
                    g2.fill(tareyeballright);
                g2.translate(-te,0);
            }
            else g2 = tf.drawE(g2,e);

            /*--------Tar Mouth-----------*/
            if (m==0) g2.draw(tarmouth);
            else g2 = tf.drawM(g2,m);
            
        g2.fill(tarhair);
        g2 = tf.drawEM(g2,em);
        
        return g2;
    }
    
    public Graphics2D fill(Graphics g,int armR,int armL,int w) {
        Graphics2D g2 = (Graphics2D)g;
        
        g2.fill(a);
        g2.translate(0,150);
        g2.scale(0.5,0.32);
        if(armR!=5&&armL!=5) g2 = ar.fillJ(g2);
        g2 = tu.fill(g2);
        g2 = ar.fillL(g2);
        g2 = ar.fillA(g2,armR,armL,w);
        g2.scale(2,3.125);
        g2.translate(0,-150);
        
        return g2;
    }
    
}
