package br.padroes.strategy.strategy;

public class Geometrica implements MediaStrategy {

    private static final double MEDIA_CORTE = 6.0;

    @Override
    public double calcularMedia(double p1, double p2) {
        return Math.sqrt(p1 * p2);
    }

    @Override
    public String verificarSituacao(double media) {
        if (media >= MEDIA_CORTE) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
}
