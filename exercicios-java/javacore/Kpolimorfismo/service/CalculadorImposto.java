package javacore.Kpolimorfismo.service;

import javacore.Kpolimorfismo.domain.Computador;
import javacore.Kpolimorfismo.domain.Produto;
import javacore.Kpolimorfismo.domain.Tomate;

public class CalculadorImposto {

    public static void calcularImposto(Produto produto) {
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor: R$" + produto.getValor());
        System.out.printf("Imposto a ser pago: R$%.2f", imposto);
        System.out.println();
        System.out.println("-  -  -  -  -  -  -  -  -  -  -  -  -  -  -");
    }

}
