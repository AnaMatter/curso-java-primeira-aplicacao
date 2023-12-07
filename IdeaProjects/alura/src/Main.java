public class Main {
    public static void main(String[] args) {
      System.out.println("Esse é o Screen Match");

        int anoDeLancamento = 2022;
        boolean incluidoNoPlano =  true;
        double notaDoFilme = 8.1;

        double media = (9.8 + 6.3 + 8.0) / 3;

        String  sinopse;
        // valor das variáveis sao passadas como parametros para o método String.format substiruindo os placeholders
        sinopse = """
                   Filme: Top Gun: " Maverick"
                   Filme de aventura com galã dos anos 80
                   Muito bom!
                   Ano de lançamento: %d
                   Média: %s""".formatted(anoDeLancamento,media) ;


        System.out.println(sinopse);


        // pega o double (media e joga dentro de um inteiro), esse recurso se chama casting ou seja ele permite que
        // tipos de dados incompativeis possam ser utilizados em uma mesma operaçao. No caso abaixo é casting explicito
        int classficacao =(int) (media /2);
        System.out.println(classficacao);

       /*  Exemplo método format(), da classe String. Permite formatar um texto utilizando diversos placeholders
       que sao representados pelo caractere % seguido de uma letra que indica o tipo de dado que será inserido
       no placeholder. Ex. %s (String), %d (inteiro), %f decimal.

        String nome = "Maria";
        int idade = 30;
        double valor = 55.9999;
        System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome, idade, valor));*/
    }
}