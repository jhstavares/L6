package lista06a;

import java.util.Scanner;

public class Professor extends Funcionarios {
    public String orgaoLotacao;
    public String nome;
    private String nivelGraduacao;
    private String disciplinaMinistrada;
    private int qtdAlunos;
    private int qtdTurmas;

    public Professor(String nome, String cpf, String numRegistro, String organoLotacao, double salarioBase, String nivelGraduacao, String disciplinaMinistrada, int qtdAlunos, int qtdTurmas) {
        super(nome, cpf, numRegistro, organoLotacao, salarioBase);
        this.nivelGraduacao = nivelGraduacao;
        this.disciplinaMinistrada = disciplinaMinistrada;
        this.qtdAlunos = qtdAlunos;
        this.qtdTurmas = qtdTurmas;
    }

    public String getNivelGraduacao() {
        return nivelGraduacao;
    }

    public void setNivelGraduacao(String nivelGraduacao) {
        this.nivelGraduacao = nivelGraduacao;
    }

    public String getDisciplinaMinistrada() {
        return disciplinaMinistrada;
    }

    public void setDisciplinaMinistrada(String disciplinaMinistrada) {
        this.disciplinaMinistrada = disciplinaMinistrada;
    }

    public int getQtdAlunos() {
        return qtdAlunos;
    }

    public void setQtdAlunos(int qtdAlunos) {
        this.qtdAlunos = qtdAlunos;
    }

    public int getQtdTurmas() {
        return qtdTurmas;
    }

    public void setQtdTurmas(int qtdTurmas) {
        this.qtdTurmas = qtdTurmas;
    }

    public void aumentarSalarioFunc() {
        reajusteFunc = (salarioBase / 100) * 10;
        double salarioFunc = salarioBase + reajusteFunc;
        System.out.print("Salário atual: R$ " + salarioBase);
        System.out.println("Você obteve um reajuste de 10% sobre seu salário atual!!");
        System.out.println("O valor do reajuste é de R$" + reajusteFunc);
        System.out.println("O valor total do novo salario será de R$ " + salarioFunc);

    }

    public void adicionarTurma() {
        int turma;
        Scanner t1 = new Scanner(System.in);
        System.out.println("Deseja adicionar alguma nova turma a esse professor? 1 - S/ 2 - N: ");
        turma = t1.nextInt();

        if ( turma ){
            Object caso;
            caso1:
            System.out.println("Insira a quantidade de turma a ser adicionada: ");
            turma = t1.nextInt();
            int turmaAtualizada = qtdTurmas + turma;
            System.out.println("nQuantidade de turmas atualizadas para: " + turmaAtualizada + "turmas");
            break;

            pattern:
            System.out.println("\nQuantidade de turmas se manteve a mesma sem diferenciação!");
        }
    }
}
