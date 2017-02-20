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

	public degreeProgram majorSelected;
	private generalEducation genEds = new generalEducation();
	public ArrayList <semSchedule> allScheds = new ArrayList <semSchedule>();
	private int upperDivs = 0;
	private int totalCreds = 0;
	public int fallSpring;
	private int schedNum = 0;
	public int year;
	
	/**
	 * 
	 * @param major: Major selected
	 * @param ge: The general eds package of courses
	 * @param schedID: The schedule index of the allScheds arraylist
	 */
	public void createSchedules(degreeProgram major, generalEducation ge, int schedID){
	int searchIndexM = 0;
	int searchIndexGE = 0;
	boolean finishedSched = false;
	//int lastMadded = -1;
	//int lastGEadded = -1;

	while (finishedSched == false){ //Try to schedule 5 classes per semester
		//Go through each list and add classes

		if (allScheds.get(schedID).sched.size() < 5 && searchIndexM < major.classList.size()){
		//System.out.println("MAJOR Search Index: " + searchIndexM);
		major.finishClass(searchIndexM, allScheds.get(schedID));
		searchIndexM++;
		//System.out.println("MAJOR OUT OF CLASSES: " + major.outOfClasses);
		}
		
		if (allScheds.get(schedID).sched.size() < 5 && searchIndexGE < ge.classList.size()){
			//System.out.println("GE Search Index: " + searchIndexGE);
		ge.finishClass(searchIndexGE, allScheds.get(schedID));
		searchIndexGE++;
		}
		
		if (allScheds.get(schedID).sched.size() >= 5) {
			finishedSched = true;
		} else if (major.outOfClasses == true) {
			finishedSched = true;
		}
		
	}
	
	//If index > 300, add num of credits to upperDivs *******
	for (int i = 0; i< allScheds.get(schedID).sched.size(); i++){
		if (allScheds.get(schedID).sched.get(i).id >= 300){
		upperDivs = upperDivs + allScheds.get(schedID).sched.get(i).credits;	
		}
		totalCreds = totalCreds + + allScheds.get(schedID).sched.get(i).credits;
	}
	
  searchIndexM = 0; //Reset search index
  searchIndexGE = 0;
	}
	
	public void algorithm(){
		//While all classes aren't finished yet************
		for (int i = 0; i < 8; i++){ //****************TEST: FOR 8 SEMESTERS
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
		System.out.println("======" + allScheds.get(i).sname + year  + "  ||  SchedID: " + schedNum + "========"); 
		allScheds.get(schedNum).printSched();
		
		schedNum++; //Move on to next schedule index
		fallSpring++;//Increment semester
			
		
			//After incrementing and fall just happened, meaning it's now SPRING, then increment year
			if (fallSpring % 2 == 0) { //If even, it's now Spring
				year++;
			}
			
			System.out.println();
			
		} //END OUTER FOR LOOP TEST FOR 2 SEMESTERS
	
		System.out.println("Upper Division Credits: " + upperDivs);
		System.out.println("Total Credits: " + totalCreds);
	}
	
}