package tesString;

public class StringOperations {
	public static void main(String[] args) {
		String string1 = "Hello";
		String string2 = "Lisa";
		String string3 = "";
		string3 = "How Are You ".concat(string2);
		System.out.println("String3: "+string3);
		System.out.println("Lenght: "+string1.length());
		System.out.println("Sub: "+string3.substring(0,5));
		System.out.println("Upper: "+string3.toUpperCase());
		System.out.println("");
		String string4 = "How Are You "+string2;
		System.out.println("String4: "+string4);
		System.out.println("String: "+ (string1 += string2));
		System.out.println(string2.indexOf('a'));
		System.out.println(string2.charAt(2));
		System.out.println("");
		String s1 = "abc";
		String s2 = "cde";
		System.out.println(s1.compareTo(s2));
		System.out.println("");
		String s3 = "abc";
		String s4 = "ABC";
		System.out.println(s3.equals(s4));
	}
}
