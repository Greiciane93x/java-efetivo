package br.com.ane.livro.java.staticfactory;

public class Test {

    public static void main(String[] args) {

       Estudante estudante = Estudante.createNewEstudante(
               "Nane",
               "nane@test",
               "rj"
       );

        System.out.println(estudante);
    }
}
