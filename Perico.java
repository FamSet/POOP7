/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.pkg7;

/**
 *
 * @author faran
 */
public class Perico extends Ave {
    private boolean habla;
    private String fraseFavorita;

    public Perico(String nombre, String colorPlumaje, double envergadura, boolean migratoria, int cantidadHuevosPorNidad, boolean habla, String fraseFavorita) {
        super(nombre, "Perico", colorPlumaje, envergadura, migratoria, cantidadHuevosPorNidad);
        this.habla = habla;
        this.fraseFavorita = fraseFavorita;
    }

    @Override
    public String toString() {
        return super.toString() + "Perico{" + "habla=" + habla + ", fraseFavorita=" + fraseFavorita + '}';
    }
}
