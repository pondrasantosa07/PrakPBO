package project1;

public class CastingData {
	public static void main(String[] args) {
//		global variabel
		byte a = 50;
		int b = 5;
		float c = 2;
			
		int d = (int)(a*b/c);
		int e = (int)(a*b)/251;
		
		System.out.println(d);
		System.out.println(e);
		
		if(d%2 == 0) {
//			local variabel
			String genap = "genap";
			System.out.println("d adalah bilangan " + genap);
		} else {
			String ganjil = "ganjil";
			System.out.println("d adalah bilangan " + ganjil);
		}
	}
}
