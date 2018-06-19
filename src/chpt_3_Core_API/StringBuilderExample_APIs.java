package chpt_3_Core_API;

public class StringBuilderExample_APIs {
	public static void main(String[] args) {
		/*	
		StringBuilder	StringBuilder.append(boolean b) 
		StringBuilder	StringBuilder.append(char c) 
		StringBuilder	StringBuilder.append(char[] str) 
		StringBuilder	StringBuilder.append(char[] str, int offset, int len) 
		StringBuilder	StringBuilder.append(CharSequence s) 
		StringBuilder	StringBuilder.append(CharSequence s, int start, int end) 
		StringBuilder	StringBuilder.append(double d) 
		StringBuilder	StringBuilder.append(float f) 
		StringBuilder	StringBuilder.append(int i) 
		StringBuilder	StringBuilder.append(long lng) 
		StringBuilder	StringBuilder.append(Object obj) 
		StringBuilder	StringBuilder.append(String str) 
		StringBuilder	StringBuilder.append(StringBuffer sb)
		StringBuilder	StringBuilder.appendCodePoint(int codePoint)
		*/
		
		/*
		StringBuilder	StringBuilder.delete(int start, int end) 
		
		StringBuilder	StringBuilder.deleteCharAt(int index) 
		
		StringBuilder	StringBuilder.insert(int offset, boolean b) 
		StringBuilder	StringBuilder.insert(int offset, char c) 
		StringBuilder	StringBuilder.insert(int offset, char[] str) 
		StringBuilder	StringBuilder.insert(int index, char[] str, int offset, int len) 
		StringBuilder	StringBuilder.insert(int dstOffset, CharSequence s) 
		StringBuilder	StringBuilder.insert(int dstOffset, CharSequence s, int start, int end) 
		StringBuilder	StringBuilder.insert(int offset, double d) 
		StringBuilder	StringBuilder.insert(int offset, float f) 
		StringBuilder	StringBuilder.insert(int offset, int i) 
		StringBuilder	StringBuilder.insert(int offset, long l) 
		StringBuilder	StringBuilder.insert(int offset, Object obj) 
		StringBuilder	StringBuilder.insert(int offset, String str) 
		
		StringBuilder	StringBuilder.replace(int start, int end, String str)
		 
		StringBuilder	StringBuilder.reverse() */
		


		StringBuilder sb = new StringBuilder("1234");
		StringBuilder b = sb.append("adf");
		// sb and b both point to object new StringBuilder("1234");
		System.out.println(sb);
	}

}
