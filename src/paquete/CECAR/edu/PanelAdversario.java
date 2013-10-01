package paquete.CECAR.edu;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

final public class PanelAdversario extends JPanel {
	
	private JPanel panel2 = new JPanel();
	private JButton[][] VectBotones = new JButton[8][8];
	private int z;
	private int y;
	private int x = 1;
	private Ficha ficha = new Ficha();
	
	public JPanel getPanel2() {
		return panel2;
	}

	public void setPanel2(Component component) {
		this.panel2 = (JPanel) component;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PanelAdversario(){
		
		   
		   
		   panel2.setLayout(new GridLayout(8,8));
		   panel2.setSize(400,400);
		   panel2.setLocation(500, 60);
		   panel2.setVisible(false);
		   
		   
		   
		 
		   for (int i = 0; i < 8; i++) {
			   
			   
			   for (int j = 0; j < VectBotones.length; j++) {
				   VectBotones[i][j] = new JButton();
				   panel2.add(VectBotones[i][j]);
				   if(j%2 == z){
						 VectBotones[i][j].setBackground(Color.white);
						 
					   }
						    
					  
				   else{
						  VectBotones[i][j].setBackground(Color.gray); 
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
				   VectBotones[i][j].setIcon(ficha.getImagen2());
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
					   VectBotones[i][j].setIcon(ficha.getImagen1());
				   }
				
			}
		if(y == 0){
			y=1;
		}else{
			y=0;
		}
		}
			   
		   }
}