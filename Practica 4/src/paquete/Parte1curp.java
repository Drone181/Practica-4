package paquete;

public class Parte1curp {
	
	public static String part1(String nombre1,String nombre2, String apellido1, String apellido2) {
		
		String s1= new String();
		char letra =0;
		
		s1=s1+apellido1.charAt(0);
					
		for(int i=1;i<apellido1.length();i++) {
			letra = apellido1.charAt(i);
			if(letra == 'A'||letra == 'E'||letra == 'I'||letra == 'O'||letra == 'U') {
				s1=s1+letra;
				break;
			}
		}
		
		if(apellido2=="X") {
			s1=s1+"X";
		}
		else {
			s1=s1+apellido2.charAt(0);
		}
		
		if(Valid.reduccion(nombre1).equals("MARIA")||Valid.reduccion(nombre1).equals("JOSE")&&nombre2.equals("X")==false) {
			s1=s1+nombre2.charAt(0);
		}
		else {
			s1=s1+nombre1.charAt(0);
		}
		
		return s1;
	}
}
