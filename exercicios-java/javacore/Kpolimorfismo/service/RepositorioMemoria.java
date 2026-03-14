package javacore.Kpolimorfismo.service;

import javacore.Kpolimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em uma memoria");
    }
}
