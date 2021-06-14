package strings;

public class StringTiming {

	static int n = 350_000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createManyStrings();
		StringBuilder sb = new StringBuilder("");
	}
	
	public static void createManyStrings() {
		String s = "";
		long start = System.currentTimeMillis();
		for (int i = 0; i < n; i++) {
			s= s.concat("a");
		}
		long end = System.currentTimeMillis();
		System.out.println("String took: " + (end-start) + " ms");
	}

}
