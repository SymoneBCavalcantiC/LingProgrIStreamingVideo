package Entidades;

import java.util.ArrayList;
import java.util.Arrays;

public class ServicoStreaming {
    protected ArrayList<Filme> filmes = new ArrayList<Filme>();
    protected ArrayList<Serie> series = new ArrayList<Serie>();

    public ServicoStreaming() {
        // Adiciona 5 filmes ao acervo
        filmes.add(new Filme("O Poderoso Chefão", "Francis Ford Copolla", Arrays.asList("Marlon Brandon", "Al Pacino", "James Caan" , "Richard Castellano", "Robert Duvall", "Sterling Hayden", "John Marley", "Richard Conte", "Diane Keaton"), "Drama-Crime", 1972, 14, 2.55));
        filmes.add(new Filme("A Lista de Schindler", "Steven Spielberg", Arrays.asList("Liam Neeson", "Ben Kingsley", "Ralph Fiennes"), "Histórico-Guerra", 1993, 14, 3.15));
        filmes.add(new Filme("O Senhor dos anéis - O retorno do Rei", "Peter Jackson", Arrays.asList("Sean Astin", "Elijah Wood", "Viggo Mortensen"), "Fantasia-Aventura", 2003, 12, 2.58));
        filmes.add(new Filme("Vingadores: Ultimato", "Joe Russo", Arrays.asList("Robert Downey Jr", "Chris Evans", "Mark Rufallo"), "Ação-Aventura-Fantasia", 2019, 13, 3.20));
        filmes.add(new Filme("O Rei Leão", "Rogers Allers", Arrays.asList("Garcia Junior", "Mathew Broderick", "James Earl Jones"), "Aventura-Animação-Musical", 2011, 10, 1.28));

        // Adiciona 4 séries ao acervo
        series.add(new Serie("Breaking Bad", "Vince Gilligan", Arrays.asList("Bryan Cranston", "Anna Gunn", "Aaron Paul", "Dean Noris", "Betsy Brandt", "RJ Mitte", "Jonathan Banks", "Bob Odenkirk"), "Ação-Suspense-Drama-Crime-Humor Negro", 2008, 16, 5));
        series.add(new Serie("Game of Thrones", "Mark Mylod", Arrays.asList("Emilia Clarke", "Pedro Pascal", "Bella Ramsey", "Sophie Turner", "Kit Harington", "Maisie Williams", "Lena Headey"), "Ação-Drama-Suspense-Aventura-Tragédia-Fantasia Medieval", 2011, 18, 8));
        series.add(new Serie("Os Simpsons", "Matt Groening", Arrays.asList("Nancy Cartwhight", "Dan Castellaneta", "Hank Azaria", "Julie Kavner", "Aaron Paul", "Harry Shearer"), "Sitcom-Sátira-Animação para adultos-Humor-Música", 1989, 12, 34));
        series.add(new Serie("Friends", "Ben Winston", Arrays.asList("Jennifer Aniston", "Lisa Kudrow", "David Schwimmer", "Courteney Cox", "Mathew Perry", "Matt LeBlanc", "James Michael Tyler", "Paul Rudd"), "Sitcom-Comédia-Romance", 1994, 12, 10));
    }


    public void listarFilmes() {
        System.out.println("Filmes disponíveis:");
        System.out.println("------------------------------------------------------------");
        for(Filme filme : filmes) {
            System.out.println("Título: " + filme.getTitulo());
            System.out.println("Diretor: " + filme.getDiretor());
            System.out.println("Elenco: " + filme.getElenco());
            System.out.println("Gênero: " + filme.getGenero());
            System.out.println("Ano: " + filme.getAnoLancamento());
            System.out.println("Classificação indicativa: " + filme.getClassifIndicativa());
            System.out.println("------------------------------------------------------------");
        }
    }

    public void listarSeries() {
        System.out.println("Séries disponíveis:");
        System.out.println("------------------------------------------------------------");
        for(Serie serie : series) {
            System.out.println("Título: " + serie.getTitulo());
            System.out.println("Diretor: " + serie.getDiretor());
            System.out.println("Elenco: " + serie.getElenco());
            System.out.println("Gênero: " + serie.getGenero());
            System.out.println("Ano: " + serie.getAnoLancamento());
            System.out.println("Classificação indicativa: " + serie.getClassifIndicativa());
            System.out.println("Número de Temporadas: " + serie.getNumTemporadas());
            System.out.println("------------------------------------------------------------");
        }


    }
}
