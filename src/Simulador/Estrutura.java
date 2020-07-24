package Simulador;

public class Estrutura {
	String name_1;
	int nota_1;
	String name_2;
	int nota_2;
	String[] status_indice = { "Ótimo", "regular", "Mal"};
	int total_nota;	
	int nota_calculada; 
	
	
	
	void status() {
		System.out.println("-----------Simulado RA -----------");
		
		total_nota = this.nota_1 + this.nota_2;
		nota_calculada = total_nota / 2;
		
		System.out.println("Total da nota calculada é: " + nota_calculada );
		
			if( nota_calculada < 5 ) {
				
				System.out.println(status_indice[2]);
				
			} else if ( nota_calculada > 4 && nota_calculada < 9 ) {
			
			System.out.println(status_indice[1]);
			
			}  else if ( nota_calculada > 8 ) {
				
				System.out.println(status_indice[0]);
				
			}
			
	}

	void lista_names() {
		
		System.out.println( "Aqui está a lista dos reclamantes: ");
		System.out.println( this.name_1 + " , " + this.name_2 + "." );
	
	}



}
