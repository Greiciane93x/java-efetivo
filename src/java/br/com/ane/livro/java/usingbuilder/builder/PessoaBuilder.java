package br.com.ane.livro.java.usingbuilder.builder;

public class PessoaBuilder {
    final private Pessoa pessoa;
    final private Endereco endereco;

    public PessoaBuilder() {
        this.pessoa = new Pessoa();
        this.endereco = new Endereco();
    }

    public static PessoaBuilder builder() {
        return new PessoaBuilder();
    }

    public PessoaBuilder addNome(String nome, String sobrenome) {
        this.pessoa.setNome(nome);
        this.pessoa.setSobrenome(sobrenome);
        return this;
    }

    public PessoaBuilder addDataNasc(int dia, int mes, int ano) {
        this.pessoa.setDia(dia);
        this.pessoa.setMes(mes);
        this.pessoa.setAno(ano);
        return this;
    }

    public PessoaBuilder addLogradouro(String logradouro) {
        this.endereco.setLogradouro(logradouro);
        return this;
    }

    public PessoaBuilder addNumero(String numero) {
        this.endereco.setNumero(numero);
        return this;
    }

    public PessoaBuilder addComplemento(String complemento) {
        this.endereco.setComplemento(complemento);
        return this;
    }

    public PessoaBuilder addBairro(String bairro) {
        this.endereco.setBairro(bairro);
        return this;
    }

    public PessoaBuilder addPais(String pais) {
        this.endereco.setPais(pais);
        return this;
    }

    public Pessoa build() {
        this.pessoa.setEndereco(endereco);
        return this.pessoa;
    }

}
