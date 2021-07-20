package ccl.Graphics.Components;

import javax.swing.JButton;

public class MButton extends JButton{
    private String _name,_text;
    public MButton(String name,String text){
        this._name = name;
        this._text = text;
        this.setName(this._name);
        this.setText(this._text);
    }
}
