
public class StringBuf {
	
	protected StringBuf() {
		
	}

	public static void main(final String[] args) {
		// TODO Auto-generated method stub

		StringBuffer buf=new StringBuffer("Java");
		buf.append("Guide Verl/");
		buf.append(3);
		int index=5;
		buf.insert(index, "Student");
		index=21;
		buf.setCharAt(index, '.');
		int start=23;
		int end=24;
		buf.replace(start, end, "8");
		String s=buf.toString();
		System.out.println(s);
	
	}

}
