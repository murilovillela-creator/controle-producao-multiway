package model;

public class PecaMecanica extends Peca {

    public PecaMecanica(
            String codigo,
            String descricao,
            String responsavel) {

        super(codigo, descricao, responsavel);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("=== PEÇA MECÂNICA ===");
        super.exibirInformacoes();
    }
}