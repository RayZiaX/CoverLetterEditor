package ccl.Graphics.Events;

import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.swing.JTextPane;

import ccl.Graphics.Components.MJTree;


public class EventMouseClickJTree implements MouseListener{
    private MJTree _tree;
    private JTextPane _textArea;
    public EventMouseClickJTree(MJTree tree,JTextPane textArea){
        this._tree = tree;
        this._textArea = textArea;
    }

    @Override
    public void mouseClicked(MouseEvent e){
        if(e.getClickCount() == 2){
            String nameNode = this._tree.getLastSelectedPathComponent().toString();
            for (int i = 0; i < this._tree._templateName.size(); i++) {
                if(nameNode.equals(this._tree._templateName.get(i))){
                    try {
                        appliedTemplate(this._tree.getLastSelectedPathComponent());
                    } catch (IOException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
                }
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    /**
     * method can search and read file and insert data into textArea
     * @throws IOException
     */
    private void appliedTemplate(Object object) throws IOException{
        String fileContent = new String();
        String[] splitArray = null;
        InputStream template = new FileInputStream("./src/main/java/ccl/Template/"+object);
        int BUFFER_SIZE = 8192;
        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(template,"utf8"),BUFFER_SIZE));
        String str;
        
        while ((str = br.readLine())!= null) {
            // System.out.println(str);
            fileContent += str;
        }
        splitArray = fileContent.split(";");
        
        fileContent = "";
        for (int i = 0; i < splitArray.length; i++) {
            if (splitArray[i].equals("[spacer]")) {
                fileContent += System.getProperty("line.separator");
            } else if(splitArray[i].equals("[litlespacer]")) {
                fileContent += System.getProperty("line.separator");
            }else{
                fileContent += splitArray[i];
            }
        }
        this._textArea.setText(fileContent);
        br.close();
    }
}
