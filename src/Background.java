import java.awt.*;

public class Background {

    //Field
    private Color color = new Color (0, 0, 0);
    private Color colorLine = new Color (0, 0, 100);

    // Constructor

    public Background(){

    }
    //Function

    public void draw (Graphics2D g){
        g.setColor(color);
        g.fillRect(0,0, GamePanel.WIDTH_FRAME, GamePanel.HEIGHT_FRAME);
        //g.setColor(colorLine);
        //g.setStroke(new BasicStroke(3));
        //g.drawLine((int)(Math.random()*GamePanel.WIDTH_FRAME), (int)(Math.random()*GamePanel.HEIGHT_FRAME),
                //(int)(Math.random()*GamePanel.WIDTH_FRAME), (int)(Math.random()*GamePanel.HEIGHT_FRAME));
    }


}
