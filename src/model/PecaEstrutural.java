package model;

public class PecaEstrutural extends Peca {

    public PecaEstrutural(
            String codigo,
            String descricao,
            String responsavel) {

        super(codigo, descricao, responsavel);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("=== PEÇA ESTRUTURAL ===");
        super.exibirInformacoes();
    }
}