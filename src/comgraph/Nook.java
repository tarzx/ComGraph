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
public class Nook extends JPanel {
    
    GeneralPath nookface = new GeneralPath(GeneralPath.WIND_EVEN_ODD); // Face
    GeneralPath nookface2 = new GeneralPath(GeneralPath.WIND_EVEN_ODD); // Face2
    GeneralPath nookhair = new GeneralPath(GeneralPath.WIND_EVEN_ODD); // Hair
    GeneralPath nookhairup = new GeneralPath(GeneralPath.WIND_EVEN_ODD); // Hair up;
    GeneralPath nookhairback = new GeneralPath(GeneralPath.WIND_EVEN_ODD); // Hair Back;
    GeneralPath nookeyebrown = new GeneralPath(GeneralPath.WIND_EVEN_ODD); // Eyebrown
    GeneralPath nookeyeballleft = new GeneralPath(GeneralPath.WIND_EVEN_ODD); // Eyeball right
    GeneralPath nookeyeballright = new GeneralPath(GeneralPath.WIND_EVEN_ODD); // Eyeball left
    GeneralPath nookmouth = new GeneralPath(GeneralPath.WIND_EVEN_ODD); // Mouth
    GeneralPath bh = new GeneralPath(GeneralPath.WIND_NON_ZERO); // Home - 80/120
    GeneralPath sh1 = new GeneralPath(GeneralPath.WIND_EVEN_ODD); // Home - 80/120
    GeneralPath sh2 = new GeneralPath(GeneralPath.WIND_EVEN_ODD); // Home - 80/120
    Line2D.Double e1,e2,e3,e4,nm; // Eyelash & Mouth
    
    BasicStroke s = new BasicStroke(6.0f,BasicStroke.CAP_ROUND,BasicStroke.JOIN_ROUND);
    BasicStroke sb = new BasicStroke(1.0f);
    Area a;
    Uniform nu = new Uniform(); 
    Arm ar = new Arm();
    Face nf = new Face();
    
