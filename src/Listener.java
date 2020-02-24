import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Listener implements KeyListener {
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT && Palka.xPalka > 0) Palka.xPalka -= Palka.speedPalka;
        if (e.getKeyCode() == KeyEvent.VK_RIGHT && (Palka.xPalka + Palka.WIDTH) < GamePanel.WIDTH_FRAME) Palka.xPalka += Palka.speedPalka;
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
