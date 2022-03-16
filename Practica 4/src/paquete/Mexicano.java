package paquete;

import javax.swing.JOptionPane;
import java.time.LocalDate;

public class Mexicano {
	String Nombre1;
	String Nombre2;
	String Apellido1;
	String Apellido2;
	String Curp="hb";
	String RFC;
	boolean w=false;
	boolean x=false;
	
	public void Mexicano() {
		Nombre1=null;
		Nombre2=null;
		Apellido1=null;
		Apellido2=null;
	}
	
	public void Capturanombre() {
		this.Nombre1=JOptionPane.showInputDialog("Ingrese su primer nombre");
		this.Nombre2=JOptionPane.showInputDialog("Ingrese su segundo nombre \nEn caso de no contar con otro nombre coloque una 'X'");
		this.Apellido1=JOptionPane.showInputDialog("Ingrese su primer apellido");
		this.Apellido2=JOptionPane.showInputDialog("Ingrese su segundo apellido \nEn caso de no contar con otro apellido coloque una 'X'");
	}
	
	public void most(String nac, char g, String f) {
		
		JOptionPane.showInternalMessageDialog(null, "Nombres: "+Nombre1+" "+Nombre2+"\nApellidos: "+Apellido1+" "+Apellido2+"\nEntidad de Nacimiento: "+nac+"\nGenero: "+g+"\nFecha de nacimiento: "+f);
	}
	
	public void curp(String nac, String f, char g, boolean ex) {
		if(w==false) {
			String s1=Entidadcurp.entidad((Mayusculas.mayus(nac)));
			String s2=Fecha.fecha(f);
			System.out.println(s1);
			if(s1.equals("Defa")==true||s2.length()!=6) {
				JOptionPane.showMessageDialog(null,"***Error Curp***\n\n Introduzca la fecha o entidad de nacimiento correctos");
			}
			else {
				String s3=Parte1curp.part1(Mayusculas.mayus(Nombre1), Mayusculas.mayus(Nombre2), Mayusculas.mayus(Apellido1), Mayusculas.mayus(Apellido2));
				String s4=Parte2curp.part2(Mayusculas.mayus(Nombre1), Mayusculas.mayus(Nombre2), Mayusculas.mayus(Apellido1), Mayusculas.mayus(Apellido2));
				String s5=s3+s2+g+s1+s4+Homoclave.h1(f)+Homoclave.h2();
				this.Curp=s5;
				if(ex==true) {
					JOptionPane.showMessageDialog(null,"**********Curp Generada**********\n\n"+s5+"\n\nFecha de asignacion: "+
							LocalDate.now()+"\n\nFecha de expiracion: "+LocalDate.now().plusDays(180));
				}
				else {
					JOptionPane.showMessageDialog(null,"**********Curp Generada**********\n\n"+s5+"Fecha de generacion: "+
							LocalDate.now());
				}
				w=true;
			}
			
		}
		else{
			String s1=Entidadcurp.entidad((Mayusculas.mayus(nac)));
			String s2=Fecha.fecha(f);
			String s3=Parte1curp.part1(Mayusculas.mayus(Nombre1), Mayusculas.mayus(Nombre2), Mayusculas.mayus(Apellido1), Mayusculas.mayus(Apellido2));
			String s4=Parte2curp.part2(Mayusculas.mayus(Nombre1), Mayusculas.mayus(Nombre2), Mayusculas.mayus(Apellido1), Mayusculas.mayus(Apellido2));
			String s5=s3+s2+g+s1+s4+Homoclave.h1(f)+Homoclave.h2();
			if(Valid.reduccion1(s5).equals(Valid.reduccion1(Curp))) {
				this.Curp=s5;
				if(ex==true) {
					JOptionPane.showMessageDialog(null,"**********Curp Generada**********\n\n"+s5+"\n\nFecha de asignacion: "+
							LocalDate.now()+"\n\nFecha de expiracion: "+LocalDate.now().plusDays(180));
				}
				else {
					JOptionPane.showMessageDialog(null,"**********Curp Generada**********\n\n"+s5+"Fecha de generacion: "+
							LocalDate.now());
				}
			}
			else {
				JOptionPane.showMessageDialog(null,"***Error CURP***\n\n La informacion no coincide con los datos ya antes registrados");
			}
			
		}
		
		
		
	}
	
	public void rfc(String f) {
		if(x==false) {
			String s1 = Parte1curp.part1(Mayusculas.mayus(Nombre1), Mayusculas.mayus(Nombre2), Mayusculas.mayus(Apellido1), Mayusculas.mayus(Apellido2));
			String s2 = Fecha.fecha(f);
			if(s2.length()==6) {
				this.RFC=s1+s2+Homoclave.h2()+Homoclave.h3()+Homoclave.h2();
				JOptionPane.showMessageDialog(null,"**********RFC Generada**********\n\n"+RFC+"\n\nFecha de generacion: "
						+LocalDate.now());
				x=true;
			}
			else {
				JOptionPane.showMessageDialog(null,"***Error RFC***\n\n Introduzca de nuevo la fecha");
			}
		}
		else {
			String s1 = Parte1curp.part1(Mayusculas.mayus(Nombre1), Mayusculas.mayus(Nombre2), Mayusculas.mayus(Apellido1), Mayusculas.mayus(Apellido2));
			String s2 = Fecha.fecha(f);
			if(s2.length()==6) {
				String s3 = s1+s2;
				if(s3.equals(Valid.reduccion2(RFC))) {
					this.RFC=s1+s2+Homoclave.h2()+Homoclave.h3()+Homoclave.h2();
					JOptionPane.showMessageDialog(null,"**********RFC Generada**********\n\n"+RFC+"\n\nFecha de generacion: "
							+LocalDate.now());
				}
				else {
					JOptionPane.showMessageDialog(null,"***Error RFC***\n\n La informacion no coincide con los datos ya antes registrados");
				}
			}
			else {
				JOptionPane.showMessageDialog(null,"***Error RFC***\n\n Introduzca de nuevo la fecha");
			}
			
		}
		
		
	}
}
