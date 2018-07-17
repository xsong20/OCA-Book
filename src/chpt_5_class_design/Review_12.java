package chpt_5_class_design;

public class Review_12 extends Review_12_Super {
	public void print(int i) {
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		new Review_12().print(9.0);
	}

}
