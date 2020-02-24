import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Palka{

    //Field

    protected static int WIDTH = Setting.getWidthPalka();
    protected static int HEIGTH = Setting.getHeightPalka();

    protected static int xPalka;
    protected static int yPalka;
    protected static int speedPalka = Setting.getSpeedPalka();

    private Color colorPalka = Setting.getColorPalka();

    // Constructor
    protected Palka(){
        xPalka = GamePanel.WIDTH_FRAME/2 - WIDTH/2;
        yPalka = GamePanel.HEIGHT_FRAME - HEIGTH*4;

    }


    //Function
    protected void drawPalka(Graphics2D g){
        g.setColor(colorPalka);
        g.fillRect(xPalka, yPalka, WIDTH, HEIGTH);
        g.setColor(colorPalka.darker());
        g.setStroke(new BasicStroke(2));
        g.drawRect(xPalka, yPalka, WIDTH, HEIGTH);
        g.drawRect(xPalka+HEIGTH, yPalka+HEIGTH/4, WIDTH-2*HEIGTH, HEIGTH/2);

    }
}
