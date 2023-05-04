package Entidades;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private int id;
    private String nome;
    private int idade;
    private String email;
    private String senha;
    private List<Filme> listaFilmesFavoritos;
    private List<Serie> listaSeriesFavoritas;

    public Usuario(int id, String nome, int idade, String email, String senha) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.senha = senha;
        this.listaFilmesFavoritos = new ArrayList<>();
        this.listaSeriesFavoritas = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public List<Filme> getListaFilmesFavoritos() {
        return listaFilmesFavoritos;
    }

    public List<Serie> getListaSeriesFavoritas() {
        return listaSeriesFavoritas;
    }

    public void adicionarFilmeFavorito(Filme filme) {
        listaFilmesFavoritos.add(filme);
    }

    public void removerFilmeFavorito(Filme filme) {
        listaFilmesFavoritos.remove(filme);
    }

    public void adicionarSerieFavorita(Serie serie) {
        listaSeriesFavoritas.add(serie);
    }

    public void removerSerieFavorita(Serie serie) {
        listaSeriesFavoritas.remove(serie);
    }

    public boolean atualizarDados(String senha, String nome, String email, String novaSenha) {
        if (senha.equals(this.senha)) {
            this.nome = nome;
            this.email = email;
            this.senha = novaSenha;
            return true;
        }
        return false;
    }
}
