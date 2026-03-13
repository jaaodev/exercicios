package javacore.Kpolimorfismo.test;

import javacore.Kpolimorfismo.domain.Computador;
import javacore.Kpolimorfismo.domain.Produto;
import javacore.Kpolimorfismo.domain.Tomate;
import javacore.Kpolimorfismo.service.CalculadorImposto;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Aceri5", 3500);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());
        System.out.println("----------------");

        Produto produto2 = new Tomate("Tomate verde", 15);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());
        System.out.println("----------------");

        CalculadorImposto.calcularImposto(produto);
        CalculadorImposto.calcularImposto(produto2);
    }
}
