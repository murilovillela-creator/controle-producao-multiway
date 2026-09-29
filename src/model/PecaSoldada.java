package model;

public class PecaSoldada extends Peca {

    public PecaSoldada(
            String codigo,
            String descricao,
            String responsavel) {

        super(codigo, descricao, responsavel);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("=== PEÇA SOLDADA ===");
        super.exibirInformacoes();
    }
}