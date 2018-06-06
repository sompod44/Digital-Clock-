/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DigitallClock;

// 06/06/2018 this date i create this application . :) 

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.time.LocalTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 *
 * @author Sompod_Programmer
 */
public class LoadPanel extends JPanel implements ActionListener {

    Timer hittime;
    private final Integer timelapes = 1000;
    LocalTime time;
    char[] breaktime;
    private BufferedImage[] digitPic = new BufferedImage[11];
 BufferedImage back ,am,pm;
 private int a = 0, p = 0;
    public LoadPanel() {
        try {
            hittime = new Timer(timelapes, (ActionListener) this);
            hittime.start();
            am = ImageIO.read(getClass().getClassLoader().getResource("AM.png"));
            pm = ImageIO.read(getClass().getClassLoader().getResource("pm.png"));
           back = ImageIO.read(getClass().getClassLoader().getResource("background.png"));
          
            for (int i = 0; i < 11; i++) {
                try {
                    String picname = i + ".png";
                    digitPic[i] = ImageIO.read(getClass().getClassLoader().getResource(picname));
                } catch (IOException ex) {
                    Logger.getLogger(LoadPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            time = LocalTime.now();
            
            breaktime = time.toString().toCharArray();
        } catch (IOException ex) {
            Logger.getLogger(LoadPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
        
        g.drawImage(back, 0, 0, 400, 200, this);
      
        int X = 30,Y = 65,W = 30,H = 40;
        
        int value = AMorPM(breaktime[0], breaktime[1]);
        if(value >12){
            if(p == 0){
                Trickmusic();
                g.drawImage(pm, 285, 60, 30,30, this);
                p = 1;
            }
            else{
                Trickmusic();
                g.drawImage(pm, 285, 120, 30,30, this);
                p = 0;
            }
            
        }
        else{
            if(p == 0){
                Trickmusic();
                g.drawImage(am, 285, 60, 30,30, this);
                p = 1;
            }
            else{
                Trickmusic();
                g.drawImage(am, 285, 120, 30,30, this);
                p = 0;
            }
        }
        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                switch (breaktime[i]) {
                    case '0':
                        g.drawImage(digitPic[0], X, Y, W, H, this);
                        break;
                    case '1':
                        g.drawImage(digitPic[1], X, Y, W, H, this);
                        break;
                    case '2':
                        g.drawImage(digitPic[2], X, Y, W, H, this);
                        break;
                    case '3':
                        g.drawImage(digitPic[3], X, Y, W, H, this);
                        break;
                    case '4':
                        g.drawImage(digitPic[4], X, Y, W, H, this);
                        break;
                    case '5':
                        g.drawImage(digitPic[5], X, Y, W, H, this);
                        break;
                    case '6':
                        g.drawImage(digitPic[6], X, Y, W, H, this);
                        break;
                    case '7':
                        g.drawImage(digitPic[7], X, Y, W, H, this);
                        break;
                    case '8':
                        g.drawImage(digitPic[8], X, Y, W, H, this);
                        break;
                    case '9':
                        g.drawImage(digitPic[9], X, Y, W, H, this);
                        break;
                    default:
                        break;
                }
            } else {
                switch (breaktime[i]) {
                    case '0':
                        g.drawImage(digitPic[0], X+32, Y, W, H, this);
                        break;
                    case '1':
                        g.drawImage(digitPic[1], X+32, Y, W, H, this);
                        break;
                    case '2':
                        g.drawImage(digitPic[2], X+32, Y, W, H, this);
                        break;
                    case '3':
                        g.drawImage(digitPic[3], X+32, Y, W, H, this);
                        break;
                    case '4':
                        g.drawImage(digitPic[4], X+32, Y, W, H, this);
                        break;
                    case '5':
                        g.drawImage(digitPic[5], X+32, Y, W, H, this);
                        break;
                    case '6':
                        g.drawImage(digitPic[6], X+32, Y, W, H, this);
                        break;
                    case '7':
                        g.drawImage(digitPic[7], X+32, Y, W, H, this);
                        break;
                    case '8':
                        g.drawImage(digitPic[8], X+32, Y, W, H, this);
                        break;
                    case '9':
                        g.drawImage(digitPic[9], X+32, Y, W, H, this);
                        break;
                    default:
                        break;
                }
            }

        }
        
        g.drawImage(digitPic[10], X+55, Y-10, W, H+20, this);
int min = 75;
int sec = 105;
        for (int i = 3; i < 5; i++) {
                        if (i == 3) {
                switch (breaktime[i]) {
                    case '0':
                        g.drawImage(digitPic[0], X+min, Y, W, H, this);
                        break;
                    case '1':
                        g.drawImage(digitPic[1], X+min, Y, W, H, this);
                        break;
                    case '2':
                        g.drawImage(digitPic[2], X+min, Y, W, H, this);
                        break;
                    case '3':
                        g.drawImage(digitPic[3], X+min, Y, W, H, this);
                        break;
                    case '4':
                        g.drawImage(digitPic[4], X+min, Y, W, H, this);
                        break;
                    case '5':
                        g.drawImage(digitPic[5], X+min, Y, W, H, this);
                        break;
                    case '6':
                        g.drawImage(digitPic[6], X+min, Y, W, H, this);
                        break;
                    case '7':
                        g.drawImage(digitPic[7], X+min, Y, W, H, this);
                        break;
                    case '8':
                        g.drawImage(digitPic[8], X+min, Y, W, H, this);
                        break;
                    case '9':
                        g.drawImage(digitPic[9], X+min, Y, W, H, this);
                        break;
                    default:
                        break;
                }
            } else {
                switch (breaktime[i]) {
                    case '0':
                        g.drawImage(digitPic[0], X+sec, Y, W, H, this);
                        break;
                    case '1':
                        g.drawImage(digitPic[1], X+sec, Y, W, H, this);
                        break;
                    case '2':
                        g.drawImage(digitPic[2], X+sec, Y, W, H, this);
                        break;
                    case '3':
                        g.drawImage(digitPic[3], X+sec, Y, W, H, this);
                        break;
                    case '4':
                        g.drawImage(digitPic[4], X+sec, Y, W, H, this);
                        break;
                    case '5':
                        g.drawImage(digitPic[5], X+sec, Y, W, H, this);
                        break;
                    case '6':
                        g.drawImage(digitPic[6], X+sec, Y, W, H, this);
                        break;
                    case '7':
                        g.drawImage(digitPic[7], X+sec, Y, W, H, this);
                        break;
                    case '8':
                        g.drawImage(digitPic[8], X+sec, Y, W, H, this);
                        break;
                    case '9':
                        g.drawImage(digitPic[9], X+sec, Y, W, H, this);
                        break;
                    default:
                        break;
                }
            }
        }
        g.drawImage(digitPic[10], X+125, Y-10, W, H+20, this);
        
        int min1 = 145;
        int sec1 = 175;
        for (int i = 6; i < 8; i++) {
                        if (i == 6) {
                switch (breaktime[i]) {
                    case '0':
                        g.drawImage(digitPic[0], X+min1, Y, W, H, this);
                        break;
                    case '1':
                        g.drawImage(digitPic[1], X+min1, Y, W, H, this);
                        break;
                    case '2':
                        g.drawImage(digitPic[2], X+min1, Y, W, H, this);
                        break;
                    case '3':
                        g.drawImage(digitPic[3], X+min1, Y, W, H, this);
                        break;
                    case '4':
                        g.drawImage(digitPic[4], X+min1, Y, W, H, this);
                        break;
                    case '5':
                        g.drawImage(digitPic[5], X+min1, Y, W, H, this);
                        break;
                    case '6':
                        g.drawImage(digitPic[6], X+min1, Y, W, H, this);
                        break;
                    case '7':
                        g.drawImage(digitPic[7], X+min1, Y, W, H, this);
                        break;
                    case '8':
                        g.drawImage(digitPic[8], X+min1, Y, W, H, this);
                        break;
                    case '9':
                        g.drawImage(digitPic[9], X+min1, Y, W, H, this);
                        break;
                    default:
                        break;
                }
            } else {
                switch (breaktime[i]) {
                    case '0':
                        g.drawImage(digitPic[0], X+sec1, Y, W, H, this);
                        break;
                    case '1':
                        g.drawImage(digitPic[1], X+sec1, Y, W, H, this);
                        break;
                    case '2':
                        g.drawImage(digitPic[2], X+sec1, Y, W, H, this);
                        break;
                    case '3':
                        g.drawImage(digitPic[3], X+sec1, Y, W, H, this);
                        break;
                    case '4':
                        g.drawImage(digitPic[4], X+sec1, Y, W, H, this);
                        break;
                    case '5':
                        g.drawImage(digitPic[5], X+sec1, Y, W, H, this);
                        break;
                    case '6':
                        g.drawImage(digitPic[6], X+sec1, Y, W, H, this);
                        break;
                    case '7':
                        g.drawImage(digitPic[7], X+sec1, Y, W, H, this);
                        break;
                    case '8':
                        g.drawImage(digitPic[8], X+sec1, Y, W, H, this);
                        break;
                    case '9':
                        g.drawImage(digitPic[9], X+sec1, Y, W, H, this);
                        break;
                    default:
                        break;
                }
            }

        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        time = LocalTime.now();

        breaktime = time.toString().toCharArray();
        
        repaint();
    }
    
    private int AMorPM(char a, char b){  // This method check Am or Pm 
        
        String str1 = String.valueOf(a);
        String str2 = String.valueOf(b);
        String str = str1 + str2;
        Integer x = Integer.parseInt(str);

        return x ;
        
    }
    
    
        void Trickmusic() { // This Method for play trick sound 
        InputStream inputStream;
        AudioPlayer audioPlayer = AudioPlayer.player; // this is need for play music
        AudioStream audio; // this is need for play music

        try {
            inputStream = getClass().getClassLoader().getResourceAsStream("trick.wav");
            audio = new AudioStream(inputStream);
            audioPlayer.start(audio);

        } catch (Exception ex) {

            System.out.println(ex);
        }

    }

}
