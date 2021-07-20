package ccl.Graphics.Events;

import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

public class EventMenu implements MenuListener{
    @Override
    public void menuSelected(MenuEvent e){
        System.out.print(e);
        System.out.print("fruit");
    }

    @Override
    public void menuDeselected(MenuEvent e) {
        
    }

    @Override
    public void menuCanceled(MenuEvent e) {
        
    }
}
