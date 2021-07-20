package ccl.Graphics.GUI;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.SwingUtilities;
import javax.swing.text.DefaultStyledDocument;

import java.awt.Dimension;

import java.io.*;

import ccl.Graphics.Components.MJPopuMenu;
import ccl.Graphics.Components.MJTree;
import ccl.Graphics.Components.MMenuBar;
import ccl.Graphics.Components.MToolBar;
import ccl.Graphics.Components.Frames.*;
// import jdk.internal.org.jline.utils.InputStreamReader;
import ccl.Graphics.Events.EventMouseClickPopupMenu;

public class MainFrame extends JFrame{
    private static MainFrame instance;
    public JTextPane _textPane;

/**
 * Constructor MainFrame class
 */

    private MainFrame(){
        this.setSize(1280, 720);
        this.setJMenuBar(new MMenuBar());
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(3);
        this.setVisible(true);
        newFile();
    }


    /**
     * instantiate singleton
     * @return instance
     */
    public static MainFrame getInstance(){
        if(instance == null){
            instance = new MainFrame();
        }
        return instance;
    }

/**
 * method create a UI for create a text file
 */

    public void newFile(){
        this.setTitle("New file");
        BorderL bl = new BorderL();
        this._textPane = new JTextPane(new DefaultStyledDocument());
        MJPopuMenu popuMenu = new MJPopuMenu();
        this._textPane.addMouseListener(new EventMouseClickPopupMenu(popuMenu));
        JScrollPane scrollTextArea = new JScrollPane(this._textPane);
        this.getContentPane().setLayout(bl);
        bl.addContent(this, scrollTextArea, "CENTER");
        bl.addContent(this, new MToolBar(), "TOP");
        updateUI();
    }

    public void editFile(){
        
        
        updateUI();
    }
    /**
     * method create a layout and insert text content in file and add this data in textArea
     */
    public void modelFile() throws IOException{
        BorderL bl = new BorderL();
        Dimension dim = new Dimension(200,0);
        MJTree tree = new MJTree(dim,this._textPane);
        tree.addCategory("Template");
        tree.addFileName(0);
        tree.addChildIntoParent(MJTree._root, tree.getOneFirstRankTreeNode(0));
        JScrollPane scrollTextArea = new JScrollPane(this._textPane);
        JScrollPane scrollTree = new JScrollPane(tree);
        this.getContentPane().setLayout(bl);
        bl.addContent(this, scrollTextArea, "CENTER");
        bl.addContent(this, scrollTree, "LEFT");
        bl.addContent(this, new MToolBar(), "TOP");
        updateUI();
    }

    public void updateUI(){
        SwingUtilities.updateComponentTreeUI(this);
    }


    public String getSelectedText() {
        return null;
    }

}
