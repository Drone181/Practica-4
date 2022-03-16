package paquete;

public class Fecha {
	
	public static String fecha(String m) {
		String f= new String();
		
		for(int i=2;i<m.length();i++) {
			if(m.charAt(i)!='/') {
				f=f+m.charAt(i);
			}
		}
		return f;
	}
	
}