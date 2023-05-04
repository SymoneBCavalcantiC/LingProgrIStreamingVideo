package Entidades;


import java.util.List;

public class Filme extends Video {
    private double duracao;

    public Filme(String titulo, String diretor, List<String> elenco, String genero, int anoLancamento, int classificacaoIndicativa, double duracao) {
        super(titulo, diretor, elenco, genero, anoLancamento, classificacaoIndicativa);
        this.duracao = duracao;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return super.toString() + ", duração:  " + duracao + "minutos";
    }
}


