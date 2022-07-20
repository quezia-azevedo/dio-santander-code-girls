package dio.bootcamp;

public class variaveis {
    public static void main(String[] args) {
        int i;
        // int i; //não pode criar variável com o msm nome de outra já criada
        int I;
        // int 1a; //Não pode começar com números
        int _1a; //Apesar de não dar erro de compilação, não deve iniciar com caracteres especiais
        int  $aq;

        i = 5;
        I = 10;
        _1a = 20;
        $aq = 7;

        final int j = 10;
        //j = 15; //por ser final, j não mudará seu valor.
        int asrn24678md;
        //int asrn246 78md; //Não pode ter espaço no nome.
        int asrn2$4678_md = 10; //A execeção de utilizar _ é apenas em constante.
        //int asrn2$46%78_md = 10; // Não pode utilizar caracteres especiais como "%", "@"

        asrn24678md = 100;

        int quantidadeProduto = 50;
        // int QuantidadeProduto; // Não segue a boa prática
        final int NUMERO_TENTATIVAS = 5;
        // final int numeroTentativas = 5; //Não segue a boa prática
        int QUANTIDADE_OPCOES = 25;  //Foi denifinada como final, não segue a boa prática.
        //int qntProd; //Não segue a boa prática

        System.out.println(i);
        System.out.println(I);
        System.out.println($aq);
        System.out.println(_1a);

        System.out.println(j);
        System.out.println(asrn24678md);
        System.out.println(asrn2$4678_md);

        System.out.println(quantidadeProduto);
        System.out.println(NUMERO_TENTATIVAS);
        System.out.println(QUANTIDADE_OPCOES);
    }
}
