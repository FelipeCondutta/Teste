public class scrennmatch {
    public static void main(String[] args) {
        System.out.println("Esse é o screen match");
        System.out.println("Filme: Top Gun Maverick");

        int anoDeLancamento = 2022;
        System.out.println("ano de lançamento:" + anoDeLancamento);

        boolean incluidoNoPlano = true;

        double notaDoFilme = 8.1;
        //Média calculada por três notas
        double media = (9.8 + 6.3 + 8.0) /3;

        System.out.println("Nota do filme:" + media);

        String sinopse;


        sinopse = """
                Filme Top Gun
                Filme de aventura com gala dos anos 80
                Ano de lançamento
                """ + anoDeLancamento;


        System.out.println(sinopse);

        int classificacao = (int) (media /2);
        System.out.println(classificacao);



    }
}
