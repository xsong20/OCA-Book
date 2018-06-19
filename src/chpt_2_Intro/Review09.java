package chpt_2_Intro;

public class Review09 {
	public static void main(String[] args) {
		// there are 2 types of data type: primitive value and reference values.
		int i = 0, j = 0;
		j = i++;
		// i = 1;
		System.out.println("i: " + i);
		// j = 0;
		System.out.println("j: " + j);
		// j = i++ can be interpreted as :
		// evaluate j = i first.
		// increment i and update the value in primitive value int i.
		
		int a = 0, b = 0;
		a++;
		++b;
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		int f = 0, g = 0;
		System.out.println("f-- :" + f--);
		System.out.println("g-- :" + --g);
		
	}
}
