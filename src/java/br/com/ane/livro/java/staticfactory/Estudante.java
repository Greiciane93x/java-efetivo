package br.com.ane.livro.java.staticfactory;

public class Estudante {

    private final String nome;
    private final String email;
    private final String cidade;

    public Estudante(String nome, String email, String cidade) {
        this.nome = nome;
        this.email = email;
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getCidade() {
        return cidade;
    }

    public static Estudante createNewEstudante(String nome, String email, String cidade){
        return new Estudante(nome, email, cidade);
    }

    @Override
    public String toString() {
        return "Estudante{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", cidade='" + cidade + '\'' +
                '}';
    }
}

