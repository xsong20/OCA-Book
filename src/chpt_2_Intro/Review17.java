package chpt_2_Intro;

public class Review17 {
	public static void main(String[] args) {
		boolean keepGoing = true;
		int result = 15, i = 10;
		do {
			i--;
			System.out.println("i: " + i);
			if(i == 8) keepGoing = false;
			result -= 2;
		}while(keepGoing);
		
		System.out.println(result);
	}

	
}
