package ccl.Graphics.Components.Edtion.FontStyle;

import javax.swing.JTextPane;
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledEditorKit;

import ccl.Graphics.Components.Edtion.MEditor;

public class Bold extends MEditor{
    public Bold(JTextPane textPane){
        setEditor(textPane);
        setStyledDoc(super._editor);
    }

    public void setBold(){
        StyledEditorKit kit = (StyledEditorKit) super._editor.getEditorKit();
        MutableAttributeSet attr = kit.getInputAttributes();
        boolean bold = (StyleConstants.isBold(attr)) ? false : true;
        SimpleAttributeSet sas = new SimpleAttributeSet();
        StyleConstants.setBold(attr, bold);
        setParagraphAttributes(sas,false);
    }
}
