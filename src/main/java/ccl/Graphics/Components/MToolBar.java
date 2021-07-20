package ccl.Graphics.Components;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;
import javax.swing.text.StyledEditorKit.*;
import ccl.Graphics.Events.EventClickButton;

import java.awt.FlowLayout;
import java.awt.Insets;

public class MToolBar extends JToolBar{
    // public MToolBar(){
    //     this.setLayout(new FlowLayout(FlowLayout.LEFT));
    //     JButton btn = new JButton("Enregistrer");
    //     this.add(btn);
    //     this.add(new JButton("button 2"));
    //     this.add(new JButton("button 3"));
    //     this.add(new JButton("button 4"));
    // }
    public MToolBar(){
        this.setLayout(new FlowLayout(FlowLayout.LEFT));
        // JButton btn = new JButton(new AlignmentAction("RIGHT",StyleConstants.ALIGN_RIGHT));
        
        // Alignment 
        JButton rightBtn = new JButton(new ImageIcon("./src/main/java/ccl/Graphics/Asset/IconButton/right-align.png"));
        JButton leftBtn = new JButton(new ImageIcon("./src/main/java/ccl/Graphics/Asset/IconButton/left-align.png"));
        JButton justifyBtn = new JButton(new ImageIcon("./src/main/java/ccl/Graphics/Asset/IconButton/justification.png"));
        JButton centerBtn = new JButton(new ImageIcon("./src/main/java/ccl/Graphics/Asset/IconButton/center-align.png"));
        
        rightBtn.setName("RIGHT");
        rightBtn.addActionListener(new EventClickButton(rightBtn.getName()));
        rightBtn.setMargin(new Insets(2, 5, 2, 5));

        justifyBtn.setName("JUSTIFY");
        justifyBtn.addActionListener(new EventClickButton(justifyBtn.getName()));
        justifyBtn.setMargin(new Insets(2, 5, 2, 5));
    
        centerBtn.setName("CENTER");
        centerBtn.addActionListener(new EventClickButton(centerBtn.getName()));
        centerBtn.setMargin(new Insets(2, 5, 2, 5));
    
        leftBtn.setName("LEFT");
        leftBtn.addActionListener(new EventClickButton(leftBtn.getName()));
        
        // Font-Size
        JButton boldBtn = new JButton(new BoldAction());
        JButton italicBtn = new JButton(new ItalicAction());
        JButton underLineBtn = new JButton(new UnderlineAction());
        
        underLineBtn.setIcon(new ImageIcon("./src/main/java/ccl/Graphics/Asset/IconButton/underline.png"));
        underLineBtn.setName("UNDERLINE");
        underLineBtn.setText("");
        underLineBtn.setMargin(new Insets(2, 5, 2, 5));
        underLineBtn.addActionListener(new EventClickButton("FONT-SIZE"));

        boldBtn.setIcon(new ImageIcon("./src/main/java/ccl/Graphics/Asset/IconButton/bold.png"));
        boldBtn.setText("");
        boldBtn.setMargin(new Insets(2, 5, 2, 5));
        boldBtn.setName("BOLD");
        boldBtn.addActionListener(new EventClickButton("FONT-SIZE"));

        italicBtn.setName("ITALIC");
        italicBtn.setText("");
        italicBtn.setMargin(new Insets(2, 5, 2, 5));
        italicBtn.setIcon(new ImageIcon("./src/main/java/ccl/Graphics/Asset/IconButton/italic.png"));
        italicBtn.addActionListener(new EventClickButton("FONT-SIZE"));

        JButton testBtn = new JButton("test");
        testBtn.setName("TEST");
        testBtn.setMargin(new Insets(2, 5, 2, 5));
        testBtn.addActionListener(new EventClickButton("TEST"));

        this.add(underLineBtn);
        this.add(italicBtn);
        this.add(boldBtn);
        this.addSeparator();
        this.add(leftBtn);
        this.add(centerBtn);
        this.add(rightBtn);
        this.add(justifyBtn);
        this.addSeparator();
        this.add(testBtn);
    }
}
