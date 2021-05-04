package Fundamentos;

import java.util.Locale;

/**
 * @author leonardo S.
 * @version 0.0.1
 * @Date 04/05/2021
 */
public class TiposPrimitivos {

    /*
    Os tipos de dados por padrão do Java são para numeros literais -> Integer e para numeros de ponto flutuante -> double!
    Literais inteiros
    default = int

    byte  -  4 bites
    short -  8 bites
    int   -  16 bites
    long  -  32 bites

    tipos de ponto flutuante
    default = double

    doulbe - 64 bites
    float  - 32


    String
    char
     */
    static {
        System.out.println("log.Iniciada com sucesso");
    }
    public static void main(String[] args) {
        System.out.println("hello world");

        var numero = 1;
        System.out.println(numero);
        Double var1 = 1.0;
        System.out.println(numero);
        System.out.println(var1.getClass().getSimpleName());

        String palavra = "Leonardo";
        // O tipo primitivo possue metodos pois herda de classe
        System.out.println(palavra.toUpperCase());
        System.out.println(palavra.toLowerCase());
        System.out.println(palavra.replace("Leo", "vi"));
        System.out.println(palavra.concat(" Desenvolvedor em treinamento!!!"));

    }


}
