package ccl.Graphics.Components;

import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

import ccl.Graphics.Events.EventClickMenuItem;
import ccl.Graphics.Events.EventSendData;

public class MJPopuMenu extends JPopupMenu{
    public MJPopuMenu(){
        JMenuItem copy = new JMenuItem("Copy");
        JMenuItem paste = new JMenuItem("Paste");
        copy.addActionListener(new EventSendData());
        this.add(copy);
        this.add(paste);
    }
}
