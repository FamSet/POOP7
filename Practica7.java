/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica.pkg7;

/**
 *
 * @author faran
 */
public class Practica7 {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 69, 10000f); 
        Empleado empleado2 = new Empleado("Emiliano", 45, 5f); 
        
        System.out.println(empleado1);
        System.out.println(empleado2);
        
        empleado1.aumentarSueldo(10); 
        System.out.println(empleado1);
        
        Gerente gerente1 = new Gerente(1000, "Jorge", 57, 40000f);
        System.out.println(gerente1);
        
        Gerente gerente2 = new Gerente(); 
        System.out.println(gerente2);
        
        gerente2.setPresupuesto(100000f);
        System.out.println(gerente2);
        
        gerente2.setNombre("Jose");
        System.out.println(gerente2);
        
        System.out.println(gerente2.getNombre());
        
        Animal animal = new Animal("Juan"); 
        System.out.println(animal);
        
        Perro miPerro = new Perro("Firulais", "Femenino", 3, "dorado", true, 25);
        System.out.println(miPerro);
        
        Ave miAve = new Ave("Pájaro Azul", "masculino", "azul", 10, false, 2);
        System.out.println(miAve);
        
        PastorAleman miPastor = new PastorAleman("Rex", 4, "negro", true, 35, true, "guarda");
        System.out.println(miPastor);
        
        Dalmata miDalmata = new Dalmata("Cruella", 2, true);
        System.out.println(miDalmata);
        
        Perico miPerico = new Perico("Coco", "verde", 20, false, 4, true, "¡Hola, qué tal!");
        System.out.println(miPerico);
        
        Paloma miPaloma = new Paloma("Celeste", "gris", 30, true, false);
        System.out.println(miPaloma);
    }
}
