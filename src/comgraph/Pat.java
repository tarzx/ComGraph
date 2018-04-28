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
public class Pat extends JPanel {

    GeneralPath patface2 = new GeneralPath(GeneralPath.WIND_EVEN_ODD); // Face
    GeneralPath pathair = new GeneralPath(GeneralPath.WIND_EVEN_ODD); // Hair
    GeneralPath pathairup = new GeneralPath(GeneralPath.WIND_EVEN_ODD); // Hair up
    GeneralPath patbodyup = new GeneralPath(GeneralPath.WIND_EVEN_ODD); // Body up
    GeneralPath patbodymid = new GeneralPath(GeneralPath.WIND_EVEN_ODD); // Body mid
    GeneralPath patbodydown = new GeneralPath(GeneralPath.WIND_EVEN_ODD); // Body down
    GeneralPath patshoeleft = new GeneralPath(GeneralPath.WIND_EVEN_ODD); // Shoe left
    GeneralPath patshoeright = new GeneralPath(GeneralPath.WIND_EVEN_ODD); // Shoe right
    GeneralPath tline = new GeneralPath(GeneralPath.WIND_EVEN_ODD); // tline
    GeneralPath pathandl = new GeneralPath(GeneralPath.WIND_EVEN_ODD); // Hand left
    GeneralPath pathandr = new GeneralPath(GeneralPath.WIND_EVEN_ODD); // Hand right
    GeneralPath sqmouth = new GeneralPath(GeneralPath.WIND_EVEN_ODD); // Mouth
    RoundRectangle2D.Double gs1,gs2; // Glasses
    Line2D.Double gs; // Glasses
    
    public Pat() {
        /*-----------Pat Face------------*/
        patface2.moveTo(1.395,151.045);
        patface2.quadTo(0.8,196.265,36.5,201.025);
        patface2.quadTo(72.2,196.265,71.605,151.045);
        patface2.quadTo(71.605,114.75,36.5,114.75);
        patface2.quadTo(1.395,114.75,1.395,151.045);
        
        /*-----------Pat Hair------------*/
        pathair.moveTo(4.965,148.07);
        pathair.lineTo(3.775,140.335);
        pathair.lineTo(10.32,142.12);
        pathair.lineTo(13.89,131.41);
        pathair.lineTo(22.22,137.36);
        pathair.lineTo(31.74,129.625);
        pathair.lineTo(37.095,136.17);
        pathair.lineTo(46.615,132.005);
        pathair.lineTo(49.59,137.955);
        pathair.lineTo(62.68,133.79);
        pathair.lineTo(62.68,140.93);
        pathair.lineTo(68.63,139.74);
        pathair.lineTo(66.845,149.855);
        pathair.quadTo(66.25,174.25,60.3,187.34);
        pathair.quadTo(76.365,167.705,72.2,150.45);
        pathair.quadTo(77.555,114.75,36.5,112.965);
        pathair.quadTo(2.0,114.75,-0.985,146.88);
        pathair.quadTo(-2.175,176.035,15.675,189.125);
        pathair.quadTo(3.775,176.035,4.965,148.07);
        pathair.closePath();
        
        /*-----------Pat Hair up------------*/
        pathairup.moveTo(67.44,187.18);
        pathairup.quadTo(93.025,146.5,68.035,104.69);
        pathairup.lineTo(66.845,109.21);
        pathairup.quadTo(63.87,100.17,51.375,90.0);
        pathairup.lineTo(50.78,99.04);
        pathairup.lineTo(47.8,88.305);
        pathairup.lineTo(38.285,97.345);
        pathairup.lineTo(36.5,90.0);
        pathairup.quadTo(25.79,93.955,18.055,101.865);
        pathairup.lineTo(21.625,96.78);
        pathairup.quadTo(2.585,104.125,-3.96,117.685);
        pathairup.quadTo(-17.05,146.5,3.775,188.875);
        pathairup.quadTo(36.5,146.5,67.44,187.18);
        pathairup.closePath();
        
        /*-----------Pat Shoe left------------*/
        patshoeleft.moveTo(-6,561);
        patshoeleft.quadTo(-23.0,572,-6,572);
        patshoeleft.lineTo(35,572);
        patshoeleft.lineTo(35,561);
        patshoeleft.closePath();
        
        patshoeright.moveTo(78,561);
        patshoeright.quadTo(96.0,572,78,572);
        patshoeright.lineTo(37,572);
        patshoeright.lineTo(37,561);
        patshoeright.closePath();
        
        /*-----------Pat Glasses------------*/
        gs1 = new RoundRectangle2D.Double(6,148,25,17,11,11);
        gs2 = new RoundRectangle2D.Double(39,148,25,17,11,11);
        gs = new Line2D.Double(32,153,39,153);
        
    }
    
