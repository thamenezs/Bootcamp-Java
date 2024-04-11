package aula1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    //tipos primitivos de dados
    int a  = 10;
    char b = 'a';
    double c = 1.2;
    boolean d = true;
    byte e = 10;
    short f = 1;
    long g = 100000000;


    //Nao primitivos
    private Integer h = 10;
    private BigDecimal big = new BigDecimal(10.7);
    private String i = "a";
    private Boolean j = true;
    private Byte k = 100;
    private Short l = 10;
    private Float m = 19898f;
    private Long n = 1088888L;


    public static void main(String[] args) {
        //aula1.Documento documento = new aula1.Documento("Thais Menezes");
        Contrato documento = new Contrato();
        documento.setNome("Thais menezes");
        System.out.println(documento.getNome());

        documento.setTipoDocumento("PDF");
        System.out.println(documento.getTipoDocumento());


        List<String> assinaturas = new ArrayList<>();

        assinaturas.add("Fulana 1");
        assinaturas.add("Fulana 2");
        assinaturas.add("Fulana 3");

        documento.setAssinaturas(assinaturas);
        documento.setAssinaturas(List.of("Alexandra Morais", "Ciclana de Tal", "Beltrana de Tal"));


        Map<Integer, String> testemunhas = Map.of(1, "Testemunha 1", 2, "Testemunha 2");
        // ou
        Map<Integer, String> testemunhas2 = new HashMap<>();
        testemunhas2.put(1, "Testemunha 1");
        testemunhas2.put(2, "Testemunha 2");
        documento.setTestemunhas(testemunhas2);

        documento.getAssinaturas().forEach(item -> {
            System.out.println(item);
        });

        // ou entao:

        for(int i = 0; i < documento.getAssinaturas().size(); i++){
            System.out.println(documento.getAssinaturas().get(i));
        }

        //Entry manipula dados do map
        for(Map.Entry<Integer, String> entry : documento.getTestemunhas().entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

    }
}