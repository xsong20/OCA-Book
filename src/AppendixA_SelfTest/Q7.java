package AppendixA_SelfTest;

import AppendixA_SelfTest.Q7_subclass;
import assessmentTest.*;
public class Q7 {
	public static void main(String[] args) {
		// name reference precedes wildcard. to reference to subclass in AppendixA
		Q7_subclass q = new Q7_subclass();
		
		// to access the subclass defined in assesssmentTest, use full qualifier name.
		assessmentTest.Q7_subclass qa = new assessmentTest.Q7_subclass();
	}

}
