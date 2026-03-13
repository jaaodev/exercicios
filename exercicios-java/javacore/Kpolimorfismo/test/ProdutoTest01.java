package javacore.Kpolimorfismo.test;

import javacore.Kpolimorfismo.domain.Computador;
import javacore.Kpolimorfismo.domain.Televisao;
import javacore.Kpolimorfismo.domain.Tomate;
import javacore.Kpolimorfismo.service.CalculadorImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Delli7", 4500);
        Tomate tomate = new Tomate("Tomate vermelho", 10);
        Televisao tv = new Televisao("LG Bacana", 6500);
        CalculadorImposto.calcularImposto(computador);
        CalculadorImposto.calcularImposto(tomate);
        CalculadorImposto.calcularImposto(tv);
    }

    /*
    Computador c = new Computador();
    c é uma variável de referencia do tipo Computador
    e o Objeto que está sendo criado também é do tipo Computador.
    Com o polimorfismo nós podemos fazer um metodo generico e extender a todos os objetos de classes filhas,
    nesse caso para todos os objetos que são produtos.
     */

}
