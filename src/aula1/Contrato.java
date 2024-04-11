package aula1;

import java.util.List;
import java.util.Map;

public class Contrato extends Documento {

    private List<String> assinaturas;
    private Map<Integer, String> testemunhas;

    public List<String> getAssinaturas(){
        return assinaturas;
    }

    public void setAssinaturas(List<String> assinaturas){
        this.assinaturas = assinaturas;
    }

    public Map<Integer, String> getTestemunhas() {
        return testemunhas;
    }

    public void setTestemunhas(Map<Integer, String> testemunhas) {
        this.testemunhas = testemunhas;
    }

}
