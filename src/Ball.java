import java.awt.*;

public class Ball {


    //Field
    protected static int xBall;
    protected static int yBall;
    private static int radius = Setting.getRadius();
    private Color color = Setting.getColorBall();

    public static int speedBall = Setting.getSpeedBall();
    private int XcenterBall = xBall+radius;
    private int YcenterBall = yBall+radius;

    private static boolean moveUpVerticalVector = true;
    private static boolean moveRightGorizontVector = true;

    private static int dX = (int) Math.sqrt(speedBall*speedBall/2);
    private static int dY = (int) Math.sqrt(speedBall*speedBall/2);


    // Constructor
    protected Ball(){
        xBall = GamePanel.WIDTH_FRAME/2;
        yBall = Palka.yPalka - 2*radius;

    }

    //Function
    public static int getxBall() {  return xBall; }
    public static void setxBall(int xBall) { Ball.xBall = xBall; }
    public static int getyBall() {  return yBall; }
    public static void setyBall(int yBall) { Ball.yBall = yBall; }
    public static int getRadius() {  return radius; }

    protected void moveBall(){

        //направление движения
        if(moveRightGorizontVector) xBall = xBall+dX;
        if(!moveRightGorizontVector) xBall = xBall-dX;
        if(moveUpVerticalVector)  yBall = yBall-dY;
        if(!moveUpVerticalVector)  yBall = yBall+dY;
        //отскок от внешних границ
        if(xBall<= 0) moveRightGorizontVector = true;
        if((xBall + 2*radius) >= GamePanel.WIDTH_FRAME) moveRightGorizontVector = false;
        if(yBall<= 0) moveUpVerticalVector = false;
        if((yBall + 2*radius) > Palka.yPalka  && (yBall + 2*radius) < (Palka.yPalka + Palka.HEIGTH) &&
                (xBall+2*radius)>=Palka.xPalka && xBall <=(Palka.xPalka + Palka.WIDTH))   moveUpVerticalVector = true;

    }

    public static boolean isMoveUpVerticalVector() {
        return moveUpVerticalVector;
    }

    public void setMoveUpVerticalVector(boolean moveUpVerticalVector) {
        this.moveUpVerticalVector = moveUpVerticalVector;
    }

    public static boolean isMoveRightGorizontVector() {
        return moveRightGorizontVector;
    }

    public void setMoveRightGorizontVector(boolean moveRightGorizontVector) {
        this.moveRightGorizontVector = moveRightGorizontVector;
    }

    protected int getXcenterBall(){
        return XcenterBall;
    }

    protected int getYcenterBall(){
        return YcenterBall;
    }

    public static void setSpeedBall(int speedBall) {
        Ball.speedBall = speedBall;
    }

    protected void drawBall(Graphics2D g){
        g.setColor(color);
        g.fillOval(xBall, yBall, 2*radius, 2*radius);
    }


}
