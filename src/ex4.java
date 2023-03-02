import java.util.*;
/*
 * 4) Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado:

SP – R$67.836,43
RJ – R$36.678,66
MG – R$29.229,88
ES – R$27.165,48
Outros – R$19.849,53

Escreva um programa na linguagem que desejar onde calcule o percentual de representação que cada estado teve dentro do valor total mensal da distribuidora.
 */

public class ex4 {
    public static void main(String[] args) throws Exception{
        Map<String, Double> faturamento = new HashMap<>() {{
            put("SP", 67836.43);
            put("RJ", 36678.66);
            put("MG", 29229.88);
            put("ES", 27165.48);
            put("Outros", 19849.53);
        }};
        Iterator<Double> iterator = faturamento.values().iterator();
        Double soma = 0d; 
        while (iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("SP: " + (faturamento.get("SP")*100)/soma + "%");
        System.out.println("RJ: " + (faturamento.get("RJ")*100)/soma + "%");
        System.out.println("MG: " + (faturamento.get("MG")*100)/soma + "%");
        System.out.println("ES: " + (faturamento.get("ES")*100)/soma + "%");
        System.out.println("Outros: " + (faturamento.get("Outros")*100)/soma + "%");

    }
}
