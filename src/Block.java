import java.awt.*;

public class Block {



    //Field
    protected int xBlock = 0;
    protected int yBlock = 0;
    protected static int widthBlock = Setting.getWidthBlock();
    protected static int heightBlock = Setting.getHeightBlock();
    private Color colorBlock;
    private Color colorBlockBorder;
    protected boolean removeBlock = false;


    // Constructor
    protected Block(int xBlock, int yBlock, Color colorBlock){
        this.xBlock = xBlock;
        this.yBlock = yBlock;
        this.colorBlock = colorBlock;
        this.colorBlockBorder = colorBlock.darker();
    }


    //Function
    protected void drawBlock(Graphics2D g){
        g.setColor(colorBlock);
        g.fillRect(xBlock,yBlock,widthBlock,heightBlock);
        g.setColor(colorBlockBorder);
        g.setStroke(new BasicStroke(2));
        g.drawRect(xBlock,yBlock,widthBlock,heightBlock);
        g.drawLine(xBlock + widthBlock/4, yBlock + heightBlock/2,
                xBlock + widthBlock*3/4,yBlock + heightBlock/2);
    }

    protected int getXBlock(){
        return xBlock;
    }
    protected int getYBlock(){
        return yBlock;
    }





}
