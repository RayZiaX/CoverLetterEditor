package ccl.Graphics.Components.Frames;

import javax.swing.JFrame;

import java.awt.GridLayout;
public class GridFrame extends JFrame{
    /**
     * Constructor for create frame with layout grid
     * Take params "col" for number columns, "row" for number rows, "spaceTopBottom" for space between top and bottom items, "spaceRightLeft" for space between right and left items
     * title for take title frame 
     * width and height set size frame
     * @param row
     * @param col
     * @param spaceTopBottom
     * @param spaceRightLeft
     * @param title
     * @param width
     * @param height
     */
    public GridFrame(int row,int col,int spaceTopBottom,int spaceRightLeft, String title, int width,int height){
        setTitle(title);
        getContentPane().setLayout(new GridLayout(row,col,spaceTopBottom,spaceRightLeft));
        setSize(width,height);
        setVisible(true);
        setDefaultCloseOperation(3);
    }
}
