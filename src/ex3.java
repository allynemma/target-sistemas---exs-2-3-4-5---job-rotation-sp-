import java.util.*;
/*
 * 3) Dado um vetor que guarda o valor de faturamento diário de uma distribuidora, faça um programa, na linguagem que desejar, que calcule e retorne:
• O menor valor de faturamento ocorrido em um dia do mês;
• O maior valor de faturamento ocorrido em um dia do mês;
• Número de dias no mês em que o valor de faturamento diário foi superior à média mensal.

IMPORTANTE:
a) Usar o json ou xml disponível como fonte dos dados do faturamento mensal;
b) Podem existir dias sem faturamento, como nos finais de semana e feriados. Estes dias devem ser ignorados no cálculo da média;
 */
public class ex3 {
    public static void main(String[] args) throws Exception{
        //PS: Não achei o json ou xml disponível, então fiz uma lista :);
        List<Double> faturamento = new ArrayList<>();
        faturamento.add(30000d);
        faturamento.add(0d);
        faturamento.add(400000d);

        Double menor= 100000.00; //eu iria naturalmente iria usar um Collection.min(faturamento), mas pelo o que foi pedido (retornar e calculdar), fiz dessa forma, que calcula e retorna.
        Double maior = 0d, soma = 0d;
        int diasSemFat = 0;

        for (int i = 0; i < faturamento.size(); i++){
            menor = MenorValor(faturamento.get(i), menor);
            maior = MaiorValor(faturamento.get(i), maior);
            diasSemFat = DiasSemFaturamento(faturamento.get(i), diasSemFat);
            soma += faturamento.get(i);
        }
        
        System.out.println("O maior faturamento apresentado foi: " + maior);
        System.out.println("O menor faturamento apresentado foi: " + menor);
        System.out.println("A média dos faturamentos foi de: " + soma/(faturamento.size()-diasSemFat));

    }
    public static Double MenorValor (Double fatAtual, Double menor){
        if (fatAtual < menor){
            menor = fatAtual;
        }
        return menor;
    }
    public static Double MaiorValor (Double fatAtual, Double maior){
        if (fatAtual > maior){
            maior = fatAtual;
        }
        return maior;
    }
    public static int DiasSemFaturamento (Double fatAtual, int dias){
        if(fatAtual == 0){
            dias ++;
        }
        return dias;
    }
}

