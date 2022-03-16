package paquete;

public class Parte2curp {
	public static String part2(String nombre1, String nombre2, String apellido1, String apellido2) {
		String s1 = new String();
		char letra1 = 0;
		char letra2 = 0;
		boolean x=false,y=false;
		
		for(int i=1;i<apellido1.length();i++) {
			letra1 = apellido1.charAt(i);
			if((letra1 != 'A')&&(letra1 != 'E')&&(letra1 != 'I')&&(letra1 != 'O')&&(letra1 != 'U')) {
				s1=s1+letra1;
				x=true;
				break;
			}
		}
		if(x!=true) {
			s1=s1+"X";
		}
		
		for(int i=1;i<apellido2.length();i++) {
			letra2 = apellido2.charAt(i);
			if((letra2 != 'A')&&(letra2 != 'E')&&(letra2 != 'I')&&(letra2 != 'O')&&(letra2 != 'U')) {
				s1=s1+letra2;
				y=true;
				break;
			}
		}
		
		if(y!=true) {
			s1=s1+"X";
		}
		
		if(Valid.reduccion(nombre1).equals("MARIA")||Valid.reduccion(nombre1).equals("JOSE")&&nombre2.equals("X")==false) {
			for(int i=1;i<nombre2.length();i++) {
				letra2 = nombre2.charAt(i);
				if((letra2 != 'A')&&(letra2 != 'E')&&(letra2 != 'I')&&(letra2 != 'O')&&(letra2 != 'U')) {
					s1=s1+letra2;
					break;
				}
			}
		}
		else {
			for(int i=1;i<nombre1.length();i++) {
				letra2 = nombre1.charAt(i);
				if((letra2 != 'A')&&(letra2 != 'E')&&(letra2 != 'I')&&(letra2 != 'O')&&(letra2 != 'U')) {
					s1=s1+letra2;
					break;
				}
			}
		}	
		return s1;
	}

}
