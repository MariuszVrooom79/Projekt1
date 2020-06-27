package game;

import javax.swing.*;
import java.awt.*;

public class Gra2048 extends JPanel {

    private static final Color BG_COLOR = new Color(0xbbada0);
    private static final String FONT_NAME = "Arial";
    private static final int TILE_SIZE = 90;
    private static final int TILES_MARGIN = 15;

    private Poziom1[] myTiles;
    boolean myWin = false;
    boolean myLose = false;
    int myScore = 0;

    public Gra2048(){


    }

}
