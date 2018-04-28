/*
 * Arm.java
 *
 * Created on 7 ���Ҥ� 2550, 14:38 �.
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
public class Arm extends JPanel {

    GeneralPath lR = new GeneralPath(GeneralPath.WIND_EVEN_ODD); // Right Leg
    GeneralPath lL = new GeneralPath(GeneralPath.WIND_EVEN_ODD); // Left Leg
    GeneralPath sR = new GeneralPath(GeneralPath.WIND_EVEN_ODD); // Right Shoe
    GeneralPath sL = new GeneralPath(GeneralPath.WIND_EVEN_ODD); // Left Shoe
    
    GeneralPath CAR = new GeneralPath(GeneralPath.WIND_EVEN_ODD); //200/600
    GeneralPath CSR = new GeneralPath(GeneralPath.WIND_EVEN_ODD); //200/600
    GeneralPath CAL = new GeneralPath(GeneralPath.WIND_EVEN_ODD); //200/600
    GeneralPath CSL = new GeneralPath(GeneralPath.WIND_EVEN_ODD); //200/600
    
    GeneralPath KAR = new GeneralPath(GeneralPath.WIND_EVEN_ODD); //200/600
    GeneralPath KSR = new GeneralPath(GeneralPath.WIND_EVEN_ODD); //200/600
    GeneralPath KAL = new GeneralPath(GeneralPath.WIND_EVEN_ODD); //200/600
    GeneralPath KSL = new GeneralPath(GeneralPath.WIND_EVEN_ODD); //200/600
    
    GeneralPath NAR = new GeneralPath(GeneralPath.WIND_EVEN_ODD); //200/600
    GeneralPath NSR = new GeneralPath(GeneralPath.WIND_EVEN_ODD); //200/600
    GeneralPath NAL = new GeneralPath(GeneralPath.WIND_EVEN_ODD); //200/600
    GeneralPath NSL = new GeneralPath(GeneralPath.WIND_EVEN_ODD); //200/600
    
    GeneralPath TAR = new GeneralPath(GeneralPath.WIND_EVEN_ODD); //200/600
    GeneralPath TSR = new GeneralPath(GeneralPath.WIND_EVEN_ODD); //200/600
    GeneralPath TAL = new GeneralPath(GeneralPath.WIND_EVEN_ODD); //200/600
    GeneralPath TSL = new GeneralPath(GeneralPath.WIND_EVEN_ODD); //200/600
    
    GeneralPath YAR = new GeneralPath(GeneralPath.WIND_EVEN_ODD); //200/600
    GeneralPath YSR = new GeneralPath(GeneralPath.WIND_EVEN_ODD); //200/600
    GeneralPath YAL = new GeneralPath(GeneralPath.WIND_EVEN_ODD); //200/600
    GeneralPath YSL = new GeneralPath(GeneralPath.WIND_EVEN_ODD); //200/600
    
    GeneralPath WAR = new GeneralPath(GeneralPath.WIND_EVEN_ODD); //200/60
    GeneralPath WSR = new GeneralPath(GeneralPath.WIND_EVEN_ODD); //200/60
    GeneralPath WAL = new GeneralPath(GeneralPath.WIND_EVEN_ODD); //200/60
    GeneralPath WSL = new GeneralPath(GeneralPath.WIND_EVEN_ODD); //200/60
    
    Ellipse2D.Double ajr,ajl;
    Area al,aa;
    
    public Arm() {
        /*---------------Leg----------------*/
            /*-----------Right Leg--------------*/
            lR.moveTo(30,700); //move 30/700
            lR.lineTo(35,900); //35/900
            lR.quadTo(57.5,1000,80,900); //57.5/1000 - 80/900
            lR.lineTo(85,700); //85/700

            /*-----------Right Shoe--------------*/
            sR.moveTo(35,900); //move 35/900
            sR.quadTo(57.5,1000,80,900); //57.5/1000 - 80/900
            sR.quadTo(57.5,930,35,900); //57.5/930 - 35/900

            /*-----------Left Leg--------------*/
            lL.moveTo(115,700); //move 115/700
            lL.lineTo(120,900); //120/900
            lL.quadTo(142.5,1000,165,900); //142.5/1000 - 165/900
            lL.lineTo(170,700); //170/700

            /*-----------Right Shoe--------------*/
            sL.moveTo(120,900); //move 120/900
            sL.quadTo(142.5,1000,165,900); //142.5/1000 - 165/900
            sL.quadTo(142.5,930,120,900); //142.5/930 - 120/900
        
        /*--------------Arm----------------*/
            /*-----------AJoint--------------*/
            ajr = new Ellipse2D.Double(-36,71,72,72); //-36/71 - 72/72
            ajl = new Ellipse2D.Double(164,71,72,72); //164/71 - 72/72
            
            /*-----------Choo Right Arm--------------*/
            CAR.moveTo(-36,107); //move -36/107
            CAR.lineTo(-72,-36); // -72/-36
            CAR.quadTo(-75,-46,-72,-56); // joint 1 : -75/-46 - -72/-56 
            CAR.lineTo(-5,-186); // -5/-186
            CAR.quadTo(15,-306,36,-186); // hand : 15/-306 - 36/-186
            CAR.lineTo(-31,-56); // -31/-56
            CAR.quadTo(-36,-46,-31,-56); // joint 1 : -36/-46 - -31/-56
            CAR.lineTo(5,107); // 5/107
            CAR.closePath();

            CSR.moveTo(-36,107); //move -36/107
            CSR.lineTo(-50,64); // -50/64
            CSR.lineTo(1,60); // 1/60
            CSR.lineTo(0,71); // 0/71
            CSR.lineTo(13,138); // 13/138
            
            /*-----------Choo Left Arm--------------*/
            CAL.moveTo(236,107); //move 236/107
            CAL.lineTo(272,-36); // 272/-36  
            CAL.quadTo(275,-46,272,-56); // joint 1 : 275/-46 - 272/-56 
            CAL.lineTo(205,-186); // 205/-186
            CAL.quadTo(185,-306,164,-186); // hand : 185/-306 - 164/-186
            CAL.lineTo(231,-56); // 231/-56
            CAL.quadTo(236,-46,231,-56); // joint 1 : 236/-46 - 231/-56
            CAL.lineTo(195,107); // 195/107
            CAL.closePath();

            CSL.moveTo(236,107); //move 236/107
            CSL.lineTo(250,64); // 250/64
            CSL.lineTo(199,60); // 199/60
            CSL.lineTo(200,71); // 200/71
            CSL.lineTo(187,138); // 187/107
            
            /*-----------Kod Right Arm--------------*/
            KAR.moveTo(-36,107); // -36/107
            KAR.lineTo(-36,280); // -36/280
            KAR.quadTo(-36,321,-16,321); // joint 1 : -36/280 - -16/321
            KAR.lineTo(120,340); // 120/340
            KAR.quadTo(220,320,120,299); // hand : 220/320 - 120/299
            KAR.lineTo(7,280);  // 7/280
            KAR.quadTo(5,280,5,270); // joint 1 : 5/280 - 5/270 
            KAR.lineTo(5,107); // 5/107
            KAR.closePath();

            KSR.moveTo(-36,107); // -36/107
            KSR.lineTo(-40,143); // -40/143
            KSR.lineTo(9,143); // -40/143
            KSR.lineTo(13,138); // 13/138
            KSR.lineTo(0,71); // 0/71
            
            /*-----------Kod Left Arm--------------*/
            KAL.moveTo(236,107); // 236/107
            KAL.lineTo(236,280); // 236/280
            KAL.quadTo(236,321,216,321); // joint 1 : 236/280 - 216/321
            KAL.lineTo(80,340); // 80/340
            KAL.quadTo(-20,320,80,299); // hand : -20/320 - 80/299
            KAL.lineTo(193,280); // 193/280
            KAL.quadTo(195,280,195,270); // joint 1 : 195/280 - 195/270 
            KAL.lineTo(195,107); // 195/107
            KAL.closePath();

            KSL.moveTo(236,107); // 236/107
            KSL.lineTo(240,143); // 240/143
            KSL.lineTo(191,143); // 191/143
            KSL.lineTo(187,138); // 197/138
            KSL.lineTo(200,71); // 200/71
            
            /*-----------Ngo Right Arm--------------*/
            NAR.moveTo(-36,107); // -36/107
            NAR.lineTo(-36,280); // -36/280
            NAR.quadTo(-36,280,-32,290); // joint 1 : -36/280 - -32/290 
            NAR.lineTo(40,360); // 40/360
            NAR.quadTo(120,500,81,360); // hand : 120/500 - 81/360
            NAR.lineTo(7,280); // 7/280
            NAR.quadTo(5,260,5,270); // joint 1 : 5/260 - 5/270 
            NAR.lineTo(5,107); // 5/107
            NAR.closePath();

            NSR.moveTo(-36,107); // -36/107
            NSR.lineTo(-40,143); // -40/143
            NSR.lineTo(9,143); // 9/143
            NSR.lineTo(13,138); // 13/138
            NSR.lineTo(0,71); // 0/71
            
            /*-----------Ngo Right Arm--------------*/
            
            NAL.moveTo(236,107); // 236/107
            NAL.lineTo(236,280); // 236/280
            NAL.quadTo(236,280,232,290); // joint 1 : 236/280 - 232/290 
            NAL.lineTo(160,360); // 160/360
            NAL.quadTo(80,500,119,360); // hand : 80/500 - 119/360
            NAL.lineTo(193,280); // 193/280
            NAL.quadTo(195,260,195,270); // joint 1 : 195/260 - 195/270 
            NAL.lineTo(195,107); // 195/107
            NAL.closePath();

            NSL.moveTo(236,107); // 236/107
            NSL.lineTo(240,143); // 240/143
            NSL.lineTo(191,143); // 191/143
            NSL.lineTo(187,138); // 197/138
            NSL.lineTo(200,71); // 200/71
        
            /*-----------Tao Right Arm--------------*/
            TAR.moveTo(-36,107); // -36/107
            TAR.lineTo(-72,250); // -72/250
            TAR.quadTo(-75,260,-72,270); // joint 1 : -75/260 - -72/270 
            TAR.lineTo(-5,400); // -5/400
            TAR.quadTo(15,520,36,400); // hand : 15/520 - 36/400
            TAR.lineTo(-31,270); // -31/270
            TAR.quadTo(-36,260,-31,250); // joint 1 : -36/260 - -31/270 
            TAR.lineTo(5,107); // 5/107
            TAR.closePath();

            TSR.moveTo(-36,107); // -36/107
            TSR.lineTo(-40,120); // -40/120
            TSR.lineTo(13,138); // 13/138
            TSR.lineTo(0,71); // 0/71
            
            /*-----------Tao Right Arm--------------*/
            
            TAL.moveTo(236,107); // 236/107
            TAL.lineTo(272,250); // 272/250
            TAL.quadTo(275,260,272,270); // joint 1 : 275/260 - 272/270 
            TAL.lineTo(205,400); // 205/400
            TAL.quadTo(185,520,164,400); // hand : 185/520 - 164/400
            TAL.lineTo(231,270); // 231/270
            TAL.quadTo(236,260,231,250); // joint 1 : 236/260 - 231/270 
            TAL.lineTo(195,107); // 195/107
            TAL.closePath();

            TSL.moveTo(236,107); // 236/107
            TSL.lineTo(240,120); // 240/120 
            TSL.lineTo(187,138); // 187/138
            TSL.lineTo(200,71); // 200/71
            
            /*-----------Yok Right Arm--------------*/
            YAR.moveTo(-36,107); // -36/107
            YAR.lineTo(-72,360); // -72/360
            YAR.quadTo(-160,380,-72,400); // hand : -160/380 - -72/400
            YAR.quadTo(-36,400,-36,360); // joint 2 : // -36/400 - -36/360
            YAR.lineTo(5,107); // 5/107
            YAR.closePath();

            YSR.moveTo(-36,107); // -36/107
            YSR.lineTo(-40,120); // -40/120
            YSR.lineTo(13,138); // 13/138
            YSR.lineTo(0,71); // 0/71
            
            /*-----------Yok Left Arm--------------*/
            YAL.moveTo(236,107); // 236/107
            YAL.lineTo(272,360); // 272/360
            YAL.quadTo(360,380,272,400); // hand : 360/380 - 272/400
            YAL.quadTo(236,400,236,360); // joint 2 : 236/400 - 236/360
            YAL.lineTo(195,107); // 195/107
            YAL.closePath();

            YSL.moveTo(236,107); // 236/107
            YSL.lineTo(240,120); // 240/120
            YSL.lineTo(187,138); // 187/138
            YSL.lineTo(200,71); // 200/71

    }
    
    public void WArm(int t) {
        /*-----------Wave left Arm--------------*/
        WAL.moveTo(200,74);
        WAL.quadTo(292.4,74-t,385,78);
        WAL.quadTo(424.4,87+t/2,385,120);
        WAL.quadTo(255,124-t,188,132);
        WAL.closePath();

        WSL.moveTo(199,72);
        WSL.lineTo(230,74-t/4);
        WSL.lineTo(187,138);
        WSL.lineTo(200,71);
        WSL.closePath();

        /*-----------Wave Right Arm--------------*/
        WAR.moveTo(0,74);
        WAR.quadTo(-92.4,74+t,-185,78);
        WAR.quadTo(-224.4,87-t/2,-185,120);
        WAR.quadTo(-55,124+t,12,132);
        WAR.closePath();

        WSR.moveTo(-7,72);
        WSR.lineTo(-35,74+t/4);
        WSR.lineTo(13,138);
        WSR.lineTo(0,71);
        WSR.closePath();
    }
    
    public void init() {
    }
    
    public Graphics2D drawLR(Graphics g,Color c) {
        Graphics2D g2 = (Graphics2D)g;
        
        g2.setColor(new Color(255,248,210));
        g2.fill(lR);
        g2.setColor(Color.BLACK);
        g2.draw(lR);
        
        g2.setColor(c);
        g2.fill(sR);
        g2.setColor(Color.BLACK);
        g2.draw(sR);
        
        return g2;
    }
    
    public Graphics2D drawLL(Graphics g,Color c) {
        Graphics2D g2 = (Graphics2D)g;
        
        g2.setColor(new Color(255,248,210));
        g2.fill(lL);
        g2.setColor(Color.BLACK);
        g2.draw(lL);
        
        g2.setColor(c);
        g2.fill(sL);
        g2.setColor(Color.BLACK);
        g2.draw(sL);
        
        return g2;
    }
    
    public Graphics2D drawJ(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        
        g2.setColor(Color.WHITE);
        g2.fill(ajl);
        g2.fill(ajr);
        g2.setColor(Color.BLACK);
        g2.draw(ajl);
        g2.draw(ajr);
        
        return g2;
    }
    
    public Graphics2D drawAL(Graphics g,int a,int w) {
        Graphics2D g2 = (Graphics2D)g;
        
        if(a==0) {
            g2.setColor(new Color(255,248,210));
            g2.fill(CAL);
            g2.setColor(Color.BLACK);
            g2.draw(CAL);
            g2.setColor(Color.WHITE);
            g2.fill(CSL);
            g2.setColor(Color.BLACK);
            g2.draw(CSL);
        }
        else if(a==1) {
            g2.setColor(new Color(255,248,210));
            g2.fill(KAL);
            g2.setColor(Color.BLACK);
            g2.draw(KAL);
            g2.setColor(Color.WHITE);
            g2.fill(KSL);
            g2.setColor(Color.BLACK);
            g2.draw(KSL);
        }
        else if(a==2) {
            g2.setColor(new Color(255,248,210));
            g2.fill(NAL);
            g2.setColor(Color.BLACK);
            g2.draw(NAL);
            g2.setColor(Color.WHITE);
            g2.fill(NSL);
            g2.setColor(Color.BLACK);
            g2.draw(NSL);
        }
        else if(a==3) {
            g2.setColor(new Color(255,248,210));
            g2.fill(TAL);
            g2.setColor(Color.BLACK);
            g2.draw(TAL);
            g2.setColor(Color.WHITE);
            g2.fill(TSL);
            g2.setColor(Color.BLACK);
            g2.draw(TSL);
        }
        else if(a==4){
            g2.setColor(new Color(255,248,210));
            g2.fill(YAL);
            g2.setColor(Color.BLACK);
            g2.draw(YAL);
            g2.setColor(Color.WHITE);
            g2.fill(YSL);
            g2.setColor(Color.BLACK);
            g2.draw(YSL);
        }
        else;
       
        
        return g2;
    }
    
    public Graphics2D drawAR(Graphics g,int a,int w) {
        Graphics2D g2 = (Graphics2D)g;
        
        if(a==0) {
            g2.setColor(new Color(255,248,210));
            g2.fill(CAR);
            g2.setColor(Color.BLACK);
            g2.draw(CAR);
            g2.setColor(Color.WHITE);
            g2.fill(CSR);
            g2.setColor(Color.BLACK);
            g2.draw(CSR);
        }
        else if(a==1) {
            g2.setColor(new Color(255,248,210));
            g2.fill(KAR);
            g2.setColor(Color.BLACK);
            g2.draw(KAR);
            g2.setColor(Color.WHITE);
            g2.fill(KSR);
            g2.setColor(Color.BLACK);
            g2.draw(KSR);
        }
        else if(a==2) {
            g2.setColor(new Color(255,248,210));
            g2.fill(NAR);
            g2.setColor(Color.BLACK);
            g2.draw(NAR);
            g2.setColor(Color.WHITE);
            g2.fill(NSR);
            g2.setColor(Color.BLACK);
            g2.draw(NSR);
        }
        else if(a==3) {
            g2.setColor(new Color(255,248,210));
            g2.fill(TAR);
            g2.setColor(Color.BLACK);
            g2.draw(TAR);
            g2.setColor(Color.WHITE);
            g2.fill(TSR);
            g2.setColor(Color.BLACK);
            g2.draw(TSR);
        }
        else if(a==4) {
            g2.setColor(new Color(255,248,210));
            g2.fill(YAR);
            g2.setColor(Color.BLACK);
            g2.draw(YAR);
            g2.setColor(Color.WHITE);
            g2.fill(YSR);
            g2.setColor(Color.BLACK);
            g2.draw(YSR);
        }
        else {
            g2.setColor(new Color(255,248,210));
            g2.fill(WAR);
            g2.setColor(Color.BLACK);
            g2.draw(WAR);
            g2.setColor(Color.WHITE);
            g2.fill(WSR);
            g2.setColor(Color.BLACK);
            g2.draw(WSR);
            
            g2.setColor(new Color(255,248,210));
            g2.fill(WAL);
            g2.fill(WAL);
            g2.setColor(Color.BLACK);
            g2.draw(WAL);
            g2.setColor(Color.WHITE);
            g2.fill(WSL);
            g2.setColor(Color.BLACK);
            g2.draw(WSL);
        }
        
        return g2;
    }
    
    public Graphics2D fillA(Graphics g,int aR,int aL,int w) {
        Graphics2D g2 = (Graphics2D)g;
        
        if(aR==0) {
            aa = new Area(CAR);
            aa.add(new Area(CSR));
        }
        else if(aR==1) {
            aa = new Area(KAR);
            aa.add(new Area(KSR));
        }
        else if(aR==2) {
            aa = new Area(NAR);
            aa.add(new Area(NSR));
        }
        else if(aR==3) {
            aa = new Area(TAR);
            aa.add(new Area(TSR));
        }
        else if(aR==4) {
            aa = new Area(YAR);
            aa.add(new Area(YSR));
        }
        else {
            WArm(w);
            aa = new Area(WAR);
            aa.add(new Area(WSR));
            aa.add(new Area(WAL));
            aa.add(new Area(WSL));
        }
        
        if(aL==0) {
            aa.add(new Area(CAL));
            aa.add(new Area(CSL));
        }
        else if(aL==1) {
            aa.add(new Area(KAL));
            aa.add(new Area(KSL));
        }
        else if(aL==2) {
            aa.add(new Area(NAL));
            aa.add(new Area(NSL));
        }
        else if(aL==3) {
            aa.add(new Area(TAL));
            aa.add(new Area(TSL));
        }
        else if(aL==4) {
            aa.add(new Area(YAL));
            aa.add(new Area(YSL));
        }
        else;
        
        g2.fill(aa);
        
        return g2;
    }
    
    public Graphics2D fillJ(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        
        g2.fill(ajl);
        g2.fill(ajr);
        
        return g2;
    }
    
    public Graphics2D fillL(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        
        al = new Area(lR);
        al.add(new Area(lL));
        
        g2.fill(al);
        
        return g2;
    }
}
