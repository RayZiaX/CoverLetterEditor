package ccl.Graphics.Components.Edtion.Alignment;
import ccl.Graphics.Components.Edtion.MEditor;

import javax.swing.text.Style;

import java.awt.Font;

import javax.swing.JTextPane;
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;


public class AlignText extends MEditor{

    public AlignText(JTextPane textPane){
        super.setEditor(textPane);
        super.setStyledDoc(super._editor);
        super._editor.setFont(new Font("Arial",0,12));
    }

    public void setAlignment(int align){
        MutableAttributeSet attr = new SimpleAttributeSet();
        StyleConstants.setAlignment(attr, align);
        setParagraphAttributes(attr,false);
    }

}
