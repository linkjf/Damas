package paquete.CECAR.edu;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

final public class PanelPrincipal extends JPanel implements ActionListener{
	
	private JPanel panel1 = new JPanel();
	private JButton[][] VectorBotones = new JButton[8][8];
	private int z;
	private int y;
	private int x = 1;
	private Ficha ficha = new Ficha();
	
	public JPanel getPanel1() {
		return panel1;
	}

	public void setPanel1(Component component) {
		this.panel1 = (JPanel) component;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PanelPrincipal(){
		
		   
		   
		   panel1.setLayout(new GridLayout(8,8));
		   panel1.setSize(400,400);
		   panel1.setLocation(50, 60);
		   panel1.setVisible(false);
		   
		   
		 
		   for (int i = 0; i < 8; i++) {
			   
			   
			   for (int j = 0; j < VectorBotones.length; j++) {
				   VectorBotones[i][j] = new JButton();
				   panel1.add(VectorBotones[i][j]);
				   VectorBotones[i][j].addActionListener(this);
				   
				   if(j%2 == z){
						 VectorBotones[i][j].setBackground(Color.white);
						 
					   }
						    
					  
				   else{
						  VectorBotones[i][j].setBackground(Color.gray); 
					   }   
				
			}
			   
			   if(z==0){
				   z=1;
			   }else{
				   z=0;
			   }			   
			   
			   }
		   
		   for (int i = 0; i < 3; i++) {
			   for (int j = 0; j < 8; j++) {
				   
				   
				   
				   if(j%2 == x){
				   VectorBotones[i][j].setIcon(ficha.getImagen1());
				   }
			}
		if(x == 1){
			x=0;
		}else{
			x=1;
		}
		}
		
		   for (int i = 5; i < 8; i++) {
			   for (int j = 0; j < 8; j++) {
				   if(j%2 == y){
					   VectorBotones[i][j].setIcon(ficha.getImagen2());
				   }
				
			}
		if(y == 0){
			y=1;
		}else{
			y=0;
		}
		}
			   
		   }

	@Override
	public void actionPerformed(ActionEvent e) {
		

	}
}