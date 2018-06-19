package assessmentTest_11;

/*
 * This program breaks the label, which has a loop from 1 to 100
 */
public class _11 {

	public static void main(String[] args) {
		
		loopthru:
			for( int i = 1; i <= 100; i++) {
				System.out.println(i);
				
				// if i has value of 20, break the label.
				if(i == 20) break loopthru;

			}
	// after the loop has been broken, flow of control is transfered to the next line of code immediate after label statment.
	System.out.println("The program terminated where i is 20");

	}

}
