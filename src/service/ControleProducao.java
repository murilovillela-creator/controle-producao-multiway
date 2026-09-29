package service;

import model.Peca;
import java.util.ArrayList;
import java.util.List;

public class ControleProducao {

    private List<Peca> pecas = new ArrayList<>();

    public void cadastrarPeca(Peca peca) {
        pecas.add(peca);
    }

    public void listarPecas() {

        if (pecas.isEmpty()) {
            System.out.println("Nenhuma peça cadastrada");
            return;
        }

        for (Peca peca : pecas) {
            peca.exibirInformacoes();
            System.out.println("------------------");
        }
    }

    public Peca buscarPeca(String codigo) {

        for (Peca peca : pecas) {

            if (peca.getCodigo().equalsIgnoreCase(codigo)) {
                return peca;
            }
        }

        return null;
    }

    public void atualizarStatus(
            String codigo,
            String novoStatus) {

        Peca peca = buscarPeca(codigo);

        if (peca != null) {
            peca.atualizarStatus(novoStatus);
        }
    }
}