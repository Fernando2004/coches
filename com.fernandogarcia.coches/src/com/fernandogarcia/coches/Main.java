package com.fernandogarcia.coches;

import java.util.Scanner;

import controlador.Metodos;
import modelo.Coche;

public class Main {

	public static Scanner lector=new Scanner (System.in);
	
	public static Coche [] vehiculo =new Coche[10];
	
	public static void main(String[] args) {
	    
		  //Los creo explicitamente
        Coche c1=new Coche("Seat","negro",true,"HDE1456","MINI",2005,false);
        Coche c2=new Coche("Seat","azul",true,"ADE1220","DEPORTIVO",2005,false);
        Coche c3=new Coche("Seat","blanco",true,"TYE3369","FAMILIAR",2005,false);
        Coche c4=new Coche("Seat","rojo",true,"ODE1456","UTILITARIO",2005,false);
        Coche c5=new Coche();
        
        //los meto en un array
        vehiculo[0]=c1;
        vehiculo[1]=c2;
        vehiculo[2]=c3;
        vehiculo[3]=c4;
        vehiculo[4]=c5;
        int opcion;

        do{
            System.out.println("---MENU----");
            System.out.println("1.Mostrar coches");
            System.out.println("2.Nuevos coches");
            System.out.println("3.Modifica datos de coches");
            System.out.println("0.salir de la aplicacion");

            System.out.println("Indique una opcion");
            opcion=lector.nextInt();
            switch(opcion){
                case 1:
                    Metodos.imprimeCoche();
                break;
                case 2:
                	  Metodos.nuevoCoche();
                break;
                case 3:
                	  Metodos.imprimeCoche();
                    System.out.println("Indique la matricula del vehiculo a modificar");
                    String matricula="";
                    Metodos.modificarDatos(matricula);
                break;
                case 0:
                    System.out.println("fin");
                break;
                default:
                System.out.println("Indique una opcion correcta");
            }
            if(opcion==0)
                break;
                System.out.println("Pulsa intro para continuar");
               String intro=lector.nextLine();
                intro=lector.nextLine();
            if(intro.equalsIgnoreCase("si")){
                continue;
            }else{
                System.out.println("Indique la opcion 0 para salir");
            }   
             
        }while(opcion!=0);



        
    }
		

	

}
