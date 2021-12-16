import java.util.Scanner;

public class DiasDaSemanas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		Integer x = sc.nextInt();
		  String dia;
		  
		  if (x == 1) {
			  dia = "domingo";
		  } else if(x == 2 ) {
			  dia = "segunda";
		  } else if (x == 3) {
			  dia = "terça";
		  } else if (x == 4 ) {
			  dia = "quarta";
		  } else {
			  dia = "Valor invalido";
		  }
		
        //  System.out.println("Dia da semana:" + dia);
		
		
		// Switch Case
		
		Integer x = sc.nextInt();
		String dia;
		    
		    switch (x) {
			case 1:
				dia = "domingo";
				break;
			case 2:
			    dia = "senguda";
			    break;
			default:
				dia = "valor invalido";
				break;
			}
		
		 System.out.println("Dia da semana:" +   dia );
		         
           sc.close();
	}

}


	
