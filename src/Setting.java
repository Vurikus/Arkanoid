import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Setting {


    //Field
        //Ball
    private static int radius = GamePanel.WIDTH_FRAME/80;
    private static Color colorBall = Color.WHITE;
    private static int speedBall = 7;

        //Palk
    private static int widthPalka = GamePanel.WIDTH_FRAME/4;
    private static int heightPalka = GamePanel.HEIGHT_FRAME/30;
    private static int speedPalka = 20;
    private static Color colorPalka = new Color(238, 66, 62);

        //BlocksMap
    protected static final byte WIDTH_FRAME_IN_BLOCKS = 16;
    protected static final byte HEIGHT_FRAME_IN_BLOCKS = 16;

        //Blocks
    private static int widthBlock = GamePanel.WIDTH_FRAME/WIDTH_FRAME_IN_BLOCKS;
    private static int heightBlock = GamePanel.HEIGHT_FRAME/HEIGHT_FRAME_IN_BLOCKS/2;
    private static Color colorBlockYGr = new Color(89,156,53);
    private static Color colorBlockGr = new Color(2,140,80);
    private static Color colorBlockBlGr = new Color(2,142,143);
    private static Color colorBlockBl = new Color(1,81,144);
    private static Color colorBlockBlF = new Color(23,48,128);
    private static Color colorBlockF = new Color(75,30,121);
    private static Color colorBlockRF = new Color(136,15,120);
    private static Color colorBlockR = new Color(187,18,25);
    private static Color colorBlockROr = new Color(189,50,47);
    private static Color colorBlockOr = new Color(196, 107 , 23);
    private static Color colorBlockYOr = new Color(195,134,17);
    private static Color colorBlockY = new Color(205,192,0);
    protected static ArrayList<Color> colorBlock = new ArrayList<Color>
            (Arrays.asList(colorBlockYGr, colorBlockGr, colorBlockBlGr, colorBlockBl, colorBlockBlF,
                    colorBlockF, colorBlockRF, colorBlockR, colorBlockROr, colorBlockOr, colorBlockYOr, colorBlockY));
    private static Color colorBlockBorder;



    // Constructor
    Setting(){

    }

    //Function
    public static int getRadius() {
        return radius;
    }

    public static void setRadius(int radius) {
        Setting.radius = radius;
    }

    public static Color getColorBall() {
        return colorBall;
    }

    public void setColorBall(Color colorBall) {
        this.colorBall = colorBall;
    }

    public static int getSpeedBall() {
        return speedBall;
    }

    public static void setSpeedBall(int speedBall) {
        Setting.speedBall = speedBall;
    }

    public static int getWidthPalka() {
        return widthPalka;
    }

    public static void setWidthPalka(int widthPalka) {
        Setting.widthPalka = widthPalka;
    }

    public static int getHeightPalka() {
        return heightPalka;
    }

    public static void setHeightPalka(int heightPalka) {
        Setting.heightPalka = heightPalka;
    }

    public static int getSpeedPalka() {
        return speedPalka;
    }

    public static void setSpeedPalka(int speedPalka) {
        Setting.speedPalka = speedPalka;
    }

    public static Color getColorPalka() {
        return colorPalka;
    }

    public void setColorPalka(Color colorPalka) {
        this.colorPalka = colorPalka;
    }

    public static int getWidthBlock() {
        return widthBlock;
    }

    public static void setWidthBlock(int widthBlock) {
        Setting.widthBlock = widthBlock;
    }

    public static int getHeightBlock() {
        return heightBlock;
    }

    public static void setHeightBlock(int heightBlock) {
        Setting.heightBlock = heightBlock;
    }

    public static Color getColorBlock(int i) {
        return colorBlock.get(i);
    }

    public static Color getColorBlockBorder(int i) {
        return colorBlock.get(i).darker();
    }

    public void setColorBlockBorder(Color colorBlockBorder) {
        this.colorBlockBorder = colorBlockBorder;
    }
}
