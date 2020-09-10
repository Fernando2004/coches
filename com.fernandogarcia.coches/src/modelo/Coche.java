package modelo;

import java.util.Scanner;

public class Coche {

		Scanner lector=new Scanner(System.in);
	
	    public static final int MINI=0;
	    public static final int UTILITARIO=1;
	    public static final int FAMILIAR=2;
	    public static final int DEPORTIVO=3;

	    private String modelo;
	    private String color;
	    private boolean tipoPintura;
	    private String matricula;
	    private String tipoCoche="";
	    private int anyoFabricacion;
	    private boolean tipoSeguro;

	   

	public Coche(){
	    System.out.println("Indica el modelo del vehiculo");
	    this.modelo=lector.nextLine();
	    System.out.println("Indica el color del vehiculo");
	    this.color=lector.nextLine();
	    System.out.println("Indica si el vehiculo es metalizado (SI/NO)");
	    String metalizado=lector.nextLine();

	        //cambiamos el true en el toString
	        if(metalizado.equalsIgnoreCase("SI")){
	            this.tipoPintura=true;
	        }else{
	            this.tipoPintura=false;
	        }
	    System.out.println("Indica cual es la matricula del vehiculo");
	    this.matricula=lector.nextLine();
	    do{
	        System.out.println("Indique el tipo de vehiculo ");
	        System.out.println("0.MINI");
	        System.out.println("1.UTILITARIO");
	        System.out.println("2.FAMILIAR");
	        System.out.println("3.DEPORTIVO");
	        int tipoVehiculo=lector.nextInt();

	        switch(tipoVehiculo){
	            case 0:
	                tipoCoche="MINI";
	                break;
	            case 1:
	                tipoCoche="UTILITARIO";
	                break;
	            case 2:
	                tipoCoche="FAMILIAR";
	                break;
	            case 3:
	                tipoCoche="DEPORTIVO";
	                break;
	                default:
	                System.out.println("El tipo de vehiculo no es correcto");
	            }
	    }while(tipoCoche!= "MINI" && 
	    tipoCoche!="UTILITARIO" &&
	    tipoCoche!="FAMILIAR" &&
	    tipoCoche!="DEPORTIVO");

	    System.out.println("Indica el año de fabricacion del vehiculo");
	    this.anyoFabricacion=lector.nextInt();
	    System.out.println("Indica si el seguro es a todo riesgo (SI/NO)");
	    String todoRiesgo=lector.nextLine();
	    lector.nextLine();
	        //cambiamos el true en el toString
	        if(todoRiesgo.equalsIgnoreCase("si")){
	            this.tipoSeguro=true;
	        }else{
	            this.tipoSeguro=false;
	        }
	}
	public Coche(String modeldo,String color,boolean tipoPintura,String matricula,String tipoCoche,int anyoFabricacion,boolean tipoSeguro){

	    this.modelo=modeldo;
	    this.color=color;
	    this.tipoPintura=tipoPintura;
	    this.matricula=matricula;
	    this.tipoCoche=tipoCoche;
	    this.anyoFabricacion=anyoFabricacion;
	    this.tipoSeguro=tipoSeguro;
	}
	// Setters dinamicos 
	public void setModelo(String modelo){
	    this.modelo=modelo;
	}
	public void setColor(String color){
	    this.color=color;
	}
	public void setTipoPintura(boolean tipoPintura){
	    this.tipoPintura=tipoPintura;
	}
	public void setMatricula(String matricula){
	    this.matricula=matricula;
	}
	public void setTipoCoche(String tipoCoche){
	    this.tipoCoche=tipoCoche;
	}
	public void setAnyoFabricacion(int anyoFabricacion){
	    this.anyoFabricacion=anyoFabricacion;
	}
	public void setTipoSeguro(boolean tipoSeguro){
	    this.tipoSeguro=tipoSeguro;
	}
	//Getters
	//-------------------------------------------------------
	public String getModelo(){
	    return this.modelo;
	}
	public String getColor(){
	    return this.color;
	}
	public boolean isTipoPintura(){
	    return this.tipoPintura;
	}
	public String getMatricula(){
	    return this.matricula;
	}
	public String getTipoCoche(){
	    return this.tipoCoche;
	}
	public int getAnyoFabricacion(){
	    return this.anyoFabricacion;
	}
	public boolean isTipoSeguro(){
	    return this.tipoSeguro;
	}

	//metodos 
	public String imprimeCoche(){

	    return "El modelo: "+this.modelo+
	           "\nEl color: " +this.color;
	}
	//toString 
	public String toStringCoche() {
	    String imprimo="Modelo:\t"+ this.modelo+
	    "\nColor: \t"+this.color;
	    //cambio los trues
	    if(this.tipoPintura==true){
	        imprimo+="\nTipo de Pintura: Metalizada";
	    }else
	        imprimo+="\nTipo de Pintura; No metalizada";

	    imprimo+="\nMatricula:\t"+this.matricula+
	    "\nTipo de Vehiculo:\t"+this.tipoCoche+
	    "\nAño de fabricacion:\t"+this.anyoFabricacion;
	     if(this.tipoSeguro==true){
	        imprimo+="\nTipo de Seguro: Todo risgo";
	    }else
	        imprimo+="\nTipo de Seguro: A terceros";
	        
	    return imprimo;
	}
	
}
