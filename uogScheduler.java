import java.util.*;

/**
 * Program Title: uogScheduler
 * 
 * About this Program:
 * This program is designed lay out the best appropriate schedule for an
 * incoming Freshman student to follow in order to graduate in his/her desired
 * program. For testing purposes, we have done this with the University's
 * Computer Science Program based on the 2016-2017 Catalog.
 * 
 * @author Anthony Balmaceda
 * @author Michael Santos
 * Date Started: 2/7/2017
 *
 */


public class uogScheduler{

	private static degreeProgram majorSelected;
	private static generalEducation genEds = new generalEducation();
	public static ArrayList <semSchedule> allScheds = new ArrayList <semSchedule>();
	private static int upperDivs = 0;
	private static int fallSpring;
	private static int schedNum = 0;
	private static int year;

	
	public static void main(String args[]){
		
	Scanner in = new Scanner(System.in);
	System.out.println("============University of Guam Degree Scheduler================");
	System.out.println("Please select your major:");
	System.out.println("1.) Computer Information Systems");
	int majorNum = in.nextInt();
	System.out.println("majorNum: " + majorNum);
	
	System.out.println("\nPlease select what semester it is:");
	System.out.println("1)Fall");
	System.out.println("2)Spring");
	fallSpring = in.nextInt();
	
	System.out.println("\nPlease enter the current YEAR:");
	year = in.nextInt();
	
	in.close();
    
	//If major selected is ________, create FieldOfStudy object
	switch (majorNum){
		case 1:
			//System.out.println("MADE IT TO SWITCH1");
	majorSelected = new ComputerInfoSys();
		break;
			
	} //END SWITCH STATEMENT
	
	//While all classes aren't finished yet************
	for (int i = 0; i < 8; i++){ //****************TEST: FOR 2 SEMESTERS
	allScheds.add(new semSchedule());
	
	//Check if fall or spring
	if (fallSpring % 2 == 0) { //If even, it's Spring
		allScheds.get(i).setSemName("Spring ");
	}else { //If not, it's Fall
		allScheds.get(i).setSemName("Fall ");
	}

	//System.out.println(majorSelected.classList);
	createSchedules(majorSelected, genEds, schedNum); //CREATE SCHEDULE

	
	/*Print out the contents of the Schedule that was just made*/
	System.out.println("======" + allScheds.get(i).sname + year  + "========"); 
	
	allScheds.get(schedNum).printSched();
	schedNum++; //Move on to next schedule index
	fallSpring++;//Increment semester
		
	
		//After incrementing and fall just happened, meaning it's now SPRING, then increment year
		if (fallSpring % 2 == 0) { //If even, it's now Spring
			year++;
		}
		
	} //END OUTER LOOP TEST FOR 2 SEMESTERS
	
	} //================END MAIN METHOD========================================================
	
	
	/**
	 * 
	 * @param major: Major selected
	 * @param ge: The general eds package of courses
	 * @param schedID: The schedule index of the allScheds arraylist
	 */
	public static void createSchedules(degreeProgram major, generalEducation ge, int schedID){
	int searchIndex = 0;

	while (allScheds.get(schedID).sched.size() <=5){ //Try to schedule 5 classes per semester
		//Go through each list and add classes
		//major.finishClass(searchIndex, allScheds.get(schedID));
		//ge.finishClass(searchIndex, allScheds.get(schedID));
		ge.finishClass(searchIndex, allScheds.get(schedID));
		searchIndex++;
	}
	
	//If index > 300, add num of credits to upperDivs *******
	for (int i = 0; i<5; i++){
		if (allScheds.get(schedID).sched.get(i).credits >= 300){
		upperDivs = upperDivs + allScheds.get(schedID).sched.get(i).credits;	
		}
	}
	
  searchIndex = 0; //Reset search index
	
	}
	
}