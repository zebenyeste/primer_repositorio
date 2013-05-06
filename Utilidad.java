/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package flujoDatos;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.DataInputStream;

/**
 *
 * @author ZebenYeste
 */
public class Utilidad {
    public static void escribir(Ficha f, DataOutputStream d) throws IOException{
        d.writeUTF(f.getNombre());
        d.writeInt(f.getEdad());
        d.writeFloat(f.getAltura());
        d.writeLong(f.getDni());
        d.writeChar((int)f.getlDni());

    }

    public static Ficha leer(DataInputStream d) throws IOException {
        Ficha f = new Ficha(d.readUTF(), d.readInt(), d.readFloat(), d.readLong(), d.readChar());
        return f;
    }
}
