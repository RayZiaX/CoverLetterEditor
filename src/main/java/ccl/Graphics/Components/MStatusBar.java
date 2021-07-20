package ccl.Graphics.Components;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.FlowLayout;

public class MStatusBar extends JPanel {
    public MStatusBar(){
        this.setLayout(new FlowLayout(FlowLayout.LEFT));
        this.add(new JLabel("message 1"));
        this.add(new JLabel("message 2"));
        this.add(new JLabel("message 3"));
    }
}
