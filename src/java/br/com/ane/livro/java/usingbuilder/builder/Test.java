package br.com.ane.livro.java.usingbuilder.builder;

public class Test {

    public static void main(String[] args) {

        Pessoa pessoa = new PessoaBuilder()
                .addNome("Nane", "Assis")
                .addDataNasc(26, 7, 1993)
                .addLogradouro("")
                .addNumero("")
                .addComplemento("")
                .addBairro("")
                .addPais("")
                .build();

        System.out.println(pessoa.toString());
    }
}
