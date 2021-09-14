package prueba.practica;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);
		
		System.out.println("Ingresar la clave: ");
		
		String num = entrada.nextLine();
		String clave="85DB";
	    boolean comparacion=num.equals(clave);
	    
	    while (comparacion==false){
	    	System.out.println("Ingresar la clave: ");
	    	num=entrada.nextLine();
	    	comparacion=num.equals(clave);
	    }
	    System.out.println("Gracias por preferirnos: ");
	    
	    System.out.println("###############################");
	    System.out.println("BANCO PICHINCHA: elija una opcion");
	    System.out.println("1. Consultar pagos");
	    System.out.println("2. Realizar transeferencia");
	    System.out.println("3. SALIR");
	    System.out.println("###############################");
	    
	    int opcion = entrada2.nextInt();
	    
	    while (opcion<3) {
	    	
	    	if (opcion==1) {
	    		System.out.println("Usted no tiene un pago pendiente: ");
	    		
	    	    System.out.println("###############################");
	    	    System.out.println("BANCO PICHINCHA: elija una opcion");
	    	    System.out.println("1. Consultar pagos");
	    	    System.out.println("2. Realizar transeferencia");
	    	    System.out.println("3. SALIR");
	    	    System.out.println("###############################");
	    	    opcion = entrada2.nextInt();
	    	    
	    	}else if (opcion==2) {
	    		System.out.println("Ingresar cuenta de destino:");
	    		String cuenta = entrada.nextLine();
	    		
	    		System.out.println("Ingresar cantidad a transferir:");
	    		int dineroTransferir = entrada2.nextInt();
	    		int saldo=2500;
	    		int nuevoSaldo=2500-dineroTransferir;
	    		
	    		System.out.println("Su nuevo saldo es: "+nuevoSaldo);
	    		
	    	    System.out.println("###############################");
	    	    System.out.println("BANCO PICHINCHA: elija una opcion");
	    	    System.out.println("1. Consultar pagos");
	    	    System.out.println("2. Realizar transeferencia");
	    	    System.out.println("3. SALIR");
	    	    System.out.println("###############################");
	    	    opcion = entrada2.nextInt();
	    	}
	    	
	    }
	    if (opcion==3) {
	    	System.out.println("Saliendo del sistema.");
	    }
	}
}