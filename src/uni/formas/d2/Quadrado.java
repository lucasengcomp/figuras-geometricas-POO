package uni.formas.d2;

import java.awt.*;

import uni.forma.d1.Ponto;

public class Quadrado extends FormaD2{
	
	private float lado;
	private Ponto ponto;
	
	public Quadrado(float x, float y, float lado) {
		ponto = new Ponto(x, y);
		this.lado = lado;
	}
	
	public float getLado(float lado) {
		return this.lado;
	}
	
	@Override
	public float getArea() {
		return (float) lado*lado;
	}
	
	@Override
	public void print(Graphics2D g2) {
		g2.setColor(Color.green);
		g2.drawRect((int) ponto.getX(), (int) ponto.getY(),
				(int) this.lado, (int) this.lado);
	}

	@Override
	public String toString() {

		return "\nIsto é um Quadrado de coordenadas ("+this.ponto.getX() +") (" +this.ponto.getY()+ ") e de lado (" + this.lado + ")"            ;
	}
}
