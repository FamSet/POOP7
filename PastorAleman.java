/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.pkg7;

/**
 *
 * @author faran
 */
public class PastorAleman extends Perro {
    private boolean adiestrado;
    private String especialidad;

    public PastorAleman(String nombre, int edad, String color, boolean vacunado, double peso, boolean adiestrado, String especialidad) {
        super(nombre, "Pastor Alemán", edad, color, vacunado, peso);
        this.adiestrado = adiestrado;
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return super.toString() + "PastorAleman{" + "adiestrado=" + adiestrado + ", especialidad=" + especialidad + '}';
    }
}
