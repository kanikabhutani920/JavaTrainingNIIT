
public class RuntimeDemo {
	
	protected RuntimeDemo() {
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runtime objRun=Runtime.getRuntime();
		Process objProcess=null;
		
		try {
			objProcess=objRun.exec("calc.exe");
			System.out.println(objRun.freeMemory());
		//	objRun.gc();
			System.out.println(System.getProperty("java.class.version"));
			System.out.println(System.getProperty("java.vendor"));
			System.out.println(System.getProperty("java.vendor.url"));
			System.out.println(System.getProperty("java.version"));
			System.out.println(System.getProperty("java.vm.name"));
		}catch(Exception e) {
			System.out.println("Error executing Calculator");
		}
		
	}

}
