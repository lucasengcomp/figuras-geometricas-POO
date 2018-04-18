package uni.forma.d1;

import java.awt.*;

public class Ponto extends FormaD1{
	
	private float x;
	private float y;
	
	public Ponto(float x, float y){
		this.x = x;
		this.y = y;
	}
	
	public float getX() {
		return this.x;
	}
	
	public float getY() {
		return this.y;
	}
	
	@Override
	public void print(Graphics2D g2) {
		g2.setColor(Color.BLUE);
		g2.fillOval((int)x, (int)y, 10, 10);
	}
	
	@Override
	public String toString() {
		
		return "\nIsto é um ponto de coordenadas ("+this.getX() +") (" +this.getY()+ ")";
	}
}
