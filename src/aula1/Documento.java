package aula1;

import java.awt.*;
import java.util.List;
import java.util.Map;

public class Documento {
    private String nome;
    private String tipoDocumento;


//    public aula1.Documento(String nome){
//        if(nome == null || nome.isEmpty() || nome.isBlank()){
//            this.nome = "Nameless";
//        } else{
//        this.nome = nome;
//        }
//    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

}
