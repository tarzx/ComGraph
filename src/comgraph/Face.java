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
public class Face extends JPanel {

    GeneralPath ea = new GeneralPath(GeneralPath.WIND_EVEN_ODD); // Emo Angry
    GeneralPath ep = new GeneralPath(GeneralPath.WIND_EVEN_ODD); // Emo Ping
    GeneralPath devileye = new GeneralPath(GeneralPath.WIND_EVEN_ODD); // Eye Devil
    GeneralPath sqmouth = new GeneralPath(GeneralPath.WIND_EVEN_ODD); // Mouth Square
    GeneralPath sqmouth2 = new GeneralPath(GeneralPath.WIND_EVEN_ODD); // Mouth Square
    GeneralPath smmouth = new GeneralPath(GeneralPath.WIND_EVEN_ODD); // Mouth Smile
    GeneralPath smmouth2 = new GeneralPath(GeneralPath.WIND_EVEN_ODD); // Mouth Smile
    Ellipse2D.Double wo1,wo2,wc1,wc2;
    
    BasicStroke s = new BasicStroke(1.0f);
    BasicStroke def = new BasicStroke(0.1f);
    
    public Face() {
        /*---------Emo Angry-----------*/
        ea.moveTo(89,57);
        ea.quadTo(91,65,83,63);
        ea.moveTo(93,57);
        ea.quadTo(91,65,99,63);
        ea.moveTo(89,73);
        ea.quadTo(91,65,83,67);
        ea.moveTo(93,73);
        ea.quadTo(91,65,99,67); 
        
        /*---------Emo Ping-----------*/
        ep.moveTo(100,25);
        ep.quadTo(100,33,92,33);
        ep.quadTo(100,33,100,41);
        ep.quadTo(100,33,108,33);
        ep.quadTo(100,33,100,25);
        ep.closePath();
        
        /*---------Eye WhiteCircle-----------*/
        wc1 = new Ellipse2D.Double(26,93,8,9);
        wc2 = new Ellipse2D.Double(64,93,8,9);
        
        /*---------Eye WhiteOval-----------*/
        wo1 = new Ellipse2D.Double(17,93,17,9);
        wo2 = new Ellipse2D.Double(64,93,17,9);
        
        /*---------Eye Devil-----------*/
        devileye.moveTo(10,86);
        devileye.quadTo(18,123,42,99);
        devileye.closePath();
        
        devileye.moveTo(90,86);
        devileye.quadTo(82,123,59,99);
        devileye.closePath();
        
        /*---------Mouth Square-----------*/
        sqmouth.moveTo(39.875,119.5);
        sqmouth.lineTo(35.625,160.8);
        sqmouth.quadTo(50.5,166.7,65.375,160.8);
        sqmouth.lineTo(61.125,119.5);
        sqmouth.lineTo(39.875,119.5);
        sqmouth.closePath();
        
        //left square Mouth square
        sqmouth2.moveTo(39.875,119.5);
        sqmouth2.lineTo(38.6,131.3);
        sqmouth2.lineTo(44.125,119.5);
        sqmouth2.lineTo(39.875,119.5);
        sqmouth2.closePath();
        
        /*---------Mouth Smile-----------*/
        smmouth.moveTo(41.0,118.75);
        smmouth.quadTo(41.0,142.5,51.625,142.5);
        smmouth.quadTo(62.25,142.5,62.25,118.75);
        smmouth.quadTo(51.625,121.125,41.0,118.75);
        smmouth.closePath();
        
        //left square Mouth Smile
        smmouth2.moveTo(41.0,118.75);
        smmouth2.lineTo(41.0,128.25);
        smmouth2.lineTo(45.25,118.75);
        smmouth2.lineTo(41.0,118.75);
        smmouth2.closePath();
        
    }
    
    public void init() {
    }
    
    public Graphics2D drawE(Graphics g,int e) {
        Graphics2D g2 = (Graphics2D)g;
        
        if(e==1) { // Eye WhiteCircle
            g2.setStroke(s);
            g2.setColor(Color.WHITE);
            g2.fill(wc1);
            g2.setColor(Color.BLACK);
            g2.draw(wc1);
            g2.setStroke(def);

            g2.setColor(Color.WHITE);
            g2.fill(wc2);
            g2.setColor(Color.BLACK);
            g2.setStroke(s);
            g2.draw(wc2);
            g2.setStroke(def);
        }
        else if(e==2) { // Eye WhiteOval
            g2.setStroke(s);
            g2.setColor(Color.WHITE);
            g2.fill(wo1);
            g2.setColor(Color.BLACK);
            g2.draw(wo1);
            g2.setStroke(def);

            g2.setColor(Color.WHITE);
            g2.fill(wo2);
            g2.setColor(Color.BLACK);
            g2.setStroke(s);
            g2.draw(wo2);
            g2.setStroke(def);
        }
        else if(e==3) { // Eye Devil
            g2.setColor(Color.WHITE);
            g2.fill(devileye);
            g2.setStroke(s);
            g2.setColor(Color.BLACK);
            g2.draw(devileye);
            g2.setStroke(def);
        }
        else;
        
        return g2;
    }
    
    public Graphics2D drawM(Graphics g,int m) {
        Graphics2D g2 = (Graphics2D)g;
        
        if(m==1) { // Mouth Square
            g2.setStroke(s);
            g2.setColor(new Color(249,153,125));
            g2.fill(sqmouth);
            g2.setColor(Color.BLACK);
            g2.draw(sqmouth);
        }
        else if(m==2) { // Mouth Smile
            g2.setStroke(s);
            g2.setColor(new Color(249,153,125));
            g2.fill(smmouth);

            g2.setColor(new Color(169,44,7));
            g2.fill(smmouth2);

            g2.setColor(Color.BLACK);
            g2.draw(smmouth);
        }
        else;
        
        return g2;
    }
    
    public Graphics2D drawEM(Graphics g,int em) {
        Graphics2D g2 = (Graphics2D)g;
        
        if(em==1) { // Emo Angry
            g2.setColor(new Color(255,255,128));
            g2.fill(ep);
            g2.setColor(Color.BLACK);
            g2.draw(ep);
        }
        else if(em==2) { // Emo Ping
            g2.setColor(Color.RED);
            g2.draw(ea);
        }
        else;
        
        return g2;
    }
}