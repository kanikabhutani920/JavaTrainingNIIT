
public class Converse {
 
	void tobeConvert(final String[] args) {
		String binary,hex,octal;
		int num=100;
		Integer obj=new Integer(num);
		
		binary=obj.toBinaryString(num);
		hex=obj.toHexString(num);
		octal=obj.toOctalString(num);
		
		System.out.println("Decimal value:" +num);
		System.out.println("Binary equivalent=" +binary);
		System.out.println("Hexadecimal equivalent=" +hex);
		System.out.println("Octal equivalent=" + octal);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Converse objConvert=new Converse();
		objConvert.tobeConvert(args);
	}
}
