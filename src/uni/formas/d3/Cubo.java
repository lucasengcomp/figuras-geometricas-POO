package uni.formas.d3;

import java.awt.*;

import uni.forma.d1.Ponto;
import uni.formas.d2.Quadrado;

public class Cubo extends FormaD3{

	private Quadrado quadrado;
	private float aresta;
	private Ponto ponto; 
	
	public Cubo(float x, float y, float aresta) {
		quadrado = new Quadrado (x, y, aresta);
		this.aresta = quadrado.getLado(aresta);
		ponto = new Ponto(x,y);
	}
	
	public float getAresta(float aresta) {
		return this.aresta;
	}
	
	@Override
	public float getVolume() {
		return this.aresta * this.aresta * this.aresta;
	}

	@Override
	public void print(Graphics2D g2) {
		g2.setColor(Color.PINK);
		//quadrados
	    g2.drawRect((int)ponto.getX()/10 , (int)ponto.getY()/10,(int)aresta, (int)aresta);
	    g2.drawRect( ((int)ponto.getX()/10) + 50, ((int)ponto.getY()/10) + 50, (int)aresta, (int)aresta);
	    
	    //linhas para ligar os pontos de coordenas do cubo
	    g2.drawLine((int)ponto.getX()/10, (int)ponto.getY()/10, ((int)ponto.getX()/10) + 50, ((int)ponto.getY()/10) + 50);
	    g2.drawLine((int)ponto.getX()/10, ((int)ponto.getY()/10) + 100, ((int)ponto.getX()/10) + 50, ((int)ponto.getY()/10) + 50 + 100);
	    g2.drawLine(((int)ponto.getX()/10) + 100, (int)ponto.getY()/10, ((int)ponto.getX()/10) + 50 + 100, ((int)ponto.getY()/10) + 50);
	    g2.drawLine(((int)ponto.getX()/10) + 100, ((int)ponto.getY()/10) + 100, ((int)ponto.getX()/10) + 100 + 50, ((int)ponto.getY()/10) + 100 + 50);
	
	}
	
	@Override
	public String toString() {
		
		return "Isto é um Cubo com coordenadas ("+this.ponto.getX() +") (" +this.ponto.getY()+ ") e de aresta (" + this.aresta + ")";
	}
}

