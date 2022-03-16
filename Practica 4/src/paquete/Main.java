package paquete;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Mexicano m1 = new Mexicano();
		Mexicano m2 = new Mexicano();
		Mexicano m3 = new Mexicano();
		
		String nac=" ";
		char g=0;
		String f=null;
		int i=0,j=0;
		boolean s=false,x=false,ex=false;
		
		do {
			j = Integer.parseInt(JOptionPane.showInputDialog("***Verificacion***\n\n1.Nacionalidad Mexicana\n2.Extranjero con residencia mexicana\n"
					+ "3.Extranjero pero no cuento con residencia mexicana\n4.Salir\n\nDigite su opcion"));
			
			switch(j) {
			case 1:
				i = Integer.parseInt(JOptionPane.showInputDialog("1.Cuento solo con nacionalidad mexicana\n2.Cuento con nacionalidad multiple\n\nDigite su opcion"));
				switch(i) {
				case 1:
					Submenu.submenu(nac, g, f, s, m1, m2, m3,ex);
					
					break;
				case 2:
					nac = "ne";
					Submenu.submenu(nac, g, f, s, m1, m2, m3,ex);
					nac = "";
					
					break;
				default:
					JOptionPane.showMessageDialog(null,"Ingrese una opcion valida");
					break;
				}
				m1.w=false;
				m3.w=false;
				m1.x=false;
				m3.x=false;
				break;
			case 2:
				ex=true;
				Submenu.submenu(nac, g, f, s, m1, m2, m3,ex);
				m1.w=false;
				m3.w=false;
				m1.x=false;
				m3.x=false;
				ex=false;
				break;
			case 3:
				JOptionPane.showMessageDialog(null,"***Error***\n\nLos sentimos, pero es necesario contar con nacionalidad mexicana para poder generar su CURP y RFC");
				break;
			case 4:
				JOptionPane.showMessageDialog(null,"Hasta Pronto!");
				x=true;
				break;
			default:
				JOptionPane.showMessageDialog(null,"Ingrese una opcion valida");
				break;
			}
		}while(x==false);
				
	}

}
