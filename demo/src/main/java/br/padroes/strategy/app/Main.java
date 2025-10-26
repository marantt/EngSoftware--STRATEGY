package br.padroes.strategy.app;

import br.padroes.strategy.model.Disciplina;
import br.padroes.strategy.strategy.Aritmetica;
import br.padroes.strategy.strategy.Geometrica;

public class Main {
    public static void main(String[] args) {
        
        Disciplina d1 = new Disciplina(new Aritmetica());
        d1.setNome("Padrões de Projeto");
        d1.setP1(9.0);
        d1.setP2(5.0);
        
        d1.calcularMedia(); 

        System.out.println("Disciplina: " + d1.getNome());
        System.out.println("Estratégia: Aritmética");

        System.out.printf("Média Final: %.2f\n", d1.getMedia()); 
        System.out.println("Situação Final: " + d1.getSituacao());

        System.out.println("---------------------------------");
        
        Disciplina d2 = new Disciplina(new Geometrica());
        d2.setNome("Engenharia de Software");
        d2.setP1(9.0);
        d2.setP2(5.0);

        d2.calcularMedia();
        
        System.out.println("Disciplina: " + d2.getNome());
        System.out.println("Estratégia: Geométrica");
        System.out.printf("Média Final: %.2f\n", d2.getMedia());
        System.out.println("Situação Final: " + d2.getSituacao());
    }
}