    public Nook() {

        /*--------Nook Face-----------*/
        nookface.moveTo(2.0,97.0);
        nookface.quadTo(0.575,92.0,16.25,87.0);
        nookface.quadTo(17.2,91.5,11.5,105.5);
        nookface.quadTo(26.225,88.5,31.45,82.0);
        nookface.quadTo(31.925,93.5,53.775,106.0);
        nookface.quadTo(41.425,83.5,43.325,72.0);
        nookface.quadTo(44.75,76.5,66.125,86.0);
        nookface.quadTo(63.75,84.0,61.375,78.0);
        nookface.quadTo(77.05,91.0,97.0,102.0);
        nookface.quadTo(87.5,154.5,49.5,154.5);
        nookface.quadTo(2.0,154.5,2.0,97.0);
        nookface.closePath();
          
        nookface2.moveTo(2.0,97.0);
        nookface2.quadTo(2.0,154.5,49.5,154.5);
        nookface2.quadTo(97.0,154.5,97.0,97.0);
        nookface2.quadTo(97.0,62.0,97.0,87.0);
        nookface2.quadTo(97.0,47.0,49.5,47.0);
        nookface2.quadTo(2.0,47.0,2.0,87.0);
        nookface2.closePath();
        
        a = new Area(nookface2);
        
        /*--------Nook Hair-----------*/
        nookhair.moveTo(4.375,112.0);
        nookhair.quadTo(0.575,92.0,16.25,82.0);
        nookhair.quadTo(17.2,91.5,11.5,100.5);
        nookhair.quadTo(26.225,88.5,31.45,72.0);
        nookhair.quadTo(31.925,93.5,53.775,103.5);
        nookhair.quadTo(41.425,83.5,43.325,63.5);
        nookhair.quadTo(44.75,76.5,66.125,83.5);
        nookhair.quadTo(63.75,84.0,61.375,75.5);
        nookhair.quadTo(77.05,91.0,97.0,99.0);
        nookhair.quadTo(97.0,119.5,78.0,137.0);
        nookhair.quadTo(99.375,124.5,104.125,112.0);
        nookhair.quadTo(116.0,67.0,87.5,47.0);
        nookhair.quadTo(25.75,22.0,2.0,67.0);
        nookhair.quadTo(-12.25,127.0,21.0,137.0);
        nookhair.quadTo(6.75,127.0,4.375,112.0);
        nookhair.closePath();
        
        /*--------Nook Hairup-----------*/
        nookhairup.moveTo(78.0,22.0);
        nookhairup.quadTo(54.25,-3.0,23.375,9.5);
        nookhairup.quadTo(40.0,7.0,47.125,14.5);
        nookhairup.quadTo(-0.375,12.0,-12.25,64.5);
        nookhairup.quadTo(-19.375,93.5,-7.5,129.5);
        nookhairup.quadTo(2.0,174.5,-12.25,184.5);
        nookhairup.quadTo(-2.75,174.5,2.0,164.5);
        nookhairup.quadTo(-1.325,189.5,11.5,204.5);
        nookhairup.quadTo(-1.325,182.0,11.5,157.0);
        nookhairup.quadTo(9.125,174.5,16.25,179.5);
        nookhairup.quadTo(17.2,130.5,49.5,147.0);
        nookhairup.quadTo(72.3,130.5,80.375,169.5);
        nookhairup.quadTo(83.225,178.5,78.0,197.0);
        nookhairup.quadTo(88.45,177.0,89.875,164.5);
        nookhairup.quadTo(94.625,178.5,106.5,184.5);
        nookhairup.quadTo(89.875,149.5,104.125,127.0);
        nookhairup.quadTo(132.625,69.5,94.625,34.5);
        nookhairup.quadTo(97.0,34.5,104.125,38.5);
        nookhairup.quadTo(97.0,19.5,78.0,22.0);
        nookhairup.closePath();
        
        a.add(new Area(nookhairup));
        
        /*--------Nook Hairback-----------*/
        nookhairback.moveTo(47.5,137.0);
        nookhairback.quadTo(5.0,157.0,12.5,129.5);
        nookhairback.quadTo(5.0,157.0,12.5,172.0);
        nookhairback.quadTo(12.5,167.0,47.5,167.0);
        nookhairback.quadTo(80.0,167.0,90.0,172.0);
        nookhairback.quadTo(80.0,167.0,80.0,132.0);
        nookhairback.quadTo(87.5,159.5,47.5,137.0);
        nookhairback.closePath();
        
        a.add(new Area(nookhairback));
        
        /*--------Nook Eyelash-----------*/
        e1 = new Line2D.Double(9,102,35,102);
        e2 = new Line2D.Double(59,102,85,102);
        
        /*--------Nook Eyebrown-----------*/
        e3 = new Line2D.Double(9,97,35,97);
        e4 = new Line2D.Double(59,97,85,97);
        
        /*--------Nook Eyeball-----------*/
        nookeyeballleft.moveTo(21.0,102.0);
        nookeyeballleft.quadTo(25.75,109.5,30.5,102.0);
        nookeyeballleft.closePath();

        nookeyeballright.moveTo(66.125,102.0);
        nookeyeballright.quadTo(70.875,109.5,75.625,102.0);
        nookeyeballright.closePath();
        
        /*--------Nook Mouth-----------*/
        nookmouth.moveTo(32.875,129.5);
        nookmouth.quadTo(42.375,122.0,50.45,129.5);
        nookmouth.quadTo(59.95,122.0,68.5,129.5);
        nookmouth.quadTo(50.45,139.5,32.875,129.5);
        nookmouth.closePath();
        
        nm = new Line2D.Double(32.875,129.50,68.5,129.5);
        
        /*--------Nook Home-----------*/ 
        bh.moveTo(65,340); //move 130/230
        bh.quadTo(105,345,145,320); //160/240 - 140/210
        bh.quadTo(105,325,65,340); //160/230 - 130/230
        bh.lineTo(65,430); //130/300
        bh.quadTo(105,440,145,410); //170/320 - 210/280
        bh.lineTo(145,320); //210/210
        bh.quadTo(105,345,65,340); //160/230 - 130/230
        
        //back
        sh1.moveTo(95,265); //move 160/25
        sh1.quadTo(105,300,115,325); //150/190 - 170/185
        sh1.moveTo(95,260); // 190/220
        sh1.quadTo(115,310,125,335); //185/200 - 180/195
        
        //symbol
        sh1.moveTo(90,410); //move 150/190
        sh1.lineTo(90,370); //150/250
        sh1.lineTo(130,400); //190/280
        sh1.lineTo(130,360); //190/240
        
        //front
        sh2.moveTo(85,335); //move 183/210
        sh2.quadTo(90,300,95,265); //180/190 - 180/195*/
        sh2.moveTo(100,340); //move 160/25
        sh2.quadTo(95,300,95,260); //150/190 - 170/185
        
    }
    
