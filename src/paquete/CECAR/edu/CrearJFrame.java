/*
 * Clase: CrearJFrame
 * 
 * Version : 1.0
 * 
 * Fecha: 2009 - 09 - 03
 * 
 * Autor: Ing. Jhon Jaime Mendez
 * 
 * Copyright: Ing.  Jhon Jaime Mendez
 */

package paquete.CECAR.edu;

import java.awt.AWTKeyStroke;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.util.HashSet;
import java.util.Set;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.text.MaskFormatter;



public class CrearJFrame {


	
	/**
	 * 
	 */
	
	private static JFrame frame;
	private static Set<AWTKeyStroke> upKeys;



	/**
	 * Constructor vacio
	 */
	public CrearJFrame(){}


	/**
	 * Constructor que crea un jFrame a partir del titulo
	 */

	public CrearJFrame (String titulo) {

		configurarJFrame(titulo,800,600);

	}

	/**
	 * Constructor que crea un jFrame a partir del titulo, ancho y alto
	 */
	public CrearJFrame (String titulo,int ancho, int alto) {

		configurarJFrame(titulo,ancho,alto);

	}


	public static void configurarJFrame(String titulo, int ancho, int alto) {

		
		// Se instancia y configura el JFrame
		frame = new JFrame(titulo);
		frame.setSize(ancho,alto);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		frame.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,getUpKeysFrame()); //Permite navegar con Enter y Tab


	}

	/**
	 *  Metodo para configurar un objeto de tipo JLabel y se agrega por defecto en el JFrame
	 *  @param texto Texto que se desea agregar al JLabel
	 *  @param posX Posicion en X
	 *  @param posY Posicion en Y
	 *  @param ancho Ancho 
	 *  @param alto alto
	 *  @return JLabel configurado
	 *  
	 */

	public static JLabel getJLabel(String texto,int posX, int posY, int ancho, int alto) {


		//Se configura el JLabel
		JLabel jLabel = new JLabel(texto);
		jLabel.setBounds(posX,posY,ancho,alto);
		frame.add(jLabel); //Se agrega al JFrame

		return jLabel;

	}

	
	public static JLabel getJLabel(int posX, int posY, int ancho, int alto) {


		//Se configura el JLabel
		JLabel jLabel = new JLabel();
		jLabel.setBorder(new BevelBorder(BevelBorder.RAISED));
		jLabel.setBounds(posX,posY,ancho,alto);
		frame.add(jLabel); //Se agrega al JFrame

		return jLabel;

	}
	
	/**
	  *  Metodo para configurar un objeto de tipo JRadioButton y se agrega por defecto en el JFrame
	  *  @param texto Texto para el JButton
	  *  @param posX Posicion en X
	  *  @param posY Posicion en Y
	  *  @param ancho Ancho 
	  *  @param alto alto
	  *  @param activo true activo, false desactivado
	  *  @return JRadioButton configurado
	  *  
	  */
	
   public static JRadioButton getJRadioButton(String texto, int posX, int posY, int ancho, int alto, ButtonGroup grupo) {
   	
   	   JRadioButton jRadioButton = new JRadioButton(texto);
       jRadioButton.setBounds(posX,posY,ancho,alto);
       jRadioButton.setMnemonic(texto.charAt(0));
       grupo.add(jRadioButton);
       frame.add(jRadioButton);
         
       return jRadioButton;
       
	}
   
   /**
    *  Metodo que configura un JTextField
    *  @param posX Posicion en X
    *  @param posY Posicion en Y
    *  @param ancho Ancho 
    *  @param alto alto
    * @return JTextField configurado
    */
	public static JTextField getJTextField(int posX, int posY, int ancho, int alto ) {

		JTextField jTextfield = new JTextField() {

			static final long serialVersionUID = 19781204;

			public void paste(){};  //Se especifica el metodo paste de esta manera para que no se pueda copiar en el JTextFied
		};	


		jTextfield.setBounds(posX,posY,ancho,alto);
		frame.add(jTextfield); 	    

		return jTextfield;
	}

	
	/**
	 *  Metodo que configura un JTextField con un texto inicial y se agrega por defecto en el JFrame
	 *  @param posX Posicion en X
	 *  @param posY Posicion en Y
	 *  @param ancho Ancho 
	 *  @param alto alto
	 * @return JTextField configurado
	 */
	public static JTextField getJTextField(String texto,int posX, int posY, int ancho, int alto) {

		JTextField jTextfield = getJTextField(posX,posY,ancho,alto);
		jTextfield.setText(texto);
		return jTextfield;
	}

	
	/**
	 *  Metodo que configura un JTextField con un texto inicial y toolTipText
	 *  @param posX Posicion en X
	 *  @param posY Posicion en Y
	 *  @param ancho Ancho 
	 *  @param alto alto
	 * @return JTextField configurado
	 */

	public static JTextField getJTextField(String texto,String toolTipText,int posX, int posY, int ancho, int alto) {

		JTextField jTextfield = getJTextField(texto,posX,posY,ancho,alto);
		jTextfield.setToolTipText(toolTipText);
		return jTextfield;
	}
     
	
	/**
	  *  Metodo para configurar un objeto de tipo JComboBox y se agrega por defecto en el JFrame
	  *  @param posX Posicion en X
	  *  @param posY Posicion en Y
	  *  @param ancho Ancho 
	  *  @param alto alto
	  *  @param toolTipText Texto informativo que se visualiza cuando se coloca el mouse sobre el componente
	  *  @return JComboBox configurado
	  *  
	  */
 	public static JComboBox getJComboBox(int posX, int posY, int ancho, int alto, String toolTipText){
 	 	
 	 	JComboBox jCombobox = new JComboBox();
		
		jCombobox.setBounds(posX,posY,ancho,alto);
		jCombobox.setToolTipText(toolTipText);
		frame.add(jCombobox);
	  	
	  	return jCombobox;
	}
	
	
	/**
	  *  Metodo para configurar un objeto de tipo JFormattedTextField para configurarlo como un DataPicker
	  *  y se agrega por defecto en el JFrame       
	  *  @param posX Posicion en X
	  *  @param posY Posicion en Y
	  *  @param ancho Ancho 
	  *  @param alto alto
	  *  @param toolTipText Texto informativo que se visualiza cuando se coloca el mouse sobre el componente
	  *  @return JFormattedTextField configurado
	  *  
	  */

	public static JFormattedTextField getJFormatoFecha(String texto,int posX, int posY, int ancho, int alto, String toolTipText) {

		JFormattedTextField jFormattedTextField = null;

		try {

			MaskFormatter  maskFormatter = new MaskFormatter("####/##/##");

			jFormattedTextField = new JFormattedTextField(maskFormatter){

				static final long serialVersionUID = 19781206;

				public void paste(){};  //Se especifica el metodo paste de esta manera para que no se pueda copiar en el JTextFied
			};	


			jFormattedTextField.setBounds(posX,posY,ancho,alto);
			jFormattedTextField.setToolTipText(toolTipText);
			jFormattedTextField.setText(texto.replace('-','/'));
			jFormattedTextField.setHorizontalAlignment(0);
			frame.add(jFormattedTextField);


		} catch (Exception e) {

			e.printStackTrace();
		}	        	    

		return jFormattedTextField;
	}

	
	/**
	  *  Metodo para configurar un objeto de tipo JCheckBox y se agrega por defecto en el JFrame
	  *  @param posX Posicion en X
	  *  @param posY Posicion en Y
	  *  @param ancho Ancho 
	  *  @param alto alto
	  *  @param toolTipText Texto informativo que se visualiza cuando se coloca el mouse sobre el componente
	  *  @return JComboBox configurado
	  *  
	  */
	
	public static JCheckBox getJCheckBox(String texto, int posX, int posY, int ancho,
			int alto) {

		JCheckBox jcheckbox = new JCheckBox(texto);
		jcheckbox.setBounds(posX, posY, ancho, alto);
		jcheckbox.setMnemonic(texto.charAt(0));
		frame.add(jcheckbox);
		return jcheckbox;
	}
	
	
    /**
     * Metodo que configura un JTextArea con varias lineas
     * 
     * @return JTextArea configurado
     */
	public  static JTextArea getJTextArea() {

		JTextArea jtextArea = new JTextArea();
		jtextArea.setLineWrap(true);
		return jtextArea;

	}
	
	/**
	  *  Metodo para configurar un objeto de tipo JButton y se agrega por defecto en el JFrame
	  *  @param texto Texto para el JButton
	  *  @param posX Posicion en X
	  *  @param posY Posicion en Y
	  *  @param ancho Ancho 
	  *  @param alto alto
	  *  @param pathIcon ruta del icono para el jButton
	  *  @param activo true activo, false desactivado
	  *  @return JButton configurado
	  *  
	  */
	  	
	public static JButton getJButton(String texto, int posX, int posY, int ancho, int alto) {	
		
	   JButton jButton = new JButton(texto);
	   jButton.setMnemonic(texto.charAt(0));
       jButton.setBounds(posX,posY,ancho,alto);
       frame.add(jButton);
         
       return jButton;
	}
	
	public JScrollPane getJScrollPane(JComponent componente,int posX, int posY, int ancho, int alto) {
		
		JScrollPane jScrollPane = new JScrollPane(componente);
		jScrollPane.setBounds(posX,posY,ancho,alto);
		frame.add(jScrollPane);
		return jScrollPane;
	}
	

	/**
	 *  Metodo para configurar un objeto de tipo Set que permite que en una GUI que permita utilizar TAB o
	 *  enter para los forward
	 *  @return Set configurado
	 *  
	 */

	public static Set<AWTKeyStroke> getUpKeysFrame() {

		if (upKeys == null) {

			// Se configura para que se pueda navegar con Enter o Tab
			upKeys = new HashSet<AWTKeyStroke>(1);
			upKeys.add(AWTKeyStroke.getAWTKeyStroke(KeyEvent.VK_ENTER,0));
			upKeys.add(AWTKeyStroke.getAWTKeyStroke(KeyEvent.VK_TAB,0));

		}


		return upKeys;


	}
    
	/**
	 * Metodo que permite visualizar el frame
	 */
	public void mostrarJFrame() {
		
		frame.setVisible(true);
	}


	/**
	 * Metodo que devuelve el JFrame en Java
	 */
	public JFrame getFrame() {
		return frame;
	}
	
	
	

}
