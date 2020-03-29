
/*
Foi retirado a lista para inserir a lista Hashset, como no caso "aluno" apenas tem um parâmetro a ser salvo que é "nome"
usando esta hashset no lugar do objeto aluno temos uma grande melhoria nas linhas de códigos.
E além disso a função verificaNomeExistente se torna inativa, enquanto o hashset já faz essa função de lista e também
de não aceitar dados replicados.

A diferença fica visivel de LoC, excluindo o arquivo de objeto Aluno e as funções abaixo que resultavam cerca
de 14 linhas de código.

O que influência? A apresentação e entendimento do código, onde qualquer desenvolvedor olhando para este código com essas
funções aplicadas poderá alterar, incluir outras funções mais fácil e com um melhor entendimento.
 */
package org.example;

import java.lang.reflect.Array;
import java.util.*;


public class App {

    private static Scanner sc = new Scanner(System.in);
    //private static List<Aluno> listaAlunos = new ArrayList<Aluno>();
    private static Collection<String> listaAlunos = new HashSet<String>();


    public static void main(String[] args) {
        String option;

        do {
            System.out.println("\n----- Menu -----");
            System.out.println("[1] - Inserir Aluno");
            System.out.println("[2] - Imprimir Lista\n");
            System.out.println("[0] - Sair\n");
            option = sc.nextLine();

            switch (option) {
                case "1":
                    inserirAluno();
                    break;
                case "2":
                    exibirLista();
                    break;
                case "0":
                    exibirLista();
                    break;
            }
        } while (!option.equals("0"));
    }

    private static void inserirAluno() {
        System.out.println("Insira o nome: ");
        String nome = sc.nextLine();
        listaAlunos.add(nome);
//        if(verificaNomeExistente(nome)){
//            listaAlunos.add(new Aluno(nome));
//        }else{
//            System.out.println("\n#### NOME JA CADASTRADO ####\n");
//        }
    }

//    private static boolean verificaNomeExistente(String nome){
//        for (Aluno aluno : listaAlunos){
//            if (aluno.getNome().equals(nome)){
//                return false;
//            }
//        }
//        return true;
//    }

    // Inserido ForEach com method Reference
    private static void exibirLista() {
        System.out.println("----- Lista de nomes -----");
        listaAlunos.forEach(nomeAluno -> System.out.println(nomeAluno));
        /* for (String nomeAluno : listaAlunos){
            System.out.println(nomeAluno);
        } */
    }
}
