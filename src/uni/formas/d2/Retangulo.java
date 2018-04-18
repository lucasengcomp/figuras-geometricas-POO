package uni.formas.d2;

import java.awt.*;

import uni.forma.d1.Ponto;

public class Retangulo extends FormaD2{

	private float altura;
	private float base;
	private Ponto ponto;
	
	public Retangulo(float x, float y, float base, float altura) {
		ponto = new Ponto(x, y);
		this.base = base;
		this.altura = altura;
	}
	
	public float getAltura(float altura) {
		return this.altura;
	}
	
	public float getBase(float base) {
		return this.base;
	}
	
	@Override
	public float getArea() {
		return (float) base*altura;
	}
	
	@Override
	public void print(Graphics2D g2) {
		g2.setColor(Color.MAGENTA);
		g2.drawRect((int) ponto.getX(), (int) ponto.getY(),
				(int) base, (int) altura);
	}
	
	@Override
	public String toString() {
		
		return "\nIsto é um Retangulo de coordenadas ("+this.ponto.getX() +") (" +this.ponto.getY()+ ") de base (" + this.base + ") e altura (" +this.altura+ ")";
	}
}
