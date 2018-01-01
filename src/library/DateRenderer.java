/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author squad
 */
public class DateRenderer extends DefaultTableCellRenderer{
    SimpleDateFormat formatter;
    
    public DateRenderer()
    {
        super();
    }
    
    @Override
    public void setValue(Object value)
    {
        if(formatter==null)
            formatter=new SimpleDateFormat("dd/MM/yyyy");
        
        setText((value==null) ? "" : formatter.format(value));
    }
    
}
