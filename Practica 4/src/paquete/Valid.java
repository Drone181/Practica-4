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
	
	public static String palAlti(String m) {
		String s1 = new String();
		
		switch(m) {
		
		case "BACA": s1="BXCA";
			break;
		case "BAKA": s1="BXKA";
			break;
		case "BUEI": s1="BXEI";
			break;
		case "BUEY": s1="BXEY";
			break;
		case "CACA": s1="CXCA";
			break;
		case "CACO": s1="CXCO";
			break;
		case "CAGA": s1="CXGA";
			break;
		case "CAGO": s1="CXGO";
			break;
		case "CAKA": s1="CXKA";
			break;
		case "CAKO": s1="CXKO";
			break;
		case "COGE": s1="CXGE";
			break;
		case "COGI": s1="CXGI";
			break;
		case "COJA": s1="CXJA";
			break;
		case "COJE": s1="CXJE";
			break;
		case "COJI": s1="CXJI";
			break;
		case "COJO": s1="CXJO";
			break;
		case "COLA": s1="CXLA";
			break;
		case "CULO": s1="CXLO";
			break;
		case "FALO": s1="FXLO";
			break;
		case "FETO": s1="FXTO";
			break;
		case "GETA": s1="GXTA";
			break;
		case "GUEI": s1="GXEI";
			break;
		case "GUEY": s1="GXEY";
			break;
		case "JETA": s1="JXTA";
			break;
		case "JOTO": s1="JXTO";
			break;
		case "KACA": s1="KXCA";
			break;
		case "KACO": s1="KXCO";
			break;
		case "KAGA": s1="KXGA";
			break;
		case "KAGO": s1="KXGO";
			break;
		case "KAKA": s1="KXKA";
			break;
		case "KAKO": s1="KXKO";
			break;
		case "KOGE": s1="KXGE";
			break;
		case "KOGI": s1="KXGI";
			break;
		case "KOJA": s1="KXJA";
			break;
		case "KOJE": s1="KXJE";
			break;
		case "KOJI": s1="KXJI";
			break;
		case "KOJO": s1="KXJO";
			break;
		case "KOLA": s1="KXLA";
			break;
		case "KULO": s1="KXLO";
			break;
		case "LILO": s1="LXLO";
			break;
		case "LOCA": s1="LXCA";
			break;
		case "LOCO": s1="LXCO";
			break;
		case "LOKA": s1="LXKA";
			break;
		case "LOKO": s1="LXKO";
			break;
		case "MAME": s1="MXME";
			break;
		case "MAMO": s1="MXMO";
			break;
		case "MEAR": s1="MXAR";
			break;
		case "MEAS": s1="MXAS";
			break;
		case "MEON": s1="MXON";
			break;
		case "MIAR": s1="MXAR";
			break;
		case "MION": s1="MXON";
			break;
		case "MOCO": s1="MXCO";
			break;
		case "MOKO": s1="MXKO";
			break;
		case "MULA": s1="MXLA";
			break;
		case "MULO": s1="MXLO";
			break;
		case "NACA": s1="NXCA";
			break;
		case "NACO": s1="NXCO";
			break;
		case "PEDA": s1="PXDA";
			break;
		case "PEDO": s1="PXDO";
			break;
		case "PENE": s1="PXNE";
			break;
		case "PIPI": s1="PXPI";
			break;
		case "PITO": s1="PXTO";
			break;
		case "POPO": s1="PXPO";
			break;
		case "PUTA": s1="PXTA";
			break;
		case "PUTO": s1="PXTO";
			break;
		case "QULO": s1="QXLO";
			break;
		case "RATA": s1="RXTA";
			break;
		case "ROBA": s1="RXBA";
			break;
		case "ROBE": s1="RXBE";
			break;
		case "ROBO": s1="RXBO";
			break;
		case "RUIN": s1="RXIN";
			break;
		case "SENO": s1="SXNO";
			break;
		case "TETA": s1="TXTA";
			break;
		case "VACA": s1="VXCA";
			break;
		case "VAGA": s1="VXGA";
			break;
		case "VAGO": s1="VXGO";
			break;
		case "VAKA": s1="VXKA";
			break;
		case "VUEI": s1="VXEI";
			break;
		case "VUEY": s1="VXEY";
			break;
		case "WUEI": s1="WXEI";
			break;
		case "WUEY": s1="WXEY";
			break;
		default: s1=m;
			break;
		}
		
		return s1;
	}

}
