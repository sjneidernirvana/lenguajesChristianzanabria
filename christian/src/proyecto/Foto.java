package proyecto;

import java.io.File;
import java.io.Serializable;

/**
 *
 * @author campitos
 */
public class Foto implements Serializable{
    
   private byte[] datosImage;
   private String  nombre;

    public Foto(byte[] datosImage, String nombre) {
        this.datosImage = datosImage;
        this.nombre = nombre;
    }

  

  

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte[] getDatosImage() {
        return datosImage;
    }

    public void setDatosImage(byte[] datosImage) {
        this.datosImage = datosImage;
    }
    
}
