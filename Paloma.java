/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.pkg7;

/**
 *
 * @author faran
 */
public class Paloma extends Ave {
    private boolean migratoriaLargaDistancia;
    private boolean domesticada;

    public Paloma(String nombre, String colorPlumaje, double envergadura, boolean migratoriaLargaDistancia, boolean domesticada) {
        super(nombre, "Paloma", colorPlumaje, envergadura, migratoriaLargaDistancia, 2);
        this.migratoriaLargaDistancia = migratoriaLargaDistancia;
        this.domesticada = domesticada;
    }

    @Override
    public String toString() {
        return super.toString() + "Paloma{" + "migratoriaLargaDistancia=" + migratoriaLargaDistancia + ", domesticada=" + domesticada + '}';
    }
}
