package controlador;

import java.util.Scanner;
import com.fernandogarcia.coches.Main;
import modelo.Coche;
public class Metodos {
	
	public static Scanner lector=new Scanner (System.in);
	
	 //metodos
    /**Busca al obgeto coche por una ref unica */
    public static int buscaCoche(String matricula){
        int pos=-1;
        for(int i=0;i<=Main.vehiculo.length;i++){
            if(Main.vehiculo[i]!=null &&
            		Main.vehiculo[i].getMatricula().equalsIgnoreCase(matricula)){
                pos=i;
                break;
            }
        }
        return pos;
    }
    //-------------------------------------------------
    /**Busca un hueco dentro del array y nos devuelve la posicion */
    public static int buscoHueco(){
        int pos=-1;
        for(int i=0;i<=Main.vehiculo.length;i++){
            if(Main.vehiculo[i]==null){
                pos=i;
                break;
            }
        }
        return pos;
    }
    //---------------------------------------------------------
    /**Muestra todos los coches creados */
    public static void imprimeCoche(){
        for(int i=0;i<Main.vehiculo.length;i++){
            if(Main.vehiculo[i]!=null){
                System.out.println(Main.vehiculo[i].imprimeCoche());
                System.out.println("-------------------------");
                System.out.println(Main.vehiculo[i].toStringCoche());
                System.out.println("-------------------------");
            }
        }
    }
    //----------------------------------------------------------
    /**Introduce un coche nuevo en el array */
    public static void nuevoCoche(){
        int pos=buscoHueco();
        if(pos!=-1){
        	Main.vehiculo[pos]=new Coche();
            System.out.println("Coche bien creado en la posicion  "+pos);
        }else{
            System.out.println("No hay sitio para mas coches");
        }    

    }
    //--------------------------------------------------------------
    /**Modifica los datos del coche encontrado por matricula */
    public static void modificarDatos(String matricula){
        int pos=buscaCoche(matricula);
        if(pos!=-1){
            System.out.println("Introduce el modelo nuevo ");
            Main.vehiculo[pos].setModelo(lector.nextLine());
            System.out.println("Introduce el color nuevo ");
            Main.vehiculo[pos].setColor(lector.nextLine());
            System.out.println("Pintura metalizada (true/false)");
            Main.vehiculo[pos].setTipoPintura(lector.nextBoolean());
            System.out.println("Introduce la matricula nueva");
            Main.vehiculo[pos].setMatricula(lector.nextLine());
            System.out.println("Indique el tipo de vehiculo ");
            System.out.println("MINI");
            System.out.println("UTILITARIO");
            System.out.println("FAMILIAR");
            System.out.println("DEPORTIVO");
            Main.vehiculo[pos].setTipoCoche(lector.nextLine());
            System.out.println("Indique el anyo de fabricacion");
            Main.vehiculo[pos].setAnyoFabricacion(lector.nextInt());
            System.out.println("Indique si el seguro es a todo reisgo (true/false)");
            Main.vehiculo[pos].setTipoSeguro(lector.nextBoolean());

        }else{
            System.out.println("La matricula no existe");
        }
        
    }

}
