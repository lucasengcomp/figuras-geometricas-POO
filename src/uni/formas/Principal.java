package uni.formas;

import uni.forma.d1.Linha;
import uni.forma.d1.Ponto;
import uni.formas.d2.Circulo;
import uni.formas.frame.JanelaFormas;
import uni.formas.d2.Quadrado;
import uni.formas.d2.Retangulo;
import uni.formas.d2.Triangulo;
import uni.formas.d2.Triangulo_Retangulo;
import uni.formas.d3.Cubo;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("================ Figura 1 dimensão ================");
		Ponto ponto = new Ponto(250, 80); // distancia X e Y em um plano cartesiano de 1 dimensao. esse ponto pode nao aparecer pq é pequeno
		System.out.println(ponto);
		System.out.println("Ponto: " + ponto.getComprimento());
		
		Linha linha = new Linha(250, 70, 380, 70);
		System.out.println(linha);
		System.out.println("Comprimento de linha: " + linha.getComprimento());
		
		System.out.println("================ Figura 2 de dimensões ================");
		Circulo circulo = new Circulo(150, 48, 60f);
		System.out.println(circulo);
		System.out.println("Círculo: " + circulo.getArea());
		
		Quadrado quadrado = new Quadrado(290, 120, 50f);
		System.out.println(quadrado);
		System.out.println("Quadrado: " + quadrado.getArea());
		
		Retangulo retangulo = new Retangulo(290, 200, 70f, 35f);
		System.out.println(retangulo);
		System.out.println("Retangulo: " + retangulo.getArea());
		
		Triangulo triangulo = new Triangulo(50f, 30f, 75f,15f,5f,145f,145f,145f);
		System.out.println(triangulo);
		System.out.println("Triangulo: " + triangulo.getArea());
		
		Triangulo_Retangulo trianguloRet = new Triangulo_Retangulo(150f, 120f,250f,130f,110f,250f,250f,250f);
		System.out.println(trianguloRet);
		System.out.println("Triangulo retangulo : " + trianguloRet.getArea());
		
		System.out.println("=============== Figuras 3 dimensões ===============");
		Cubo cubo = new Cubo(290, 2600, 100f);
		System.out.println(cubo);
		System.out.println("Volume do Cubo: " + cubo.getVolume());
		
		JanelaFormas janelaFormas = new JanelaFormas(750, 750);
		
		janelaFormas.addForma(ponto);
		janelaFormas.addForma(linha);
		janelaFormas.addForma(circulo);
		janelaFormas.addForma(triangulo);
		janelaFormas.addForma(quadrado);
		janelaFormas.addForma(cubo);
		janelaFormas.addForma(trianguloRet);
		janelaFormas.addForma(retangulo);
		//Vamos colocar true para a janela aparecer
		janelaFormas.setVisible(true);
	}
}


