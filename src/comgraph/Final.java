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
import java.awt.event.WindowAdapter;
import java.awt.image.*;
import java.awt.geom.*;
import java.applet.*;
import java.net.*;
import javax.swing.*;
/**
 *
 * @author Administrator
 */

public class Final extends JPanel implements Runnable  {
    
    Image img,img2;
    BufferedImage bi;
    Graphics2D g2;
    private AudioClip sound;
    
    int w,h,t=0,te1=0,te2=0;
    
    double x1=0, y1=-100, z1=0, sc1 = 1;
    double x2=0, y2=-100, z2=0, sc2 = 1;
    double x3=0, y3=0, z3=0, sc3 = 1;
    double x4=0,y4=0,z4=0,sc41=1,sc42=1,sc43=1,st41=0,st42=0;
    double x5=0,y5=0,z5=0,sc51=1,sc52=1,sc53=1,st1=0,st2=0;
    double x6=0,y6=0,z6=0,sc6=1,st61=0,st62=0,sc61=1,sc62=1,sc63=1;
    double x7=0,y7=0,z7=0,sc71=1,sc72=1,sc73=1,st71=0,st72=0;
    double x8=0,y8=0,z8=0,sc81=1,sc82=1,sc83=1,st81=0,st82=0,sin8=0; int eye8=0;
    
    int i=0,j=0,u=0,wa=0; double xx2=0,s=1,sin=0;
    int xx1=0,tt=0; double s1=1,s2=1.25,s3=1.5;
    
    public void init() {
        this.setSize(800,600);
        w = getSize().width;
        h = getSize().height;
        Toolkit kit = Toolkit.getDefaultToolkit();
        try {
            sound = Applet.newAudioClip(new URL("daioh.wav"));
        } catch(MalformedURLException mue) {}
        img = kit.getImage("../pattarmanga.gif");
        img2 = kit.getImage("../ex3.gif");
        bi = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
        g2 = bi.createGraphics(); 
        new Thread(this).start();
    }
    
