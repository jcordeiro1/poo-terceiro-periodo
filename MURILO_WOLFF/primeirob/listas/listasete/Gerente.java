package MURILO_WOLFF.primeirob.listas.listasete;

public class Gerente extends Funcionario {

    public Gerente(String nome, int idade, Endereco endereco, String loja, double salarioBase) {
        super(nome, idade, endereco, loja, salarioBase);
    }

    @Override
    public void apresentarse() {
        System.out.println("Nome: " + getNome() + ", Idade: " + getIdade() + ", Loja: " + getLoja());
        getEndereco().apresentarLogradouro();
    }

    @Override
    public double calcularBonus() {
        return getSalarioBase() * 0.35;
    }
}