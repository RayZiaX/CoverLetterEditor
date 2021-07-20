package ccl.Graphics.Events;

import java.awt.event.ActionListener;


import ccl.Graphics.GUI.MainFrame;

import java.awt.event.ActionEvent;
public class EventSendData implements ActionListener{
    
    public EventSendData(){
    }
    @Override
    public void actionPerformed(ActionEvent a){


        if(getDataPane() == "" ){
            System.out.println("c'est vide");
        }else{
            System.out.println(getDataPane());
        }
    }

    public String getDataPane(){
        return MainFrame.getInstance()._textPane.getText();
    }
}
