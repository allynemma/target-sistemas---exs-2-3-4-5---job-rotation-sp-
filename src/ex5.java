/*
 * 5) Escreva um programa que inverta os caracteres de um string.

    IMPORTANTE:
    a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;
    b) Evite usar funções prontas, como, por exemplo, reverse;

 */
public class ex5 {
    public static void main (String[] args) throws Exception{
        String normal = "batata";
        String inversa ="";
        System.out.println(normal.toCharArray());
        for (int i = normal.length()-1; i >=0 ; i--){
            inversa = inversa + normal.charAt(i);
        }
        System.out.println(inversa);
    }
}