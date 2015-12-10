/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package character;

import java.awt.Color;
import java.awt.Graphics;
import static javax.swing.Spring.width;

/**
 *
 * @author NathanielWard
 */
public class Kirby {

    private int x;
    private int y;

    private int width;
    private int height;

    private int armWidth;
    private int armHeight;

    private int footWidth;
    private int footHeight;

    private int eyeWidth;
    private int eyeHeight;

    private int whitepupulWidth;
    private int whitepupulHeight;

    private int blackpupulWidth;
    private int blackpupulHeight;
    private int eyecolorWidth;
    private int eyecolorHeight;

    private int mouthWidth;
    private int mouthHeight;
    private int tongueHieght;
    private int tongueWidth;
    private int cheekwidth;
    private int cheekHeight;

    public Kirby(int x, int y, int width, int height, int armWidth,
            int armHeight, int footWidth, int footHeight, int eyeWidth,
            int eyeHeight, int whitepupulWidth, int whitepupulHeight, int blackpupulWidth,
            int blackpupulHeight, int eyecolorWidth, int eyecolorHeight, int mouthWidth,
            int mouthHeight, int tongueWidth, int tongueHeight, int cheekWidth, int cheekHeight) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.armWidth = armWidth;
        this.armHeight = armHeight;
        this.footWidth = footWidth;
        this.footHeight = footHeight;
        this.eyeWidth = eyeWidth;
        this.eyeHeight = eyeHeight;
        this.whitepupulWidth = whitepupulWidth;
        this.whitepupulHeight = whitepupulHeight;
        this.blackpupulWidth = blackpupulWidth;
        this.blackpupulHeight = blackpupulHeight;
        this.eyecolorWidth = eyecolorWidth;
        this.eyecolorHeight = eyecolorHeight;
        this.mouthHeight = mouthHeight;
        this.mouthWidth = mouthWidth;
        this.tongueHieght = tongueHeight;
        this.tongueWidth = tongueWidth;
        this.cheekwidth = cheekWidth;
        this.cheekHeight = cheekHeight;
    }

    public void draw(Graphics graphics) {

//feet
        graphics.setColor(new Color(200, 10, 40));
        graphics.fillOval(x + (width * 3 / 20), y + (height * 40 / 40), footWidth, footHeight);
        graphics.fillOval(x + (width * 20 / 40), y + (height * 40 / 40), footWidth, footHeight);
//body
        graphics.setColor(Color.pink);
        graphics.fillOval(this.x, this.y, this.height, this.width);
//arms
        graphics.setColor(Color.pink);
        graphics.fillOval(x - (width * 1 / 20), y + (height * 5 / 10), armWidth, armHeight);
        graphics.fillOval(x + (width * 31 / 40), y + (height * 5 / 10), armWidth, armHeight);
//eye
        graphics.setColor(Color.black);
        graphics.fillOval(x + (width * 3 / 20), y + (height * 15 / 40), eyeWidth, eyeHeight);
        graphics.fillOval(x + (width * 20 / 40), y + (height * 15 / 40), eyeWidth, eyeHeight);
        //eye color
        graphics.setColor(Color.blue);
        graphics.fillOval(x + (width * 25 / 160), y + (height * 31 / 80), eyecolorWidth, eyecolorHeight);
        graphics.fillOval(x + (width * 81 / 160), y + (height * 31 / 80), eyecolorWidth, eyecolorHeight);
        //blackpupul
        graphics.setColor(Color.black);
        graphics.fillOval(x + (width * 25 / 160), y + (height * 31 / 80), blackpupulWidth, blackpupulHeight);
        graphics.fillOval(x + (width * 172 / 340), y + (height * 31 / 80), blackpupulWidth, blackpupulHeight);
        //whitepupul
        graphics.setColor(Color.white);
        graphics.fillOval(x + (width * 26 / 160), y + (height * 31 / 80), whitepupulWidth, whitepupulHeight);
        graphics.fillOval(x + (width * 175 / 340), y + (height * 31 / 80), whitepupulWidth, whitepupulHeight);
        //mouth
        graphics.setColor(new Color(86, 1, 3));
        graphics.fillOval(x + (width * 51 / 160), y + (height * 52 / 80), mouthWidth, mouthHeight);
        graphics.setColor(Color.red);
       
//tongue
        graphics.setColor(Color.pink);
        graphics.fillOval(x + (width * 883 / 2720), y + (height * 107 / 160), tongueWidth, tongueHieght);
        //cheeks
        graphics.setColor(new Color(255, 180, 196));
        graphics.fillOval(x + (width * 16 / 160), y + (height * 43 / 80), cheekwidth, cheekHeight);
        graphics.fillOval(x + (width * 157 / 340), y + (height * 43 / 80), cheekwidth, cheekHeight);
    }

}