    public void update(Graphics g) {
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        
        bg bg = new bg();
        Nook nook = new Nook(); 
        Yim yim = new Yim();
        Pin pin = new Pin();
        Tar tar = new Tar();
        Pat pat = new Pat();
        Hun hun = new Hun();
        g2.rotate(Math.PI,400,300);
        g2 = bg.draw(g2,Color.WHITE,new Color(0,64,128),0,Color.WHITE);
        g2.rotate(-Math.PI,400,300);
        
        /*--------------------TITLE-------------*/
        if(t<185) {
            g2.setColor(Color.WHITE);
            g2.fillRect(0,0,w,h);
            g2.drawImage(img,90,20,this);
            g2.setColor(Color.BLACK);
            g2.drawString(Integer.toString(t),10,20);
        }
        
        /*-------------------SCENE 1 YimNook enter-------------*/
        else if(t<255){
            g2 = bg.draw(g2,Color.WHITE,Color.PINK,0,Color.WHITE);
            g2.scale(1.25,1.25);
                g2.rotate(Math.PI,100,100);
                    g2.translate(0,-20-y1);
                        g2.translate(-50-y1/5,0-y1/5);
                            g2.scale(sc1,sc1);
                                g2.setColor(Color.LIGHT_GRAY);
                                g2 = yim.fill(g2,2,2,0);
                            g2.scale(1/sc1,1/sc1);
                        g2.translate(50+y1/5,y1/5);
                        g2 = yim.draw(g2,0,0,0,0,2,2,0,false);
                    g2.translate(0,20+y1);
                g2.rotate(-Math.PI,100,100);

                g2.translate(450,270);
                    g2.translate(0,-y1);
                        g2.translate(-50-y1/5,0-y1/5);
                            g2.scale(sc1,sc1);
                                g2.setColor(Color.LIGHT_GRAY);
                                g2 = nook.fill(g2,3,3,0,false);
                            g2.scale(1/sc1,1/sc1);
                        g2.translate(50+y1/5,y1/5);
                        g2 = nook.draw(g2,0,0,0,0,3,3,0,false);
                    g2.translate(0,y1);
                g2.translate(-450,-270);
            g2.scale(0.8,0.8);
            
            y1 = y1+1*3;
            sc1 = sc1 + 0.001;
            
            g2.drawString(Integer.toString(t),10,20);
        }
        else if(z1<Math.PI){
            g2 = bg.draw(g2,Color.WHITE,Color.PINK,0,Color.WHITE);
            g2.rotate(z1,400,300);
            g2.scale(1.25,1.25);
                g2.rotate(Math.PI,100,100);
                    g2.translate(0,-y1);
                        g2.translate(-50-y1/5,0-y1/5);
                            g2.scale(sc1,sc1);
                                g2.setColor(Color.LIGHT_GRAY);
                                g2 = yim.fill(g2,2,2,0);
                            g2.scale(1/sc1,1/sc1);
                        g2.translate(50+y1/5,y1/5);
                        g2 = yim.draw(g2,0,0,0,0,2,2,0,false);
                    g2.translate(0,y1);
                g2.rotate(-Math.PI,100,100);

                g2.translate(450,270);
                    g2.translate(0,-y1);
                        g2.translate(-50-y1/5,0-y1/5);
                            g2.scale(sc1,sc1);
                                g2.setColor(Color.LIGHT_GRAY);
                                g2 = nook.fill(g2,3,3,0,false);
                            g2.scale(1/sc1,1/sc1);
                        g2.translate(50+y1/5,y1/5);
                        g2 = nook.draw(g2,0,0,0,0,3,3,0,false);
                    g2.translate(0,y1);
                g2.translate(-450,-270);
            g2.scale(0.8,0.8);
            g2.rotate(-z1,400,300);
            
            
            z1 = z1+Math.PI*10/180;
            
            g2.drawString(Integer.toString(t),10,20);
        }
        else if(t<315){
            g2 = bg.draw(g2,Color.WHITE,Color.PINK,0,Color.WHITE);
            g2.rotate(Math.PI,400,300);
            g2.scale(1.25,1.25);
                g2.rotate(Math.PI,100,100);
                    g2.translate(0,-y1);
                        g2.translate(-50-y1/5,0-y1/5);
                            g2.scale(sc1,sc1);
                                g2.setColor(Color.LIGHT_GRAY);
                                g2 = yim.fill(g2,2,2,0);
                            g2.scale(1/sc1,1/sc1);
                        g2.translate(50+y1/5,y1/5);
                        g2 = yim.draw(g2,0,0,0,0,2,2,0,false);
                    g2.translate(0,y1);
                g2.rotate(-Math.PI,100,100);

                g2.translate(450,270);
                    g2.translate(0,-y1);
                        g2.translate(-50-y1/5,0-y1/5);
                            g2.scale(sc1,sc1);
                                g2.setColor(Color.LIGHT_GRAY);
                                g2 = nook.fill(g2,3,3,0,false);
                            g2.scale(1/sc1,1/sc1);
                        g2.translate(50+y1/5,y1/5);
                        if (te1<9) te1++;
                        g2 = nook.draw(g2,-te1,0,0,0,3,3,0,false);
                    g2.translate(0,y1);
                g2.translate(-450,-270);
            g2.scale(0.8,0.8);
            g2.rotate(-Math.PI,400,300);
            
            y1 = y1-0.5;
            sc1 = sc1 - 0.001;
            
            g2.drawString(Integer.toString(t),10,20);
            
        }
        
        /*-----------------SCENE 2 PinTar enter-------------*/
        else if(t<370){
            g2 = bg.draw(g2,Color.WHITE,new Color(128,128,255),0,Color.WHITE);
            g2.scale(1.25,1.25);
                g2.rotate(Math.PI,100,100);
                    g2.translate(0,-110-y2);
                        g2.translate(-50-y2/5,0-y2/5);
                            g2.scale(sc2,sc2);
                                g2.setColor(Color.LIGHT_GRAY);
                                g2 = pin.fill(g2,0,4,0);
                            g2.scale(1/sc2,1/sc2);
                        g2.translate(50+y2/5,y2/5);
                        g2 = pin.draw(g2,0,0,0,1,0,4,0);
                    g2.translate(0,110+y2);
                g2.rotate(-Math.PI,100,100);

                g2.translate(450,270);
                    g2.translate(0,-110-y2);
                        g2.translate(-50-y2/5,0-y2/5);
                            g2.scale(sc2,sc2);
                                g2.setColor(Color.LIGHT_GRAY);
                                g2 = tar.fill(g2,1,1,0);
                            g2.scale(1/sc2,1/sc2);
                        g2.translate(50+y2/5,y2/5);
                        g2 = tar.draw(g2,0,0,0,0,1,1,0,false);
                    g2.translate(0,110+y2);
                g2.translate(-450,-270);
            g2.scale(0.8,0.8);
            
            y2 = y2+1*2;
            sc2 = sc2 + 0.001;
            
            g2.drawString(Integer.toString(t),10,20);
        }
        else if(z2<Math.PI){
            g2 = bg.draw(g2,Color.WHITE,new Color(128,128,255),0,Color.WHITE);
            g2.rotate(z2,400,300);
            g2.scale(1.25,1.25);
                g2.rotate(Math.PI,100,100);
                    g2.translate(0,-y2);
                        g2.translate(-50-y2/5,0-y2/5);
                            g2.scale(sc2,sc2);
                                g2.setColor(Color.LIGHT_GRAY);
                                g2 = pin.fill(g2,0,4,0);
                            g2.scale(1/sc2,1/sc2);
                        g2.translate(50+y2/5,y2/5);
                        g2 = pin.draw(g2,0,0,0,1,0,4,0);
                    g2.translate(0,y2);
                g2.rotate(-Math.PI,100,100);

                g2.translate(450,270);
                    g2.translate(0,-y2);
                        g2.translate(-50-y2/5,0-y2/5);
                            g2.scale(sc2,sc2);
                                g2.setColor(Color.LIGHT_GRAY);
                                g2 = tar.fill(g2,1,1,0);
                            g2.scale(1/sc2,1/sc2);
                        g2.translate(50+y2/5,y2/5);
                        g2 = tar.draw(g2,0,0,0,0,1,1,0,false);
                    g2.translate(0,y2);
                g2.translate(-450,-270);
            g2.scale(0.8,0.8);
            g2.rotate(-z2,400,300);
            
            
            z2 = z2+Math.PI*10/180;
            
            g2.drawString(Integer.toString(t),10,20);
        }
        else if(t<450){
            g2 = bg.draw(g2,Color.WHITE,new Color(128,128,255),0,Color.WHITE);
            g2.rotate(Math.PI,400,300);
            g2.scale(1.25,1.25);
                g2.rotate(Math.PI,100,100);
                    g2.translate(0,-y2);
                        g2.translate(-50-y2/5,0-y2/5);
                            g2.scale(sc2,sc2);
                                g2.setColor(Color.LIGHT_GRAY);
                                g2 = pin.fill(g2,0,4,0);
                            g2.scale(1/sc2,1/sc2);
                        g2.translate(50+y2/5,y2/5);
                        g2 = pin.draw(g2,0,0,0,1,0,4,0);
                    g2.translate(0,y2);
                g2.rotate(-Math.PI,100,100);

                g2.translate(450,270);
                    g2.translate(0,-y2);
                        g2.translate(-50-y2/5,0-y2/5);
                            g2.scale(sc2,sc2);
                                g2.setColor(Color.LIGHT_GRAY);
                                g2 = tar.fill(g2,1,1,0);
                            g2.scale(1/sc2,1/sc2);
                        g2.translate(50+y2/5,y2/5);
                        if (te2<9) te2++;
                        g2 = tar.draw(g2,-te2,0,0,0,1,1,0,false);
                    g2.translate(0,y2);
                g2.translate(-450,-270);
            g2.scale(0.8,0.8);
            g2.rotate(-Math.PI,400,300);
            
            y2 = y2-0.5;
            sc2 = sc2 - 0.001;
            
            g2.drawString(Integer.toString(t),10,20);
            
        }
        
        /*-----------------SCENE 3 PAT enter---------------*/
        else if(t<600 || x4<68){
            g2 = bg.draw(g2,Color.WHITE,Color.LIGHT_GRAY,0,Color.WHITE);

            g2.scale(4,4);
                g2.translate(105,0-x4);
                    g2 = pat.draw(g2,0,0);
                g2.translate(-105,0+x4);
            g2.scale(0.25,0.25);
            
            g2.drawString(Integer.toString(t),10,20);
            x4 = x4+0.5;
        }
        else if(y4<54){
            g2 = bg.draw(g2,Color.WHITE,Color.LIGHT_GRAY,0,Color.WHITE);

            g2.scale(4,4);
                g2.translate(105,0-x4);
                    g2 = pat.draw(g2,0,y4);
                g2.translate(-105,0+x4);
            g2.scale(0.25,0.25);
            
            g2.drawString(Integer.toString(t),10,20);
            g2.drawString(Double.toString(x4),10,40);
            y4 = y4+0.5;
        }
        else if(t<760){
            g2 = bg.draw(g2,Color.WHITE,Color.LIGHT_GRAY,0,Color.WHITE);

            g2.scale(4,4);
                g2.translate(105,0-x4);
                    g2 = pat.draw(g2,0,y4);
                g2.translate(-105,0+x4);
            g2.scale(0.25,0.25);
            
            g2.drawString(Integer.toString(t),10,20);
            g2.drawString(Double.toString(x4),10,40);
        }
        
        /*--------------------SCENE 4 PIN-----------------*/
        else if(t<880){
            Flower flower = new Flower();
        
            g2.rotate(Math.PI,400,300);
            g2 = bg.draw(g2,Color.WHITE,Color.PINK,0,Color.WHITE);
            g2.rotate(-Math.PI,400,300);
        
            g2.scale(5,5);
                g2.translate(110,-20-y4);
                    g2.translate(-10,0);
                        g2.setColor(Color.LIGHT_GRAY);
                        g2 = pin.fill(g2,1,4,0);
                    g2.translate(10,0);
                    g2 = pin.draw(g2,0,0,0,0,1,4,0);
                g2.translate(-110,20+y4);
            g2.scale(0.2,0.2);
            
            g2.translate(50,st41-200);
                g2.rotate(st42,150,150);
                        g2.scale(sc41,sc41);
                            g2.setColor(new Color(255,255,128));
                            g2 = flower.draw(g2);
                        g2.scale(1/sc41,1/sc41);
                g2.rotate(-st42,150,150);
            g2.translate(-50,-st41+200);
            
            g2.translate(-60,st41-450);
                g2.rotate(st42,150,150);
                        g2.scale(2,2);
                            g2.setColor(new Color(255,128,128));
                            g2 = flower.draw(g2);
                        g2.scale(0.5,0.5);
                g2.rotate(-st42,150,150);
            g2.translate(60,-st41+450);
            
            g2.translate(250,st41-670);
                g2.rotate(st42,150,150);
                        g2.scale(sc43,sc43);
                            g2.setColor(new Color(203,35,245));
                            g2 = flower.draw(g2);
                        g2.scale(1/sc43,1/sc43);
                g2.rotate(-st42,150,150);
            g2.translate(-250,-st41+670);
            
            st41 = st41+2*4;
            st42 = st42+0.1;
            y4 = y4+0.02;
            sc41 = sc41 + 0.001;
            sc42 = sc42 + 0.002;
            sc43 = sc43 + 0.004;
            
            g2.drawString(Integer.toString(t),10,20);
        }
        
        /*-----------------SCENE 5 YIM-------------------*/
        else if(t<1005){
            g2.rotate(Math.PI,400,300);
            g2 = bg.draw(g2,Color.WHITE,Color.PINK,0,Color.WHITE);
            g2.rotate(-Math.PI,400,300);
            
            g2.scale(5,5);
                g2.translate(-50,-40+y5);
                    g2.translate(10,0);
                            g2.setColor(Color.LIGHT_GRAY);
                            g2 = yim.fill(g2,1,4,0);
                    g2.translate(-10,0);
                    g2 = yim.draw(g2,0,1,2,0,1,4,0,false);
                g2.translate(50,40-y5);
            g2.scale(0.2,0.2);
            
            g2.translate(250,st1-200);
                g2.rotate(st2,150,150);
                        g2.scale(sc51,sc51);
                            GradientPaint gp = new GradientPaint(30,100,Color.YELLOW,70,100,Color.ORANGE,true);
                            g2.setPaint(gp);
                            g2.fillRect(10,220,80,100);
                            g2.setColor(Color.BLACK);
                            g2.drawRect(10,220,80,100);
                        g2.scale(1/sc51,1/sc51);
                g2.rotate(-st2,150,150);
            g2.translate(-250,-st1+200);
            
            g2.translate(700,st1-450);
                g2.rotate(st2+Math.PI/3,120,400);
                        g2.scale(sc52,sc52);
                            GradientPaint gp2 = new GradientPaint(30,100,Color.WHITE,70,100,Color.PINK,true);
                            g2.setPaint(gp2);
                            g2.fillRect(10,220,80,100);
                            g2.setColor(Color.BLACK);
                            g2.drawRect(10,220,80,100);
                        g2.scale(1/sc52,1/sc52);
                g2.rotate(-st2-Math.PI/3,120,400);
            g2.translate(-700,-st1+450);
            
            g2.translate(400,st1-670);
                g2.rotate(st2+Math.PI,120,400);
                        g2.scale(2,2);
                            GradientPaint gp3 = new GradientPaint(30,100,new Color(255,255,128),70,100,Color.WHITE,true);
                            g2.setPaint(gp3);
                            g2.fillRect(10,220,80,100);
                            g2.setColor(Color.BLACK);
                            g2.drawRect(10,220,80,100);
                        g2.scale(0.5,0.5);
                g2.rotate(-st2-Math.PI,120,400);
            g2.translate(-400,-st1+670);
            
            st1 = st1+2*4;
            st2 = st2+0.1;
            y5 = y5+0.02;
            sc51 = sc51 + 0.001;
            sc52 = sc52 + 0.002;
            sc53 = sc53 + 0.004;
            
            g2.drawString(Integer.toString(t),750,20);
        }
        /*---------------------SCENE 6 TAR----------------*/
        else if(t<1130) {
            g2.rotate(Math.PI,400,300);
            g2 = bg.draw(g2,Color.WHITE,new Color(128,128,255),0,Color.WHITE);
            g2.rotate(-Math.PI,400,300);
            
            g2.scale(5,5);
                g2.translate(100,-20-y6);
                    g2.translate(-10,0);
                        g2.scale(sc6,sc6);
                            g2.setColor(Color.LIGHT_GRAY);
                            g2 = tar.fill(g2,1,4,0);
                        g2.scale(1/sc6,1/sc6);
                    g2.translate(10,0);
                    g2 = tar.draw(g2,0,2,1,0,1,4,0,false);
                g2.translate(-100,20+y6);
            g2.scale(0.2,0.2);
            
            g2.translate(50,st61-200);
                g2.rotate(st62,100,140);
                g2.scale(0.5,0.5);
                    g2.setColor(new Color(255,255,128));
                    g2 = hun.draw(g2,2,true);
                g2.scale(2,2);
                g2.rotate(-st62,100,140);
            g2.translate(-50,-st61+200);
            
            g2.translate(-60,st61-450);
                g2.rotate(st62+Math.PI/3,100,140);
                //g2.scale(sc62,sc62);
                    g2.setColor(new Color(255,255,128));
                    g2 = hun.draw(g2,1,true);
                //g2.scale(1/sc62,1/sc62);
                g2.rotate(-st62-Math.PI/3,100,140);
            g2.translate(60,-st61+450);
            
            g2.translate(250,st61-670);
                g2.rotate(st62+Math.PI,100,140);
                g2.scale(sc63,sc63);
                    g2.setColor(new Color(255,255,128));
                    g2 = hun.draw(g2,0,true);
                g2.scale(1/sc63,1/sc63);
                g2.rotate(-st62-Math.PI,100,140);
            g2.translate(-250,-st61+670);
            
            st61 = st61+2*4;
            st62 = st62+0.1;
            y6 = y6+0.02;
            
            sc61 = sc61 + 0.001;
            sc62 = sc62 + 0.002;
            sc63 = sc63 + 0.004;
            
            g2.drawString(Integer.toString(t),10,20);
        }
        /*---------------SCENE 7 NOOK------------------*/
        else if(t<1250) {
            g2.rotate(Math.PI,400,300);
            g2 = bg.draw(g2,Color.WHITE,new Color(255,255,128),0,Color.WHITE);
            g2.rotate(-Math.PI,400,300);
            
            g2.scale(5,5);
                g2.translate(-50,-40+y7);
                    g2.translate(10,0);
                            g2.setColor(Color.LIGHT_GRAY);
                            g2 = nook.fill(g2,1,4,0,false);
                    g2.translate(-10,0);
                    g2 = nook.draw(g2,0,3,0,0,1,4,0,false);
                g2.translate(50,40-y7);
            g2.scale(0.2,0.2);
            
            g2.translate(200,st71*2-2070);
                g2.rotate(st72+Math.PI/3,200,1670);
                        g2.scale(4,4);
                            g2 = nook.drawHome(g2);
                        g2.scale(0.25,0.25);
                g2.rotate(-st72-Math.PI/3,200,1670);
            g2.translate(-200,-st71*2+2070);
            
            g2.translate(150,st71-600);
                g2.rotate(st72,250,400);
                        g2.scale(sc71,sc71);
                            g2 = nook.drawHome(g2);
                        g2.scale(1/sc71,1/sc71);
                g2.rotate(-st72,250,400);
            g2.translate(-150,-st71+600);
            
            g2.translate(700,st71-450);
                g2.rotate(st72+Math.PI/3,120,400);
                        g2.scale(sc72,sc72);
                            g2 = nook.drawHome(g2);
                        g2.scale(1/sc72,1/sc72);
                g2.rotate(-st72-Math.PI/3,120,400);
            g2.translate(-700,-st71+450);
            
            st71 = st71+2*4;
            st72 = st72+0.1;
            y7 = y7+0.02;
            sc71 = sc71 + 0.001;
            sc72 = sc72 + 0.004;
            sc73 = sc73 + 0.008;
            
            g2.drawString(Integer.toString(t),750,20);
        }
        /*---------------SCENE 8 PIN2.1------------------*/
        else if(t<1290) {
            g2 = bg.draw(g2,Color.WHITE,new Color(255,128,192),0,Color.WHITE);
            if(xx1<20) {
                g2.scale(s1,s1);
                g2.translate(100,600-s1*(10*xx1));
                g2 = pin.draw(g2,0,0,0,1,0,4,0);
                g2.translate(-100,s1*(10*xx1)-600);
                g2.scale(1/s1,1/s1);
            }
            else if(xx1<40) {
                g2.scale(s1,s1);
                g2.translate(100,600-s1*400);
                g2 = pin.draw(g2,0,0,0,1,4,0,0);
                g2.translate(-100,s1*400-600);
                g2.scale(1/s1,1/s1);
            }
            else if(xx1<60) {
                g2.scale(s1,s1);
                g2.translate(100,600-s1*400);
                g2.setColor(new Color(255,96,160));
                g2 = pin.fill(g2,0,4,0);
                g2.translate(-100,s1*400-600);
                g2.scale(1/s1,1/s1);
                
                tt=xx1%40;
                g2.scale(s2,s2);
                g2.translate(260,600-s2*(10*tt));
                g2 = pin.draw(g2,0,0,0,1,0,4,0);
                g2.translate(-260,s2*(10*tt)-600);
                g2.scale(1/s2,1/s2);
            }
            else if(xx1<80) {
                g2.scale(s1,s1);
                g2.translate(100,600-s1*400);
                g2.setColor(new Color(255,96,160));
                g2 = pin.fill(g2,0,4,0);
                g2.translate(-100,s1*400-600);
                g2.scale(1/s1,1/s1);
                
                g2.scale(s2,s2);
                g2.translate(260,600-s2*400);
                g2 = pin.draw(g2,0,0,0,1,4,0,0);
                g2.translate(-260,s2*400-600);
                g2.scale(1/s2,1/s2);
            }
            else if(xx1<100) {
                g2.scale(s1,s1);
                g2.translate(100,600-s1*400);
                g2.setColor(new Color(255,96,160));
                g2 = pin.fill(g2,0,4,0);
                g2.translate(-100,s1*400-600);
                g2.scale(1/s1,1/s1);
                
                g2.scale(s2,s2);
                g2.translate(260,600-s2*400);
                g2.setColor(new Color(255,64,128));
                g2 = pin.fill(g2,0,4,0);
                g2.translate(-260,s2*400-600);
                g2.scale(1/s2,1/s2);
                
                tt=xx1%40;
                g2.scale(s3,s3);
                g2.translate(375,600-s3*(10*tt));
                g2 = pin.draw(g2,0,0,0,1,0,4,0);
                g2.translate(-375,s3*(10*tt)-600);
                g2.scale(1/s3,1/s3);
            }
            else {
                g2.scale(s1,s1);
                g2.translate(100,600-s1*400);
                g2.setColor(new Color(255,96,160));
                g2 = pin.fill(g2,0,4,0);
                g2.translate(-100,s1*400-600);
                g2.scale(1/s1,1/s1);
                
                
                g2.scale(s2,s2);
                g2.translate(260,600-s2*400);
                g2.setColor(new Color(255,64,128));
                g2 = pin.fill(g2,0,4,0);
                g2.translate(-260,s2*400-600);
                g2.scale(1/s2,1/s2);
                
                g2.scale(s3,s3);
                g2.translate(375,600-s3*400);
                g2 = pin.draw(g2,0,0,0,1,4,0,0);
                g2.translate(-375,s3*400-600);
                g2.scale(1/s3,1/s3);
            }
            xx1+=3;
            g2.drawString(Integer.toString(t),10,20);
        }
        /*---------------SCENE 9 PIN2.2------------------*/
        else if(t<1330) {
            g2 = bg.draw(g2,Color.WHITE,new Color(128,0,128),2,new Color(255,128,255));
            g2.translate(xx2,s+100);
                g2.scale(0.8,0.8);
                g2.translate(10,-10);
                g2.setColor(Color.LIGHT_GRAY);
                g2 = pin.fill(g2,5,5,wa);
                g2.translate(-10,10);
                g2 = pin.draw(g2,0,1,2,0,5,5,wa);
                g2.scale(1.25,1.25);
            g2.translate(-xx2,-s-100);

            if(u==0) {
                if(wa<-100) { wa +=40; u=1; }
                else wa -=40;
            }
            else {
                if(wa>100) { wa -=40; u=0; }
                else wa +=40;
            }
            s = 50*Math.sin(sin);
            sin -=Math.PI/12;
            xx2+=20;
            xx1=0; tt=0; s1=1; s2=1.25; s3=1.5;
            g2.drawString(Integer.toString(t),10,20);
        }
        /*---------------SCENE 10 YIM2.1------------------*/
        else if(t<1370) {
            g2.rotate(Math.PI,400,300);
            g2 = bg.draw(g2,Color.WHITE,Color.GRAY,0,Color.WHITE);
            if(xx1<20) {
                g2.scale(s1,s1);
                g2.translate(100,600-s1*(10*xx1));
                g2 = yim.draw(g2,0,0,0,0,2,2,0,false);
                g2.translate(-100,s1*(10*xx1)-600);
                g2.scale(1/s1,1/s1);
            }
            else if(xx1<40) {
                g2.scale(s1,s1);
                g2.translate(100,600-s1*400);
                g2 = yim.draw(g2,0,0,0,0,2,2,0,false);
                g2.translate(-100,s1*400-600);
                g2.scale(1/s1,1/s1);
            }
            else if(xx1<60) {
                g2.scale(s1,s1);
                g2.translate(100,600-s1*400);
                g2.setColor(Color.GRAY);
                g2 = yim.fill(g2,2,2,0);
                g2.translate(-100,s1*400-600);
                g2.scale(1/s1,1/s1);
                
                tt=xx1%40;
                g2.scale(s2,s2);
                g2.translate(260,600-s2*(10*tt));
                g2 = yim.draw(g2,0,0,0,0,2,0,0,false);
                g2.translate(-260,s2*(10*tt)-600);
                g2.scale(1/s2,1/s2);
            }
            else if(xx1<80) {
                g2.scale(s1,s1);
                g2.translate(100,600-s1*400);
                g2.setColor(Color.GRAY);
                g2 = yim.fill(g2,2,2,0);
                g2.translate(-100,s1*400-600);
                g2.scale(1/s1,1/s1);
                
                g2.scale(s2,s2);
                g2.translate(260,600-s2*400);
                g2 = yim.draw(g2,0,0,0,0,2,0,0,false);
                g2.translate(-260,s2*400-600);
                g2.scale(1/s2,1/s2);
            }
            else if(xx1<100) {
                g2.scale(s1,s1);
                g2.translate(100,600-s1*400);
                g2.setColor(Color.GRAY);
                g2 = yim.fill(g2,2,2,0);
                g2.translate(-100,s1*400-600);
                g2.scale(1/s1,1/s1);
                
                g2.scale(s2,s2);
                g2.translate(260,600-s2*400);
                g2.setColor(Color.DARK_GRAY);
                g2 = yim.fill(g2,2,0,0);
                g2.translate(-260,s2*400-600);
                g2.scale(1/s2,1/s2);
                
                tt=xx1%40;
                g2.scale(s3,s3);
                g2.translate(375,600-s3*(10*tt));
                g2 = yim.draw(g2,0,0,0,0,0,0,0,false);
                g2.translate(-375,s3*(10*tt)-600);
                g2.scale(1/s3,1/s3);
            }
            else {
                g2.scale(s1,s1);
                g2.translate(100,600-s1*400);
                g2.setColor(Color.GRAY);
                g2 = yim.fill(g2,2,2,0);
                g2.translate(-100,s1*400-600);
                g2.scale(1/s1,1/s1);
                
                
                g2.scale(s2,s2);
                g2.translate(260,600-s2*400);
                g2.setColor(Color.DARK_GRAY);
                g2 = yim.fill(g2,2,0,0);
                g2.translate(-260,s2*400-600);
                g2.scale(1/s2,1/s2);
                
                g2.scale(s3,s3);
                g2.translate(375,600-s3*400);
                g2 = yim.draw(g2,0,0,0,0,0,0,0,false);
                g2.translate(-375,s3*400-600);
                g2.scale(1/s3,1/s3);
            }
            g2.rotate(-Math.PI,400,300);
            xx1+=3;
            xx2=0; u=0; i=0; j=0; wa=0; s=1; sin=0;
            g2.drawString(Integer.toString(t),10,20);
        }
        /*---------------SCENE 11 YIM2.2------------------*/
        else if(t<1400) {
            g2 = bg.draw(g2,Color.LIGHT_GRAY,Color.WHITE,2,Color.WHITE);
            g2.translate(750-xx2,s+50);
                g2.scale(0.8,0.8);
                g2.rotate(-sin,100,200);
                g2.translate(10,-10);
                g2.setColor(Color.GRAY);
                g2 = yim.fill(g2,2,2,0);
                g2.translate(-10,10);
                g2 = yim.draw(g2,0,1,2,0,2,2,0,true);
                g2.rotate(sin,100,200);
                g2.scale(1.25,1.25);
            g2.translate(xx2-750,-s-50);

            s = 200*Math.sin(sin/8);
            xx2 +=20;
            sin += Math.PI/10;
            xx1=0; tt=0; s1=1; s2=1.25; s3=1.5;
            g2.drawString(Integer.toString(t),10,20);
        }
        /*---------------SCENE 12 YTN2.1------------------*/
        else if(t<1440) {
            g2 = bg.draw(g2,Color.WHITE,new Color(128,0,0),0,Color.WHITE);
            if(xx1<20) {
                g2.scale(s1,s1);
                g2.translate(100,600-s1*(10*xx1));
                g2 = yim.draw(g2,0,2,2,0,4,4,0,false);
                g2.translate(-100,s1*(10*xx1)-600);
                g2.scale(1/s1,1/s1);
            }
            else if(xx1<40) {
                g2.scale(s1,s1);
                g2.translate(100,600-s1*400);
                g2 = yim.draw(g2,0,2,2,0,0,0,0,false);
                g2.translate(-100,s1*400-600);
                g2.scale(1/s1,1/s1);
            }
            else if(xx1<60) {
                g2.scale(s1,s1);
                g2.translate(100,600-s1*400);
                g2.setColor(new Color(64,0,0));
                g2 = yim.fill(g2,0,0,0);
                g2.translate(-100,s1*400-600);
                g2.scale(1/s1,1/s1);
                
                tt=xx1%40;
                g2.scale(s2,s2);
                g2.translate(260,600-s2*(10*tt));
                g2 = tar.draw(g2,0,3,1,0,4,4,0,false);
                g2.translate(-260,s2*(10*tt)-600);
                g2.scale(1/s2,1/s2);
            }
            else if(xx1<80) {
                g2.scale(s1,s1);
                g2.translate(100,600-s1*400);
                g2.setColor(new Color(64,0,0));
                g2 = yim.fill(g2,0,0,0);
                g2.translate(-100,s1*400-600);
                g2.scale(1/s1,1/s1);
                
                g2.scale(s2,s2);
                g2.translate(260,600-s2*400);
                g2 = tar.draw(g2,0,3,1,0,0,0,0,false);
                g2.translate(-260,s2*400-600);
                g2.scale(1/s2,1/s2);
            }
            else if(xx1<100) {
                g2.scale(s1,s1);
                g2.translate(100,600-s1*400);
                g2.setColor(new Color(64,0,0));
                g2 = yim.fill(g2,0,0,0);
                g2.translate(-100,s1*400-600);
                g2.scale(1/s1,1/s1);
                
                g2.scale(s2,s2);
                g2.translate(260,600-s2*400);
                g2.setColor(new Color(96,0,0));
                g2 = tar.fill(g2,0,0,0);
                g2.translate(-260,s2*400-600);
                g2.scale(1/s2,1/s2);
                
                tt=xx1%40;
                g2.scale(s3,s3);
                g2.translate(375,600-s3*(10*tt));
                g2 = nook.draw(g2,0,3,1,0,4,4,0,false);
                g2.translate(-375,s3*(10*tt)-600);
                g2.scale(1/s3,1/s3);
            }
            else {
                g2.scale(s1,s1);
                g2.translate(100,600-s1*400);
                g2.setColor(new Color(64,0,0));
                g2 = yim.fill(g2,0,0,0);
                g2.translate(-100,s1*400-600);
                g2.scale(1/s1,1/s1);
                
                
                g2.scale(s2,s2);
                g2.translate(260,600-s2*400);
                g2.setColor(new Color(96,0,0));
                g2 = tar.fill(g2,0,0,0);
                g2.translate(-260,s2*400-600);
                g2.scale(1/s2,1/s2);
                
                g2.scale(s3,s3);
                g2.translate(375,600-s3*400);
                g2 = nook.draw(g2,0,3,1,0,0,0,0,false);
                g2.translate(-375,s3*400-600);
                g2.scale(1/s3,1/s3);
            }
            xx1+=3;
            xx2=0; u=0; i=0; j=0; wa=0; s=1; sin=0;
            g2.drawString(Integer.toString(t),10,20);
        }
        /*---------------SCENE 13 YTN2.2------------------*/
        else if(t<1515) {
            g2 = bg.draw(g2,Color.WHITE,Color.YELLOW,1,new Color(0,255,128));
            g2.setColor(new Color(0,96,96));

            g2.translate(110,190-(s-1)*250);
            g2.scale(s,s);
                g2 = yim.fill(g2,i,j,wa);
            g2.scale(1/s,1/s);
            g2.translate(-110,(s-1)*250-190);

            g2.translate(110+250*s,190-(s-1)*250);
            g2.scale(s,s);
                g2 = tar.fill(g2,i,j,wa);
            g2.scale(1/s,1/s);
            g2.translate(-110-250*s,(s-1)*250-190);

            g2.translate(110+500*s,190-(s-1)*250);
            g2.scale(s,s);
                g2 = nook.fill(g2,i,j,wa,false);
            g2.scale(1/s,1/s);
            g2.translate(-110-500*s,(s-1)*250-190);

            g2.translate((1-s)*200,0);
                g2.translate(100,200);
                g2 = yim.draw(g2,0,2,2,0,i,j,wa,false);
                g2.translate(250,0);
                g2 = tar.draw(g2,0,3,1,0,i,j,wa,false);
                g2.translate(250,0);
                g2 = nook.draw(g2,0,3,1,0,i,j,wa,false);
                g2.translate(-600,-200);
                g2.translate((s-1)*200,0);

            if(xx2<100) {
                if (xx2%50<25) { i=0;j=4; }
                else { i=4;j=0; }
                s += 0.002;
            }
            else {
                i=5; j=5; s += 0.002;
                if(u==0) {
                    if(wa<-100) { wa +=40; u=1; }
                    else wa -=40;
                }
                else {
                    if(wa>100) { wa -=40; u=0; }
                    else wa +=40;
                }
            }
            xx2+=4;
            xx1=0; tt=0; s1=1; s2=1.25; s3=1.5;
            g2.drawString(Integer.toString(t),10,20);
        }
        /*---------------SCENE 14 TAR2.1------------------*/
        else if(t<1555) {
            g2.rotate(Math.PI,400,300);
            g2 = bg.draw(g2,Color.WHITE,new Color(128,64,0),0,Color.WHITE);
            if(xx1<20) {
                g2.scale(s1,s1);
                g2.translate(600,600-s1*(10*xx1));
                g2 = tar.draw(g2,0,0,0,2,4,4,0,false);
                g2.translate(-600,s1*(10*xx1)-600);
                g2.scale(1/s1,1/s1);
            }
            else if(xx1<40) {
                g2.scale(s1,s1);
                g2.translate(600,600-s1*400);
                g2 = tar.draw(g2,0,0,0,2,4,4,0,false);
                g2.translate(-600,s1*400-600);
                g2.scale(1/s1,1/s1);
            }
            else if(xx1<60) {
                g2.scale(s1,s1);
                g2.translate(600,600-s1*400);
                g2.setColor(new Color(255,128,0));
                g2 = tar.fill(g2,4,4,0);
                g2.translate(-600,s1*400-600);
                g2.scale(1/s1,1/s1);
                
                tt=xx1%40;
                g2.scale(s2,s2);
                g2.translate(270,600-s2*(10*tt));
                g2 = tar.draw(g2,0,0,0,2,3,3,0,false);
                g2.translate(-270,s2*(10*tt)-600);
                g2.scale(1/s2,1/s2);
            }
            else if(xx1<80) {
                g2.scale(s1,s1);
                g2.translate(600,600-s1*400);
                g2.setColor(new Color(255,128,0));
                g2 = tar.fill(g2,4,4,0);
                g2.translate(-600,s1*400-600);
                g2.scale(1/s1,1/s1);
                
                g2.scale(s2,s2);
                g2.translate(270,600-s2*400);
                g2 = tar.draw(g2,0,0,0,2,3,3,0,false);
                g2.translate(-270,s2*400-600);
                g2.scale(1/s2,1/s2);
            }
            else if(xx1<100) {
                g2.scale(s1,s1);
                g2.translate(600,600-s1*400);
                g2.setColor(new Color(255,128,0));
                g2 = tar.fill(g2,4,4,0);
                g2.translate(-600,s1*400-600);
                g2.scale(1/s1,1/s1);
                
                g2.scale(s2,s2);
                g2.translate(270,600-s2*400);
                g2.setColor(new Color(192,92,0));
                g2 = tar.fill(g2,3,3,0);
                g2.translate(-270,s2*400-600);
                g2.scale(1/s2,1/s2);
                
                tt=xx1%40;
                g2.scale(s3,s3);
                g2.translate(50,600-s3*(10*tt));
                g2 = tar.draw(g2,0,0,0,2,1,1,0,false);
                g2.translate(-50,s3*(10*tt)-600);
                g2.scale(1/s3,1/s3);
            }
            else {
                g2.scale(s1,s1);
                g2.translate(600,600-s1*400);
                g2.setColor(new Color(255,128,0));
                g2 = tar.fill(g2,4,4,0);
                g2.translate(-600,s1*400-600);
                g2.scale(1/s1,1/s1);
                
                
                g2.scale(s2,s2);
                g2.translate(270,600-s2*400);
                g2.setColor(new Color(192,92,0));
                g2 = tar.fill(g2,3,3,0);
                g2.translate(-270,s2*400-600);
                g2.scale(1/s2,1/s2);
                
                g2.scale(s3,s3);
                g2.translate(50,600-s3*400);
                g2 = tar.draw(g2,0,0,0,2,1,1,0,false);
                g2.translate(-50,s3*400-600);
                g2.scale(1/s3,1/s3);
            }
            g2.rotate(-Math.PI,400,300);
            xx1+=3;
            xx2=0; u=0; i=0; j=0; wa=0; s=1; sin=0;
            g2.drawString(Integer.toString(t),10,20);
        }
        /*---------------SCENE 14 TAR2.2------------------*/
        else if(t<1585) {
            g2.translate(400-(s*400),0);
            g2.scale(s,1);
            g2 = bg.draw(g2,Color.WHITE,new Color(255,128,64),2,new Color(255,128,64));
            g2.scale(1/s,1);
            g2.translate((s*400)-400,0);
            
            g2.translate(250+wa,100+xx2);
                g2.scale(1.6,1.6);
                g2.translate(10,-10);
                g2.setColor(Color.LIGHT_GRAY);
                g2 = tar.fill(g2,1,1,0);
                g2.translate(-10,10);
                g2 = tar.draw(g2,0,0,0,2,1,1,0,true);
                g2.scale(0.625,0.625);
            g2.translate(-250-wa,-100-xx2);
            
            if(u==0) {
                if(wa<-140) { wa +=20; u=1; }
                else wa -=20;
            }
            else {
                if(wa>140) { wa -=20; u=0; }
                else wa +=20;
            }
            
            xx2 = 30*Math.sin(sin);            
            s += 0.008;
            sin += Math.PI/12;
            xx1=0; tt=0; s1=1; s2=1.25; s3=1.5;
            g2.drawString(Integer.toString(t),10,20);
        }
        /*---------------SCENE 15 NOOK2.1------------------*/
        else if(t<1630) {
            g2 = bg.draw(g2,Color.WHITE,new Color(255,225,128),0,Color.WHITE);
            if(xx1<20) {
                g2.scale(s1,s1);
                g2.translate(600,600-s1*(10*xx1));
                g2 = nook.draw(g2,0,0,0,0,4,4,0,false);
                g2.translate(-600,s1*(10*xx1)-600);
                g2.scale(1/s1,1/s1);
            }
            else if(xx1<40) {
                g2.scale(s1,s1);
                g2.translate(600,600-s1*400);
                g2 = nook.draw(g2,0,0,0,0,3,3,0,false);
                g2.translate(-600,s1*400-600);
                g2.scale(1/s1,1/s1);
            }
            else if(xx1<60) {
                g2.scale(s1,s1);
                g2.translate(600,600-s1*400);
                g2.setColor(new Color(255,225,32));
                g2 = nook.fill(g2,3,3,0,false);
                g2.translate(-600,s1*400-600);
                g2.scale(1/s1,1/s1);
                
                tt=xx1%40;
                g2.scale(s2,s2);
                g2.translate(270,600-s2*(10*tt));
                g2 = nook.draw(g2,0,0,0,0,4,4,0,false);
                g2.translate(-270,s2*(10*tt)-600);
                g2.scale(1/s2,1/s2);
            }
            else if(xx1<80) {
                g2.scale(s1,s1);
                g2.translate(600,600-s1*400);
                g2.setColor(new Color(255,255,32));
                g2 = nook.fill(g2,3,3,0,false);
                g2.translate(-600,s1*400-600);
                g2.scale(1/s1,1/s1);
                
                g2.scale(s2,s2);
                g2.translate(270,600-s2*400);
                g2 = nook.draw(g2,0,0,0,0,3,3,0,false);
                g2.translate(-270,s2*400-600);
                g2.scale(1/s2,1/s2);
            }
            else if(xx1<100) {
                g2.scale(s1,s1);
                g2.translate(600,600-s1*400);
                g2.setColor(new Color(255,255,32));
                g2 = nook.fill(g2,3,3,0,false);
                g2.translate(-600,s1*400-600);
                g2.scale(1/s1,1/s1);
                
                g2.scale(s2,s2);
                g2.translate(270,600-s2*400);
                g2.setColor(new Color(255,255,64));
                g2 = nook.fill(g2,3,3,0,false);
                g2.translate(-270,s2*400-600);
                g2.scale(1/s2,1/s2);
                
                tt=xx1%40;
                g2.scale(s3,s3);
                g2.translate(50,600-s3*(10*tt));
                g2 = nook.draw(g2,0,0,0,0,4,4,0,false);
                g2.translate(-50,s3*(10*tt)-600);
                g2.scale(1/s3,1/s3);
            }
            else {
                g2.scale(s1,s1);
                g2.translate(600,600-s1*400);
                g2.setColor(new Color(255,255,32));
                g2 = nook.fill(g2,3,3,0,false);
                g2.translate(-600,s1*400-600);
                g2.scale(1/s1,1/s1);
                
                
                g2.scale(s2,s2);
                g2.translate(270,600-s2*400);
                g2.setColor(new Color(255,255,64));
                g2 = nook.fill(g2,3,3,0,false);
                g2.translate(-270,s2*400-600);
                g2.scale(1/s2,1/s2);
                
                g2.scale(s3,s3);
                g2.translate(50,600-s3*400);
                g2 = nook.draw(g2,0,0,0,0,3,3,0,false);
                g2.translate(-50,s3*400-600);
                g2.scale(1/s3,1/s3);
            }
            xx1+=3;
            xx2=0; u=0; i=0; j=0; wa=0; s=1; sin=0;
            g2.drawString(Integer.toString(t),10,20);
        }
        /*---------------SCENE 16 NOOK2.2------------------*/
        else if(t<1660) {
            g2 = bg.draw(g2,Color.YELLOW,Color.WHITE,2,Color.WHITE);
            sin += 0.5;
            g2.translate(930-(sin*100),-sin*80);
            g2.scale(sin,sin);
                g2 = nook.fill(g2,3,3,0,true);
                g2 = nook.draw(g2,0,0,0,0,3,3,0,true);
            g2.scale(1/sin,1/sin);
            g2.translate((sin*100)-930,sin*80);
            
            xx2+=6;
            xx1=0; tt=0; s1=1; s2=1.25; s3=1.5;
            g2.drawString(Integer.toString(t),10,20);
        }
        /*---------------SCENE 17 PAT2------------------*/
        else if(t<1680 && x8<80){
            g2.translate(50,100);
                g2.translate(10,-10);
                    g2.setColor(Color.LIGHT_GRAY);
                    g2 = nook.fill(g2,2,2,0,false);
                g2.translate(-10,10);
                g2 = nook.draw(g2,eye8,0,0,0,1,1,0,false);
            g2.translate(-50,-100);
            g2.translate(200,100);
                g2.translate(10,-10);
                    g2.setColor(Color.LIGHT_GRAY);
                    g2 = tar.fill(g2,2,2,0);
                g2.translate(-10,10);
                g2 = tar.draw(g2,eye8,0,0,0,1,1,0,false);
            g2.translate(-200,-100);
            
            g2.translate(600,100-x8);
                g2 = pat.draw(g2,0,0);
            g2.translate(-600,-100+x8);
            
            x8 = x8+0.2;
            if(t>1670 && eye8<9)eye8++;
            g2.drawString(Integer.toString(t),10,20);
        }
        else if(t<1710){
            g2.translate(50,100);
                g2.translate(10,-10);
                    g2.setColor(Color.LIGHT_GRAY);
                    g2 = nook.fill(g2,2,2,0,false);
                g2.translate(-10,10);
                g2 = nook.draw(g2,eye8,0,0,0,1,1,0,false);
            g2.translate(-50,-100);
            g2.translate(200,100);
                g2.translate(10,-10);
                    g2.setColor(Color.LIGHT_GRAY);
                    g2 = tar.fill(g2,2,2,0);
                g2.translate(-10,10);
                g2 = tar.draw(g2,eye8,0,0,0,1,1,0,false);
            g2.translate(-200,-100);
            
            g2.translate(600,100-x8);
                g2 = pat.draw(g2,y8,0);
            g2.translate(-600,-100+x8);
            
            if(t>1690){
                y8 = Math.sin(sin8)*9;
                sin8 = sin8+Math.PI*30/180;
            }
            g2.drawString(Integer.toString(t),10,20);
        }
        else if(t<1780){
            
            g2.translate(50,100);
                g2.translate(10,-10);
                    g2.setColor(Color.LIGHT_GRAY);
                    g2 = nook.fill(g2,2,2,0,false);
                g2.translate(-10,10);
                g2 = nook.draw(g2,eye8,2,1,0,4,4,0,false);
            g2.translate(-50,-100);
            g2.translate(200,100);
                g2.translate(10,-10);
                    g2.setColor(Color.LIGHT_GRAY);
                    g2 = tar.fill(g2,2,2,0);
                g2.translate(-10,10);
                g2 = tar.draw(g2,eye8,2,1,0,4,4,0,false);
            g2.translate(-200,-100);
            
            g2.translate(600,100-x8);
                g2 = pat.draw(g2,y8,z8);
            g2.translate(-600,-100+x8);
            
            y8 = Math.sin(sin8)*9;
            sin8 = sin8+Math.PI*30/180;
            
            if(t>1740 && z8<54)z8 = z8+2;
            
            if(t>1720 && t<1725){        
                g2.rotate(-Math.PI*10/180,20,60);
                g2.drawImage(img2,20,50,this);
                g2.rotate(Math.PI*10/180,20,60);

                g2.rotate(Math.PI*10/180,320,70);
                g2.drawImage(img2,350,70,this);
                g2.rotate(-Math.PI*10/180,320,70);
            }
            if(t>1728 && t<1735){        
                g2.rotate(-Math.PI*10/180,20,60);
                g2.drawImage(img2,20,50,this);
                g2.rotate(Math.PI*10/180,20,60);

                g2.rotate(Math.PI*10/180,320,70);
                g2.drawImage(img2,350,70,this);
                g2.rotate(-Math.PI*10/180,320,70);
            }
            g2.drawString(Integer.toString(t),10,20);
        }
        /*---------------SCENE 18 End------------------*/
        else {
            g2 = bg.draw(g2,Color.WHITE,Color.PINK,0,Color.WHITE);
            
            g2.translate(50,50);
            g2.setColor(Color.LIGHT_GRAY);
            g2.translate(10,-10);
            g2 = yim.fill(g2,2,2,0);
            g2.translate(-10,10);
            g2 = yim.draw(g2,0,0,0,0,2,2,0,true);

            g2.translate(150,0);
            g2.setColor(Color.LIGHT_GRAY);
            g2.translate(10,-10);
            g2 = tar.fill(g2,1,1,0);
            g2.translate(-10,10);
            g2 = tar.draw(g2,0,0,0,2,1,1,0,true);

            g2.translate(300,0);
            g2.setColor(Color.LIGHT_GRAY);
            g2.translate(10,-10);
            g2 = nook.fill(g2,3,3,0,true);
            g2.translate(-10,10);
            g2 = nook.draw(g2,0,0,0,0,3,3,0,true);

            g2.translate(150,0);
            g2.setColor(Color.LIGHT_GRAY);
            g2.translate(10,-10);
            g2 = pin.fill(g2,0,4,0);
            g2.translate(-10,10);
            g2 = pin.draw(g2,0,0,0,1,0,4,0);

            g2.translate(-650,-50);
            
            g2.translate(365,20);
            g2 = pat.draw(g2,xx1,54);
            g2.translate(-365,-20);
            
            if(u==0) {
                if(xx1<-5) { xx1++; u=1; }
                else xx1--;
            }
            else {
                if(xx1>5) { xx1--; u=0; }
                else xx1++;
            }
            
            g2.drawString("4833683023  �����  ����ͧ���",600,560);
            g2.drawString("4833688123  �ѷ�  �ѧ�����س",600,575);
        }
        
        g.drawImage(bi, 0, 0, null);
        t++;
        
    }
    
    public void draw() {
       repaint();
   }

    
    public void run() {
        if(sound!=null)sound.play();
        while(true) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {  ex.printStackTrace();   }
            repaint();           
        }
    }
    // TODO overwrite start(), stop() and destroy() methods
}
    
