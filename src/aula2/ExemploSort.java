package aula2;

import java.util.SortedSet;
import java.util.TreeSet;

public class ExemploSort {

    public static void main(String[] args) {

        //Sort é uma lista ordenada crescente e nao se repete
        SortedSet<Integer> jogo = new TreeSet<Integer>();
        SortedSet<Integer> usados = new TreeSet<Integer>();

        int i, j, n;

        System.out.println("Jogo da Mega Sena");

        for (i=1; i<=10; i++){
            jogo.clear();
            for(j=1; j<=6; j++){
                do{
                    n = (int) (1 + Math.random() * 60);
                } while (usados.contains(n));
                jogo.add(n);
                usados.add(n);
            }

            System.out.printf("| %2do. Jogo: ", i);
            for (Integer integer : jogo){
                System.out.printf(" %2d", integer);
            }

            System.out.printf("|\n");
            System.out.printf("+------------------------+\n");

        }


    }

}
