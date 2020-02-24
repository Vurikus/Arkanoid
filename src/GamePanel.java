import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class GamePanel extends JPanel implements Runnable {

    //Field
    public static final int WIDTH_FRAME = 800;
    public static final int HEIGHT_FRAME = 600;

    private BufferedImage gameFieldImage;
    private Graphics2D gameGraphics;
    private Thread thread;

    private static Background background = new Background();
    private static Palka palka = new Palka();
    private static Ball ball = new Ball();
    private BlocksMap blocksMap = new BlocksMap();

    private int FPS = 60;
    private long timerFPS;
    private double millisToFPS = 1000/FPS;
    private int sleepTime = 1;

    public static ArrayList<Block> blocks = new ArrayList<Block>();


    //Constructor
    public GamePanel (){

        setPreferredSize(new Dimension(WIDTH_FRAME,HEIGHT_FRAME));
        setFocusable(true);
        requestFocus();
        addKeyListener(new Listener());

    }

    //Function
    public void start(){
        thread = new Thread(this);
        thread.start();
    }

    public void run() {

        gameFieldImage = new BufferedImage(WIDTH_FRAME, HEIGHT_FRAME, BufferedImage.TYPE_INT_RGB);
        gameGraphics = (Graphics2D) gameFieldImage.getGraphics();
        gameGraphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);



        while (true){

            timerFPS = System.currentTimeMillis();
            gameDraw();
            paintGraphics(gameGraphics);
            removeBlocks();
            sleepThread();

        }
    }

    private void sleepThread(){

        timerFPS = System.currentTimeMillis() - timerFPS;

        if (millisToFPS > timerFPS) {
            sleepTime = (int) (millisToFPS - timerFPS);
        } else sleepTime = 1;

        try {
            thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    private void removeBlocks(){

        for(int i = 0; i<blocks.size(); i++){

            blocks.get(i).drawBlock(gameGraphics);

            if((ball.getxBall()+2*Ball.getRadius()) >= blocks.get(i).getXBlock() &&
                    (ball.getxBall()+2*Ball.getRadius()) <= (blocks.get(i).getXBlock()+ Block.widthBlock) ||
                    ball.getxBall() >= blocks.get(i).getXBlock() &&
                            ball.getxBall() <= (blocks.get(i).getXBlock()+ Block.widthBlock)) {

                if((ball.getyBall() + 2*Ball.getRadius()) >= blocks.get(i).getYBlock() &&
                        (ball.getyBall() + 2*Ball.getRadius())<= (blocks.get(i).getYBlock() + Block.heightBlock)||
                        ball.getyBall() >= blocks.get(i).getYBlock() &&
                                ball.getyBall() <= (blocks.get(i).getYBlock() + Block.heightBlock)){


                    if(ball.getyBall() >= blocks.get(i).getYBlock() &&
                            ball.getyBall() <= (blocks.get(i).getYBlock() + Block.heightBlock))

                        ball.setMoveUpVerticalVector(false);

                    if((ball.getyBall() + 2*Ball.getRadius()) >= blocks.get(i).getYBlock() &&
                            (ball.getyBall() + 2*Ball.getRadius())<= (blocks.get(i).getYBlock() + Block.heightBlock))

                        ball.setMoveUpVerticalVector(true);

                    if(ball.getxBall() >= blocks.get(i).getXBlock() &&
                            ball.getxBall() <= (blocks.get(i).getXBlock()+ Block.widthBlock))

                        ball.setMoveRightGorizontVector(true);

                    if((ball.getxBall()+2*Ball.getRadius()) >= blocks.get(i).getXBlock() &&
                            (ball.getxBall()+2*Ball.getRadius()) <= (blocks.get(i).getXBlock()+ Block.widthBlock))

                        ball.setMoveRightGorizontVector(false);


                    blocks.remove(i);
                    i--;
                }
            }
        }
    }

    private void paintGraphics(Graphics2D g){
        background.draw(g);
        palka.drawPalka(g);
        ball.moveBall();
        ball.drawBall(g);
        if(blocks.size()==0)  blocksMap.fillFieldBlocks();
    }

    public void gameDraw(){
        Graphics g = this.getGraphics();
        g.drawImage(gameFieldImage, 0,0, null);
        g.dispose();
    }
}
