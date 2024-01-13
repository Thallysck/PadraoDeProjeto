import br.com.alura.loja.desconto.CalculadoraDeDescontos;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Orcamento primeiro = new Orcamento(new BigDecimal("100"), 6);
        Orcamento segundo = new Orcamento(new BigDecimal("1000"), 1);
        //CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
        CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
        System.out.println(calculadora.calcular(primeiro));
        System.out.println(calculadora.calcular(segundo));
    }
}