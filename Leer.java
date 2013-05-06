/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package flujoDatos;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author ZebenYeste
 */
public class Leer {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        DataInputStream d = new DataInputStream(new FileInputStream("src/flujoDatos/Datos.dat"));
        Ficha f;
        f=Utilidad.leer(d);

        System.out.println(f.toString());
    }

}
