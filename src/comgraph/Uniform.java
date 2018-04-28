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

public class Uniform extends JPanel {
    
        GeneralPath s = new GeneralPath(GeneralPath.WIND_EVEN_ODD); // Shirt - 200/700
        GeneralPath sp = new GeneralPath(GeneralPath.WIND_EVEN_ODD); // Shirt - 200/700
        GeneralPath sk = new GeneralPath(GeneralPath.WIND_EVEN_ODD); // Skirt - 200/700
        GeneralPath tl = new GeneralPath(GeneralPath.WIND_EVEN_ODD); // Leg - 200/700
        GeneralPath sl = new GeneralPath(GeneralPath.WIND_EVEN_ODD); // Shadow Leg - 200/700
        GeneralPath ub = new GeneralPath(GeneralPath.WIND_EVEN_ODD); // Underbreasts - 200/700
        GeneralPath neck = new GeneralPath(GeneralPath.WIND_EVEN_ODD); // Neck - 200/700
        Arc2D.Double ljlc,ljrc; // Leg Joint - 200/700
        Rectangle2D.Double b1,b2; // Belt - 200/700
        Ellipse2D.Double[] c = new Ellipse2D.Double[7]; // Coat Button
        Area a;
    
    public Uniform() {
        /*-----------Neck--------------*/
        neck.moveTo(69,0); //move 69/0
        neck.lineTo(69,18); //69/18
        neck.quadTo(55,88,100,130); //55/88 - 100/130
        neck.quadTo(145,88,131,18); //145/88 - 131/18
        neck.lineTo(131,0); //131/0
        neck.closePath();
        
        a = new Area(neck);
        
        /*-----------Shirt--------------*/
        s.moveTo(69,18); //move 69/18
        s.quadTo(45,62,0,71); //45/62 - 0/71
        s.lineTo(13,138); //13/138
        s.quadTo(0,185,17,236); //0/185 - 17/236
        s.quadTo(20,292,17,337); //20/292 - 17/337
        s.quadTo(8,355,4,387); //8/355 - 4/387
        s.lineTo(196,387); //196/387
        s.quadTo(192,355,183,337); //192/355 - 183/337
        s.quadTo(180,292,183,236); //180/292 - 183/236
        s.quadTo(200,185,187,138); //200/185 - 187/138
        s.lineTo(200,71); //200/71
        s.quadTo(155,62,131,18); //155/62 - 131/18
        s.quadTo(145,88,100,130); //145/88 - 100/130
        s.quadTo(55,88,69,18); //55/88 - 69/18
        s.closePath();
        
        a.add(new Area(s));
        
        sp.moveTo(69,18); //move 69/18
        sp.lineTo(35,121); //35/121
        sp.lineTo(58,98); //58/98
        sp.lineTo(100,130); //100/130
        sp.lineTo(142,98); //142/98
        sp.lineTo(165,121); //165/121
        sp.lineTo(131,18); //131/18
        sp.moveTo(100,130); //move 100/130
        sp.lineTo(100,387); //100/387

        /*------------Skirt-------------*/
        sk.moveTo(4,387); //4/387
        sk.quadTo(0,445,14,600); //0/445 - 14/600
        sk.lineTo(163,600); //163/600
        sk.lineTo(163,536); //163/536
        sk.lineTo(176,600); //176/600
        sk.lineTo(186,600); //186/600
        sk.quadTo(200,445,196,387); //200/445 - 196/387
        sk.closePath();
        
        a.add(new Area(sk));
        
        /*------------TopLeg-------------*/
        tl.moveTo(4,387); // move 4/387
        tl.lineTo(30,700); //30/700
        tl.lineTo(85,700); //85/700
        tl.lineTo(100,387); //100/387
        tl.lineTo(115,700); //115/700
        tl.lineTo(170,700); //170/700
        tl.lineTo(196,387); //196/387
        tl.closePath();
        
        a.add(new Area(tl));
        
        /*-----------LJoint--------------*/
        c[5] = new Ellipse2D.Double(30,672.5,55,55); // 30,672.5 - 55/55
        c[6] = new Ellipse2D.Double(115,672.5,55,55); // 115,672.5 - 55/55
        ljlc = new Arc2D.Double(30,672.5,55,55,180,180,Arc2D.OPEN); // 30,673 - 55/55 - 180/180
        ljrc = new Arc2D.Double(115,672.5,55,55,180,180,Arc2D.OPEN); // 115,673 - 55/55 - 180/180
        
        a.add(new Area(c[5]));
        a.add(new Area(c[6]));
        
        /*----------LegShadow----------*/
        sl.moveTo(4,387); //4/387
        sl.lineTo(30,620); //30/620
        sl.lineTo(90,620); //90/620
        sl.lineTo(100,387); //100/387
        sl.lineTo(115,620); //115/620
        sl.lineTo(175,620); //175/620
        sl.lineTo(196,387); //196/387
        
        /*--------UnderBreasts---------*/
        ub.moveTo(10,200); //move 10,200
        ub.quadTo(55,270,100,200); //55/270 - 100/200
        ub.quadTo(55,230,10,200); //55/230 - 10/200
        ub.moveTo(100,200); //move 100/200
        ub.quadTo(155,270,190,200); //155/270 - 190/200
        ub.quadTo(155,230,100,200); //155/230 - 100/200
        
        /*-----------Belt--------------*/
        b1 = new Rectangle2D.Double(0,382,200,27); // 0/382 - 200/27
        b2 = new Rectangle2D.Double(78,387,44,27); // 78/387 - 44/27
        
        /*-----------Coat Button--------------*/
        c[0] = new Ellipse2D.Double(92,132,16,16); // 92/132 - 16/16 
        c[1] = new Ellipse2D.Double(92,192,16,16); // 92/192 - 16/16 
        c[2] = new Ellipse2D.Double(92,252,16,16); // 92/252 - 16/16
        c[3] = new Ellipse2D.Double(92,312,16,16); // 92/312 - 16/16
        c[4] = new Ellipse2D.Double(92,372,16,16); // 92/372 - 16/16
        
    }
    
