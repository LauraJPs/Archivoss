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
    private String horMat1;
    private String horMat2;
    private int numCup;
    public Materias() {
    }
    

    public Materias(int codMat, String nombreMat, int numCredMat, String horMat1,String horMat2, int numCup) {
        this.codMat= codMat;
        this.nombreMat = nombreMat;
        this.numCredMat = numCredMat;
        this.horMat1 = horMat1;
        this.horMat2=horMat2;
        this.numCup=numCup;
        
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

    public String getHorMat1() {
        return horMat1;
    }

    public void setHorMat1(String horMat1) {
        this.horMat1 = horMat1;
    }

    public String getHorMat2() {
        return horMat2;
    }

    public void setHorMat2(String horMat2) {
        this.horMat2 = horMat2;
    }

    public int getNumCup() {
        return numCup;
    }

    public void setNumCup(int numCup) {
        this.numCup = numCup;
    }

    
    
    
}

