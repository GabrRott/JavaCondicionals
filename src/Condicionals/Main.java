package Condicionals;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numeroIf = 72;
		int numeroWhile = -5;
		int numeroFor;
		String estacion= "primavera";
		
		if(numeroIf<0) {
			System.out.println("el n�mero "+ numeroIf + " es negativo");
		} if(numeroIf>0) {
			System.out.println("el n�mero "+ numeroIf + " es positivo");
		} else {
			System.out.println("el n�mero "+ numeroIf + " no es positivo ni negativo");
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
				System.out.println("Estamos en la estaci�n "+estacion);
				break;
			case "oto�o":
				System.out.println("Estamos en la estaci�n "+estacion);
				break;
			case "primavera":
				System.out.println("Estamos en la estaci�n "+estacion);
				break;
			case "verano":
				System.out.println("Estamos en la estaci�n "+estacion);
				break;
			default:
				System.out.println("La informaci�n ingresada no corresponde a una estaci�n del a�o");
				break;
		}
		
	}

}
