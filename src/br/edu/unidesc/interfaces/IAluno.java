package br.edu.unidesc.interfaces;

import br.edu.unidesc.entidades.Aluno;

public interface IAluno {

    Aluno criarAluno(Aluno aluno);                         //CREATE
    Aluno recuperarAluno(String cpf);                                                                  //READ
    void atualizarAluno(Aluno aluno);                                                                //UPDATE
    Boolean deletarAluno(String cpf);
}
