/**
 * Clase: ConvertirCaracteresMayuscula.java
 *
 * Version: 1.0
 *
 * Fecha Creacion: 3/03/2011
 *
 * Fecha Modificacion: 
 *
 * Autor: Ing. Jhon Jaime Mendez
 *
 * Copyrigth: JASoft
 */

package paquete.CECAR.edu;


import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;


/*
 * Esta clase permite configurar un evento para validar que solo se digiten mayusculas y un numero
 * maximo de caracteres
 */

final public class ConvertirCaracteresMayuscula extends KeyAdapter {
   
   private JTextField jtextField;

   public void  keyTyped (KeyEvent k) {
   	   
   	   jtextField = (JTextField) k.getComponent();
   	 
   	   if (k.getComponent().getName()!= null && jtextField.getText().length() >= Integer.parseInt(k.getComponent().getName()) || k.getKeyChar() == '\'')
	  
	     k.consume();
	  
	   else  
		   
	     k.setKeyChar(String.valueOf(k.getKeyChar()).toUpperCase().charAt(0));
   }
}




 