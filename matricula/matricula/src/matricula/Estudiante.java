/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matricula;

/**
 *
 * @author USER
 */
public class Estudiante {
    private int codEst;
    private String nomEst;
    private String apellEst;
    private String correo;

    public Estudiante(){
        
    }

    public Estudiante(int codEst, String nomEst, String apellEst, String correo) {
        this.codEst = codEst;
        this.nomEst = nomEst;
        this.apellEst = apellEst;
        this.correo = correo;
    }

    public int getCodEst() {
        return codEst;
    }

    public void setCodEst(int codEst) {
        this.codEst = codEst;
    }

    public String getNomEst() {
        return nomEst;
    }

    public void setNomEst(String nomEst) {
        this.nomEst = nomEst;
    }

    public String getApellEst() {
        return apellEst;
    }

    public void setApellEst(String apellEst) {
        this.apellEst = apellEst;
    }

    public String getId() {
        return correo;
    }

    public void setId(String correo) {
        this.correo = correo;
    }
    
    
}
