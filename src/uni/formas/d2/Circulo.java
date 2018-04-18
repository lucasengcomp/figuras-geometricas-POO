package uni.formas.d2;

import java.awt.*;

import uni.forma.d1.Ponto;

public class Circulo extends FormaD2{

	private float raio;
	private Ponto ponto;
	
	public Circulo(float x, float y, float raio) {
		ponto = new Ponto(x, y);
		this.raio = raio;
	}
	
	public float getRaio() {
		return this.raio;
	}
	
	@Override
	public float getArea() {
		return (float) Math.PI * raio * raio;
	}
	
	@Override
	public void print(Graphics2D g2) {
		g2.setColor(Color.red);
		g2.drawOval((int) ponto.getX(), (int) ponto.getY(),
				(int) raio, (int) raio);
	}
	
	@Override
	public String toString() {
		
		return "\nIsto é um Circulo de coordenadas ("+this.ponto.getX() +") (" +this.ponto.getY()+ ") e raio (" + this.raio + ")";
	}
}
