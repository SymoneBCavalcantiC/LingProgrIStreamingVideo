package Entidades;

public abstract class ItemPlaylist {
    private String titulo;
    private int duracao;

    public ItemPlaylist(String titulo, int duracao) {
        this.titulo = titulo;
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public abstract String getDescricao();

    public abstract String getTipo();
}
