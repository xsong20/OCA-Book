package chpt_4_statement_Encapsulation;

public class Chpt4_review03 {
	void methodA(){
		return ;
	}
	
	void methodB(){
		// void method cannot return a value.
		// not compiling : return null;
	}

	
	int methodC() {
		// cannot convert doulbe to int
		// return 9.0;
		return 0;
	}
	
	int methodD() {
		// methodD must return a value of type int
		// return;
		return 1;
	}
	
	int medthodE() {
		// java cannot convert null to int
		// return null;
		return 0;
	}
	

}
