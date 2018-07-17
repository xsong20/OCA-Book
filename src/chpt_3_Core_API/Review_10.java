package chpt_3_Core_API;

import org.omg.Messaging.SyncScopeHelper;

public class Review_10 {
	public static void main(String[] args) {
		String a = "";
		String b = new String("");
		a += 2;
		a += 'c';
		a += false;
		if( a == "2cfalse") System.out.println("==");
		if( a .equals("2cfalse")) System.out.println("equals");
		
		// 359023572
		System.out.println(System.identityHashCode("2cfalse"));
		// 305808283
		System.out.println(System.identityHashCode(a));
		// 2111991224
		System.out.println(System.identityHashCode(b));
	}

}