    public void init() {
    }
    
    public Graphics2D drawHome(Graphics g){
        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(Color.YELLOW);
        g2.fill(bh);
        g2.setColor(Color.BLACK);
        g2.draw(bh);
        g2.setStroke(s);
        g2.draw(sh1);
        
        g2.setStroke(sb);
        g2.setColor(Color.BLACK);
        g2.setStroke(s);
        g2.draw(sh2);
        g2.setStroke(sb);
        return g2;
    }
    
    public Graphics2D draw(Graphics g,int te,int e,int m,int em,int armR,int armL,int w,boolean ih) {
        Graphics2D g2 = (Graphics2D)g;
        
        /*--------Nook Hair-----------*/
        g2.setColor(Color.BLACK);
        g2.fill(nookhairback);
            /*--------Nook Body-----------*/
            g2.translate(0,150);
            g2.scale(0.5,0.32);
            if(armR!=5&&armL!=5) g2 = ar.drawJ(g2);
            g2 = nu.drawN(g2);
            g2 = nu.draw(g2);

                /*----------Nook Leg---------*/
                ar.drawLL(g2,new Color(64,0,64));
                ar.drawLR(g2,new Color(64,0,64));

            g2.scale(2,3.125);
            g2.translate(0,-150);

                /*-----------Home------------*/
                if (ih) { 
                    g2.setColor(Color.YELLOW);
                    g2.fill(bh);
                    g2.setColor(Color.BLACK);
                    g2.draw(bh);
                    g2.setStroke(s);
                    g2.draw(sh1);
                    g2.setStroke(sb);
                }
                
            g2.translate(0,150);
            g2.scale(0.5,0.32);

                    /*---------Nook Arm-----------*/
                    g2 = ar.drawAR(g2,armR,w);
                    g2 = ar.drawAL(g2,armL,w);

            g2.scale(2,3.125);
            g2.translate(0,-150);

                if (ih) {
                    g2.setColor(Color.BLACK);
                    g2.setStroke(s);
                    g2.draw(sh2);
                    g2.setStroke(sb);
                }

        g2.fill(nookhairup);
        
            /*--------Nook Face-----------*/
            g2.setColor(new Color(255,192,130));
            g2.fill(nookface2);
            g2.setColor(new Color(255,248,210));
            g2.fill(nookface);
            
            g2.setColor(Color.BLACK);
            g2.draw(nookface2);
             
            /*--------Nook Eye-----------*/
            if (e==0) {
                g2.draw(e1);
                g2.draw(e2);
                g2.draw(e3);
                g2.draw(e4);
                g2.translate(te,0);
                    g2.fill(nookeyeballleft);
                    g2.fill(nookeyeballright);
                g2.translate(-te,0);
            }
            else g2 = nf.drawE(g2,e);

            /*--------Nook Mouth-----------*/
            if (m==0) {
                g2.setColor(new Color(249,153,125));
                g2.fill(nookmouth);
                g2.setColor(Color.BLACK);
                g2.draw(nm);
                g2.draw(nookmouth);
            }
            else g2 = nf.drawM(g2,m);
            
        g2.fill(nookhair);
        g2 = nf.drawEM(g2,em);
        
        return g2;
    }
    
    public Graphics2D fill(Graphics g,int armR,int armL,int w,boolean ib) {
        Graphics2D g2 = (Graphics2D)g;
        
        if(ib) {
            a.add(new Area(bh));
            g2.setStroke(s);
            g2.draw(sh1);
            g2.draw(sh2);
            g2.setStroke(sb);
        }
        g2.fill(a);
        g2.translate(0,150);
        g2.scale(0.5,0.32);
        if(armR!=5&&armL!=5) g2 = ar.fillJ(g2);
        g2 = nu.fill(g2);
        g2 = ar.fillL(g2);
        g2 = ar.fillA(g2,armR,armL,w);
        g2.scale(2,3.125);
        g2.translate(0,-150);
        
        return g2;
    }
    
}
