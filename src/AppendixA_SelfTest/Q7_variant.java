package AppendixA_SelfTest;

import AppendixA_SelfTest.*;
import assessmentTest.*;
public class Q7_variant {
	public static void main(String[] args) {
		// when both imports use wildcard,  the first import takes effect.
		// in order to use the class in another package, a fully qualifiered name must be provided.
		Q7_subclass q = new Q7_subclass();
		assessmentTest.Q7_subclass qa = new assessmentTest.Q7_subclass();
	}

}
