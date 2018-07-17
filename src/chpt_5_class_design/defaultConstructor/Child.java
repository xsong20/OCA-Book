package chpt_5_class_design.defaultConstructor;

// compare with ReviewQ_2.
// if there is no constructor defined in parent class, the compiler will add the default constructor, i.e
// public ParentClass(){} into the code. As a result, the child class doesn't have to explicitly use super. 

public class Child extends ParentClass{

	public Child() {
		System.out.println("23");
	}

}
