package ccl.Graphics.Components;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;

import ccl.Graphics.Events.EventClickMenuItem;

import java.awt.event.KeyEvent;

public class MMenuBar extends JMenuBar{
    public MMenuBar(){
        JMenu file = new JMenu("Action");

        JMenuItem newFileItem = new JMenuItem("New file");
        JMenuItem editFileItem = new JMenuItem("Edit file");
        JMenuItem templateFileItem = new JMenuItem("Use Template");
        JMenuItem saveFile = new JMenuItem("Save file");
        JMenuItem saveFileAs = new JMenuItem("Save file as");
        JMenuItem openFile = new JMenuItem("Open file");
        JMenuItem exitItem = new JMenuItem("Exit");
        newFileItem.setMnemonic(KeyEvent.VK_N);
        editFileItem.setMnemonic(KeyEvent.VK_E);
        exitItem.setMnemonic(KeyEvent.VK_Q);
        templateFileItem.setMnemonic(KeyEvent.VK_T);
        exitItem.addActionListener(new EventClickMenuItem("EXIT"));
        newFileItem.addActionListener(new EventClickMenuItem("NEW"));
        templateFileItem.addActionListener(new EventClickMenuItem("TEMPLATE"));
        saveFile.addActionListener(new EventClickMenuItem("REGISTER FILE"));
        saveFileAs.addActionListener(new EventClickMenuItem("REGISTER FILE AS"));
        openFile.addActionListener(new EventClickMenuItem("OPENT FILE"));
        newFileItem.setActionCommand("New");
        editFileItem.setActionCommand("Edit");
        saveFile.setActionCommand("Register");
        saveFileAs.setActionCommand("Register as");
        openFile.setActionCommand("Open file");
        exitItem.setActionCommand("Exit");
        templateFileItem.setActionCommand("Template");
        file.add(newFileItem);
        file.add(editFileItem);
        file.add(templateFileItem);
        file.add(new JSeparator());
        file.add(saveFile);
        file.add(saveFileAs);
        file.add(openFile);
        file.add(new JSeparator());
        file.add(exitItem);
        this.add(file);
    }
}
