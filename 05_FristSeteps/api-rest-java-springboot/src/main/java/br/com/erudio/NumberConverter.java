package br.com.erudio;

public class NumberConverter {
	public static Double convertToDouble(String StrNumber) {
		if(StrNumber == null) return 0D;
		String number = StrNumber.replaceAll(",", ".");
		if(isNumeric(number)) return Double.parseDouble(number);
		return 0D;
	}


	public static boolean isNumeric(String StrNumber) {
		// TODO Auto-generated method stub
		if(StrNumber == null) return false;
		String numeber = StrNumber.replaceAll(",", ".");
		return numeber.matches("[-+]?[0-9]*\\.?[0-9]+");
	}
}
