package ccl.Graphics.Components.Frames;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Component;

public class BorderL extends BorderLayout{
    /**
     * 
    */
    public void addContent(JFrame frame,Component component,String side){
        switch (side) {
            case "CENTER":
                frame.getContentPane().add(component,BorderLayout.CENTER);
                break;
            case "LEFT":
                frame.getContentPane().add(component,BorderLayout.WEST);
                break;
            case "RIGHT":
                frame.getContentPane().add(component,BorderLayout.EAST);
                break;
            case "BOTTOM":
                frame.getContentPane().add(component,BorderLayout.SOUTH);
                break;
            case "TOP":
                frame.getContentPane().add(component,BorderLayout.NORTH);
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
}
