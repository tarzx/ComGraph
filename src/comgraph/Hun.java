/*
 * Hun.java
 *
 * Created on 13 �ѹ��¹ 2550, 17:56 �.
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
public class Hun extends JPanel {
    
    GeneralPath ha1 = new GeneralPath(GeneralPath.WIND_EVEN_ODD); //Arm - 200/120
    GeneralPath ha2 = new GeneralPath(GeneralPath.WIND_EVEN_ODD); //Arm - 200/120
    GeneralPath hb = new GeneralPath(GeneralPath.WIND_EVEN_ODD); //Body - 200/120
    GeneralPath hl = new GeneralPath(GeneralPath.WIND_EVEN_ODD); // Leg - 200/120
    GeneralPath he = new GeneralPath(GeneralPath.WIND_EVEN_ODD); // Ear - 200/160
    GeneralPath hh = new GeneralPath(GeneralPath.WIND_EVEN_ODD); // Head - 200/160
    GeneralPath hm = new GeneralPath(GeneralPath.WIND_EVEN_ODD); // Mouth - 200/160
    GeneralPath hmm = new GeneralPath(GeneralPath.WIND_EVEN_ODD); // Mouth - 200/160
    GeneralPath ht = new GeneralPath(GeneralPath.WIND_EVEN_ODD); // Tongue - 200/160
    GeneralPath hp = new GeneralPath(GeneralPath.WIND_EVEN_ODD); // Paster - 200/160
    Ellipse2D[] e = new Ellipse2D[5];
    Line2D.Double mm;
    Color c;
    
    public Hun() {
        
        /*----------Hun Arm-----------*/
        ha1.moveTo(30,140); //move 30/140
        ha1.quadTo(10,180,20,220); //10/180 - 20/220
        ha1.quadTo(35,240,50,220); //35/240 - 50/220
        ha1.quadTo(60,200,44,145); //60/200 - 44/145
        ha1.closePath();
        
        ha2.moveTo(170,140); //move 170/140
        ha2.quadTo(190,200,180,220); //190/200 - 180/220 
        ha2.quadTo(165,240,150,220); //165/240 - 150/220
        ha2.quadTo(140,200,156,145); //140/200 - 156/145
        ha2.closePath();
        
        /*----------Hun Body-----------*/
        hb.moveTo(36,140); //move 36/140
        hb.quadTo(10,235,50,280); //10/235 - 50/280
        hb.quadTo(100,290,150,280); //100/290 - 150/280
        hb.quadTo(190,235,164,140); //190/235 - 164/140
        hb.quadTo(100,130,36,140); //100/130 - 36/140
        hb.closePath();
        
        /*----------Hun Leg-----------*/
        hl.moveTo(50,280); //move 50/120
        hl.quadTo(40,370,45,390); //40/370 - 45/390
        hl.quadTo(70,420,95,390); //70/420 - 95/390 
        hl.quadTo(100,370,90,280); //100/370 - 90/280
        hl.lineTo(150,280); //move 150/280
        hl.quadTo(160,370,155,390); //160/370 - 155/390
        hl.quadTo(130,420,105,390); //130/420 - 105/390 
        hl.quadTo(100,370,110,280); //100/370 - 110/280
        hl.closePath();
        
        /*----------Hun Ears-----------*/
        he.moveTo(16,31); //move 16/31
        he.quadTo(0,47,-5,68); //0/47 - -5/68
        he.quadTo(-4,119,6,121); //-4/119 - 6/121
        he.lineTo(194,121); //194/121
        he.quadTo(204,119,205,68); //204/119 - 205/68
        he.quadTo(200,47,186,31); //200/47 - 186/31
        he.closePath();
        
        /*----------Hun Head-----------*/
        hh.moveTo(100,0); //move 100/0
        hh.quadTo(23,6,16,31); //23/6 - 16/31
        hh.quadTo(5,60,4,86); //5/60 - 4/86
        hh.quadTo(0,103,6,121); //0/103 - 6/121
        hh.quadTo(23,149,100,155); //23/149 - 100/155
        hh.quadTo(177,149,194,121); //177/149 - 194/121
        hh.quadTo(200,103,196,86); //200/103 - 196/86
        hh.quadTo(195,60,184,31); //195/60 - 184/31
        hh.quadTo(177,6,100,0); //177,6 - / 100/0
        hh.closePath();
        
        /*----------Hun Mouth-----------*/
        hm.moveTo(100,75); //move 152/131
        hm.lineTo(100,131); //100/131
        hm.quadTo(126,147,154,131); //126/147 - 154/131
        hm.moveTo(100,131); //100/131
        hm.quadTo(74,147,48,131); //74/147 - 48/131
        
        hmm.moveTo(100,131);
        hmm.quadTo(126,147,154,131); //74/147 - 100/131
        hmm.closePath();
        
        /*----------Hun Tongue-----------*/
        ht.moveTo(114,136); //move 114/136
        ht.lineTo(114,152); //114/152
        ht.quadTo(127,164,140,152); //127/164 - 140/152
        ht.lineTo(140,136); //140/136
        
        mm = new Line2D.Double(127,136,127,146); // 127/136 - 127/146
        
        /*---------Hun Eye&Nose---------------*/
        e[0] = new Ellipse2D.Double(16,67,8,12); //16/67 - 8/12
        e[1] = new Ellipse2D.Double(176,67,8,12); //176/67 - 8/12
        e[2] = new Ellipse2D.Double(17,68,7,10); //17/68 - 7/10
        e[3] = new Ellipse2D.Double(176,68,7,10); // 176/68 - 7/10
        
        e[4] = new Ellipse2D.Double(85,69,30,16); //85/69 - 30/16
        
        /*----------Hun Paster-------------*/
        hp.moveTo(136,15); //136/15
        hp.lineTo(130,21); //130/21
        hp.lineTo(139,30); //139/30
        hp.lineTo(130,39); //130/39 
        hp.lineTo(136,45); //136/45 
        hp.lineTo(145,36); //145/36
        hp.lineTo(154,45); //154/45
        hp.lineTo(160,39); //160/39
        hp.lineTo(150,30); //151/30
        hp.lineTo(160,21); //160/21
        hp.lineTo(154,15); //154/15
        hp.lineTo(145,24); //145/24
        hp.lineTo(136,15); //136/15
        hp.closePath();
        
    }
    
    public void init() {
    }
    
    public Graphics2D draw(Graphics g,int i,boolean ia) {
        Graphics2D g2 = (Graphics2D)g;
        
        if(i==1) c = Color.WHITE;
        else if(i==2) c = Color.PINK;
        else c = new Color(181,159,89);
        
        g2.setColor(c);
        g2.fill(hl);
        g2.setColor(Color.BLACK);
        g2.draw(hl);
        
        g2.setColor(c);
        g2.fill(hb);
        g2.setColor(Color.BLACK);
        g2.draw(hb);
        
        g2.setColor(c);
        g2.fill(he);
        g2.setColor(Color.BLACK);
        g2.draw(he);
        
        g2.setColor(c);
        g2.fill(hh);
        g2.setColor(Color.BLACK);
        g2.draw(hh);
        
        g2.setColor(Color.RED);
        g2.fill(ht);
        g2.setColor(Color.BLACK);
        g2.draw(ht);
        g2.draw(mm);
        
        g2.setColor(c);
        g2.fill(hmm);
        
        g2.setColor(Color.WHITE);
        g2.fill(e[0]);
        g2.fill(e[1]);
        if(i==1) g2.setColor(Color.RED);
        g2.fill(hp);
        
        g2.setColor(Color.BLACK);
        g2.draw(hp);
        g2.draw(hm);
        g2.fill(e[2]);
        g2.fill(e[3]);
        g2.fill(e[4]);
        
        if(ia) g2=drawA(g,i);
        
        return g2;
    }

    public Graphics2D drawA(Graphics g,int i) {
        Graphics2D g2 = (Graphics2D)g;
        
        if(i==1) g2.setColor(Color.WHITE);
        else if(i==2) g2.setColor(Color.PINK);
        else g2.setColor(new Color(181,159,89));
        g2.fill(ha1);
        g2.fill(ha2);
        g2.setColor(Color.BLACK);
        g2.draw(ha1);
        g2.draw(ha2);
        
        return g2;
    }
}