    public void init() {
    }
    
    public Graphics2D draw(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        
        /*------------TopLeg--------------*/
        g2.setColor(new Color(255,248,210));
        g2.fill(tl);
        
        /*----------LegShadow----------*/
        g2.setColor(new Color(255,192,130));
        g2.fill(sl);
        
        g2.setColor(Color.BLACK);
        g2.draw(tl);
        
        /*----------LegJoint----------*/
        g2.setColor(new Color(255,248,210));
        g2.fill(c[5]);
        g2.fill(c[6]);
        g2.setColor(Color.BLACK);
        g2.draw(ljlc);
        g2.draw(ljrc);
        
        /*------------Shirt-------------*/
        g2.setColor(Color.WHITE);
        g2.fill(s);
        g2.setColor(Color.BLACK);
        g2.draw(sp);
        g2.draw(s);
        
        /*------------Skirt-------------*/
        g2.fill(sk);
        
        /*---------UnderBreasts---------*/
        g2.setColor(new Color(250,250,250));
        g2.fill(ub);
        
        /*-----------Belt--------------*/
        g2.setColor(new Color(180,145,3));
        g2.fill(b1);
        g2.setColor(Color.GRAY);
        g2.fill(b2);
        
        /*-----------Coat Button--------------*/
        g2.fill(c[0]);
        g2.fill(c[1]);
        g2.fill(c[2]);
        g2.fill(c[3]);
        g2.fill(c[4]);
        
        return g2;
    }
    
    public Graphics2D drawN(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        
        g2.setColor(new Color(255,248,210));
        g2.fill(neck);
        g2.setColor(Color.BLACK);
        g2.draw(neck);
        
        return g2;
    }
    
    public Graphics2D fill(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        
        g2.fill(a);
        
        return g2;
    }
    
}
