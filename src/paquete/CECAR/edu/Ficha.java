package paquete.CECAR.edu;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Ficha extends JLabel {

	private static final long serialVersionUID = 1L;
	
	int posX;
	int posY;
	boolean estado= true;
	ImageIcon imagen1;
	ImageIcon imagen2;
	
	
	
	public ImageIcon getImagen1() {
		imagen1 = new ImageIcon("Ficha11.png");
		ImageIcon imagen11 = new ImageIcon(imagen1.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));
		
		return imagen11;
	}
	public ImageIcon getImagen2() {
		imagen2 = new ImageIcon("Ficha22.png");
		ImageIcon imagen22 = new ImageIcon(imagen2.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
		return imagen22;
	}
	
	public int getPosX() {
		return posX;
	}
	public void setPosX(int posX) {
		this.posX = posX;
	}
	public int getPosY() {
		return posY;
	}
	public void setPosY(int posY) {
		this.posY = posY;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	
	
	
}
