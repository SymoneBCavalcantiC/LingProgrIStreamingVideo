
import Entidades.ServicoStreaming;
import Entidades.Usuario;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ServicoStreaming servicoStreaming = new ServicoStreaming();

        Usuario user1 = new Usuario(1, "Pilar San Juan", 18, "pilarica@gmail.com", "123456");
        Usuario user2 = new Usuario(2, "Fábio San Juan", 10, "fabiosjuan@gmail.com", "654321");
        Usuario user3 = new Usuario(3, "Josileide Batista", 50, "jbatistac@gmail.com", "123123");

        int opcao = -1; // inicializa a variável opcao com um valor inválido
        while (opcao !=0) {
            System.out.println("\n-------- MENU --------");
            System.out.println("1 - Listar filmes disponíveis");
            System.out.println("2 - Listar séries disponíveis");
            System.out.println("3 - Alterar dados cadastrais");
            System.out.println("4 - Adicionar um título à lista de favoritos");
            System.out.println("5 - Remover um título da lista de favoritos");
            System.out.println("6 - Buscar um título");
            System.out.println("0 - Sair");

            System.out.print("\nDigite a opção desejada: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    servicoStreaming.listarFilmes();
                    break;

                case 2:
                    servicoStreaming.listarSeries();
                    break;

                case 3:
                    System.out.println("\n-------- ALTERAR DADOS CADASTRAIS --------");
                    System.out.print("Em desenvolvimento");
                    break;

                case 4:
                    System.out.println("\n-------- ADICIONAR TÍTULO À LISTA DE FAVORITOS --------");
                    System.out.print("Em desenvolvimento");
                    break;

                case 5:
                    System.out.println("\n-------- REMOVER TÍTULO DA LISTA DE FAVORITOS --------");
                    System.out.print("Em desenvolvimento");
                    break;

                case 6:
                    System.out.println("\n-------- BUSCAR TÍTULO --------");
                    System.out.print("Em desenvolvimento");
                    break;

                case 0:
                    System.out.println("\nAgradecemos por utilizar nosso serviço de streaming de vídeos!");
                    System.out.println("\nAté mais! ;)");
                    break;

                default:
                    System.out.println("\nOpção inválida! Digite novamente.");
                    break;
            }
        }

        sc.close();
    }
}
