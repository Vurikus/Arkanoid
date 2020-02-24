import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

public class BlocksMap {
    //Field. Standart Field: WIDTH = 16 Blocks, HEIGHT = 15 Blocks

    private byte WidthFrameOfBlocks = Setting.WIDTH_FRAME_IN_BLOCKS;
    private byte HeightFrameOfBlocks = Setting.HEIGHT_FRAME_IN_BLOCKS;
    private byte random;
    //private ArrayList AllField = new ArrayList();
    private ArrayList <Color> color = Setting.colorBlock;

    //BlocksMap
    private ArrayList field1 = new ArrayList(Arrays.asList(

            null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
            null, color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()),color.get(Random()), color.get(Random()), null,
            null, color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()),color.get(Random()), color.get(Random()), null,
            null, color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()),color.get(Random()), color.get(Random()), null,
            null, color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()),color.get(Random()), color.get(Random()), null,
            null, color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()),color.get(Random()), color.get(Random()), null,
            null, color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()),color.get(Random()), color.get(Random()), null,
            null, color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()),color.get(Random()), color.get(Random()), null,
            null, color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()),color.get(Random()), color.get(Random()), null,
            null, color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()),color.get(Random()), color.get(Random()), null,
            null, color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()),color.get(Random()), color.get(Random()), null));

    private ArrayList field2 = new ArrayList(Arrays.asList(

            null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
            color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()),color.get(Random()), color.get(Random()), color.get(Random()),
            color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()),color.get(Random()), color.get(Random()), color.get(Random()),
            color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()),color.get(Random()), color.get(Random()), color.get(Random()),
            null, color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()),color.get(Random()), color.get(Random()), null,
            null, null, color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()),color.get(Random()), null, null,
            null, null, color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()),color.get(Random()), null, null,
            null, color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()),color.get(Random()), color.get(Random()), null,
            color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()),color.get(Random()), color.get(Random()), color.get(Random()),
            color.get(Random()), color.get(Random()), color.get(Random()), null, color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), null,color.get(Random()), color.get(Random()), color.get(Random()),
            color.get(Random()), color.get(Random()), null, null, null, color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), color.get(Random()), null, null,null, color.get(Random()), color.get(Random())));


    // Constructor
    protected BlocksMap(){

    }

    //Function
    protected byte Random (){
        random = (byte)(Math.random()*12);
        return random;
    }

    protected void fillFieldBlocks(){
        createBlocksMap_One(field2);
    }

    private void createBlocksMap_One(ArrayList blocksMap){
        byte x = 0;
        byte y = 0;
        byte counter = 0;
        for (int i = 0; i < blocksMap.size(); i++) {
            if (counter==WidthFrameOfBlocks) {
                x = 0;
                y++;
                counter = 0;
            }
            if(blocksMap.get(i) != null) {
                GamePanel.blocks.add(new Block(x * Block.widthBlock, y * Block.heightBlock, (Color)blocksMap.get(i)));
            }
            x++;
            counter++;
        }
    }

}
