/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.pkg7;

/**
 *
 * @author faran
 */
public class Dalmata extends Perro {
    private boolean manchasNegras; 

    public Dalmata(String nombre, int edad, boolean manchasNegras) {
        super(nombre, "Dálmata", edad, manchasNegras ? "blanco con manchas negras" : "blanco con manchas marrones", true, 25);
        this.manchasNegras = manchasNegras;
    }

    @Override
    public String toString() {
        return super.toString() + "Dalmata{" + "manchasNegras=" + manchasNegras + '}';
    }
}
