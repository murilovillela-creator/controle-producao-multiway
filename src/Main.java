import java.util.Scanner;

import model.*;
import service.ControleProducao;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ControleProducao controle =
                new ControleProducao();

        int opcao;

        do {

            System.out.println("\n=== MULTIWAY INFRA ===");
            System.out.println("1 - Cadastrar Peça");
            System.out.println("2 - Listar Peças");
            System.out.println("3 - Atualizar Status");
            System.out.println("0 - Sair");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:

                    System.out.print("Código: ");
                    String codigo = sc.nextLine();

                    System.out.print("Descrição: ");
                    String descricao = sc.nextLine();

                    System.out.print("Responsável: ");
                    String responsavel = sc.nextLine();

                    System.out.println("Tipo:");
                    System.out.println("1 - Estrutural");
                    System.out.println("2 - Mecânica");
                    System.out.println("3 - Soldada");

                    int tipo = sc.nextInt();
                    sc.nextLine();

                    Peca peca;

                    if (tipo == 1) {
                        peca = new PecaEstrutural(
                                codigo,
                                descricao,
                                responsavel);
                    } else if (tipo == 2) {
                        peca = new PecaMecanica(
                                codigo,
                                descricao,
                                responsavel);
                    } else {
                        peca = new PecaSoldada(
                                codigo,
                                descricao,
                                responsavel);
                    }

                    controle.cadastrarPeca(peca);

                    System.out.println(
                            "Peça cadastrada com sucesso!"
                    );

                    break;

                case 2:

                    controle.listarPecas();

                    break;

                case 3:

                    System.out.print(
                            "Código da peça: "
                    );

                    String cod =
                            sc.nextLine();

                    System.out.print(
                            "Novo Status: "
                    );

                    String status =
                            sc.nextLine();

                    controle.atualizarStatus(
                            cod,
                            status
                    );

                    System.out.println(
                            "Status atualizado!"
                    );

                    break;
            }

        } while (opcao != 0);

        sc.close();
    }
}