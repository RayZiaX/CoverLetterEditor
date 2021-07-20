package ccl;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import ccl.Graphics.GUI.MainFrame;



public class CCL {

    private String[] _params;

    CCL(String[] args){
        this._params = args;
    }

    public void show(){
        MainFrame.getInstance();
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel( new NimbusLookAndFeel() );
        } catch (UnsupportedLookAndFeelException e) {
            System.err.println("obj");;
        }
        new CCL(args).show();
    }
    
}