package paquete;

import javax.swing.JOptionPane;


public class Submenu {
	
	public static void submenu(String nac, char g, String f, boolean s, Mexicano m1, Mexicano m2, Mexicano m3, boolean ex) {
		int i =0;
		
		do {
		i = Integer.parseInt(JOptionPane.showInputDialog("*****MENU*****\n\n"
				+ "1.Generar CURP\n2.Generar RFC\n3.Generar CURP y RFC\n4.Regresar\n\nDigite su opcion"));
		
		switch(i){
			case 1: 
					f = JOptionPane.showInputDialog("Ingrese su fecha de nacimiento (aaaa/mm/dd) Ej:2001/05/18");
					g = JOptionPane.showInputDialog("Ingrese su ganero\nH = Hombre M = Mujer").charAt(0);
					if(nac.equals("ne")==true) {
						m1.Capturanombre();
						m1.most(nac,g,f);
						m1.curp(nac,f,g,ex);
					}
					else {
						nac = JOptionPane.showInputDialog("Ingrese su entidad de nacimiento o de registro Ej: Aguascalientes");
						m1.Capturanombre();
						m1.most(nac,g,f);
						m1.curp(nac,f,g,ex);
						
					}
				m3.w=m1.w;
				m3.Curp=m1.Curp;
				break;
			case 2:
				m2.Capturanombre();
				f = JOptionPane.showInputDialog("Ingrese su fecha de nacimiento (aaaa/mm/dd) Ej:2001/05/18");
				m2.rfc(f);
				m3.x=m1.x;
				m3.RFC=m1.RFC;
				break;
			case 3:
				f = JOptionPane.showInputDialog("Ingrese su fecha de nacimiento (aaaa/mm/dd) Ej:2001/05/18");
				g = JOptionPane.showInputDialog("Ingrese su ganero\nH = Hombre M = Mujer").charAt(0);
				m3.Capturanombre();
				m3.most(nac, g, f);
				m3.curp(nac, f, g,ex);
				m3.rfc(f);
				m1.x=m3.x;
				m1.RFC=m3.RFC;
				m1.w=m3.w;
				m1.Curp=m3.Curp;
				break;
			case 4:
				s=true;
				break;
			default: JOptionPane.showMessageDialog(null,"***Ingrese una opcion valida***");
				break;
		}
	}while(s==false);
		
	}

}
