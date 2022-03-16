package paquete;

public class Entidadcurp {
	
	public static String entidad(String m) {
		String s1=null;
		switch(m){
		case "AGUASCALIENTES": s1="AS";
			break;
		case "BAJA CALIFORNIA": s1="BC";
			break;
		case "BAJA CALIFORNIA SUR": s1="BS";
			break;
		case "CAMPECHE": s1="CC";
			break;
		case "COAHUILA": s1="CL";
			break;
		case "COLIMA": s1="CM";
			break;
		case "CHIAPAS": s1="CS";
			break;
		case "CHIHUAHUA": s1="CH";
			break;
		case "DISTRITO FEDERAL": s1="DF";
			break;
		case "DURANGO": s1="DG";
			break;
		case "GUANAJUATO": s1="GT";
			break;
		case "GUERRERO": s1="GR";
			break;
		case "HIDALGO": s1="HG";
			break;
		case "JALISCO": s1="JC";
			break;
		case "MEXICO": s1="MC";
			break;
		case "MICHOACAN": s1="MN";
			break;
		case "MORELOS": s1="MS";
			break;
		case "NAYARIT": s1="NT";
			break;
		case "NUEVO LEON": s1="NL";
			break;
		case "OAXACA": s1="OC";
			break;
		case "PUEBLA": s1="PL";
			break;
		case "QUERETARO": s1="QT";
			break;
		case "QUINTANA ROO": s1="QR";
			break;
		case "SAN LUIS POTOSI": s1="SP";
			break;
		case "SINALOA": s1="SL";
			break;
		case "SONORA": s1="SR";
			break;
		case "TABASCO": s1="TC";
			break;
		case "TAMAULIPAS": s1="TS";
			break;
		case "TLAXCALA": s1="TL";
			break;
		case "VERACRUZ": s1="VZ";
			break;
		case "YUCATAN": s1="YN";
			break;
		case "ZACATECAS": s1="ZS";
			break;
		case "NE": s1="NE";
			break;
		default: s1="Defa";
			break;
		}
		return s1;
	}

}
