

package proyecto;

import java.awt.Foto;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class PersistenciaFoto {
    
    public static void guardarImagen(Foto  i){
          ArrayList<> Foto=new ArrayList<Foto>();
        try{
            File file=new File("");
            if(file.exists()){
            Foto=    leerTodasLasImagenes();
            }
            Foto.add(i);
            FileOutputStream fos=new FileOutputStream(file);
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(Foto);
            System.out.println("se guardo exitosamente:");
        }catch(Exception e){
            
        }
    }
    
    public static ArrayList<Foto> leerTodasLasImagenes(){
        ArrayList<Foto> imagenes=new ArrayList<Foto>();
      File file=new File("");
  
      try{
      FileInputStream fis=new FileInputStream(file);
      ObjectInputStream ois=new ObjectInputStream(fis);
      Foto=(ArrayList<Foto>)ois.readObject();
      System.out.println("exitoso");
      }catch(Exception e){
          
      }
      return imagenes;
    }
    
    public static Foto leerImagenPorId(int id){
        Foto fot=null;
        try{
           fot=  leerTodasLasImagenes().get(id);
        }catch(Exception e){
            
        }
        return fot;
    }
    
}


    

