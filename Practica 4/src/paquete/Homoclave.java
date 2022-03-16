package paquete;

import java.util.Random;

public class Homoclave {
	
	public static char h1(String m) {
		String s1 = new String();
		char letra1 = 0;
		
		for(int i=0;i<2;i++) {
			s1=s1+m.charAt(i);
		}
		
		if(s1.equals("20")) {
			letra1='A';
		}
		else {
			letra1='0';
		}
		
		return letra1;
	}
	
	public static int h2() {
		int i=0;
		
		Random r = new Random();
		i = (int)(r.nextDouble()*9);
		
		return i;
	}
	
	public static char h3() {
		
		String n = new String("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		
		Random r = new Random();
		byte i = (byte)(r.nextInt(n.length()-1));
		
		return n.charAt(i);
	}
}
