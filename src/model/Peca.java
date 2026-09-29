package model;

public class Peca {

    private String codigo;
    private String descricao;
    private String responsavel;
    private String status;

    public Peca(String codigo, String descricao, String responsavel) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.responsavel = responsavel;
        this.status = "Aguardando Produção";
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public String getStatus() {
        return status;
    }

    public void atualizarStatus(String novoStatus) {
        this.status = novoStatus;
    }

    public void exibirInformacoes() {
        System.out.println("Código: " + codigo);
        System.out.println("Descrição: " + descricao);
        System.out.println("Responsável: " + responsavel);
        System.out.println("Status: " + status);
    }
}