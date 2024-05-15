/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matricula;

/**
 *
 * @author Jimena
 */
public class Materias {
    private int codMat;
    private String nombreMat;
    private int numCredMat;
    private String horMat;
    //private int grupoMat;

    public Materias() {
    }
    

    public Materias(int codMat, String nombreMat, int numCredMat, String horMat) {
        this.nombreMat = nombreMat;
        this.numCredMat = numCredMat;
        this.horMat = horMat;
        this.codMat= codMat;
    }

    public int getCodMat() {
        return codMat;
    }

    public void setCodMat(int codMat) {
        this.codMat = codMat;
    }

    public String getNombreMat() {
        return nombreMat;
    }

    public void setNombreMat(String nombreMat) {
        this.nombreMat = nombreMat;
    }

    public int getNumCredMat() {
        return numCredMat;
    }

    public void setNumCredMat(int numCredMat) {
        this.numCredMat = numCredMat;
    }

    public String getHorMat() {
        return horMat;
    }

    public void setHorMat(String horMat) {
        this.horMat = horMat;
    }
    
    
}

