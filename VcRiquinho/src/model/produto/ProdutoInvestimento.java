package model.produto;

public interface ProdutoInvestimento {

    // Apenas assinaturas! Sem variáveis, sem construtor e sem corpo { }.
    // O Java já entende implicitamente que eles são "public abstract".

    String getNome();

    String getDescricao();

    void setNome(String nome);

    void setDescricao(String descricao);

    double calcularRendimento(double valorAplicado, int dias);
}