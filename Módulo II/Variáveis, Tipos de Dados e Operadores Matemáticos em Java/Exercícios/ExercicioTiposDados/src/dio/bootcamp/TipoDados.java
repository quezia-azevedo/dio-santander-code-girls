package dio.bootcamp;

public class TipoDados {
    public static void main(String[] args) {

        byte b1 = 10;
        byte b2 = 20;

        short s1 = 20000;
//        short s2 = 40000; - Está ultrapassando o valor limite de short.

//        int i1 = -10000000000; - O valor está muito abaixo o inteiro não suporta.
        int i2 = 28500;

        long l1 = 1000000000000000000L;
        long l2 = 2004005000500055000L;

//        float f1 = 4.5; - Se não especificar o f, ele entende como double.
        float f2 = 10.68f;

        double d1 = 58.69;
        double d2 = 99.84d;

        char c1 = 'W';
//        char c2 = 'Tw'; - Apenas um caracter
        char c3 = '\u0057';

        String st1 = "Fulano";
        String st2 = "Ciclano";
        String st3 = "ag dgb se se et t KKSLA ....";

//        String dt1 = "20/07/2022"; - está sendo passado como string, devendo ser utilizado o tipo de dado, "data"

        boolean bo1 = true;
        boolean bo2 = false;

        System.out.println(b1);
        System.out.println(b2);

        System.out.println(s1);

        System.out.println(i2);

        System.out.println(l1);
        System.out.println(l2);

        System.out.println(f2);

        System.out.println(d1);
        System.out.println(d2);

        System.out.println(c1);
        System.out.println(c3);

        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);

        System.out.println(bo1);
        System.out.println(bo2);
    }
}
