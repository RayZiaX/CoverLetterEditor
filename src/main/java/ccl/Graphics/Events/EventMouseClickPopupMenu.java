package ccl.Graphics.Events;

import java.awt.event.*;
import ccl.Graphics.Components.MJPopuMenu;

public class EventMouseClickPopupMenu implements MouseListener{

    private MJPopuMenu _popuMenu;
    public EventMouseClickPopupMenu(MJPopuMenu popuMenu){
        this._popuMenu = popuMenu;
    }

    @Override
    public void mouseClicked(MouseEvent e){

    }

    @Override
    public void mousePressed(MouseEvent e) {
        if(e.getButton() == 3){
            this._popuMenu.show(e.getComponent(), e.getX(), e.getY());;
        }
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
}
