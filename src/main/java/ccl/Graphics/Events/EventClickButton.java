package ccl.Graphics.Events;
import java.awt.event.*;
import java.awt.font.TextAttribute;
import java.text.AttributedString;
import java.text.AttributedCharacterIterator.Attribute;
import java.awt.Color;

import javax.swing.plaf.ColorUIResource;
import javax.swing.text.BadLocationException;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import javax.swing.text.StyledEditorKit;
import javax.swing.text.StyledEditorKit.StyledTextAction;
import javax.swing.text.StyledEditorKit.*;

import ccl.Graphics.Components.Edtion.GeneratePDF;
import ccl.Graphics.Components.Edtion.Alignment.AlignText;
import ccl.Graphics.Components.Edtion.FontStyle.Bold;
import ccl.Graphics.GUI.MainFrame;

public class EventClickButton implements ActionListener{
    private String _btnName;
    private StyledEditorKit _kit;
    private StyledTextAction _kitAction;
    public EventClickButton(String btnName){
        this._btnName = btnName;
        _kit = new StyledEditorKit();
    }

    @Override
    public void actionPerformed(ActionEvent a){
        if(this._btnName.equals("RIGHT")){
            AlignText alignText = new AlignText(MainFrame.getInstance()._textPane);
            alignText.setAlignment(StyleConstants.ALIGN_RIGHT);
            MainFrame.getInstance()._textPane.requestFocusInWindow();
        }
        if(this._btnName.equals("LEFT")){
            AlignText alignText = new AlignText(MainFrame.getInstance()._textPane);
            alignText.setAlignment(StyleConstants.ALIGN_LEFT);
            MainFrame.getInstance()._textPane.requestFocusInWindow();
        }
        if(this._btnName.equals("JUSTIFY")){
            AlignText alignText = new AlignText(MainFrame.getInstance()._textPane);
            alignText.setAlignment(StyleConstants.ALIGN_JUSTIFIED);
            MainFrame.getInstance()._textPane.requestFocusInWindow();
        }
        if(this._btnName.equals("CENTER")){
            AlignText alignText = new AlignText(MainFrame.getInstance()._textPane);
            alignText.setAlignment(StyleConstants.ALIGN_CENTER);
            MainFrame.getInstance()._textPane.requestFocusInWindow();
        }
        if(this._btnName.equals("FONT-SIZE")){
            MainFrame.getInstance()._textPane.requestFocusInWindow();
        }
        if(this._btnName.equals("TEST")){
            String test = MainFrame.getInstance()._textPane.getSelectedText();
            Color red = new Color(255, 0, 0);
            AttributedString attr = new AttributedString(test);
            attr.addAttribute(TextAttribute.FOREGROUND, red);
            System.out.println();
            // GeneratePDF pdf = new GeneratePDF("PD");
            // pdf.test(attr);
            MainFrame.getInstance()._textPane.requestFocusInWindow();
        }
    }
}
