package model.produto;

public class RendaFixa extends ProdutoInvestimento{

    private String nome;
    private String descricao;
    private double rendimentoMensalFixo;
    private int periodoCarenciaDias;

    public RendaFixa(String nome, String descricao, double rendimentoMensalFixo, int periodoCarenciaDias){
        super(nome, descricao);
        this.rendimentoMensalFixo = rendimentoMensalFixo;
        this.periodoCarenciaDias = periodoCarenciaDias;
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
        return valorAplicado * (rendimentoMensalFixo * ((double) dias / 30));
    }

    public int getPeriodoCarenciaDias() {
        return periodoCarenciaDias;
    }
}