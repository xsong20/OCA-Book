package assessmentTest_16;

public class Main {
	public static void main(String[] args) {
		Animal an = new Sub();
		Mammal ma = new Sub();
		Sub sb = new Sub();
		
		//sub
		System.out.println(an.getName());
		System.out.println(ma.getName());
		System.out.println(sb.getName());
		
		//sub
		System.out.println(((Animal)an).getName());
		//sub
		System.out.println(((Mammal)ma).getName());
		
		// to access .getName() from Mammal.
		
	}
}
