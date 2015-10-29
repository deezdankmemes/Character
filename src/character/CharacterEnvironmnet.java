/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package character;

import environment.Environment;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author NathanielWard
 */
class CharacterEnvironmnet extends Environment {

    private Kirby kirby;

    public CharacterEnvironmnet() {
        kirby = new Kirby(100, 100, /* body*/ 450,/*body*/ 400, /*arm*/ 75,/*arm*/ 75,
                /*foot*/ 100,/*foot*/ 75,/*eye*/ 36,/*eye*/ 60,/*whitepupul*/ 12,/*whitepupul*/ 12,
                /*blackpupul*/ 30,/*blackpupul*/ 35,/*eyecolor*/ 30,/*eyecolor*/ 50,/*mouth*/ 30, /*mouth*/ 30,
                /*tongue*/ 25,/*tongue*/ 25, /*cheek*/ 0, /*cheek*/ 0);
    }

    @Override
    public void initializeEnvironment() {
    }

    @Override
    public void timerTaskHandler() {
    }

    @Override
    public void keyPressedHandler(KeyEvent e) {
    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {
    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {
    }

    @Override
    public void paintEnvironment(Graphics graphics) {

        if (kirby != null) {
            kirby.draw(graphics);
        }

    }

}
