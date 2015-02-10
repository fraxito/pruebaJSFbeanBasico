package adivinaNumero;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author xp
 */
@ManagedBean
@SessionScoped
public class NumeroUsuarioBean {
        //almacena el nº a adivinar
    int numeroOculto;
        //almacena el nº que ha introducido el usuario
    int numeroIntroducido;
        //almacena la respuesta que le vamos a dar a JSF
    String respuesta;

    public String getRespuesta() {
        if (numeroOculto == numeroIntroducido){
            return "ACERTASTE!!!!!";
        }
        else{ 
            return "<p> Lo siento, " + numeroIntroducido + " luser, </p>"
                    + "<p> Prueba de nuevo </p>";
        }    
    }

    public int getNumeroIntroducido() {
        return numeroIntroducido;
    }

    public void setNumeroIntroducido(int numeroIntroducido) {
        this.numeroIntroducido = numeroIntroducido;
    }
    /**
     * Creates a new instance of NumeroUsuarioBean
     */
    public NumeroUsuarioBean() {
        numeroOculto = 10;
    }
    
}
