/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package flujoDatos;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author ZebenYeste
 */
public class Escribir {
    public static void main (String[] args) throws IOException {
        DataOutputStream d = new DataOutputStream(new FileOutputStream("src/flujoDatos/Datos.dat"));
        Ficha f = new Ficha("Antonio", 21, 1.7f, 12345678, 'A');

        Utilidad.escribir(f,d);
        d.close();
    }
}
