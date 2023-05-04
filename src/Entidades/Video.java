package Entidades;

import java.util.List;

public class Video {

    private String titulo;
    private String diretor;
    private List<String> elenco;
    private String genero;
    private int anoLancamento;
    private int classifIndicativa;


    public Video(String titulo, String diretor, List<String> elenco, String genero, int anoLancamento, int classificacaoIndicativa) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.elenco = elenco;
        this.genero = genero;
        this.anoLancamento = anoLancamento;
        this.classifIndicativa = classificacaoIndicativa;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public int getClassifIndicativa() {
        return classifIndicativa;
    }

    public void setClassifIndicativa(int classifIndicativa) {
        this.classifIndicativa = classifIndicativa;
    }

    public List<String> getElenco() { return elenco; }

    public void setElenco(List<String> elenco) { this.elenco = elenco; }
}
