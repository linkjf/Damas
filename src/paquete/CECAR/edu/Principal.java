package paquete.CECAR.edu;

//FAIL COMMENT ADDED

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.HashSet;

import javax.swing.*;

public class Principal{
	
	private Jugador jugador = new Jugador();
	private Ficha ficha = new Ficha();
	private ValidarEntradaNumero validarnumero = new ValidarEntradaNumero();
	private ConvertirCaracteresMayuscula convertircaracteres = new ConvertirCaracteresMayuscula();
	private CrearJFrame frame;
	private int i = 1;
	private int n;
	private ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
	private HashSet<Integer> identificaciones = new HashSet<Integer>();
	private boolean validarid;
	private PanelAdversario paneldos = new PanelAdversario();
	private PanelPrincipal paneluno = new PanelPrincipal();	
		
	
	public static void main(String[] args) {
		 
         new Principal();     
         
	}	
	
	public Principal() {
	   
	   frame = new CrearJFrame("DAMAS", 1000, 700);
	   frame.mostrarJFrame();
	   frame.getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   
	  
	      
	   final JLabel etiquetatitulo = frame.getJLabel("DATOS JUGADOR", 150, 20, 100, 20);
	   final JLabel etiqueta1 = frame.getJLabel("Identificacion", 30, 70, 100, 20);
	   final JTextField textfield1 = frame.getJTextField(125, 70, 90, 25); 
	     textfield1.addKeyListener(validarnumero);
	   final JLabel etiqueta2 = frame.getJLabel("Nombre", 30, 120, 80, 20);  
	   final JTextField textfield2 = frame.getJTextField(125, 120, 90, 25);
	     textfield2.addKeyListener(convertircaracteres);
	   final JLabel etiqueta3 = frame.getJLabel("Apodo(Opcional)", 30, 170, 95, 20);
	   final JTextField textfield3 = frame.getJTextField(125, 170, 90, 25);
	     textfield3.addKeyListener(convertircaracteres);
	    final JLabel etiqueta4 = frame.getJLabel("Direccion", 30, 220, 95, 20);
	    final JTextField textfield4 = frame.getJTextField(125, 220, 90, 25);
	   final JButton boton1 = frame.getJButton("Continuar", 250, 150, 90, 25);
	   final JLabel imagen1 = frame.getJLabel(370, 100, 340, 260);
	   imagen1.setIcon(new ImageIcon("Damas.jpg"));
	   
	   
	  imagen1.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				
				n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de juegos a jugar"));
				
				if(jugadores.size() != 2){
					JOptionPane.showMessageDialog(null, "Debe Ingresar Dos jugadores");
				}
				else if(n%2 ==0){
				
				
				JOptionPane.showMessageDialog(null, "El juego va a empezar");
				   
				   
				   paneluno.getPanel1().setVisible(true);
				   paneldos.getPanel2().setVisible(true);
				   
				   
				   
				   boton1.setVisible(false);
				   etiqueta1.setVisible(false);
				   etiqueta2.setVisible(false);
				   etiqueta3.setVisible(false);
				   etiqueta4.setVisible(false);
				   etiquetatitulo.setVisible(false);
				   textfield1.setVisible(false);
				   textfield2.setVisible(false);
				   textfield3.setVisible(false);
				   textfield4.setVisible(false);
				   imagen1.setVisible(false);
				   
				   
			}else{
				JOptionPane.showMessageDialog(null, "El numero de juegos debe ser PAR");}
			}
			});
	  
	   
	   boton1.addActionListener(new ActionListener(){		   
		   public void actionPerformed(ActionEvent e){	   
			   
			  
			if(jugadores.size() != 2){								
				
			 
			   validarid = identificaciones.contains(Integer.parseInt(textfield1.getText()));
			   
			if(validarid == true){
				JOptionPane.showMessageDialog(null, "Cedula existe");
				textfield1.setText("");
				textfield2.setText("");
				textfield3.setText("");
				textfield4.setText("");
				
			}
			
			else{
			   
			   jugador.setIdentificacion(Integer.parseInt(textfield1.getText()));
			   jugador.setNombre(textfield2.getText());
			   if(textfield3.getText() == ""){
				   jugador.setApodo("Predeterminado "+i);
				   i=2;
			   }else{
				   jugador.setApodo(textfield3.getText());
			   }
			   jugador.setDireccion(textfield4.getText());
			   jugadores.add(jugador);
			   identificaciones.add(jugador.identificacion);
			   
			   if(jugadores.size() ==2){
				   JOptionPane.showMessageDialog(null, "Jugadores Ingresados, de click en la imagen para jugar");
					boton1.setEnabled(false);
					textfield1.setText("");
					textfield2.setText("");
					textfield3.setText("");
					textfield4.setText("");
					textfield1.setEnabled(false);
					textfield2.setEnabled(false);
					textfield3.setEnabled(false);
					textfield4.setEnabled(false);
			   }
			   
			   textfield1.setText("");
			   textfield2.setText("");
			   textfield3.setText("");
			   textfield4.setText("");   
			   
		   }								
	   }}});  
	    
	   frame.getFrame().add(paneluno.getPanel1()); 
	   frame.getFrame().add(paneldos.getPanel2());
	   
	   
	   
	   
	   
	     	   	   
	}
	

}
