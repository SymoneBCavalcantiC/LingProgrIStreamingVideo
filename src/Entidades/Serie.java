package Entidades;

import java.util.List;

public class Serie extends Video {

    private int NumTemporadas;

    public Serie(String titulo, String diretor, List<String> elenco, String genero, int anoLancamento, int classificacaoIndicativa, int NumTemporadas){
        super(titulo, diretor, elenco, genero, anoLancamento, classificacaoIndicativa);
        this.NumTemporadas = NumTemporadas;
    }


    public int getNumTemporadas() {
        return NumTemporadas;
    }

    public void setNumTemporadas(int numTemporadas) {
        NumTemporadas = numTemporadas;
    }

    public String toString(){
        return super.toString() + ", temporadas: " + getNumTemporadas();
    }
}

//CRIAR ACERVO COM 5 SÉRIES DIFERENTES



