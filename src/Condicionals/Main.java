package Condicionals;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numeroIf = 72;
		int numeroWhile = -5;
		int numeroFor;
		String estacion= "primavera";
		
		if(numeroIf<0) {
			System.out.println("el número "+ numeroIf + " es negativo");
		} if(numeroIf>0) {
			System.out.println("el número "+ numeroIf + " es positivo");
		} else {
			System.out.println("el número "+ numeroIf + " no es positivo ni negativo");
		}
		System.out.println("");
		
		
		while(numeroWhile < 3) {
			numeroWhile ++;
			System.out.println(numeroWhile);
		}
		System.out.println("");
		
		do{
			numeroWhile ++;
			System.out.println(numeroWhile);
		} while (numeroWhile == 2.2);
		
		System.out.println("");
		
		for(numeroFor = 0; numeroFor<=3; numeroFor++) {
			System.out.println(numeroFor);
		}
		
		switch(estacion) {
			case "invierno":
				System.out.println("Estamos en la estación "+estacion);
				break;
			case "otoño":
				System.out.println("Estamos en la estación "+estacion);
				break;
			case "primavera":
				System.out.println("Estamos en la estación "+estacion);
				break;
			case "verano":
				System.out.println("Estamos en la estación "+estacion);
				break;
			default:
				System.out.println("La información ingresada no corresponde a una estación del año");
				break;
		}
		
	}

}
