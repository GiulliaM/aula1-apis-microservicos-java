package model;

public class Funcionario extends Pessoa{
    protected float salario;

    public Funcionario(String nome, Data nascimento, float salario){
        super(nome, nascimento);
        this.salario = salario;
    }

    public float calculaImposto(){
        return salario * 0.03f; //3% do salario
    }

    @Override
    public void imprimeDados(){
        System.out.println("Funcionário: " + nome + " | Salário: R$" + salario + " | Imposto: R$" + calculaImposto());
    }
}