    public void Patw(double angle, double t) {
        angle *= 10;
        /*-----------Pat Body up------------*/
        patbodyup.moveTo(-6,147);
        patbodyup.quadTo(-5.15+angle,85,-6,26);
        patbodyup.lineTo(18,26);
        patbodyup.quadTo(18.65+angle,85,18,147);
        
        patbodyup.moveTo(54,147);
        patbodyup.quadTo(54.35+angle,85,54,26);
        patbodyup.lineTo(78,26);
        patbodyup.quadTo(78.15+angle,85,78,147);
        patbodyup.lineTo(-6,147);
        
        /*-----------Pat Body mid------------*/
        patbodymid.moveTo(-6,147);
        patbodymid.quadTo(-5.15-angle,204,-6,331);
        patbodymid.lineTo(78,331);
        patbodymid.quadTo(78.15-angle,204,78,147);
        patbodymid.moveTo(36,147);
        patbodymid.quadTo(36.5-angle,204,36,331);
        patbodymid.quadTo(36.5-angle,204,36,147);
        
        /*-----------Pat Body down------------*/
        patbodydown.moveTo(-6,331);
        patbodydown.quadTo(-5.15+angle,442,-6,561);
        patbodydown.lineTo(78,561);
        patbodydown.quadTo(78.15+angle,442,78,331);
        patbodydown.lineTo(-6,331);
        
        tline.moveTo(36.0+angle/4,382);
        tline.quadTo(36.5+angle*3/4,442,36,561);    
        
        angle /= 5;
        /*-----------Pat Hand------------*/
        pathandl.moveTo(-6,26);
        pathandl.lineTo(-6.0-angle,8);
        pathandl.quadTo(-3.0-angle*2,-1,0.0-angle,8);
        pathandl.quadTo(3.0-angle*2,-1,6.0-angle,8);
        pathandl.quadTo(9.0-angle*2,-1,12.0-angle,8);
        pathandl.quadTo(15.0-angle*2,-1,18.0-angle,8);
        pathandl.lineTo(18,26);
        
        pathandr.moveTo(54,26);
        pathandr.lineTo(54.0-angle,8);
        pathandr.quadTo(57.0-angle*2,-1,60.0-angle,8);
        pathandr.quadTo(63.0-angle*2,-1,66.0-angle,8);
        pathandr.quadTo(69.0-angle*2,-1,72.0-angle,8);
        pathandr.quadTo(75.0-angle*2,-1,78.0-angle,8);
        pathandr.lineTo(78,26);
        
        /*-----------Pat Mouth------------*/
        sqmouth.moveTo(21.625,174.0);
        sqmouth.lineTo(15.675,225.8-t);
        sqmouth.quadTo(36.5,233.2-t,57.325,225.8-t);
        sqmouth.lineTo(51.375,174.0);
        sqmouth.lineTo(21.625,174.0);
        sqmouth.closePath();
    }
    
    public void init() {
    }
    
    public Graphics2D draw(Graphics g,double angle, double t) {
        Graphics2D g2 = (Graphics2D)g;

        Patw(angle,t);
        /*-----------Pat Body------------*/
        g2.setColor(Color.WHITE);
        g2.fill(patbodyup);
        g2.setColor(Color.BLACK);
        g2.draw(patbodyup);
        
        g2.setColor(Color.WHITE);
        g2.fill(patbodymid);
        g2.setColor(Color.BLACK);
        g2.draw(patbodymid);
        
        g2.setColor(Color.BLACK);
        g2.fill(patbodydown);
        g2.setColor(Color.WHITE);
        g2.draw(tline);
        
        /*-----------Pat Hand------------*/
        g2.setColor(new Color(255,248,210));
        g2.fill(pathandl);
        g2.setColor(Color.BLACK);
        g2.draw(pathandl);

        g2.setColor(new Color(255,248,210));
        g2.fill(pathandr);
        g2.setColor(Color.BLACK);
        g2.draw(pathandr);
        
        /*-----------Pat Shoe------------*/
        g2.setColor(Color.WHITE);
        g2.fill(patshoeleft);
        g2.fill(patshoeright);
        g2.setColor(Color.BLACK);
        g2.draw(patshoeleft);
        g2.draw(patshoeright);
        
        g2.rotate(angle/20,36,144);
            /*-----------Pat Hair------------*/
            g2.setColor(Color.BLACK);
            g2.fill(pathairup);
                /*-----------Pat Face------------*/
                g2.setColor(new Color(255,248,210));
                g2.fill(patface2);
                g2.setColor(Color.BLACK);
                g2.draw(patface2);

                /*-----------Pat Mouth------------*/
                g2.setColor(new Color(249,153,125));
                g2.fill(sqmouth);
                g2.setColor(Color.BLACK);
                g2.draw(sqmouth);

            g2.fill(pathair);

            /*-----------Pat Glasses------------*/
            g2.setColor(Color.WHITE);
            g2.fill(gs1);
            g2.fill(gs2);
            g2.setColor(Color.BLACK);
            g2.draw(gs1);
            g2.draw(gs2);
            g2.draw(gs);
        g2.rotate(-angle/20,36,144);
        
        return g2;
    }
    
}