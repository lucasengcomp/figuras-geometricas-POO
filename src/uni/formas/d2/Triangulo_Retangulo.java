package uni.formas.d2;

import java.awt.*;

import uni.forma.d1.Ponto;

public class Triangulo_Retangulo extends FormaD2{

	private float base;
	private float altura;
	private Ponto ponto1;
	private Ponto ponto2;
	private Ponto ponto3;
	
	public Triangulo_Retangulo(float base, float altura, float x1, float y1, float x2, float y2, float x3, float y3) {
		this.base = base;
		this.altura = altura;
		ponto1 = new Ponto(x1,y1);
		ponto2 = new Ponto(x2,y2);
		ponto3 = new Ponto(x3,y3);
	}
	
	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	@Override
	public float getArea() {
		return (float) (this.getAltura() * this.getBase()) / 2;
		
	}
	
	@Override
	public void print(Graphics2D g2) {
		g2.setColor(Color.ORANGE);
		Polygon poligono = new Polygon();   
		poligono.addPoint((int)this.ponto1.getX(),(int)this.ponto1.getY());   
		poligono.addPoint((int)this.ponto2.getX(),(int)this.ponto2.getY());
		poligono.addPoint((int)this.ponto3.getX(),(int)this.ponto3.getY());
		g2.drawPolygon(poligono);
	}
	
	@Override
	public String toString() {
		
		return "\nIsto é um Triangulo Retangulo de coordenadas ("+this.ponto1.getX() +", " +this.ponto1.getY()+ ") , (" + this.ponto2.getX() + ", " +this.ponto2.getY() +") , (" + this.ponto3.getX() + ", " +this.ponto3.getY() +") ";
	}
	
}
