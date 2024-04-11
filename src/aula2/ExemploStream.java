package aula2;

import java.util.List;

public class ExemploStream {

    public static void main(String[] args) {

        List<String> list = List.of("Thais", "Menezes", "Alves", "Cecilia", "Carmen");
        System.out.println(list);
        //Stream é uma forma de programação funcional, uma cadeia de funções
        List<String> listFilteredName = list.stream()
                .filter(name -> name.startsWith("C"))
                .toList();
        System.out.println(listFilteredName);
    }
}
