package ccl.Graphics.Components.Edtion;

import javax.swing.JEditorPane;
import javax.swing.JTextPane;
import javax.swing.text.AttributeSet;
import javax.swing.text.Document;

import javax.swing.text.StyledDocument;


abstract public class MEditor {
    protected JEditorPane _editor;
    protected StyledDocument _docStyled;
    
    protected StyledDocument setStyledDoc(JEditorPane editorPane){
        Document doc = this._editor.getDocument();
        if(doc instanceof StyledDocument){
            return this._docStyled = (StyledDocument)doc;
        }
        throw new IllegalArgumentException("document must be StyledDocument");
    }

    protected JEditorPane setEditor(JTextPane textPane){
        if(textPane instanceof JEditorPane){
            return this._editor = (JEditorPane)textPane;
        }
        throw new IllegalArgumentException("editor must be JTextPane");
    }

    public JEditorPane getEditor(){
        return this._editor;
    }
    public StyledDocument getDocStyled(){
        return this._docStyled;
    }

    protected void setParagraphAttributes(AttributeSet attr, boolean replace){

        int p0 = this._editor.getSelectionStart();
        int p1 = this._editor.getSelectionEnd();
        StyledDocument doc = this._docStyled;
        doc.setParagraphAttributes(p0, p1 - p0, attr, false);
    }
}
