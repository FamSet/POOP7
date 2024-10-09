/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.pkg7;

/**
 *
 * @author faran
 */
public class Ave extends Animal {
    private String sexo;
    private String colorPlumaje;
    private double envergadura;
    private boolean migratoria;
    private int cantidadHuevosPorNidad;

    public Ave(String nombre, String sexo, String colorPlumaje, double envergadura, boolean migratoria, int cantidadHuevosPorNidad) {
        super(nombre);
        this.sexo = sexo;
        this.colorPlumaje = colorPlumaje;
        this.envergadura = envergadura;
        this.migratoria = migratoria;
        this.cantidadHuevosPorNidad = cantidadHuevosPorNidad;
    }

    @Override
    public String toString() {
        return super.toString() + "Ave{" + "sexo=" + sexo + ", colorPlumaje=" + colorPlumaje + ", envergadura=" + envergadura + ", migratoria=" + migratoria + ", cantidadHuevosPorNidad=" + cantidadHuevosPorNidad + '}';
    }
}
