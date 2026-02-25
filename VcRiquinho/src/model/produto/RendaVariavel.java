package model.produto;

public class RendaVariavel extends ProdutoInvestimento {
    private String nome;
    private String descricao;
    private double rendimentoMensalEsperado;

    public RendaVariavel(String nome, String descricao, double rendimentoMensalEsperado){
        super(nome, descricao);
        this.rendimentoMensalEsperado = rendimentoMensalEsperado;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public double calcularRendimento(double valorAplicado, int dias){
        return valorAplicado * (rendimentoMensalEsperado * ((double) dias / 30));
    }
}