package imd.ufrn.br.models;

public class Pessoa implements ITributavel {
    private String nome;
    private double salario;
    private ContaCorrente conta;

    public Pessoa() {}

    private SeguroVida seguro;

    public Pessoa(String nome, double salario, ContaCorrente conta, SeguroVida seguro)  {
        this.nome = nome;
        this.salario = salario;
        this.conta = conta;
        this.seguro = seguro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public ContaCorrente getConta() {
        return conta;
    }

    public void setConta(ContaCorrente conta) {
        this.conta = conta;
    }

    public SeguroVida getSeguro() {
        return seguro;
    }

    public void setSeguro(SeguroVida seguro) {
        this.seguro = seguro;
    }

    @Override
    public double calcularTributos() {
        return (11 * salario) / 100;
    }
}
