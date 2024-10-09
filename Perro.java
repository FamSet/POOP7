/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.pkg7;

/**
 *
 * @author faran
 */
public class Perro extends Animal {
    private String sexo;
    private int edad;
    private String color;
    private boolean vacunado;
    private double peso;

    public Perro(String nombre, String sexo, int edad, String color, boolean vacunado, double peso) {
        super(nombre);
        this.sexo = sexo;
        this.edad = edad;
        this.color = color;
        this.vacunado = vacunado;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return super.toString() + "Perro{" + "sexo=" + sexo + ", edad=" + edad + ", color=" + color + ", vacunado=" + vacunado + ", peso=" + peso + '}';
    }
}
