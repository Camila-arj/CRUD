package br.edu.unidesc;

import br.edu.unidesc.controllers.AlunoController;
import br.edu.unidesc.entidades.Aluno;

public class Test {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        aluno.setCurso("SIS");
        aluno.setNome("Jose Souza");
        aluno.setCpf("87596415832");

        AlunoController controller = new AlunoController();
        controller.criarAluno(aluno);

        System.out.println("O numero da matrícula é: "+ aluno.getMatricula());


        //altera aluno
        aluno.setNome("João");
        controller.atualizarAluno(aluno);

        if (aluno == null)
            System.out.println("Aluno não encontrado");
        else
            System.out.println("Aluno atualizado "+ aluno.getNome());

        //deleta aluno
        Boolean deletou = controller.deletarAluno(aluno.getCpf());

        if (deletou)
            System.out.println("Aluno apagado");
        else
            System.out.println("Aluno não encontrado");
    }
}
