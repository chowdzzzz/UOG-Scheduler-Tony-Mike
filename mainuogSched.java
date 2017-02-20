import java.util.Scanner;

public class mainuogSched {

	public static void main(String args[]){
		
		uogScheduler scheduler = new uogScheduler();
		
		Scanner in = new Scanner(System.in);
		System.out.println("============University of Guam Degree Scheduler================");
		System.out.println("Please select your major:");
		System.out.println("1.) Computer Information Systems");
		int majorNum = in.nextInt();
		System.out.println("majorNum: " + majorNum);
		
		System.out.println("\nPlease select what semester it is:");
		System.out.println("1)Fall");
		System.out.println("2)Spring");
		scheduler.fallSpring = in.nextInt();
		
		System.out.println("\nPlease enter the current YEAR:");
		scheduler.year = in.nextInt();
		
		in.close();
	    
		//If major selected is ________, create FieldOfStudy object
		switch (majorNum){
			case 1:
				//System.out.println("MADE IT TO SWITCH1");
		scheduler.majorSelected = new ComputerInfoSys();
			break;
				
		} //END SWITCH STATEMENT
		
		scheduler.algorithm();

		
		} //================END MAIN METHOD========================================================
	
}
