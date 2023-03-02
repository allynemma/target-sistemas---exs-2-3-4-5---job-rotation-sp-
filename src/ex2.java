/*
 * Dado a sequência de Fibonacci, onde se inicia por 0
 *  e 1 e o próximo valor sempre será a soma dos 2 
 * valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 
 * 13, 21, 34...), escreva um programa na linguagem 
 * que desejar onde, informado um número, ele calcule
 *  a sequência de Fibonacci e retorne uma mensagem 
 * avisando se o número informado pertence ou não a 
 * sequência.

IMPORTANTE:
Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;
 */
public class ex2 {
    public static void main(String[] args) throws Exception {
        int numero = 33, numAnterior = 0, numAtual = 1, numDaSoma = 0;
        while (numAtual<numero){
            numDaSoma = numAnterior + numAtual;
            numAnterior = numAtual;
            numAtual = numDaSoma; 
        }
        if (numAtual == numero){
            System.out.println("O número " + numero + " está na sequência de Fibonacci");
        }
        else{
            System.out.println("O número " + numero + " NÃO foi encontrado na sequência de Fibonacci");
        }
    }
}
