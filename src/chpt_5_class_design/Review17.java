package chpt_5_class_design;

public abstract class Review17 {
	public abstract void drive(){};
	public static void main(String[] args) {
		Review17 r = new Review17_sub();
	}
	
	protected abstract void d();

}
