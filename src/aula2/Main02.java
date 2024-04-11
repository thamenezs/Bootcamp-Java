package aula2;

import java.util.*;

public class Main02 {


    public static void main(String[] args){

        List<String> list = new ArrayList<>();
        list.add("Thais Menezes");
        list.add("Thais Souza");
        list.removeFirst();
        /*list.forEach(item -> {
            System.out.println(item);
        });*/

        //Set é uma lista que nao permite valores duplicados
        Set<String> set = Set.of("Thais", "Souza", "Menezes");

        /*for(String s : set) {
            System.out.println(s);
        }*/

        // Lista de fila
        Queue<String> queue = new ArrayDeque<>();
        queue.add("A");
        queue.add("B");
        queue.add("C");

        System.out.println(queue);

        //peek retorna o inicio da fila e poll retorna o primeiro e remove ele
        /*String element = queue.peek();*/
        System.out.println("Chamou: " + queue.poll());
        System.out.println(queue);

        System.out.println("Chamou: " + queue.poll());
        System.out.println(queue);

        System.out.println("Chamou: " + queue.poll());
        System.out.println(queue);

        System.out.println("Chamou: " + queue.poll());
        System.out.println(queue);


        //Pilha. Primeiro que entra é o último a sair
        Stack p = new Stack<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++){
            System.out.println("Inserindo na pilha: " + p.push(random.nextInt(100)));
        }
        System.out.println("--------------------");
        for (int i = 0; i < 10; i++){
            System.out.println("Inserindo na pilha: " + p.pop());
        }
    }
}
