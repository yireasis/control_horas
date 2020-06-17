package Ventanas;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class Limitador  extends PlainDocument{
    private int limit;
    
    public Limitador (int tamanio){
        super();
        this.limit = tamanio;
    }
    
    public void insertString (int offset, String str, AttributeSet set)throws BadLocationException
    {
        if (str == null)
        
        return;
         if((getLength() + str.length()) <= limit)
            //str = str.toUpperCase();
            super.insertString(offset, str, set);
    }
    
    
}
