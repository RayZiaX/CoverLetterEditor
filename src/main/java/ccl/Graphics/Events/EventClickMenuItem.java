package ccl.Graphics.Events;

import java.awt.event.*;
import java.io.IOException;

import ccl.Graphics.Components.Edtion.GeneratePDF;
import ccl.Graphics.GUI.MainFrame;

public class EventClickMenuItem implements ActionListener{
    
    private String _type;
    public EventClickMenuItem(String type){
        this._type = type;
    }

    @Override
    public void actionPerformed(ActionEvent a){
        if(this._type == "EXIT"){
            System.exit(1);
        }
        if(this._type == "NEW"){
            changeLayout();
            MainFrame.getInstance().newFile();
        }
        if(this._type == "COPY"){
        }
        if(this._type == "TEMPLATE"){
            try {
                changeLayout();
                MainFrame.getInstance().modelFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }if(this._type == "REGISTER FILE"){
            try{
                GeneratePDF pdf = new GeneratePDF("name");
                pdf.createPDFFile();
            }catch(Exception e){
                System.out.print(e);
            }
        }
    }

    private void changeLayout(){
        MainFrame.getInstance().getContentPane().removeAll();
        MainFrame.getInstance().repaint();
    }
}
