package lista06a;

public  abstract class Funcionarios {
    String Nome;
    String cpf;
    String numRegistro;
    String organoLotacao;
    double salarioBase = 0;
    double reajusteFunc = 0;

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNumRegistro() {
        return numRegistro;
    }

    public void setNumRegistro(String numRegistro) {
        this.numRegistro = numRegistro;
    }

    public String getOrganoLotacao() {
        return organoLotacao;
    }

    public void setOrganoLotacao(String organoLotacao) {
        this.organoLotacao = organoLotacao;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getReajusteFunc() {
        return reajusteFunc;
    }

      public Funcionarios(String nome, String cpf, String numRegistro, String organoLotacao, double salarioBase) {
        Nome = nome;
        this.cpf = cpf;
        this.numRegistro = numRegistro;
        this.organoLotacao = organoLotacao;
        this.salarioBase = salarioBase;


    }

    public void aumentarSalarioFunc(double salarioBase) {

    }

}

