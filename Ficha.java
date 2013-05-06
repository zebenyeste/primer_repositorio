/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package flujoDatos;

/**
 *
 * @author ZebenYeste
 */
public class Ficha {
    private String nombre;
    private int edad;
    private float altura;
    private long dni;
    private char lDni;

    public Ficha(String nombre, int edad, float altura, long dni, char lDni) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.dni = dni;
        this.lDni = lDni;
    }

    public float getAltura() {
        return altura;
    }

    public long getDni() {
        return dni;
    }

    public int getEdad() {
        return edad;
    }

    public char getlDni() {
        return lDni;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Ficha{" + "nombre=" + nombre + " edad=" + edad + " altura=" + altura + " dni=" + dni + " lDni=" + lDni + '}';
    }
}