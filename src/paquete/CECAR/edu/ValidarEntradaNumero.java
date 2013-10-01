package paquete.CECAR.edu;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JTextField;


public class ValidarEntradaNumero extends KeyAdapter{
	
	private JTextField jtextField;

	   public void  keyTyped (KeyEvent k) {
	   	   
	   	   jtextField = (JTextField) k.getComponent();
	   	 
	   	   if (k.getComponent().getName()!= null && jtextField.getText().length() >= Integer.parseInt(k.getComponent().getName()) || k.getKeyChar() == '\'')
		  
		     k.consume();
		  
		   else  
			   
		     if (!Character.isDigit(k.getKeyChar()))
		    	 
		    	 k.consume();
	   }

}
