package paquete;

public class Valid {
	
	public static String reduccion(String s) {
		String s1 = new String();
		char letra = 0;
		for(int i=0;i<s.length();i++) {
			letra=s.charAt(i);
			if(letra!=' ') {
				s1=s1+letra;
			}
			else {
				break;
			}
			
		}
		return s1;
	}
	
	public static String reduccion1(String s) {
		String s1 = new String();
		char letra = 0;
		for(int i=0;i<s.length()-1;i++) {
			letra=s.charAt(i);
				s1=s1+letra;	
		}
		return s1;
	}
	
	public static String reduccion2(String s) {
		String s1 = new String();
		char letra = 0;
		for(int i=0;i<s.length()-3;i++) {
			letra=s.charAt(i);
				s1=s1+letra;	
		}
		return s1;
	}

}
